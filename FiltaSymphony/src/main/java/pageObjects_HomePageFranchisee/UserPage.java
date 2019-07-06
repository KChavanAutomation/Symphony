package pageObjects_HomePageFranchisee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import helper.UserPage_Interface;
import util.Login;
import util.ReadExcelData;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import util.Global;
import util.Logout;

public class UserPage implements UserPage_Interface
{
	private Global global;
	private WebDriver driver;
	private Properties Prop;
	private Login login;
	private String User_Name;
	private String First_Name;
	private String Last_Name;
	private String Filta_User_Type;
	private String Status;
	private String User_Type;
	private boolean Send_Remainder;
	private String Employee_Status;
	private String Title;
	private String Department;
	private String[] IM_Type;
	private String Default_IM_Type;
	private String Address_Street;
	private String Address_State;
	private String Address_Country;
	private String StandardRate;
	private String Description;
	private boolean Display_Employee_Record;
	private String Work_Phone;
	private String Mobile;
	private String Other_Phone;
	private String Fax;
	private String IM_Name;
	private String Address_City;
	private String AddressPostalZipCodel;
	private String WeeklyStandardHours;
	private String[] WeeklyStandardHoursMin;
	private String DefaultWeeklyStandardHoursMin;
	private String OverTimeRate;
	private String EmailAddress1;
	private boolean PrimaryRadio1;
	private boolean PrimaryReplyTo;
	private String[] EmailClient;
	private String DefaultEmailClient;
	private ReadExcelData UserData;
	private ReadExcelData PasswordData;
	private ReadExcelData ThemeData;
	private ReadExcelData AdvancedData;
	private ReadExcelData LayoutData;
	private ReadExcelData LocalSettingData;
	private ReadExcelData CalendarOptionData;
	private ReadExcelData AccessData;

	private String Alert1;
	private String Alert2;
	private String Number = null;
	private int countZero;
	private int countDollar;
	private int countComma;
	private int countDecimal;
	private int countNumber;

	private String ExportDelimiter;
	private String ImportExportCharSet;
	private boolean ShowFullNameValue;
	private boolean NotifyOnAssignmentvalue;
	private String DateFormat;
	private String TimeFormat;
	private String TimeZone;
	private String Currency;
	private int CurrencySignificantDigit;
	private String ThousandsSeparator;
	private String DecimalSymbol;
	private String Name;
	private String PublishAtMyLocationValue;
	private String SearchLocation;
	private String iCalValue;
	private String FirstDayOfWeek;
	private boolean RemainEmailTextbox;
	private boolean RemainderPopupTextbox;
	private boolean MailMergetextBox;
	private String PopupEditPage;
	private String EmailEditPage;
	private Logout logout;

	@FindBy(how = How.XPATH, using = ".//a[@class='container-close']")
	private WebElement containerClose;

	@FindBy(how = How.XPATH, using = ".//a[@id='user_link_link']")
	private WebElement topText1;

	@FindBy(how = How.XPATH, using = ".//div[@class='moduleTitle']//h2")
	private WebElement getUserName;

	@FindBy(how = How.XPATH, using = ".//input[@id='SAVE_HEADER']")
	private WebElement SaveButtonHeader;

	@FindBy(how = How.XPATH, using = ".//input[@id='CANCEL_HEADER']")
	private WebElement CancelButtonHeader;

	@FindBy(how = How.XPATH, using = ".//input[@id='reset_user_preferences_header']")
	private WebElement ResetUserPreferencesButtonHeader;

	@FindBy(how = How.XPATH, using = ".//input[@id='reset_homepage_header']")
	private WebElement ResetHomePageButtonHeader;

	@FindBy(how = How.XPATH, using = ".//input[@id='SAVE_FOOTER']")
	private WebElement SaveButtonFooter;

	@FindBy(how = How.XPATH, using = ".//input[@id='CANCEL_FOOTER']")
	private WebElement CancelButtonFooter;

	@FindBy(how = How.XPATH, using = ".//input[@id='reset_user_preferences_footer']")
	private WebElement ResetUserPreferencesButtonFooter;

	@FindBy(how = How.XPATH, using = ".//input[@id='reset_homepage_footer']")
	private WebElement ResetHomePageButtonFooter;

	@FindBy(how = How.XPATH, using = ".//input[@id='edit_button']")
	private WebElement EditButton;

	@FindBy(how = How.XPATH, using = ".//a[@id='tab1']//em")
	private WebElement Tab1OnEditPage;

	@FindBy(how = How.XPATH, using = ".//input[@id='user_name']")
	private WebElement editUname;

	@FindBy(how = How.XPATH, using = ".//input[@id='first_name']")
	private WebElement editFirstName;

