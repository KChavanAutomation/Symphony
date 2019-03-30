package pageObjects_HomePageFranchisee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import helper.HomePage_Interface;
import util.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import util.Global;

public class HomePage implements HomePage_Interface {

	private Global global;
	private WebDriver driver;
	private Properties Prop;
	private Login login;

	@FindBy(how = How.XPATH, using = ".//select[@name='login_language']")
	private WebElement Language;

	@FindBy(how = How.LINK_TEXT, using = "Symphony Training on FiltaNet")
	private WebElement link;

	@FindBy(how = How.XPATH, using = ".//div[@class='main-wrapper clearfix']//div[@class='left-panel'][2]//div[@class='left-panel-national'][3]//ul//li")
	private WebElement tech;

	@FindBy(how = How.XPATH, using = ".//div[@class='main-wrapper clearfix']//div[@class='left-panel'][3]//div[@class='left-panel-national'][2]//ul//li")
	private WebElement filtagold;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_marketing_summery']//h1")
	private WebElement email_summary;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_marketing_summery']//div[@style='font-style: italic;']")
	private WebElement email_summary2;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_marketing_summery']//span[@id='last-updated']")
	private WebElement email_summary3;

	@FindBy(how = How.XPATH, using = ".//a[@href='https://sites.google.com/a/filta.com/opsmanual/filta-symphony']")
	private WebElement homeText;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DNotes%26action%3DEditView%26return_module%3DNotes%26return_action%3DDetailView']")
	private WebElement noteToolTip;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DLeads%26action%3DEditView%26return_module%3DLeads%26return_action%3DDetailView']")
	private WebElement leadToolTip1;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DTasks%26action%3DEditView%26return_module%3DTasks%26return_action%3DDetailView']")
	private WebElement leadToolTip2;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DCalls%26action%3DEditView%26return_module%3DCalls%26return_action%3DDetailView']")
	private WebElement leadToolTip3;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DNotes%26action%3DEditView%26return_module%3DNotes%26return_action%3DDetailView']")
	private WebElement leadToolTip4;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DFL_New_Oil_Inventory%26action%3DEditView%26return_module%3DFL_New_Oil_Inventory%26return_action%3DDetailView']")
	private WebElement filtagoldToolTip;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DAccounts%26action%3Dfrindex%26parentTab%3DCustomers']")
	private WebElement Customerlabel;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DIM_NCA%26action%3Dindex%26parentTab%3DNCA']")
	private WebElement NCALabel;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DLeads%26action%3Ddashletlist%26parentTab%3DLeads']")
	private WebElement Leadlabel;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DFL_Filtabio%26action%3Dindex%26parentTab%3DFiltaBio']")
	private WebElement FiltaBiolabel;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DTR_Leads%26action%3Dindex%26parentTab%3DTRS']")
	private WebElement Techhiringlabel;

	@FindBy(how = How.XPATH, using = ".//a[@href='#']")
	private WebElement filtaGoldlabel;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?module=IM_NCA&action=frindex']")
	private WebElement myFranchiseelabel;

