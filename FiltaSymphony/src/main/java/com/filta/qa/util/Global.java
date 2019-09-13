package com.filta.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Global
{
	private WebDriver driver;
	private TakesScreenshot screen;
	private WebElement element;
	private JavascriptExecutor jS;
	private Alert alert_Obj;
	private Select select_Obj;
	private Actions action;
	private WebDriverWait wait;
	private File f;
	private File file_Obj;
	private File file_;
	private ChromeOptions options;
	private Properties prop;
	private FileInputStream input;
	private String text;
	private String message;
	private String url;
	private boolean result;
	private static int count = 1;


	// Driver Initialization Method !!
	public WebDriver driver()
	{
		// ChromeOption will Disable Password Save Popup In Chrome
		prop = readProperties();
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-web-security");
		options.addArguments("--no-proxy-server");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities capablities = new DesiredCapabilities();
		capablities.setCapability(ChromeOptions.CAPABILITY, options);
		capablities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driver"));
		driver = new ChromeDriver(capablities);
		driver.get(prop.getProperty("URL2"));
		driver.manage().window().maximize();
		return driver;
	}


	public Properties readProperties()
	{
		f = new File("E:\\Work\\Symphony\\FiltaSymphony\\configs\\Configuration.properties");
		file_Obj = new File(
				"C:\\Users\\kunal\\git\\Repository\\FiltaSymphony\\configs\\OfficeConfiguration.properties");
		file_ = new File(
				"C:\\Users\\Boka_Chiku\\git\\Symphony\\FiltaSymphony\\configs\\HomePC_Configuration.properties");
		if (f.exists() == true)
		{
			try
			{
				input = new FileInputStream(f);

			}
			catch (FileNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			prop = new Properties();
			try
			{
				prop.load(input);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return prop;
		}
		else if (file_Obj.exists() == true)
		{

			try
			{
				input = new FileInputStream(file_Obj);

			}
			catch (FileNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			prop = new Properties();
			try
			{
				prop.load(input);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return prop;
		}
		else if (file_.exists() == true)
		{
			try
			{
				input = new FileInputStream(file_);

			}
			catch (FileNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			prop = new Properties();
			try
			{
				prop.load(input);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return prop;

	}


	public void screenShot(WebDriver driver)
	{
		screen = (TakesScreenshot) driver;
		f = screen.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(f, new File("E:\\Msite\\MobileApp\\ScreenShots\\Screen" + count + ".png"));
			count++;
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public WebElement driverWait(WebDriver driver, String xPath)
	{
		wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
		return element;
	}


	public Select select(WebElement element)
	{
		select_Obj = new Select(element);
		return select_Obj;
	}


	public WebDriverWait wait(WebDriver driver)
	{
	     wait = new WebDriverWait(driver, 2500);
		return wait;
	}


	public String getString(WebDriver driver, String xPath)
	{
		text = driver.findElement(By.xpath(xPath)).getText();
		return text;
	}


	public String getStringElement(WebElement element)
	{
		text = element.getText();
		return text;
	}


	public void click(WebDriver driver, String xPath)
	{
		driver.findElement(By.xpath(xPath)).click();
	}


	public void send(WebDriver driver, String xPath, String value)
	{
		driver.findElement(By.xpath(xPath)).sendKeys(value);
	}


	public void clickElement(WebElement element)
	{
		element.click();
	}


	public void sendElementKey(WebElement element, String text)
	{
		element.sendKeys(text);
	}


	public void sendElement(WebDriver driver, String xPath, String text)
	{
		driver.findElement(By.xpath(xPath)).sendKeys(text);
	}


	public void sleepMethod()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("We are in Catch Block !!");
			e.printStackTrace();
		}
	}


	public void implicityWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}


	public String url(WebDriver driver)
	{
		url = driver.getCurrentUrl();
		return url;
	}


	public boolean enabled(WebElement element)
	{
		result = element.isEnabled();
		return result;
	}


	public void linkText(WebDriver driver, String text)
	{
		driver.findElement(By.linkText(text)).click();
	}


	public WebElement webElementReturn(WebDriver driver, String xPath)
	{
		element = driver.findElement(By.xpath(xPath));
		return element;
	}


	public String getAttributes(WebElement element, String value)
	{
		text = element.getAttribute(value);
		return text;
	}


	public void clearText(WebDriver driver, String xPath)
	{
		driver.findElement(By.xpath(xPath)).clear();
	}


	public String alert(WebDriver driver)
	{
		alert_Obj = driver.switchTo().alert();
		message = alert_Obj.getText();
		alert_Obj.accept();
		return message;
	}


	public void alertAccept(WebDriver driver)
	{
		alert_Obj = driver.switchTo().alert();
		alert_Obj.accept();

	}


	public Actions action(WebDriver driver)
	{
		action = new Actions(driver);
		return action;
	}


	public String alert(String input, WebDriver driver)
	{
		alert_Obj = driver.switchTo().alert();
		message = alert_Obj.getText();
		if (input.equalsIgnoreCase("accept"))
			alert_Obj.accept();
		else if (input.equalsIgnoreCase("dismiss"))
			alert_Obj.dismiss();
		return message;
	}


	public JavascriptExecutor jsReturn(WebDriver driver)
	{
		jS = (JavascriptExecutor) driver;
		return jS;
	}


	
}