	@FindBy(how = How.XPATH, using = ".//input[@id='last_name']")
	private WebElement editLastName;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][3]//td[@class='edit-table-row1'][4]")
	private WebElement editFiltaUserType;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][2]//td[@class='edit-table-row1'][2]")
	private WebElement editStatus;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][3]//td[@class='edit-table-row1'][2]")
	private WebElement editUserType;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][5]//td[@class='edit-table-row1'][2]")
	private WebElement editSendRemainder;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][1]//td[@class='edit-table-row1'][2]")
	private WebElement editEmployeeStatus;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][2]//td[@class='edit-table-row1'][2]")
	private WebElement editTitle;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][3]//td[@class='edit-table-row1'][2]")
	private WebElement editDepartment;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][7]//td[@class='edit-table-row1'][2]//input")
	private WebElement editAddressStreet;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][8]//td[@class='edit-table-row1'][2]//input")
	private WebElement editAddressState;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][9]//td[@class='edit-table-row1'][2]//input")
	private WebElement editAddressCountry;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][10]//td[@class='edit-table-row1'][2]//input")
	private WebElement editStandardRate;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][11]//td[@class='edit-table-row1'][2]//textarea")
	private WebElement editDescription;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][1]//td[@class='edit-table-row1'][4]")
	private WebElement editDisplayEmployeeRecord;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][2]//td[@class='edit-table-row1'][4]//input")
	private WebElement editWorkPhone;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][3]//td[@class='edit-table-row1'][4]//input")
	private WebElement editMobile;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][4]//td[@class='edit-table-row1'][4]//input")
	private WebElement editOtherPhone;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][5]//td[@class='edit-table-row1'][4]//input")
	private WebElement editFax;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][6]//td[@class='edit-table-row1'][4]//input")
	private WebElement editIMName;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][7]//td[@class='edit-table-row1'][4]//input")
	private WebElement editAddressCity;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][8]//td[@class='edit-table-row1'][4]//input")
	private WebElement editAddressPostalZipCode;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][9]//td[@class='edit-table-row1'][4]//input")
	private WebElement editWeeklyStandardHours;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][10]//td[@class='edit-table-row1'][4]//input")
	private WebElement editOverTimeRate;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_options']//table[@class='emailaddresses_span']//tr[@id='Users0emailAddressRow0']//input[@id='Users0emailAddress0']")
	private WebElement editEmailAddress1;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_options']//table[@class='emailaddresses_span']//input[@type='radio' and @id='Users0emailAddressPrimaryFlag0']")
	private WebElement editPrimaryRadio;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_options']//table[@class='emailaddresses_span']//input[@type='radio' and @id='Users0emailAddressReplyToFlag0']")
	private WebElement editPrimaryReplyToRadio;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][9]//td[@class='edit-table-row1'][4]//select")
	private WebElement editDefaultMin;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_options']//select[@id='email_link_type']")
	private WebElement editDefaultEmailClient;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//tr[1]//td[2]//span")
	private WebElement UserProfile_Fullname;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//tr[1]//td[4]//span")
	private WebElement UserProfile_Username;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//tr[2]//td[2]")
	private WebElement UserProfile_Status;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//tr[2]//td[4]//span")
	private WebElement UserProfile_UserType;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//tr[3]//td[2]")
	private WebElement UserProfile_FiltaUserType;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//tr[4]//td[2]")
	private WebElement UserProfile_StoreAccess;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//tr[5]//td[2]//input")
	private WebElement UserProfile_SendRemainder;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[1]//td[2]//span")
	private WebElement UserProfile_EmployeeStatus;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[1]//td[4]")
	private WebElement UserProfile_DisplayEmployeeRecord;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[2]//td[2]//span")
	private WebElement UserProfile_Title;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[2]//td[4]")
	private WebElement UserProfile_WorkPhone;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[3]//td[2]")
	private WebElement UserProfile_Department;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[3]//td[4]")
	private WebElement UserProfile_Mobile;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[4]//td[2]//span")
	private WebElement UserProfile_ReportsTo;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[4]//td[4]")
	private WebElement UserProfile_OtherPhone;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[5]//td[4]")
	private WebElement UserProfile_Fax;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[6]//td[2]")
	private WebElement UserProfile_IMType;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][6]//td[@class='edit-table-row1'][2]//select")
	private WebElement editDefaultIMType;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[6]//td[4]//span")
	private WebElement UserProfile_IMName;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[7]//td[2]//span")
	private WebElement UserPRofile_AddressStreet;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[7]//td[4]//span")
	private WebElement UserProfile_AddressCity;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[8]//td[2]//span")
	private WebElement UserProfile_AddressState;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[9]//td[2]//span")
	private WebElement UserProfile_AddressCounty;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[9]//td[4]//span")
	private WebElement UserProfile_WeeklyStandardHours;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[8]//td[4]//span")
	private WebElement UserProfile_AddressPostalZipCode;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[10]//td[2]//span")
	private WebElement UserProfile_StandardRate;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[10]//td[4]//span")
	private WebElement UserProfile_OverTimeRate;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//tr[11]//td[2]//span")
	private WebElement UserPRofile_Description;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_options']//tbody//tr[2]//a")
	private WebElement UserProfile_PrimaryEmail;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_options']//tbody//tr[3]//td[2]")
	private WebElement UserProfile_SugarClient;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_USER_INFORMATION']//h4")
	private WebElement UserProfile_UserLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='LBL_EMPLOYEE_INFORMATION']//h4")
	private WebElement UserProfile_EmployeeLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='email_options']//h4")
	private WebElement UserProfile_EmailLabel;

	@FindBy(how = How.XPATH, using = ".//ul[@id='groupTabs']//a")
	private WebElement UserProfile_AllLabel;

	@FindBy(how = How.XPATH, using = ".//a[@id='tab2']//em")
	private WebElement Tab2OnEditPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='generate_password']//h4")
	private WebElement PasswordPage_PasswordLabel;

	@FindBy(how = How.CSS, using = "#generate_password_old_password > table > tbody > tr > td:nth-child(1)")
	private WebElement PasswordPage_CurrentPasswordLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='generate_password']//table[2]//tbody//tr[1]//td[1]")
	private WebElement PasswordPage_NewPasswordLabel;

	@FindBy(how = How.CSS, using = "#generate_password > table > tbody > tr > td > table:nth-child(3) > tbody > tr:nth-child(2) > td:nth-child(1)")
	private WebElement PasswordPage_ConfirmPassword;

	@FindBy(how = How.CSS, using = "#generate_password > table > tbody > tr > td > table:nth-child(3) > tbody > tr:nth-child(3) > td")
	private WebElement PasswordPage_Note;

	@FindBy(how = How.XPATH, using = ".//input[@id='old_password']")
	private WebElement CurrentpasswordInput;

	@FindBy(how = How.XPATH, using = ".//input[@id='new_password']")
	private WebElement NewPasswordInput;

	@FindBy(how = How.XPATH, using = ".//input[@id='confirm_pwd']")
	private WebElement ConfirmPasswordInput;

	@FindBy(how = How.XPATH, using = ".//div[@id='comfirm_pwd_match']")
	private WebElement PasswordValidation;

	@FindBy(how = How.XPATH, using = ".//div[@id='sugarMsgWindow']//div[@id='sugarMsgWindow_h']")
	private WebElement PasswordUpdatedLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='sugarMsgWindow']//div[@class='bd']")
	private WebElement PasswordUpdatedLabel2;

	@FindBy(how = How.XPATH, using = ".//span[@id='error_pwd']")
	private WebElement PasswordErrorMessage;

	@FindBy(how = How.XPATH, using = ".//div[@id='sugarMsgWindow']//a[@class='container-close']")
	private WebElement SugarDashletClose;

	@FindBy(how = How.XPATH, using = ".//a[@id='tab3']")
	private WebElement Tab3OnEditPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='themepicker']//h4")
	private WebElement ThemeLabel;

	@FindBy(how = How.XPATH, using = ".//select[@name='user_theme']")
	private WebElement DefaultTheme;

	@FindBy(how = How.XPATH, using = ".//a[@id='tab4']")
	private WebElement Tab4OnEditPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//h4")
	private WebElement UserSettingLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[2]//td[1]")
	private WebElement ExportDelimiterLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[2]//td[2]//input")
	private WebElement ExportDelimiterlabelTextbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[2]//td[3]")
	private WebElement NotifyOnAssignment;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[2]//td[4]//input")
	private WebElement NotifyOnAssignmentCheckBox;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[1]")
	private WebElement ImportExportLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[2]//select")
	private WebElement DefaultSelectedImportExport;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[3]")
	private WebElement RemainderLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[4]//div[1]//div[1]")
	private WebElement Popup;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[4]//div[1]//input[2]")
	private WebElement DefaultPopupCheckbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[4]//div[2]//input[2]")
	private WebElement DefaultEmailCheckBox;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[4]//div[2]/div[1]")
	private WebElement Email;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[4]//td[1]")
	private WebElement ShowFullName;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[4]//td[2]//input")
	private WebElement DefaultShowFullameCheckbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[4]//td[4]//input")
	private WebElement DefaultMailMergeCheckBox;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//tbody[1]//tr//th//h4")
	private WebElement LayoutOption;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//tbody[1]//tr[@id='use_group_tabs_row']//span")
	private WebElement ModuleMenuLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//tbody[1]//tr[@id='use_group_tabs_row']//input[2]")
	private WebElement ModuleMenuLabelCheckbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//table//tbody//tr[3]//h4")
	private WebElement SelectModule;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//table//tbody//tr[3]//tr[1]//td[2][@id='chooser_display_tabs_text']//nobr")
	private WebElement DisplayModule;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//table//tbody//tr[3]//tr[1]//td[4][@id='chooser_hide_tabs']//nobr")
	private WebElement HideModule;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//table//tbody//tr[4]//td//span")
	private WebElement SubPanelTab;

	@FindBy(how = How.XPATH, using = ".//div[@id='layout']//table//tbody//tr[4]//td[2]//input")
	private WebElement SubPanelCheckbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[1]//h4//slot")
	private WebElement LocalSetting;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[2]//td[1]//slot")
	private WebElement DataFormatLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[2]//td[3]//slot")
	private WebElement CurrencyLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[3]//td[1]//slot")
	private WebElement TimeFormatLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[3]//td[3]//slot")
	private WebElement CurrencySignificantDigitsLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[2]//td[2]//select")
	private WebElement DefaultDateFormat;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[2]//td[4]//select")
	private WebElement DefaultCurrency;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[3]//td[2]//select")
	private WebElement DefaultTimeFormat;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[3]//td[4]//select")
	private WebElement DefaultCurrencySignificantDigits;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[4]//td[1]//slot")
	private WebElement TimeZoneLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[4]//td[3]//slot")
	private WebElement ExampleLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[4]//td[4]//slot//input")
	private WebElement ExampleTextbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[5]//td[3]//slot")
	private WebElement separatorLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[5]//td[4]//slot//input")
	private WebElement sepratorTextbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[6]//td[1]")
	private WebElement NameDisplayFormatLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[6]//td[3]//slot")
	private WebElement DecimalSymbolLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[6]//td[4]//slot//input")
	private WebElement DecimalSymbolTextbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//h4")
	private WebElement CalendarOptionLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[2]//td[1]//slot")
	private WebElement PublishKeyLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[2]//td[2]//slot//input")
	private WebElement PublishKeyTextbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[3]//td[1]//slot")
	private WebElement PublishAtMyLocation;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[3]//td[2]//slot")
	private WebElement PublishAtMyLocationText;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[4]//td[1]//slot")
	private WebElement SearchLocationLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[4]//td[2]//slot")
	private WebElement SearchLocationText;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[5]//td[1]//slot")
	private WebElement iCalintegrationURLLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[5]//td[2]//slot")
	private WebElement iCalintegrationText;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[6]//td[1]//slot")
	private WebElement FirstDayOfWeekLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[6]//td[2]//slot//select")
	private WebElement DefaultFirstdayOfWeek;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[4]//td[2]//select")
	private WebElement DefaultTimeZone;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tbody//tr[6]//td[2]//select")
	private WebElement DefaultName;

	@FindBy(how = How.XPATH, using = ".//div[@id='user_detailview_tabs']//ul[1]//li[2]")
	private WebElement AdvancedTab;

	@FindBy(how = How.XPATH, using = ".//div[@id='user_detailview_tabs']//ul[1]//li[2]//em")
	private WebElement AdvancedTabLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//h4//slot")
	private WebElement UserSettingUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[2]//td[1]//slot")
	private WebElement NotifyOnAssignmentUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[2]//td[2]//slot")
	private WebElement NotifyOnAssignmentValueUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[2]//td[3]//slot")
	private WebElement NotifyOnAssignmentTextUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[1]//slot")
	private WebElement RemainderUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[2]//slot//div[1]//input")
	private WebElement PopupCheckBoxUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[2]//slot//div[2]//input")
	private WebElement EmailCheckBoxUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[2]//slot//div[1]")
	private WebElement PopupUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[2]//slot//div[2]")
	private WebElement EmailUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[3]//td[3]//slot")
	private WebElement RemainderText;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[4]//td[1]//slot")
	private WebElement MailMergeuserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[4]//td[2]//slot//input")
	private WebElement MailMergeUserPageCheckBox;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[4]//td[3]//slot")
	private WebElement MailMergeTextUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[5]//td[1]//slot")
	private WebElement URLUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[5]//td[2]//slot")
	private WebElement URLUserPage2;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[5]//td[3]//slot")
	private WebElement URLUserPage3;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[6]//td[1]//slot")
	private WebElement ExportDelimiterUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[6]//td[2]//slot")
	private WebElement ExportDelimiterTextboxUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[6]//td[3]//slot")
	private WebElement ExportDelimiterText;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[7]//td[1]//slot")
	private WebElement ImportExportUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[7]//td[2]//slot")
	private WebElement ImportExportText;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[7]//td[3]//slot")
	private WebElement ImportExportTextUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[8]//td[1]//slot")
	private WebElement ShowFullNamesTextUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[8]//td[2]//slot//input")
	private WebElement ShowFullNameTextBox;

	@FindBy(how = How.XPATH, using = ".//div[@id='settings']//tr[8]//td[3]//slot")
	private WebElement ShowFullNameUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//h4//slot")
	private WebElement LocaleUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[2]//td[1]//slot")
	private WebElement DataFormatUserPageLabel;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[2]//td[2]//slot")
	private WebElement DataFormatText;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[2]//td[3]//slot")
	private WebElement DataFormatTextUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[3]//td[1]//slot")
	private WebElement TimeFormatUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[3]//td[2]//slot")
	private WebElement TimeFormatValueUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[3]//td[3]//slot")
	private WebElement TimeFormatText;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[4]//td[1]//slot")
	private WebElement TimeZoneUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[4]//td[2]//slot")
	private WebElement TimeZoneValueUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[5]//td[1]//slot")
	private WebElement CurrencyUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[5]//td[2]//slot")
	private WebElement CurrencyValueUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[5]//td[3]//slot")
	private WebElement CurrencyText;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[6]//td[1]//slot")
	private WebElement CurrencyDigitUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[6]//td[2]//slot")
	private WebElement CurrencyDigitValueUserpage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[6]//td[3]//slot")
	private WebElement CurrencyDigitTextUserpage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[7]//td[1]//slot")
	private WebElement ThousandsUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[7]//td[2]//slot")
	private WebElement ThousandsValueUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[7]//td[3]//slot")
	private WebElement ThousandsTextValueUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[8]//td[1]//slot")
	private WebElement DecimalUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[8]//td[2]//slot")
	private WebElement DecilamlValueUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[8]//td[3]")
	private WebElement DeciamlTextUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[1]//slot")
	private WebElement NameDisplayUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[2]//slot//i[1]")
	private WebElement NameDisplayValueOneUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[2]//slot//i[2]")
	private WebElement NameDisplayValueSecondUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[2]//slot//i[3]")
	private WebElement NameDisplayValueThirdUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[2]//slot//i[4]")
	private WebElement NameDisplayValueForthUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[2]//slot//i[5]")
	private WebElement NameDisplayValueFifthUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[2]//slot//i[6]")
	private WebElement NameDisplayValueSixthUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='locale']//tr[9]//td[3]")
	private WebElement NameDisplayTextUserPage;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//h4//slot")
	private WebElement CalendarOption;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[2]//td[1]//slot")
	private WebElement Publish_Key;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[2]//td[2]//slot")
	private WebElement Publish_Key_Text;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[3]//td[1]//slot")
	private WebElement Publish_at_my_location;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[3]//td[2]//slot")
	private WebElement Publish_at_my_location_text;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[4]//td[1]//slot")
	private WebElement Search_Location;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[4]//td[2]//slot")
	private WebElement Search_Location_Text;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[5]//td[1]//slot")
	private WebElement iCal;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[5]//td[2]//slot")
	private WebElement iCal_Text;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[6]//td[1]//slot")
	private WebElement First_Day_Of_Week;

	@FindBy(how = How.XPATH, using = ".//div[@id='calendar_options']//tr[6]//td[2]//slot")
	private WebElement First_Day_Of_Week_Text;

	@FindBy(how = How.XPATH, using = ".//div[@id='edit_tabs']//h4//slot")
	private WebElement Layout_Option;

	@FindBy(how = How.XPATH, using = ".//div[@id='edit_tabs']//tr[2]//td[1]//slot")
	private WebElement Module_Menu_Filter;

	@FindBy(how = How.XPATH, using = ".//div[@id='edit_tabs']//tr[2]//td[2]//slot")
	private WebElement Module_Menu_Filter_Checkbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='edit_tabs']//tr[2]//td[3]//slot")
	private WebElement Module_Menu_Filter_text;

	@FindBy(how = How.XPATH, using = ".//div[@id='edit_tabs']//tr[3]//td[1]//slot")
	private WebElement SubPanel_Tab;

	@FindBy(how = How.XPATH, using = ".//div[@id='edit_tabs']//tr[3]//td[2]//slot")
	private WebElement SubPanel_Tab_Checkbox;

	@FindBy(how = How.XPATH, using = ".//div[@id='edit_tabs']//tr[3]//td[3]//slot")
	private WebElement SubPanel_Tab_Text;

	@FindBy(how = How.XPATH, using = ".//li[@id='All_sp_tab']//a")
	private WebElement All;

	@FindBy(how = How.XPATH, using = ".//div[@id='user_detailview_tabs']//ul[@class='yui-nav']//li[3]//a")
	private WebElement Access;

	@FindBy(how = How.XPATH, using = ".//div[@class='table-responsive-edit']//table//tbody//tr[2]//td[2]")
	private WebElement EnabledColor;

	@FindBy(how = How.XPATH, using = ".//div[@class='table-responsive-edit']//table//tbody//tr[2]//td[3]")
	private WebElement NoneColor;

	@FindBy(how = How.XPATH, using = ".//div[@class='table-responsive-edit']//table//tbody//tr[3]//td[3]")
	private WebElement AllColor;

	@FindBy(how = How.XPATH, using = ".//div[@class='table-responsive-edit']//table//tbody//tr[6]//td[3]")
	private WebElement OwnerColor;

	@FindBy(how = How.XPATH, using = ".//div[@id='subpanel_title_aclroles']//table//tbody//h3/span[1]")
	private WebElement Roles;

	@FindBy(how = How.XPATH, using = ".//div[@class='detail-table-overflow']//table//tr[2]//th[1]//a")
	private WebElement Roles_Name;

	@FindBy(how = How.XPATH, using = ".//div[@class='detail-table-overflow']//table//tr[2]//th[2]//span")
	private WebElement Roles_Description;

	@FindBy(how = How.XPATH, using = ".//div[@class='detail-table-overflow']//table//tr[3]//td[1]//span")
	private WebElement Roles_Franchisee;

	@FindBy(how = How.XPATH, using = ".//div[@class='detail-table-overflow']//table//tr[3]//td[2]//span")
	private WebElement Roles_Not_Delete;

	@FindBy(how = How.XPATH, using = ".//ul[@id='groupTabs']//li//a")
	private WebElement Roles_ALL;


	public UserPage(WebDriver driver)
	{
		global = new Global();
		Prop = global.readProperties();
		this.driver = driver;
		login = new Login(driver);
		logout = new Logout(driver);
		PageFactory.initElements(driver, this);
		UserData = new ReadExcelData(Prop.getProperty("Path1"), "UserProfile");
		PasswordData = new ReadExcelData(Prop.getProperty("Path1"), "Password");
		ThemeData = new ReadExcelData(Prop.getProperty("Path1"), "Theme");
		AdvancedData = new ReadExcelData(Prop.getProperty("Path1"), "Advanced");
		LayoutData = new ReadExcelData(Prop.getProperty("Path1"), "Layout");
		LocalSettingData = new ReadExcelData(Prop.getProperty("Path1"), "Locale Settings");
		CalendarOptionData = new ReadExcelData(Prop.getProperty("Path1"), "Calrendar");
		AccessData = new ReadExcelData(Prop.getProperty("Path1"), "Access");
	}


	public void login()
	{
		login.credentials();
	}


	public void urlCheck()
	{
		global.wait(driver).until(ExpectedConditions.visibilityOf(containerClose));
		containerClose.click();
		topText1.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(getUserName));
		Assert.assertEquals(driver.getCurrentUrl(), Prop.getProperty("UserPageURL"));
	}


	public void buttonCheck()
	{
		Assert.assertEquals(SaveButtonHeader.getAttribute("value"), Prop.getProperty("UserPageSaveButtonNameHeader"));
		Assert.assertEquals(CancelButtonHeader.getAttribute("value"),
				Prop.getProperty("UserPageCancelButtonNameHeader"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getAttribute("value"),
				Prop.getProperty("UserPageResetUserPreferencesButtonHeader"));
		Assert.assertEquals(ResetHomePageButtonHeader.getAttribute("value"),
				Prop.getProperty("UserPageResetHomepageButtonHeader"));
		Assert.assertEquals(SaveButtonFooter.getAttribute("value"), Prop.getProperty("UserPageSaveButtonNameFooter"));
		Assert.assertEquals(CancelButtonFooter.getAttribute("value"),
				Prop.getProperty("UserPageCancelButtonNameFooter"));
		Assert.assertEquals(ResetUserPreferencesButtonFooter.getAttribute("value"),
				Prop.getProperty("UserPageResetUserPreferencesButtonFooter"));
		Assert.assertEquals(ResetHomePageButtonFooter.getAttribute("value"),
				Prop.getProperty("UserPageResetHomepageButtonFooter"));
		CancelButtonHeader.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(EditButton));
		Assert.assertEquals(EditButton.getAttribute("value"), Prop.getProperty("UserPageEditButton"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getAttribute("value"),
				Prop.getProperty("UserPageResetUserPreferencesButtonHeader"));
		Assert.assertEquals(ResetHomePageButtonHeader.getAttribute("value"),
				Prop.getProperty("UserPageResetHomepageButtonHeader"));
	}


	public void buttonBackGroundWithoutMouseOverview()
	{
		Assert.assertEquals(EditButton.getCssValue("background"),
				Prop.getProperty("UserPageEditButtonBackGroundColorBlue"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getCssValue("background"),
				Prop.getProperty("UserPageResetUserPreferencesButtonBackGroundColorBlue"));
		Assert.assertEquals(ResetHomePageButtonHeader.getCssValue("background"),
				Prop.getProperty("UserPageResetHomePageButtonBackGroundColorBlue"));
		// Text Color Assertion
		Assert.assertEquals(EditButton.getCssValue("color"), Prop.getProperty("UserPageEditButtonTextWhite"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getCssValue("color"),
				Prop.getProperty("UserPageResetUserPreferencesButtonTextWhite"));
		Assert.assertEquals(ResetHomePageButtonHeader.getCssValue("color"),
				Prop.getProperty("UserPageResetHomePageButtonTextWhite"));
		EditButton.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(getUserName));
		Assert.assertEquals(SaveButtonHeader.getCssValue("background"),
				Prop.getProperty("UserPageSaveButtonHeaderBackGroundColorBlue"));
		Assert.assertEquals(CancelButtonHeader.getCssValue("background"),
				Prop.getProperty("UserPageCancelButtonHeaderBackGroundColorBlue"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getCssValue("background"),
				Prop.getProperty("UserPageResetUserPreferencesButtonHeaderBackGroundColorBlue"));
		Assert.assertEquals(ResetHomePageButtonHeader.getCssValue("background"),
				Prop.getProperty("UserPageResetHomePageButtonHeaderBackGroundColorBlue"));
		Assert.assertEquals(SaveButtonFooter.getCssValue("background"),
				Prop.getProperty("UserPageSaveButtonFooterBackGroundColorBlue"));
		Assert.assertEquals(CancelButtonFooter.getCssValue("background"),
				Prop.getProperty("UserPageCancelButtonFooterBackGroundColorBlue"));
		Assert.assertEquals(ResetUserPreferencesButtonFooter.getCssValue("background"),
				Prop.getProperty("UserPageResetUserPreferencesButtonFooterBackGroundColorBlue"));
		Assert.assertEquals(ResetHomePageButtonFooter.getCssValue("background"),
				Prop.getProperty("UserPageResetHomePageButtonFooterBackGroundColorBlue"));
		// Text Color Assertion
		Assert.assertEquals(SaveButtonHeader.getCssValue("color"),
				Prop.getProperty("UserPageSaveButtonHeaderTextWhite"));
		Assert.assertEquals(CancelButtonHeader.getCssValue("color"),
				Prop.getProperty("UserPageCancelButtonHeaderTextWhite"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getCssValue("color"),
				Prop.getProperty("UserPageResetUserPreferencesButtonHeaderTextWhite"));
		Assert.assertEquals(ResetHomePageButtonHeader.getCssValue("color"),
				Prop.getProperty("UserPageResetHomePageButtonHeaderTextWhite"));
		Assert.assertEquals(SaveButtonFooter.getCssValue("color"),
				Prop.getProperty("UserPageSaveButtonFooterTextWhite"));
		Assert.assertEquals(CancelButtonFooter.getCssValue("color"),
				Prop.getProperty("UserPageCancelButtonFooterTextWhite"));
		Assert.assertEquals(ResetUserPreferencesButtonFooter.getCssValue("color"),
				Prop.getProperty("UserPageResetUserPreferencesButtonFooterTextWhite"));
		Assert.assertEquals(ResetHomePageButtonFooter.getCssValue("color"),
				Prop.getProperty("UserPageResetHomePageButtonFooterTextWhite"));
	}


	public void buttonBackGroundWithMouseOverview()
	{
		global.action(driver).moveToElement(SaveButtonHeader).build().perform();
		Assert.assertEquals(SaveButtonHeader.getCssValue("border-color"),
				Prop.getProperty("UserPageSaveButtonHeaderBackGroundColorGreen"));
		global.action(driver).moveToElement(CancelButtonHeader).build().perform();
		Assert.assertEquals(CancelButtonHeader.getCssValue("border-color"),
				Prop.getProperty("UserPageCancelButtonHeaderBackGroundColorGreen"));
		global.action(driver).moveToElement(ResetUserPreferencesButtonHeader).build().perform();
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getCssValue("border-color"),
				Prop.getProperty("UserPageResetUserPreferencesButtonHeaderBackGroundColorGreen"));
		global.action(driver).moveToElement(ResetHomePageButtonHeader).build().perform();
		Assert.assertEquals(ResetHomePageButtonHeader.getCssValue("border-color"),
				Prop.getProperty("UserPageResetHomePageButtonHeaderBackGroundColorGreen"));
		global.action(driver).moveToElement(SaveButtonFooter).build().perform();
		Assert.assertEquals(SaveButtonFooter.getCssValue("border-color"),
				Prop.getProperty("UserPageSaveButtonFooterBackGroundColorGreen"));
		global.action(driver).moveToElement(CancelButtonFooter).build().perform();
		Assert.assertEquals(CancelButtonFooter.getCssValue("border-color"),
				Prop.getProperty("UserPageCancelButtonFooterBackGroundColorGreen"));
		global.action(driver).moveToElement(ResetUserPreferencesButtonFooter).build().perform();
		Assert.assertEquals(ResetUserPreferencesButtonFooter.getCssValue("border-color"),
				Prop.getProperty("UserPageResetUserPreferencesButtonFooterBackGroundColorGreen"));
		global.action(driver).moveToElement(ResetHomePageButtonFooter).build().perform();
		Assert.assertEquals(ResetHomePageButtonFooter.getCssValue("border-color"),
				Prop.getProperty("UserPageResetHomePageButtonFooterBackGroundColorGreen"));
		CancelButtonFooter.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(EditButton));
		global.action(driver).moveToElement(EditButton).build().perform();
		Assert.assertEquals(EditButton.getCssValue("border-color"),
				Prop.getProperty("UserPageEditButtonBackGroundColorGreen"));
		global.action(driver).moveToElement(ResetUserPreferencesButtonHeader).build().perform();
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getCssValue("border-color"),
				Prop.getProperty("UserPageResetUserPreferencesButtonBackGroundColorGreen"));
		global.action(driver).moveToElement(ResetHomePageButtonHeader).build().perform();
		Assert.assertEquals(ResetHomePageButtonHeader.getCssValue("border-color"),
				Prop.getProperty("UserPageResetHomePageButtonBackGroundColorGreen"));
	}


	public void buttonToolTipCheck()
	{
		Assert.assertEquals(EditButton.getAttribute("title"), Prop.getProperty("UserPageEditButtonToolTip"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getAttribute("title"),
				Prop.getProperty("UserPageResetUserPreferencesButtonToolTip"));
		Assert.assertEquals(ResetHomePageButtonHeader.getAttribute("title"),
				Prop.getProperty("UserPageResetHomePageButtonToolTip"));
		EditButton.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(getUserName));
		Assert.assertEquals(SaveButtonHeader.getAttribute("title"),
				Prop.getProperty("UserPageSaveButtonHeaderToolTip"));
		Assert.assertEquals(CancelButtonHeader.getAttribute("title"),
				Prop.getProperty("UserPageCancelButtonHeaderToolTip"));
		Assert.assertEquals(ResetUserPreferencesButtonHeader.getAttribute("title"),
				Prop.getProperty("UserPageResetUserPreferencesButtonHeaderToolTip"));
		Assert.assertEquals(ResetHomePageButtonHeader.getAttribute("title"),
				Prop.getProperty("UserPageResetHomePageButtonHeaderToolTip"));
		Assert.assertEquals(SaveButtonFooter.getAttribute("title"),
				Prop.getProperty("UserPageSaveButtonFooterToolTip"));
		Assert.assertEquals(CancelButtonFooter.getAttribute("title"),
				Prop.getProperty("UserPageCancelButtonFooterToolTip"));
		Assert.assertEquals(ResetUserPreferencesButtonFooter.getAttribute("title"),
				Prop.getProperty("UserPageResetUserPreferencesButtonFooterToolTip"));
		Assert.assertEquals(ResetHomePageButtonFooter.getAttribute("title"),
				Prop.getProperty("UserPageResetHomePageButtonFooterToolTip"));
	}


	public void tabnamesCheck()
	{
		List<WebElement> list = driver.findElements(By.xpath(".//ul[@class='yui-nav']//li//a//em"));
//		 for (int i = 0; i < list.size(); i++) {
//		 System.out.println(list.get(i).getText());
//		 }
		for (int i = 0; i < list.size(); i++)
		{
			if (i == 2)
			{
				break;
			}
			else
			{
				Assert.assertEquals(list.get(i).getText(), Prop.getProperty("TabOnEditPage" + i));
				if (list.get(i).getAttribute("class").equals(Prop.getProperty("userPageClass")))
				{
					Assert.assertEquals(list.get(i).getCssValue("color"),
							Prop.getProperty("TabOnUserPageColorBlue"));
				}
				else if (list.get(i).getAttribute("class").equals("")
						&& list.get(i).getCssValue("color").equals(Prop.getProperty("TabOnUserPageColorGrey2")))
				{
					Assert.assertEquals(list.get(i).getCssValue("color"),
							Prop.getProperty("TabOnUserPageColorGrey2"));
				}
				else if (list.get(i).getAttribute("class").equals("")
						&& list.get(i).getCssValue("color").equals(Prop.getProperty("TabOnUserPageColorGrey")))
				{
					Assert.assertEquals(list.get(i).getCssValue("color"),
							Prop.getProperty("TabOnUserPageColorGrey"));
				}
			}
		}
		// Count of tabs Assertion
		CancelButtonHeader.click();
		global.wait(driver).until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//ul[@class='yui-nav']//li[1]//em")));
		List<WebElement> list2 = driver.findElements(By.xpath(".//ul[@class='yui-nav']//li//em"));
		for (int i = 0; i < list2.size(); i++)
		{
			if (i == 1)
			{
				break;
			}
			else
			{
				Assert.assertEquals(list2.get(i).getText(), Prop.getProperty("TabOnUserPage" + i));

			}
		}
	}


	public void getDataFromEditPageUserProfile()
	{
		global.wait(driver).until(ExpectedConditions.visibilityOf(EditButton));
		EditButton.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(getUserName));
		// To Check Label on User Profile Page
		Assert.assertEquals(UserProfile_UserLabel.getText(), Prop.getProperty("UserProfileLabel1"));
		Assert.assertEquals(UserProfile_UserLabel.getCssValue("color"), Prop.getProperty("UserProfileLabelColor"));
		Assert.assertEquals(UserProfile_EmployeeLabel.getText(), Prop.getProperty("UserProfileLabel2"));
		Assert.assertEquals(UserProfile_EmployeeLabel.getCssValue("color"),
				Prop.getProperty("UserProfileLabelColor"));
		Assert.assertEquals(UserProfile_EmailLabel.getText(), Prop.getProperty("UserProfileLabel3"));
		Assert.assertEquals(UserProfile_EmailLabel.getCssValue("color"), Prop.getProperty("UserProfileLabelColor"));
		// To Get Data From Edit User Page
		User_Name = editUname.getAttribute("value");
		First_Name = editFirstName.getAttribute("value");
		Last_Name = editLastName.getAttribute("value");
		Filta_User_Type = editFiltaUserType.getText();
		Status = editStatus.getText();
		User_Type = editUserType.getText();
		Send_Remainder = editSendRemainder.isSelected();
		Employee_Status = editEmployeeStatus.getText();
		Title = editTitle.getText();
		Department = editDepartment.getText();
		List<WebElement> list = driver.findElements(By.xpath(
				".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][6]//td[@class='edit-table-row1'][2]//select//option"));
		IM_Type = new String[list.size()];
		for (int i = 0; i < list.size(); i++)
		{
			IM_Type[i] = list.get(i).getText();
		}
		Default_IM_Type = global.select(editDefaultIMType).getFirstSelectedOption().getText();
		Address_Street = editAddressStreet.getAttribute("value");
		Address_State = editAddressState.getAttribute("value");
		Address_Country = editAddressCountry.getAttribute("value");
		StandardRate = editStandardRate.getAttribute("value");
		Description = editDescription.getAttribute("value");
		Display_Employee_Record = editDisplayEmployeeRecord.isSelected();
		Work_Phone = editWorkPhone.getAttribute("value");
		Mobile = editMobile.getAttribute("value");
		Other_Phone = editOtherPhone.getAttribute("value");
		Fax = editFax.getAttribute("value");
		IM_Name = editIMName.getAttribute("value");
		Address_City = editAddressCity.getAttribute("value");
		AddressPostalZipCodel = editAddressPostalZipCode.getAttribute("value");
		WeeklyStandardHours = editWeeklyStandardHours.getAttribute("value");
		List<WebElement> list2 = driver.findElements(By.xpath(
				".//div[@id='LBL_EMPLOYEE_INFORMATION']//table[@class='yui3-skin-sam edit view dcQuickEdit edit508'][1]//tr[@class='edit-table1'][9]//td[@class='edit-table-row1'][4]//select//option"));
		WeeklyStandardHoursMin = new String[list2.size()];
		for (int i = 0; i < list2.size(); i++)
		{
			WeeklyStandardHoursMin[i] = list2.get(i).getText();
		}
		DefaultWeeklyStandardHoursMin = global.select(editDefaultMin).getFirstSelectedOption().getText();
		OverTimeRate = editOverTimeRate.getAttribute("value");
		EmailAddress1 = editEmailAddress1.getAttribute("value");
		PrimaryRadio1 = editPrimaryRadio.isSelected();
		PrimaryReplyTo = editPrimaryReplyToRadio.isSelected();
		List<WebElement> list3 = driver
				.findElements(By.xpath(".//div[@id='email_options']//select[@id='email_link_type']//option"));
		EmailClient = new String[list3.size()];
		for (int i = 0; i < list3.size(); i++)
		{
			EmailClient[i] = list3.get(i).getText();
		}
		DefaultEmailClient = global.select(editDefaultEmailClient).getFirstSelectedOption().getText();
		// To Verify Edit Page Data From "UserPage.xlsx" sheet
		Assert.assertEquals(First_Name + " " + Last_Name, UserData.getCellData(1, 0));
		Assert.assertEquals(User_Name, UserData.getCellData(1, 1));
		Assert.assertEquals(Status, UserData.getCellData(1, 2));
		Assert.assertEquals(User_Type.substring(0, 12), UserData.getCellData(1, 3));
		Assert.assertEquals(Filta_User_Type, UserData.getCellData(1, 4));
		Assert.assertEquals(Send_Remainder, false);
		Assert.assertEquals(Employee_Status, UserData.getCellData(1, 5));
		Assert.assertEquals(Display_Employee_Record, false);
		Assert.assertEquals(Title, UserData.getCellData(1, 6));
		Assert.assertEquals(Work_Phone, UserData.getCellData(1, 7));
		Assert.assertEquals(Mobile, UserData.getCellData(1, 8));
		Assert.assertEquals(UserData.getCellData(1, 9), Prop.getProperty("Reports_To"));
		Assert.assertEquals(Other_Phone, UserData.getCellData(1, 10));
		Assert.assertEquals(Fax, UserData.getCellData(1, 11));
		Assert.assertEquals(Default_IM_Type, UserData.getCellData(1, 12));
		Assert.assertEquals(IM_Name, UserData.getCellData(1, 13));
		Assert.assertEquals(Address_Street, UserData.getCellData(1, 14));
		Assert.assertEquals(Address_City, UserData.getCellData(1, 15));
		Assert.assertEquals(Address_State, UserData.getCellData(1, 16));
		Assert.assertEquals(AddressPostalZipCodel, UserData.getCellData(1, 17));
		Assert.assertEquals(Address_Country, UserData.getCellData(1, 18));
		Assert.assertEquals(StandardRate, String.valueOf(UserData.getCellDataInt(1, 19)));
		Assert.assertEquals(OverTimeRate, String.valueOf(UserData.getCellDataInt(1, 20)));
		Assert.assertEquals(Description, UserData.getCellData(1, 21));
		Assert.assertEquals(EmailAddress1, UserData.getCellData(1, 22));
		Assert.assertTrue(PrimaryRadio1);
		Assert.assertEquals(PrimaryReplyTo, false);
//		Assert.assertEquals(DefaultEmailClient, UserData.getCellData(1, 23));
	}


	public void verifyDataOfUserProfile()
	{
		global.wait(driver).until(ExpectedConditions.visibilityOf(CancelButtonHeader));
		CancelButtonHeader.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(EditButton));
		// To Check Label on User Profile Page
		Assert.assertEquals(UserProfile_UserLabel.getText(), Prop.getProperty("UserProfileLabel1"));
		Assert.assertEquals(UserProfile_UserLabel.getCssValue("color"), Prop.getProperty("UserProfileLabelColor"));
		Assert.assertEquals(UserProfile_EmployeeLabel.getText(), Prop.getProperty("UserProfileLabel2"));
		Assert.assertEquals(UserProfile_EmployeeLabel.getCssValue("color"),
				Prop.getProperty("UserProfileLabelColor"));
		Assert.assertEquals(UserProfile_EmailLabel.getText(), Prop.getProperty("UserProfileLabel3"));
		Assert.assertEquals(UserProfile_EmailLabel.getCssValue("color"), Prop.getProperty("UserProfileLabelColor"));
		Assert.assertEquals(UserProfile_AllLabel.getText(), Prop.getProperty("UserProfileLabel4"));
		Assert.assertEquals(UserProfile_AllLabel.getCssValue("color"), Prop.getProperty("UserProfileLabelColor"));
		// Verify Data On User profile Page
		Assert.assertEquals(UserProfile_Fullname.getText(), First_Name + " " + Last_Name);
		Assert.assertEquals(UserProfile_Username.getText(), User_Name);
		Assert.assertEquals(UserProfile_Status.getText(), Status);
		Assert.assertTrue(UserProfile_UserType.getText().startsWith(User_Type.substring(0, 12)));
		Assert.assertEquals(UserProfile_FiltaUserType.getText(), Filta_User_Type);
		Assert.assertEquals(UserProfile_StoreAccess.isSelected(),
				Boolean.parseBoolean(Prop.getProperty("StoreAccess")));
		Assert.assertTrue(UserProfile_SendRemainder.isSelected());
		Assert.assertEquals(UserProfile_EmployeeStatus.getText(), Employee_Status);
		Assert.assertEquals(UserProfile_DisplayEmployeeRecord.isSelected(),
				Boolean.parseBoolean("DisplayEmployeeRecords"));
		Assert.assertEquals(UserProfile_Title.getText(), Title);
		Assert.assertEquals(UserProfile_WorkPhone.getText().replace("  ", ""), Work_Phone);
		Assert.assertEquals(UserProfile_Department.getText(), Department);
		Assert.assertEquals(UserProfile_Mobile.getText().replace("  ", ""), Mobile);
		Assert.assertEquals(UserProfile_ReportsTo.getText().replace(" ", ""), Prop.getProperty("Reports_To"));
		Assert.assertEquals(UserProfile_OtherPhone.getText().replace("  ", ""), Other_Phone);
		Assert.assertEquals(UserProfile_Fax.getText().replace("  ", ""), Fax);
		Assert.assertEquals(UserProfile_IMType.getText(), Default_IM_Type);
		Assert.assertEquals(UserProfile_IMName.getText(), IM_Name);
		Assert.assertEquals(UserPRofile_AddressStreet.getText(), Address_Street);
		Assert.assertEquals(UserProfile_AddressCity.getText(), Address_City);
		Assert.assertEquals(UserProfile_AddressState.getText(), Address_State);
		Assert.assertEquals(UserProfile_AddressCounty.getText(), Address_Country);
		Assert.assertEquals(UserProfile_WeeklyStandardHours.getText(),
				WeeklyStandardHours + " : " + DefaultWeeklyStandardHoursMin);
		Assert.assertEquals(UserProfile_AddressPostalZipCode.getText(), AddressPostalZipCodel);
		Assert.assertEquals(UserProfile_StandardRate.getText(), StandardRate);
		Assert.assertEquals(UserProfile_OverTimeRate.getText(), OverTimeRate);
		Assert.assertEquals(UserPRofile_Description.getText(), Description);
		Assert.assertEquals(UserProfile_PrimaryEmail.getText(), EmailAddress1);
