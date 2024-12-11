package globalview_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterpageOR 


{
	public RegisterpageOR(WebDriver driver) 
	{
	
		PageFactory.initElements(driver, this);

	}

	
	
	@FindBy(xpath = "//*[text()='Register']")
	private WebElement registerbutton;
	public WebElement getregistraonbutton()
	{
		return registerbutton;
	}
	@FindBy(xpath = "//input[@id='company_name']")
	private WebElement companyname;
	@FindBy(xpath = "//*[@id='business_type']")
	private WebElement businesstype;
	@FindBy(xpath = "//*[@id=\"hear_about_us\"]")
	private WebElement hearaboutus;
	@FindBy(xpath = "//*[@id='business_location_state']")
	private WebElement locationstate;
	@FindBy(xpath = "//*[@id='sales_tax_state']")
	private WebElement salestax;
	@FindBy(xpath = "//input[@id='representative']")
	private WebElement representative;
	@FindBy(xpath = "//input[@id='tax_exemption_1']")
	private WebElement salesTaxno;
	@FindBy(xpath = "//input[@id='customFile']")
	private WebElement cerificatefile;
	@FindBy(xpath = "//input[@id='federal_tax_id']")
	private WebElement TaxId;
	@FindBy(xpath = "//input[@id='business_license_number']")
	private WebElement blnumber;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//*[@id='organizational_title']")
	private WebElement organisationaltitle;
	@FindBy(xpath = "//input[@id='phone_number']")
	private WebElement phonenumber;
	@FindBy(xpath = "//input[@id='email_2']")
	private WebElement emailid;
	@FindBy(xpath = "//input[@id='flexCheckDefault']")
	private WebElement flexcheckdefault;
	@FindBy(xpath = "//div[contains(@class,'form-check')]/input")
	private WebElement checkbox;
	@FindBy(xpath = "(//*[text()='Policies'])[1]")
	private WebElement policies;
	@FindBy(xpath = "//*[@id='company_details']/div[3]/label/span/p[1]/a[2]/strong")
	private WebElement privacystatement;
	@FindBy(xpath = "//*[@id='company_information_save']")
	private WebElement submit;
}
