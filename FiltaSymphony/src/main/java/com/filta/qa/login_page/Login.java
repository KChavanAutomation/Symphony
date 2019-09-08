package com.filta.qa.login_page;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.filta.qa.helper.Login_Interface;
import com.filta.qa.util.Global;

public class Login implements Login_Interface
{
	private WebDriver driver;
	private Global global_Obj;
	private Properties prop;
	private String actualMsg;

	@FindBy(how = How.XPATH, using = ".//input[@id='user_name']")
	private WebElement userName;

	@FindBy(how = How.XPATH, using = ".//input[@id='user_password']")
	private WebElement passWord;

	@FindBy(how = How.XPATH, using = ".//input[@id='login_button']")
	private WebElement log_In;

	@FindBy(how = How.XPATH, using = ".//div[@class='login']//tbody//tr[2]")
	private WebElement errorMessage;


	public Login(WebDriver driver)
	{
		global_Obj = new Global();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		prop = global_Obj.readProperties();
	}


	public void availableLinks()
	{
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("URL name => " + list.get(i).getText());
		}
	}


	public List<WebElement> findAllLinks(WebDriver driver)

	{

		List<WebElement> elementList = driver.findElements(By.tagName("a"));

		elementList.addAll(driver.findElements(By.tagName("img")));

		List<WebElement> finalList = new ArrayList<WebElement>();

		for (WebElement element : elementList)

		{

			if (element.getAttribute("href") != null)

			{

				finalList.add(element);

			}

		}

		return finalList;

	}


	public static String isLinkBroken(URL url) throws Exception

	{

		// url = new URL("https://yahoo.com");

		String response = "";

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		try

		{

			connection.connect();

			response = connection.getResponseMessage();

			connection.disconnect();

			return response;

		}

		catch (Exception exp)

		{

			return exp.getMessage();

		}

	}


	public void brokenLink()
	{
		List<WebElement> allLinks = findAllLinks(driver);

		System.out.println("Total number of elements found " + allLinks.size());

		for (WebElement element : allLinks)
		{

			try

			{

				System.out.println("URL: " + element.getAttribute("href") + " returned "
						+ isLinkBroken(new URL(element.getAttribute("href"))));

				// System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned "
				// + isLinkBroken(new URL(element.getAttribute("href"))));

			}

			catch (Exception exp)

			{

				System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; "
						+ exp.getMessage());

			}

		}

	}


	public void enterUserName(String userName)
	{
		this.userName.sendKeys(userName);
	}


	public void enterPassword(String password_String)
	{
		passWord.sendKeys(password_String);
	}


	public void clickSubmit()
	{
		log_In.click();
	}


	public void assertCheck()
	{
		actualMsg = driver.getCurrentUrl();
		Assert.assertEquals(actualMsg, prop.getProperty("URLAssert"));
	}


	public void assertCheck2()
	{
		global_Obj.wait(driver).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='login']//tbody//tr[2]")));
		actualMsg = errorMessage.getText();
		Assert.assertEquals(actualMsg, prop.getProperty("Validation1"));
	}


	public void clearText()
	{
		userName.clear();
		passWord.clear();
	}


	public void driverClose()
	{
		driver.close();
	}
}