//		Assert.assertEquals(UserProfile_SugarClient.getText(), DefaultEmailClient);
	}


	public void checkPasswordPage()
	{
		global.wait(driver).until(ExpectedConditions.visibilityOf(EditButton));
		EditButton.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(getUserName));
		// Click On Password Tab
		Tab2OnEditPage.click();
		Assert.assertEquals(Tab2OnEditPage.getCssValue("color"), Prop.getProperty("EditPagePasswordColor"));
		// Verify Password Data With The Help Of "UserPage.xlsx" sheet
		Assert.assertEquals(PasswordPage_PasswordLabel.getText(), PasswordData.getCellData(0, 4));
		Assert.assertEquals(PasswordPage_PasswordLabel.getCssValue("color"), PasswordData.getCellData(1, 4));
		Assert.assertEquals(PasswordPage_CurrentPasswordLabel.getText(), PasswordData.getCellData(0, 0));
		Assert.assertEquals(PasswordPage_NewPasswordLabel.getText(), PasswordData.getCellData(0, 1));
		Assert.assertEquals(PasswordPage_ConfirmPassword.getText(), PasswordData.getCellData(0, 2));
		Assert.assertEquals(PasswordPage_Note.getText(),
				PasswordData.getCellData(0, 3) + " " + PasswordData.getCellData(1, 3));
		// verify Alert and Validation Message On Alert
		CurrentpasswordInput.sendKeys(PasswordData.getCellData(0, 1));
		SaveButtonHeader.click();
		// Handling Alert1
		Alert1 = global.alert(driver);
		Assert.assertEquals(Alert1, PasswordData.getCellData(1, 5));
		NewPasswordInput.sendKeys(PasswordData.getCellData(0, 2));
		SaveButtonHeader.click();
		// Handling Alert2
		Alert2 = global.alert(driver);
		Assert.assertEquals(Alert2, PasswordData.getCellData(1, 6));
		SaveButtonHeader.click();
		global.alertAccept(driver);
		// Check Validation Message At Confirmation Message
		ConfirmPasswordInput.sendKeys("KC");
		global.wait(driver).until(
				ExpectedConditions.textToBePresentInElement(PasswordValidation, "The passwords do not match."));
		Assert.assertEquals(PasswordValidation.getText(), PasswordData.getCellData(2, 2));
		// Clear Text For NewPasswordInput And ConfirmPasswordInput And Pass Valid
		// Password
		NewPasswordInput.clear();
		NewPasswordInput.sendKeys(PasswordData.getCellData(1, 1));
		ConfirmPasswordInput.clear();
		ConfirmPasswordInput.sendKeys(PasswordData.getCellData(1, 2));
		SaveButtonHeader.click();
		Tab2OnEditPage.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(PasswordErrorMessage));
		Assert.assertEquals(PasswordErrorMessage.getText(),
				PasswordData.getCellData(1, 9) + " " + User_Name + PasswordData.getCellData(1, 10));
		// Check Sugar Dashlet Message
		CurrentpasswordInput.sendKeys(PasswordData.getCellData(1, 0));
		NewPasswordInput.sendKeys(PasswordData.getCellData(1, 1));
		ConfirmPasswordInput.sendKeys(PasswordData.getCellData(1, 2));
		SaveButtonHeader.click();
		global.wait(driver)
				.until(ExpectedConditions.textToBePresentInElement(PasswordUpdatedLabel, "Password Updated"));
		Assert.assertEquals(PasswordUpdatedLabel.getText(), PasswordData.getCellData(1, 7));
		Assert.assertEquals(PasswordUpdatedLabel2.getText(), PasswordData.getCellData(1, 8));
		SugarDashletClose.click();
	}


	public void checkThemesPage()
	{
		global.wait(driver).until(ExpectedConditions.visibilityOf(EditButton));
		EditButton.click();
		global.wait(driver).until(ExpectedConditions.visibilityOf(getUserName));
		Tab3OnEditPage.click();
		Assert.assertEquals(Tab3OnEditPage.getCssValue("color"), Prop.getProperty("EditPageThemeColor"));
		Assert.assertEquals(ThemeLabel.getText(), Prop.getProperty("ThemeLabel"));
		// Check List Of Themes And Count Of Themes
		List<WebElement> list = driver.findElements(By.xpath(".//select[@name='user_theme']//option"));
		for (int i = 0; i < list.size(); i++)
		{
			Assert.assertEquals(list.get(i).getText(), ThemeData.getCellData(1, i));
		}
		Assert.assertEquals(list.size(), (int) (ThemeData.getCellDataInt(1, 2)));
		Assert.assertEquals(global.select(DefaultTheme).getFirstSelectedOption().getText(),
				ThemeData.getCellData(1, 1));
	}


	public void checkDataFromEditPageAdvanced()
	{
		Tab4OnEditPage.click();
		Assert.assertEquals(Tab4OnEditPage.getCssValue("color"), Prop.getProperty("EditPageThemeColor"));
		Assert.assertEquals(Tab4OnEditPage.getText(), Prop.getProperty("AdvancedLabel"));
		Assert.assertEquals(UserSettingLabel.getText(), Prop.getProperty("Advanced1"));
		Assert.assertEquals(UserSettingLabel.getCssValue("color"), Prop.getProperty("EdiPageAdvancedColor"));
		Assert.assertEquals(ExportDelimiterLabel.getText().startsWith(AdvancedData.getCellData(0, 0)), true);
		ExportDelimiter = ExportDelimiterlabelTextbox.getAttribute("value");
		Assert.assertEquals(ExportDelimiter, AdvancedData.getCellData(2, 0));
		Assert.assertEquals(NotifyOnAssignment.getText().startsWith(AdvancedData.getCellData(0, 3)), true);
		NotifyOnAssignmentvalue = NotifyOnAssignmentCheckBox.isSelected();
		Assert.assertTrue(NotifyOnAssignmentvalue);
		Assert.assertTrue(ImportExportLabel.getText().startsWith(AdvancedData.getCellData(0, 1)));
		ImportExportCharSet = global.select(DefaultSelectedImportExport).getFirstSelectedOption().getText();
		Assert.assertEquals(ImportExportCharSet, AdvancedData.getCellData(2, 1));
		List<WebElement> list = driver.findElements(By.xpath(".//div[@id='settings']//tr[3]//td[2]//select//option"));
		for (int i = 0; i < list.size(); i++)
		{
			// System.out.println(list.get(i).getText());
			Assert.assertEquals(list.get(i).getText(), AdvancedData.getCellData(i, 6));
		}
		Assert.assertEquals(list.size(), Integer.parseInt(Prop.getProperty("CharachterSetCount")));
		Assert.assertEquals(RemainderLabel.getText().startsWith(AdvancedData.getCellData(0, 4)), true);
		PopupEditPage = Popup.getText();
		Assert.assertEquals(PopupEditPage, AdvancedData.getCellData(1, 4));
		RemainEmailTextbox = DefaultEmailCheckBox.isSelected();
		RemainderPopupTextbox = DefaultPopupCheckbox.isSelected();
		Assert.assertEquals(RemainderPopupTextbox, false);
		Assert.assertEquals(RemainEmailTextbox, false);
		EmailEditPage = Email.getText();
		Assert.assertEquals(EmailEditPage, AdvancedData.getCellData(2, 4));
		Assert.assertEquals(ShowFullName.getText().startsWith(AdvancedData.getCellData(0, 2)), true);
		ShowFullNameValue = DefaultShowFullameCheckbox.isSelected();
		Assert.assertTrue(ShowFullNameValue);
		MailMergetextBox = DefaultMailMergeCheckBox.isSelected();
		Assert.assertEquals(MailMergetextBox, false);
		Assert.assertEquals(LayoutOption.getText(), LayoutData.getCellData(0, 0));
		Assert.assertEquals(LayoutOption.getText(), LayoutData.getCellData(0, 0));
		Assert.assertEquals(LayoutOption.getCssValue("color"), Prop.getProperty("EdiPageAdvancedColor"));
		Assert.assertEquals(ModuleMenuLabel.getText(), LayoutData.getCellData(0, 1));
		Assert.assertTrue(ModuleMenuLabelCheckbox.isSelected());
		Assert.assertEquals(SelectModule.getText(), LayoutData.getCellData(0, 6));
		Assert.assertEquals(DisplayModule.getText(), LayoutData.getCellData(0, 3));
		Assert.assertEquals(HideModule.getText(), LayoutData.getCellData(0, 4));
		List<WebElement> list2 = driver
				.findElements(By.xpath(".//div[@id='layout']//table//tbody//tr[3]//tr[2]//td[2]//select//option"));
		List<String> list3 = new ArrayList<String>();
		for (int i = 0; i < list2.size(); i++)
		{
			if (list2.get(i).getText().length() != 0)
			{
				// System.out.println(list2.get(i).getText());
				list3.add(list2.get(i).getText());
			}
		}
//		for (int i = 0; i < list3.size(); i++) {
//			System.out.println(list3.get(i));
//		}
		List<String> list4 = new ArrayList<String>();
		list4.add("Home");
		list4.add("Customers");
		list4.add("Contacts");
		list4.add("Leads");
		list4.add("Calendar");
		list4.add("Documents");
		list4.add("Emails");
		list4.add("Calls");
		list4.add("Tech App");
		list4.add("Accounts");
		list4.add("Site-Evaluations");
		list4.add("Tasks");
		list4.add("Notes");
		list4.add("FIM Accounts");
		list4.add("Targets");
		list4.add("Collections");
		list4.add("Collectors");
		list4.add("Franchisee");
		list4.add("Jacobsen");
		list4.add("FiltaBio Reported Volumes");
		list4.add("Routes");
		list4.add("Invoices");
		list4.add("Reports");
		list4.add("Timesheets");
		list4.add("Worksheets");
		list4.add("Oil Transfers");
		list4.add("Routes");
		list4.add("Coolers");
		list4.add("Vans");
		list4.add("Tanks");
		list4.add("Invoice Settings");
		list4.add("Jobs");
		list4.add("Fryers");
		list4.add("Schedule Infos");
		list4.add("Postal/Zip Code");
		list4.add("Territory");
		list4.add("FiltaFry Invoices");
		list4.add("Machines");
		list4.add("FiltaCool Panels");
		list4.add("Archive Reports");
		list4.add("NCA Outgoing Payments");
		list4.add("Discount & Rebate");
		list4.add("QB Invoices");
		list4.add("Allocate Unapplied Payments");
		list4.add("Invoices");
		list4.add("NCA Payments");
		list4.add("Franchisee Credit-Debit");
		list4.add("Franchisee Payments");
		list4.add("QB Invoice Line Items");
		list4.add("NCA Group");
		list4.add("Rebate Payments");
		list4.add("NCA Chain");
		list4.add("Unapplied Payments");
		list4.add("WO Storage Location");
		list4.add("Advertisement Spends");
		list4.add("Knowledge Base");
		list4.add("Buyers");
		Assert.assertTrue((list3.containsAll(list4)));
		Assert.assertEquals(SubPanelTab.getText(), LayoutData.getCellData(0, 5));
		Assert.assertEquals(SubPanelCheckbox.isSelected(), true);
		Assert.assertEquals(LocalSetting.getText(), LocalSettingData.getCellData(0, 0));
		Assert.assertEquals(DataFormatLabel.getText(), LocalSettingData.getCellData(0, 1));
		List<WebElement> list5 = driver
				.findElements(By.xpath(".//div[@id='locale']//tbody//tr[2]//td[2]//select//option"));
		DateFormat = global.select(DefaultDateFormat).getFirstSelectedOption().getText();
		Assert.assertEquals("\"" + DateFormat + "\"", LocalSettingData.getCellData(5, 1));
		for (int i = 0; i < list5.size(); i++)
		{
//			System.out.println(list5.get(i).getText());
			Assert.assertEquals("\"" + list5.get(i).getText() + "\"", LocalSettingData.getCellData(i + 1, 1));
		}
		Assert.assertEquals(CurrencyLabel.getText(), LocalSettingData.getCellData(0, 2));
		List<WebElement> list6 = driver
				.findElements(By.xpath(".//div[@id='locale']//tbody//tr[2]//td[4]//select//option"));
		Currency = global.select(DefaultCurrency).getFirstSelectedOption().getText();
		Assert.assertEquals(Currency, LocalSettingData.getCellData(1, 2));
		for (int i = 0; i < list6.size(); i++)
		{
//			System.out.println(list6.get(i).getText());
			Assert.assertEquals(list6.get(i).getText(), LocalSettingData.getCellData(i + 1, 2));

		}
		Assert.assertEquals(TimeFormatLabel.getText(), LocalSettingData.getCellData(0, 3));
		List<WebElement> list7 = driver
				.findElements(By.xpath(".//div[@id='locale']//tbody//tr[3]//td[2]//select//option"));

		List<String> list8 = new ArrayList<String>();
		for (int i = 0; i < list7.size(); i++)
		{
			if (list2.get(i).getText().length() != 0)
			{
//				System.out.println(list7.get(i).getText());
				list8.add(list7.get(i).getText());
			}

		}
		List<String> list9 = new ArrayList<String>();
		list9.add("23:00");
		list9.add("11:00pm");
		list9.add("11:00PM");
		list9.add("11:00 pm");
		list9.add("11:00 PM");
		list9.add("23.00");
		list9.add("11.00pm");
		list9.add("11.00PM");
		list9.add("11.00 pm");
		list9.add("11.00 PM");
		TimeFormat = global.select(DefaultTimeFormat).getFirstSelectedOption().getText();
		Assert.assertEquals(TimeFormat, list9.get(0));
		Assert.assertTrue(list8.containsAll(list9));
		Assert.assertEquals(CurrencySignificantDigitsLabel.getText(), LocalSettingData.getCellData(0, 4));

		List<WebElement> list10 = driver
				.findElements(By.xpath(".//div[@id='locale']//tbody//tr[3]//td[4]//select//option"));
		for (int i = 0; i < list10.size(); i++)
		{
			Assert.assertEquals(Integer.parseInt(list10.get(i).getText()),
					(int) LocalSettingData.getCellDataInt(i + 1, 4));
		}
		CurrencySignificantDigit = Integer
				.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText());
		Assert.assertEquals(CurrencySignificantDigit, (int) LocalSettingData.getCellDataInt(3, 4));

		Assert.assertEquals(TimeZoneLabel.getText(), LocalSettingData.getCellData(0, 5));
		List<WebElement> list11 = driver
				.findElements(By.xpath(".//div[@id='locale']//tbody//tr[4]//td[2]//select//option"));
		TimeZone = global.select(DefaultTimeZone).getFirstSelectedOption().getText();
		Assert.assertEquals(TimeZone, LocalSettingData.getCellData(327 + 1, 5));