	@FindBy(how = How.XPATH, using = ".//a[@href='index.php?module=Home&action=index&type=widget']")
	private WebElement homeDashletlabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='main']//div[@id='content']//tr/td//div[@id='pageNum_0_div'][1]/table/tbody/tr[1]/td[3]/span[5]/a[2]")
	private WebElement homeDashletlabel2;

	@FindBy(how = How.XPATH, using = ".//div[@id='main']//div[@id='content']//tr/td//div[@id='pageNum_0_div'][1]/table/tbody/tr[1]/td[3]/span[1]")
	private WebElement homeDashletlabel3;

	@FindBy(how = How.XPATH, using = ".//div[@id='dashletsDialog']")
	private WebElement dashletDialog;

	@FindBy(how = How.XPATH, using = ".//input[@id='search_string']")
	private WebElement searchWidet;

	@FindBy(how = How.XPATH, using = ".//input[@value='Search']")
	private WebElement searchButton;

	@FindBy(how = How.XPATH, using = ".//input[@value='Clear']")
	private WebElement clearButton;

	@FindBy(how = How.XPATH, using = ".//a[@id='moduleCategoryAnchor']")
	private WebElement tapNameWidget1;

	@FindBy(how = How.XPATH, using = ".//a[@id='chartCategoryAnchor']")
	private WebElement tapNameWidget2;

	public HomePage(WebDriver driver) {
		global = new Global();
		Prop = global.readProperties();
		this.driver = driver;
		login = new Login(driver);
		PageFactory.initElements(driver, this);
	}

	public void login() {
		login.credentials();
	}

	public void menuBar() {
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@id='ajaxHeader']//div[@class='menubar']//div[@id='moduleList']//ul[@class='last']/li//span/a"));

		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// }

		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), Prop.getProperty("FranchiseeMenu" + i));
		}
	}

	public void urlCheck() {
		driver.get(
				"https://dev.filtasymphony.com/index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DHome%26action%3Dindex%26type%3Dmenu");
		waitLoader();
		link.click();
		ArrayList<String> Array = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Array.get(1));
		Assert.assertEquals(driver.getCurrentUrl(), Prop.getProperty("HomeURL"));
		driver.close();
		driver.switchTo().window(Array.get(0));
	}

	public void customers() {
		driver.get(
				"https://dev.filtasymphony.com/index.php?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DHome%26action%3Dindex%26type%3Dmenu");
		waitLoader();
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@class='left-panel'][1]//div[@class='left-panel-national'][1]//div[@class='left-panel-national-block-link clearfix']//ul//li"));

		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// }

		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), Prop.getProperty("FranchiseeCustomerMenuScreen" + i));
		}
	}

	public void leads() {
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@class='left-panel'][1]//div[@class='left-panel-national'][2]//div[@class='left-panel-national-block-link clearfix']//ul//li"));

		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// }

		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), Prop.getProperty("FranchiseeLeadsMenuScreen" + i));
		}
	}

	public void nca() {
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@class='main-wrapper clearfix']//div[@class='left-panel'][2]//div[@class='left-panel-national'][1]//ul//li"));

		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// }

		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), Prop.getProperty("FranchiseeNCAMenuScreen" + i));
		}
	}

	public void filtaBio() {
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@class='main-wrapper clearfix']//div[@class='left-panel'][2]//div[@class='left-panel-national'][2]//ul//li"));

		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// }

		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), Prop.getProperty("FranchiseeFiltaBioMenuScreen" + i));
		}
	}

	public void techHiring() {
		Assert.assertEquals(tech.getText(), Prop.getProperty("FranchiseeTechMenuScreen0"));

	}

	public void myFranchisee() {
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@class='main-wrapper clearfix']//div[@class='left-panel'][3]//div[@class='left-panel-national'][1]//ul//li"));
		//
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// }

		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), Prop.getProperty("MyFranchiseeMenuScreen" + i));
		}
	}

	public void filtaGold() {
		Assert.assertEquals(filtagold.getText(), Prop.getProperty("FiltaGoldMenuScreen"));

	}

	public void checkText() {
		Assert.assertEquals(email_summary.getText(), Prop.getProperty("HomeText1"));
		Assert.assertEquals(email_summary2.getText(), Prop.getProperty("HomeText2"));
		System.out.println("Test => " + email_summary3.getText());
		Assert.assertEquals(email_summary3.getText(), Prop.getProperty("HomeText3"));
		Assert.assertEquals(homeText.getText(), Prop.getProperty("HomeText4"));
		Assert.assertEquals(Customerlabel.getText(), Prop.getProperty("HomeCustomerLabel"));
		Assert.assertEquals(NCALabel.getText(), Prop.getProperty("HomeNCALabel"));
		Assert.assertEquals(Leadlabel.getText(), Prop.getProperty("HomeLeadLabel"));
		Assert.assertEquals(FiltaBiolabel.getText(), Prop.getProperty("HomeFiltaBioLabel"));
		Assert.assertEquals(Techhiringlabel.getText(), Prop.getProperty("HomeTechLabel"));
		Assert.assertEquals(filtaGoldlabel.getText(), Prop.getProperty("HomeFiltaGoldlabel"));
		Assert.assertEquals(myFranchiseelabel.getText(), Prop.getProperty("HomeMyFranchiseelabel"));
		Assert.assertEquals(homeDashletlabel.getText(), Prop.getProperty("HomeDashletlabel"));

	}

	public void tableTest() {
		List<WebElement> list = driver.findElements(By.xpath(".//table[@id='campaignerData']//tbody//tr"));
		List<WebElement> list2 = driver.findElements(By.xpath(".//table[@id='campaignerData']//tbody//tr[1]//th"));
		global.wait(driver).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//table[@id='campaignerData']//tbody//tr")));
		Assert.assertEquals(list.size(), Integer.parseInt(Prop.getProperty("HomeTable1Rows")));
		Assert.assertEquals(list2.size(), Integer.parseInt(Prop.getProperty("HomeTable1Column")));

		// for (int i = 0; i < list2.size(); i++) {
		// if (i != 0)
		// System.out.println(list2.get(i).getText());
		// }

		// Checks the Column Names
		for (int i = 0; i < list2.size(); i++) {
			if (i != 0) {
				Assert.assertEquals(list2.get(i).getText(), Prop.getProperty("Hometable1ColumnHeading" + i));
			}
		}

		// Checks the Row Names
		for (int i = 2; i < list.size(); i++) {
			Assert.assertEquals(driver
					.findElement(By.xpath(".//table[@id='campaignerData']//tbody//tr[" + i + "]//td[1]")).getText(),
					Prop.getProperty("HomeTabale1RowName" + i));
		}

		// Checks Table Column Data
		for (int i = 2; i < list.size(); i++) {
			Assert.assertEquals(driver
					.findElement(By.xpath(".//table[@id='campaignerData']//tbody//tr[" + i + "]//td[2]")).getText(),
					Prop.getProperty("HomeTableRow1Data"));
			Assert.assertEquals(driver
					.findElement(By.xpath(".//table[@id='campaignerData']//tbody//tr[" + i + "]//td[3]")).getText(),
					Prop.getProperty("HomeTableRow1Data"));
			Assert.assertEquals(driver
					.findElement(By.xpath(".//table[@id='campaignerData']//tbody//tr[" + i + "]//td[4]")).getText(),
					Prop.getProperty("HomeTableRow1Data"));
		}
	}

	public void toolTipCheck() {
		Assert.assertEquals(noteToolTip.getAttribute("title"), Prop.getProperty("HomeCustomerTooltip"));
		Assert.assertEquals(leadToolTip1.getAttribute("title"), Prop.getProperty("HomeLeadTooltip1"));
		Assert.assertEquals(leadToolTip2.getAttribute("title"), Prop.getProperty("HomeLeadTooltip2"));
		Assert.assertEquals(leadToolTip3.getAttribute("title"), Prop.getProperty("HomeLeadTooltip3"));
		Assert.assertEquals(leadToolTip4.getAttribute("title"), Prop.getProperty("HomeLeadTooltip4"));
		Assert.assertEquals(filtagoldToolTip.getAttribute("title"), Prop.getProperty("HomeFiltaGoldToolTip1"));
	}

	public void widgetTesting() {
		driver.get("https://dev.filtasymphony.com/index.php?module=Home&action=index&type=widget");
		Assert.assertEquals(homeDashletlabel2.getText(), Prop.getProperty("HomeDashletlabel2"));
		Assert.assertEquals(homeDashletlabel2.isDisplayed(), true);
		Assert.assertEquals(homeDashletlabel3.getText(), Prop.getProperty("HomeDashletlabel3"));
		Assert.assertEquals(homeDashletlabel3.isDisplayed(), true);
		homeDashletlabel2.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(dashletDialog));
		Assert.assertEquals(searchWidet.isEnabled(), true);
		Assert.assertEquals(searchButton.getAttribute("value"), Prop.getProperty("HomeDashletSearchButtonLabel"));
		Assert.assertEquals(clearButton.getAttribute("value"), Prop.getProperty("HomeDashletClearButtonLabel"));
		Assert.assertEquals(searchButton.isDisplayed(), true);
		Assert.assertEquals(clearButton.isDisplayed(), true);
		Assert.assertEquals(tapNameWidget1.getText(), Prop.getProperty("tapNameWidget1"));
		Assert.assertEquals(tapNameWidget2.getText(), Prop.getProperty("tapNameWidget2"));
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@class='yui-panel-container yui-dialog shadow']//div[@id='moduleDashletsList']//tbody//tr//td"));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}

		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i).getText(), " " + Prop.getProperty("Module" + i));
		}
	}

	public void waitLoader() {
		global.wait(driver)
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//div[@id='ajaxloading_mask']")));
	}

	public void closeBrowser() {
		driver.close();
	}
}