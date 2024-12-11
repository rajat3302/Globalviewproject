package globalview_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

public class Register_page extends BaseLibrary



{
	Applicationutility ob;
	public Register_page() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[text()='Register']")
	private WebElement registerbutton;
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
	@FindBy(xpath="(//input[@id='website'])[1]")
	private WebElement website;
	@FindBy(xpath = "//label[contains(text(),'How many designers work at your firm?*')]/following-sibling::div//input[@id=\"designers_work\"]")
	private WebElement retaillocation;
	@FindBy(xpath = "//label[contains(text(),'What type of office do you work out of?*')]/following-sibling::select")
	private WebElement homedesignservice;
	
	@FindBy(xpath = "//label[contains(text(),'Do you have a librarian or staff*')]/following-sibling::select")
	private WebElement librarianorstaff;
	
	
	
	


	public void ClickonRegister() 
	{
		registerbutton.click();
	}

	public void companydetails() {
		try

		{
			companyname.click();
			companyname.sendKeys(Propertyutility.getproperty("Companyname"));
			businesstype.click();
			Thread.sleep(2000);
//			ob = new Applicationutility();
//			ob.dropdown(businesstype, "Design");
			
			Select sell = new Select(businesstype);
			sell.selectByValue("Design");
			
			hearaboutus.click();
			Thread.sleep(2000);
			Select sell1 = new Select(hearaboutus);
			sell1.selectByValue("Tradeshow");
			
		
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0, 500);", locationstate);
			
			
			locationstate.click();
			Thread.sleep(2000);
			Select sell3 =  new Select(locationstate);
			sell3.selectByValue("AL");
			
			Thread.sleep(2000);
			salestax.click();
			Select sell4 = new Select(salestax);
			sell4.selectByValue("Non-Exempt");
			

			salestax.click();
			Select sell5 = new Select(salestax);
			sell4.selectByValue("Exempt");
			
			representative.click();
			representative.sendKeys(Propertyutility.getproperty("representative"));
			
			salesTaxno.click();
			salesTaxno.sendKeys(Propertyutility.getproperty("salestexno"));
			
		
			Thread.sleep(2000);
		        // Provide the full file path to upload
		        String filePath = "C:\\Users\\rajat.shrotriya.INNOAGE\\Downloads\\Cart (1).pdf";
		        cerificatefile.sendKeys(filePath);
		
						
		}
		

		catch (Exception e) 
		{
			System.out.println("issue in companydetails" + e);
		}
		
	}
	public void Primarycontact() throws InterruptedException
	{
		try
		{
		firstname.click();
		firstname.sendKeys(Propertyutility.getproperty("firstname"));
		lastname.click();
		lastname.sendKeys(Propertyutility.getproperty("lastname"));
		
		Thread.sleep(2000);
		organisationaltitle.click();
		Select sell3 =  new Select(organisationaltitle);
		sell3.selectByValue("Owner");
		
		phonenumber.click();
		phonenumber.sendKeys(Propertyutility.getproperty("phoneno"));
		
		emailid.click();
		emailid.sendKeys(Propertyutility.getproperty("email"));
		
		
		checkbox.click();
//		policies.click();
//		
//		Applicationutility.chnagewindow(0, driver);
//		privacystatement.click();	
//		
//		
//		Applicationutility.chnagewindow(0, driver);
//		
	
	
		submit.click();
		
		
	    }
	 catch (Exception e) 
		{
		 	System.out.println("issue in primarycontact" + e);
	    }
	}
	
	public void businessoverview()
	{
		try
		{
			
		Applicationutility.scrolltotop();
		Applicationutility.waitforVisible(driver, website);
		website.click();
		website.sendKeys(Propertyutility.getproperty("website"));
		
		retaillocation.click();
		retaillocation.sendKeys(Propertyutility.getproperty("retaillocations"));
		
		homedesignservice.click();
		Applicationutility.dropdown(homedesignservice, "Home office");
		
		
		
		}
		catch (Exception e) 
		{
			System.out.println("issue in businessoverview" +e);
		}
	}
	
}