//		for (int i = 0; i < list11.size(); i++)
//		{
//		System.out.println(list11.get(i).getText());
//			sa.assertEquals(list11.get(i).getText(), LocalSettingData.getCellData(i + 1, 5));
//		}
		Assert.assertEquals(ExampleLabel.getText(), LocalSettingData.getCellData(0, 6));
		Assert.assertEquals(ExampleTextbox.isEnabled(), false);
		if (Integer.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()) == 2)
		{
//			System.out.println(ExampleTextbox.getAttribute("value"));
			Number = ExampleTextbox.getAttribute("value");
			countZero = 0;
			countDollar = 0;
			countComma = 0;
			countDecimal = 0;
			countNumber = 0;
			for (int i = 0; i < Number.length(); i++)
			{
				if (Number.charAt(i) == '0')
				{
					countZero++;
				}
				if (Number.charAt(i) == '$')
				{
					countDollar++;
				}
				if (Number.charAt(i) == ',')
				{
					countComma++;
				}
				if (Number.charAt(i) == '.')
				{
					countDecimal++;
				}
				if (Number.charAt(i) == '1' || Number.charAt(i) == '2' || Number.charAt(i) == '3'
						|| Number.charAt(i) == '4' || Number.charAt(i) == '5' || Number.charAt(i) == '6'
						|| Number.charAt(i) == '7' || Number.charAt(i) == '8' || Number.charAt(i) == '9')
				{
					countNumber++;
				}
			}
			Assert.assertEquals(countZero, Integer
					.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()));
			Assert.assertEquals(countDollar, (int) LocalSettingData.getCellDataInt(1, 7));
			Assert.assertEquals(countComma, (int) LocalSettingData.getCellDataInt(1, 8));
			Assert.assertEquals(countDecimal, (int) LocalSettingData.getCellDataInt(2, 9));
			Assert.assertEquals(countNumber, (int) LocalSettingData.getCellDataInt(1, 10));
		}
		global.select(DefaultCurrencySignificantDigits).selectByVisibleText("0");
		if (Integer.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()) == 0)
		{
			Number = ExampleTextbox.getAttribute("value");
			countZero = 0;
			countDollar = 0;
			countComma = 0;
			countDecimal = 0;
			countNumber = 0;
			for (int i = 0; i < Number.length(); i++)
			{
				if (Number.charAt(i) == '0')
				{
					countZero++;
				}
				if (Number.charAt(i) == '$')
				{
					countDollar++;
				}
				if (Number.charAt(i) == ',')
				{
					countComma++;
				}
				if (Number.charAt(i) == '.')
				{
					countDecimal++;
				}
				if (Number.charAt(i) == '1' || Number.charAt(i) == '2' || Number.charAt(i) == '3'
						|| Number.charAt(i) == '4' || Number.charAt(i) == '5' || Number.charAt(i) == '6'
						|| Number.charAt(i) == '7' || Number.charAt(i) == '8' || Number.charAt(i) == '9')
				{
					countNumber++;
				}
			}
			Assert.assertEquals(countZero, Integer
					.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()));
			Assert.assertEquals(countDollar, (int) LocalSettingData.getCellDataInt(1, 7));
			Assert.assertEquals(countComma, (int) LocalSettingData.getCellDataInt(1, 8));
			Assert.assertEquals(countDecimal, (int) LocalSettingData.getCellDataInt(1, 9));
			Assert.assertEquals(countNumber, (int) LocalSettingData.getCellDataInt(1, 10));

		}
		global.select(DefaultCurrencySignificantDigits).selectByVisibleText("1");
		if (Integer.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()) == 1)
		{
			Number = ExampleTextbox.getAttribute("value");
			countZero = 0;
			countDollar = 0;
			countComma = 0;
			countDecimal = 0;
			countNumber = 0;
			for (int i = 0; i < Number.length(); i++)
			{
				if (Number.charAt(i) == '0')
				{
					countZero++;
				}
				if (Number.charAt(i) == '$')
				{
					countDollar++;
				}
				if (Number.charAt(i) == ',')
				{
					countComma++;
				}
				if (Number.charAt(i) == '.')
				{
					countDecimal++;
				}
				if (Number.charAt(i) == '1' || Number.charAt(i) == '2' || Number.charAt(i) == '3'
						|| Number.charAt(i) == '4' || Number.charAt(i) == '5' || Number.charAt(i) == '6'
						|| Number.charAt(i) == '7' || Number.charAt(i) == '8' || Number.charAt(i) == '9')
				{
					countNumber++;
				}
			}
			Assert.assertEquals(countZero, Integer
					.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()));
			Assert.assertEquals(countDollar, (int) LocalSettingData.getCellDataInt(1, 7));
			Assert.assertEquals(countComma, (int) LocalSettingData.getCellDataInt(1, 8));
			Assert.assertEquals(countDecimal, (int) LocalSettingData.getCellDataInt(2, 9));
			Assert.assertEquals(countNumber, (int) LocalSettingData.getCellDataInt(1, 10));
		}
		global.select(DefaultCurrencySignificantDigits).selectByVisibleText("3");
		if (Integer.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()) == 3)
		{
			Number = ExampleTextbox.getAttribute("value");
			countZero = 0;
			countDollar = 0;
			countComma = 0;
			countDecimal = 0;
			countNumber = 0;
			for (int i = 0; i < Number.length(); i++)
			{
				if (Number.charAt(i) == '0')
				{
					countZero++;
				}
				if (Number.charAt(i) == '$')
				{
					countDollar++;
				}
				if (Number.charAt(i) == ',')
				{
					countComma++;
				}
				if (Number.charAt(i) == '.')
				{
					countDecimal++;
				}
				if (Number.charAt(i) == '1' || Number.charAt(i) == '2' || Number.charAt(i) == '3'
						|| Number.charAt(i) == '4' || Number.charAt(i) == '5' || Number.charAt(i) == '6'
						|| Number.charAt(i) == '7' || Number.charAt(i) == '8' || Number.charAt(i) == '9')
				{
					countNumber++;
				}
			}
			Assert.assertEquals(countZero, Integer
					.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()));
			Assert.assertEquals(countDollar, (int) LocalSettingData.getCellDataInt(1, 7));
			Assert.assertEquals(countComma, (int) LocalSettingData.getCellDataInt(1, 8));
			Assert.assertEquals(countDecimal, (int) LocalSettingData.getCellDataInt(2, 9));
			Assert.assertEquals(countNumber, (int) LocalSettingData.getCellDataInt(1, 10));
		}
		global.select(DefaultCurrencySignificantDigits).selectByVisibleText("4");
		if (Integer.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()) == 4)
		{
			Number = ExampleTextbox.getAttribute("value");
			countZero = 0;
			countDollar = 0;
			countComma = 0;
			countDecimal = 0;
			countNumber = 0;
			for (int i = 0; i < Number.length(); i++)
			{
				if (Number.charAt(i) == '0')
				{
					countZero++;
				}
				if (Number.charAt(i) == '$')
				{
					countDollar++;
				}
				if (Number.charAt(i) == ',')
				{
					countComma++;
				}
				if (Number.charAt(i) == '.')
				{
					countDecimal++;
				}
				if (Number.charAt(i) == '1' || Number.charAt(i) == '2' || Number.charAt(i) == '3'
						|| Number.charAt(i) == '4' || Number.charAt(i) == '5' || Number.charAt(i) == '6'
						|| Number.charAt(i) == '7' || Number.charAt(i) == '8' || Number.charAt(i) == '9')
				{
					countNumber++;
				}
			}
			Assert.assertEquals(countZero, Integer
					.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()));
			Assert.assertEquals(countDollar, (int) LocalSettingData.getCellDataInt(1, 7));
			Assert.assertEquals(countComma, (int) LocalSettingData.getCellDataInt(1, 8));
			Assert.assertEquals(countDecimal, (int) LocalSettingData.getCellDataInt(2, 9));
			Assert.assertEquals(countNumber, (int) LocalSettingData.getCellDataInt(1, 10));
		}
		global.select(DefaultCurrencySignificantDigits).selectByVisibleText("5");
		if (Integer.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()) == 5)
		{
			Number = ExampleTextbox.getAttribute("value");
			countZero = 0;
			countDollar = 0;
			countComma = 0;
			countDecimal = 0;
			countNumber = 0;
			for (int i = 0; i < Number.length(); i++)
			{
				if (Number.charAt(i) == '0')
				{
					countZero++;
				}
				if (Number.charAt(i) == '$')
				{
					countDollar++;
				}
				if (Number.charAt(i) == ',')
				{
					countComma++;
				}
				if (Number.charAt(i) == '.')
				{
					countDecimal++;
				}
				if (Number.charAt(i) == '1' || Number.charAt(i) == '2' || Number.charAt(i) == '3'
						|| Number.charAt(i) == '4' || Number.charAt(i) == '5' || Number.charAt(i) == '6'
						|| Number.charAt(i) == '7' || Number.charAt(i) == '8' || Number.charAt(i) == '9')
				{
					countNumber++;
				}
			}
			Assert.assertEquals(countZero, Integer
					.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()));
			Assert.assertEquals(countDollar, (int) LocalSettingData.getCellDataInt(1, 7));
			Assert.assertEquals(countComma, (int) LocalSettingData.getCellDataInt(1, 8));
			Assert.assertEquals(countDecimal, (int) LocalSettingData.getCellDataInt(2, 9));
			Assert.assertEquals(countNumber, (int) LocalSettingData.getCellDataInt(1, 10));
		}
		global.select(DefaultCurrencySignificantDigits).selectByVisibleText("6");
		if (Integer.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()) == 6)
		{
			Number = ExampleTextbox.getAttribute("value");
			countZero = 0;
			countDollar = 0;
			countComma = 0;
			countDecimal = 0;
			countNumber = 0;
			for (int i = 0; i < Number.length(); i++)
			{
				if (Number.charAt(i) == '0')
				{
					countZero++;
				}
				if (Number.charAt(i) == '$')
				{
					countDollar++;
				}
				if (Number.charAt(i) == ',')
				{
					countComma++;
				}
				if (Number.charAt(i) == '.')
				{
					countDecimal++;
				}
				if (Number.charAt(i) == '1' || Number.charAt(i) == '2' || Number.charAt(i) == '3'
						|| Number.charAt(i) == '4' || Number.charAt(i) == '5' || Number.charAt(i) == '6'
						|| Number.charAt(i) == '7' || Number.charAt(i) == '8' || Number.charAt(i) == '9')
				{
					countNumber++;
				}
			}
			Assert.assertEquals(countZero, Integer
					.parseInt(global.select(DefaultCurrencySignificantDigits).getFirstSelectedOption().getText()));
			Assert.assertEquals(countDollar, (int) LocalSettingData.getCellDataInt(1, 7));
			Assert.assertEquals(countComma, (int) LocalSettingData.getCellDataInt(1, 8));
			Assert.assertEquals(countDecimal, (int) LocalSettingData.getCellDataInt(2, 9));
			Assert.assertEquals(countNumber, (int) LocalSettingData.getCellDataInt(1, 10));
		}
		Assert.assertEquals(separatorLabel.getText(), LocalSettingData.getCellData(0, 11));
		ThousandsSeparator = sepratorTextbox.getAttribute("value");
		Assert.assertEquals(ThousandsSeparator, LocalSettingData.getCellData(1, 11));
		Assert.assertEquals(NameDisplayFormatLabel.getText(), LocalSettingData.getCellData(0, 12) + " ");
		List<WebElement> list12 = driver
				.findElements(By.xpath(".//div[@id='locale']//tbody//tr[6]//td[2]//select//option"));
		Name = global.select(DefaultName).getFirstSelectedOption().getText();
		Assert.assertEquals(Name, LocalSettingData.getCellData(1, 13));
		for (int i = 0; i < list12.size(); i++)
		{
//			System.out.println(list12.get(i).getText());
			Assert.assertEquals(list12.get(i).getText(), LocalSettingData.getCellData(i + 1, 13));
		}
		Assert.assertEquals(DecimalSymbolLabel.getText(), LocalSettingData.getCellData(0, 14));
		DecimalSymbol = DecimalSymbolTextbox.getAttribute("value");
		Assert.assertEquals(DecimalSymbol, LocalSettingData.getCellData(1, 14));
		Assert.assertEquals(CalendarOptionLabel.getText(), CalendarOptionData.getCellData(0, 0));
		Assert.assertEquals(CalendarOptionLabel.getCssValue("color"), CalendarOptionData.getCellData(1, 0));
		Assert.assertEquals(PublishKeyLabel.getText(), CalendarOptionData.getCellData(0, 1));
		Assert.assertEquals(PublishKeyTextbox.getText().isEmpty(), true);
		PublishAtMyLocationValue = PublishAtMyLocation.getText();
		Assert.assertEquals(PublishAtMyLocationValue, CalendarOptionData.getCellData(0, 2));
		if (!PublishAtMyLocationText.getText().contains("&email="))
		{
			Assert.assertEquals(PublishAtMyLocationText.getText(),
					CalendarOptionData.getCellData(1, 2) + EmailAddress1);
		}
		else if (PublishAtMyLocationText.getText().contains("&email="))
		{
			Assert.assertEquals(PublishAtMyLocationText.getText(),
					CalendarOptionData.getCellData(2, 2) + EmailAddress1);
		}
		Assert.assertEquals(SearchLocationLabel.getText(), CalendarOptionData.getCellData(0, 3));
		SearchLocation = SearchLocationText.getText();
		Assert.assertEquals(SearchLocation, CalendarOptionData.getCellData(1, 3));
		Assert.assertEquals(iCalintegrationURLLabel.getText(), CalendarOptionData.getCellData(0, 4));
		iCalValue = iCalintegrationText.getText();
		Assert.assertEquals(iCalValue, CalendarOptionData.getCellData(1, 4));
		Assert.assertEquals(FirstDayOfWeekLabel.getText(), CalendarOptionData.getCellData(0, 5));
		List<WebElement> list13 = driver
				.findElements(By.xpath(".//div[@id='calendar_options']//tr[6]//td[2]//slot//select//option"));
		for (int i = 0; i < list13.size(); i++)
		{
//			System.out.println(list13.get(i).getText());
			Assert.assertEquals(list13.get(i).getText(), CalendarOptionData.getCellData(i + 1, 5));
		}
		FirstDayOfWeek = global.select(DefaultFirstdayOfWeek).getFirstSelectedOption().getText();
		Assert.assertEquals(FirstDayOfWeek, CalendarOptionData.getCellData(1, 5));
		global.jsReturn(driver).executeScript("arguments[0].scrollIntoView();", CancelButtonFooter);
		CancelButtonFooter.click();
	}


	public void verifyDataOfAdvanced()
	{
		global.wait(driver).until(ExpectedConditions.visibilityOf(EditButton));
		AdvancedTab.click();
		Assert.assertEquals(AdvancedTabLabel.getText(), AdvancedData.getCellData(0, 7));
		Assert.assertEquals(AdvancedTabLabel.getCssValue("color"), AdvancedData.getCellData(1, 7));
		Assert.assertEquals(UserSettingUserPage.getText(), AdvancedData.getCellData(0, 8));
		Assert.assertEquals(UserSettingUserPage.getCssValue("color"), AdvancedData.getCellData(1, 8));
		Assert.assertEquals(NotifyOnAssignmentUserPage.getText(), AdvancedData.getCellData(0, 9));
//		Assert.assertEquals(NotifyOnAssignmentValueUserPage.isSelected(), NotifyOnAssignmentvalue);
		Assert.assertEquals(NotifyOnAssignmentTextUserPage.getText(), AdvancedData.getCellData(1, 9) + " ");
		Assert.assertEquals(RemainderUserPage.getText(), AdvancedData.getCellData(0, 10));
		Assert.assertEquals(PopupCheckBoxUserPage.isSelected(), RemainderPopupTextbox);
		Assert.assertEquals(PopupCheckBoxUserPage.isEnabled(), false);
		Assert.assertEquals(EmailCheckBoxUserPage.isSelected(), RemainEmailTextbox);
		Assert.assertEquals(EmailCheckBoxUserPage.isEnabled(), false);
		Assert.assertEquals(PopupUserPage.getText(), PopupEditPage);
		Assert.assertEquals(EmailUserPage.getText(), EmailEditPage);
		Assert.assertEquals(RemainderText.getText(), AdvancedData.getCellData(3, 4) + " ");
		Assert.assertEquals(MailMergeuserPage.getText(), AdvancedData.getCellData(0, 5));
		Assert.assertEquals(MailMergeUserPageCheckBox.isSelected(), MailMergetextBox);
		Assert.assertEquals(MailMergeUserPageCheckBox.isEnabled(), false);
		Assert.assertEquals(MailMergeTextUserPage.getText(), AdvancedData.getCellData(1, 5) + " ");
		Assert.assertEquals(URLUserPage.getText(), AdvancedData.getCellData(0, 11));
		Assert.assertEquals(URLUserPage2.getText(), AdvancedData.getCellData(1, 11));
		Assert.assertEquals(URLUserPage3.getText(), AdvancedData.getCellData(2, 11) + " ");
		Assert.assertEquals(ExportDelimiterUserPage.getText(), AdvancedData.getCellData(0, 0));
		Assert.assertEquals(ExportDelimiterTextboxUserPage.getText(), ExportDelimiter);
		Assert.assertEquals(ExportDelimiterText.getText(), AdvancedData.getCellData(1, 0));
		Assert.assertEquals(ImportExportUserPage.getText(), AdvancedData.getCellData(0, 1));
		Assert.assertEquals(ImportExportText.getText(), AdvancedData.getCellData(2, 1));
		Assert.assertEquals(ImportExportTextUserPage.getText(), AdvancedData.getCellData(1, 1));
		Assert.assertEquals(ShowFullNamesTextUserPage.getText(), AdvancedData.getCellData(0, 2));
		Assert.assertEquals(ShowFullNameTextBox.isEnabled(), false);
		Assert.assertEquals(ShowFullNameUserPage.getText(), AdvancedData.getCellData(1, 2));

		Assert.assertEquals(LocaleUserPage.getText(), LocalSettingData.getCellData(0, 0));
		Assert.assertEquals(LocaleUserPage.getCssValue("color"), LocalSettingData.getCellData(1, 0));
		Assert.assertEquals(DataFormatUserPageLabel.getText(), LocalSettingData.getCellData(0, 1));
		Assert.assertEquals(DataFormatTextUserPage.getText(), LocalSettingData.getCellData(10, 1) + " ");
		Assert.assertEquals(TimeFormatUserPage.getText(), LocalSettingData.getCellData(0, 3));
		Assert.assertEquals(TimeFormatValueUserPage.getText(), TimeFormat + " ");
		Assert.assertEquals(TimeFormatText.getText(), LocalSettingData.getCellData(11, 3) + " ");
		Assert.assertEquals(TimeZoneUserPage.getText(), LocalSettingData.getCellData(0, 5));
		Assert.assertEquals(TimeZoneValueUserPage.getText(), LocalSettingData.getCellData(327 + 1, 5) + " ");
		Assert.assertEquals(CurrencyUserPage.getText(), LocalSettingData.getCellData(0, 2));
		Assert.assertEquals(CurrencyValueUserPage.getText().contains("USD"), true);
		Assert.assertEquals(CurrencyText.getText(), LocalSettingData.getCellData(5, 2) + " ");
		Assert.assertEquals(CurrencyDigitUserPage.getText(), LocalSettingData.getCellData(0, 4));
		Assert.assertEquals(Integer.parseInt(CurrencyDigitValueUserpage.getText().replace(" ", "")),
				CurrencySignificantDigit);
		Assert.assertEquals(CurrencyDigitTextUserpage.getText(), LocalSettingData.getCellData(8, 4) + " ");
		Assert.assertEquals(ThousandsUserPage.getText(), LocalSettingData.getCellData(0, 11));
		Assert.assertEquals(ThousandsValueUserPage.getText().replace(" ", ""), LocalSettingData.getCellData(1, 11));
		Assert.assertEquals(ThousandsTextValueUserPage.getText().contains(LocalSettingData.getCellData(2, 11)), true);
		Assert.assertEquals(DecimalUserPage.getText(), LocalSettingData.getCellData(0, 14));
		Assert.assertEquals(DecilamlValueUserPage.getText().replace(" ", ""), LocalSettingData.getCellData(1, 14));
		Assert.assertEquals(DeciamlTextUserPage.getText(), LocalSettingData.getCellData(2, 14) + " ");
		Assert.assertEquals(NameDisplayUserPage.getText(), LocalSettingData.getCellData(0, 12));
		Assert.assertEquals(NameDisplayValueOneUserPage.getText(), LocalSettingData.getCellData(1, 12));
		Assert.assertEquals(NameDisplayValueSecondUserPage.getText(), LocalSettingData.getCellData(2, 12));
		Assert.assertEquals(NameDisplayValueThirdUserPage.getText(), LocalSettingData.getCellData(3, 12));
		Assert.assertEquals(NameDisplayValueForthUserPage.getText(), LocalSettingData.getCellData(4, 12));
		Assert.assertEquals(NameDisplayValueFifthUserPage.getText(), LocalSettingData.getCellData(5, 12));
		Assert.assertEquals(NameDisplayValueSixthUserPage.getText(), LocalSettingData.getCellData(6, 12));
		Assert.assertEquals(NameDisplayTextUserPage.getText(), LocalSettingData.getCellData(7, 12) + " ");
		Assert.assertEquals(CalendarOption.getText(), CalendarOptionData.getCellData(0, 0));
		Assert.assertEquals(CalendarOption.getCssValue("color"), CalendarOptionData.getCellData(1, 0));
		Assert.assertEquals(Publish_Key.getText(), CalendarOptionData.getCellData(0, 1));
		Assert.assertEquals(Publish_Key_Text.getText(), CalendarOptionData.getCellData(1, 1) + " ");
		Assert.assertEquals(Publish_at_my_location.getText(), CalendarOptionData.getCellData(0, 2));
		if (Publish_at_my_location_text.getText().contains("&email="))
		{
			Assert.assertEquals(Publish_at_my_location_text.getText(),
					CalendarOptionData.getCellData(2, 2) + EmailAddress1);
		}
		else
		{
			Assert.assertEquals(Publish_at_my_location_text.getText(), CalendarOptionData.getCellData(1, 2));
		}
		Assert.assertEquals(Search_Location.getText(), CalendarOptionData.getCellData(0, 3));
		Assert.assertEquals(Search_Location_Text.getText(), CalendarOptionData.getCellData(1, 3));
		Assert.assertEquals(iCal.getText(), CalendarOptionData.getCellData(0, 4));
		Assert.assertEquals(iCal_Text.getText(), CalendarOptionData.getCellData(1, 4));
		Assert.assertEquals(First_Day_Of_Week.getText(), CalendarOptionData.getCellData(0, 5));
		Assert.assertTrue(First_Day_Of_Week_Text.getText().contains(FirstDayOfWeek));
		Assert.assertTrue(First_Day_Of_Week_Text.getText().contains(CalendarOptionData.getCellData(8, 5)));
		Assert.assertEquals(Layout_Option.getText(), LayoutData.getCellData(0, 0));
		Assert.assertEquals(Layout_Option.getCssValue("color"), LayoutData.getCellData(1, 0));
		Assert.assertEquals(Module_Menu_Filter.getText(), LayoutData.getCellData(0, 1));
		Assert.assertEquals(Module_Menu_Filter_text.getText(), LayoutData.getCellData(1, 1) + " ");
		Assert.assertEquals(SubPanel_Tab.getText(), LayoutData.getCellData(0, 5));
		Assert.assertEquals(SubPanel_Tab_Text.getText(), LayoutData.getCellData(1, 5) + " ");
		Assert.assertEquals(All.getText(), LayoutData.getCellData(0, 8));
		Assert.assertEquals(All.getCssValue("color"), LayoutData.getCellData(1, 8));
	}


	public void accessCheck()
	{
		global.wait(driver).until(ExpectedConditions.visibilityOf(Access));
		Access.click();
		List<WebElement> list = driver
				.findElements(By.xpath(".//div[@class='table-responsive-edit']//table//tbody//tr"));
//		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++)
//		{
//			System.out.println(list.get(i).getText());
//		}
		for (int i = 0; i < list.size(); i++)
		{
			if (driver.findElement(
					By.xpath(".//div[@class='table-responsive-edit']//table//tbody/tr[" + (i + 1) + "]//td[1]"))
					.getText().equals(AccessData.getCellData(i, 0)) == true)
			{
				Assert.assertEquals(driver.findElement(By
						.xpath(".//div[@class='table-responsive-edit']//table//tbody/tr[" + (i + 1) + "]//td[1]"))
						.getText(), AccessData.getCellData(i, 0));
			}
		}
		List<WebElement> list2 = driver
				.findElements(By.xpath(".//div[@class='table-responsive-edit']//table//tbody//tr[1]//td"));
//		for (int i = 0; i < list2.size(); i++)
//		{
//			System.out.println(driver.findElement(
//					By.xpath(".//div[@class='table-responsive-edit']//table//tbody/tr[1]//td[" + (i + 1) + "]"))
//					.getText());
//			if (driver.findElement(
//					By.xpath(".//div[@class='table-responsive-edit']//table//tbody/tr[1]//td[" + (i + 1) + "]"))
//					.getText().equals(" ") == true)
//			{
//				System.out.println("Blank Value");
//			}
//			else {
//				Assert.assertEquals(driver.findElement(By
//						.xpath(".//div[@class='table-responsive-edit']//table//tbody/tr[1]//td[" + (i + 1) + "]"))
//						.getText(), AccessData.getCellData(i, 0));
//			}
//		}

//		List<WebElement> list3 = driver.findElements(By.xpath(".//div[@class='table-responsive-edit']//table//tbody//tr[2]//td[3]"));
		for (int i = 1; i < list.size(); i++)
		{
			Assert.assertEquals(driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[3]"))
					.getText(), AccessData.getCellData(i, 2));
			Assert.assertEquals(driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[4]"))
					.getText(), AccessData.getCellData(i, 3));
			Assert.assertEquals(driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[5]"))
					.getText(), AccessData.getCellData(i, 4));
			Assert.assertEquals(driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[6]"))
					.getText(), AccessData.getCellData(i, 5));
			Assert.assertEquals(driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[7]"))
					.getText(), AccessData.getCellData(i, 6));
			Assert.assertEquals(driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[8]"))
					.getText(), AccessData.getCellData(i, 7));
			Assert.assertEquals(driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[9]"))
					.getText(), AccessData.getCellData(i, 8));
			if (driver.findElement(
					By.xpath(".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[2]"))
					.getText().equals(AccessData.getCellData(0, 9)))
			{
				Assert.assertEquals(driver.findElement(By.xpath(
						".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[2]"))
						.getCssValue("color"), AccessData.getCellData(1, 9));
			}
			if (driver.findElement(
					By.xpath(".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[3]"))
					.getText().equals(AccessData.getCellData(0, 10)))
			{
				Assert.assertEquals(driver.findElement(By.xpath(
						".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[3]"))
						.getCssValue("color"), AccessData.getCellData(1, 10));
			}
			else if (driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[3]"))
					.getText().equals(AccessData.getCellData(0, 11)))
			{
				Assert.assertEquals(driver.findElement(By.xpath(
						".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[3]"))
						.getCssValue("color"), AccessData.getCellData(1, 11));
			}
			else if (driver
					.findElement(By.xpath(
							".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[3]"))
					.getText().equals(AccessData.getCellData(0, 12)))
			{
				Assert.assertEquals(driver.findElement(By.xpath(
						".//div[@class='table-responsive-edit']//table//tbody//tr[" + (i + 1) + "]//td[3]"))
						.getCssValue("color"), AccessData.getCellData(1, 12));
			}
		}
//		System.out.println(NoneColor.getCssValue("color"));
//		System.out.println(AllColor.getCssValue("color"));
//		System.out.println(OwnerColor.getCssValue("color"));
//		System.out.println(
//				driver.findElement(By.xpath(".//div[@id='subpanel_title_aclroles']//table//tbody//h3/span[1]"))
//						.getText());
		Assert.assertEquals(Roles.getText(), AccessData.getCellData(0, 13));
		Assert.assertEquals(Roles_Name.getText(), AccessData.getCellData(0, 14));
		Assert.assertEquals(Roles_Description.getText(), AccessData.getCellData(0, 15));
		Assert.assertEquals(Roles_Franchisee.getText(), AccessData.getCellData(0, 16));
		Assert.assertEquals(Roles_Not_Delete.getText(), AccessData.getCellData(0, 17));
		Assert.assertEquals(Roles_ALL.getText(), AccessData.getCellData(0, 18));
	}


	public void closeBrowser()
	{
		logout.logout();
		driver.close();
	}
}
