package globalview_page;

import java.time.Duration;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

public class Register_page extends BaseLibrary



{
//	Applicationutility ob;
	public Register_page() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[text()='Register']")
	private WebElement registerbutton;
	@FindBy(xpath = "//*[text()='FAQ']")
	private WebElement faq;
	@FindBy(xpath="//*[text()='info@globalviews.com']")
	private WebElement infoglobal;
	@FindBy(xpath = "//*[text()='submit an inquiry']")
	private WebElement inquiry;
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
	@FindBy(xpath = "//label[@for='tax_federal_tax_id']/following-sibling::input")
	private WebElement TaxId;
	@FindBy(xpath = "//label[@for='tax_bussiness_license_number']/following-sibling::input")
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
	
	
	// user select design in businesstype 
	
	@FindBy(xpath = "//label[@for='designers_work']/following-sibling::div/input")
	private WebElement noofdesigner;
	@FindBy(xpath = "//select[contains(@class,'type_of_office')]")
	private WebElement typeofoffice;
	@FindBy(xpath ="//select[@id='librarian_or_staff']")
	private WebElement librarianorstaff;
	@FindBy(xpath="//label[@for='avgProject']/following-sibling::div/input")
	private WebElement onaverageproject;
	@FindBy(xpath = "//*[@id='avgBudget']")
	private WebElement totalbudget;
	@FindBy(xpath ="//select[@id='segment']")
	private WebElement segment;
	@FindBy(xpath = "//select[@id='first_order']")
	private WebElement urgencyfirstorder;
	
	
	// user select retail in business type 
	
	@FindBy(xpath = "//input[@id='retail_locations']")
	private WebElement retaillocation;
	@FindBy(xpath="//select[@id='home_design_services']")
	private WebElement homedesignservice;
	@FindBy(xpath = "//select[@id='retail_value']")
	private WebElement salesaccessories;
	@FindBy(xpath = "//select[@id='lighting_at_retail_value']")
	private WebElement saleslighting;
	@FindBy(xpath = "//input[@id='sales_associates']")
	private WebElement salesassociates;
	@FindBy(xpath = "//input[@id='average_square_feet']")
	private WebElement averagesquare;
	@FindBy(xpath="//select[@id='retail_first_rder']")
	private WebElement firstorder;
	
	
	//user select e-commerce in business type 
	
	@FindBy(xpath="//div[contains(@class,'goliveDate')]")
	private WebElement datepicker;
	@FindBy(xpath = "//input[@id='Ecomhome_Decor']")
	private WebElement homedecor;
	@FindBy(xpath = "//select[@id='Ecom_retail_value']")
	private WebElement ecomsalesassesories;
	@FindBy(xpath = "//select[@id='EcomLighting_Retailvalue']")
	private WebElement ecomsaleslighting;
	
	// user select Contract in buiseness type
	
	@FindBy(xpath = "//input[@id='contDesigners']")
	private WebElement countdesigner;
	@FindBy(xpath = "//select[@id='contlibrarian']")
	private WebElement stafflibrariiancount;
	@FindBy(xpath="//*[@id='cont_projects']")
	private WebElement projectnumber;
	@FindBy(xpath = "//input[@id='Cont_Budget']")
	private WebElement countbudget;
	@FindBy(xpath = "//label[@for='Cont_purchase']/following-sibling::select")
	private WebElement purchase;
	@FindBy(xpath  ="(//label[text()='Urgency of First Order* '])[1]/following-sibling::select/following::div[1]/a[1]")
	private WebElement previous;
	@FindBy(xpath = "//label[@for='Cont_purchase']//following::a/following::a[contains(@class,'business_overview_save_contract')]")
	private WebElement save7continue;
	
	
	
	
	
	

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
			
			Applicationutility.dropdown(businesstype, "Design");
			
			hearaboutus.click();
			Applicationutility.dropdown(hearaboutus, "Tradeshow");
			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0, 500);", locationstate);
			
			locationstate.click();
			Applicationutility.dropdown(locationstate, "Alabama");
			
			Thread.sleep(1000);
			salestax.click();
			Applicationutility.dropdown(salestax, "Non-Exempt");
			
			salestax.click();
			Applicationutility.dropdown(salestax, "Exempt");
			
			representative.click();
			representative.sendKeys(Propertyutility.getproperty("representative"));
			
			salesTaxno.click();
			salesTaxno.sendKeys(Propertyutility.getproperty("salestexno"));
			
		
			Thread.sleep(1000);
		        // Provide the full file path to upload
		        String filePath = "C:\\Users\\rajat.shrotriya.INNOAGE\\Downloads\\Cart (1).pdf";
		        cerificatefile.sendKeys(filePath);
		        
		        locationstate.click();
				Applicationutility.dropdown(locationstate, "Alaska");
		     
		        TaxId.click();
		        TaxId.sendKeys(Propertyutility.getproperty("TaxId"));
		         
		        blnumber.click();
		        blnumber.sendKeys(Propertyutility.getproperty("bnumber"));
						
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
		
		Thread.sleep(1000);
		organisationaltitle.click();
		Select sell3 =  new Select(organisationaltitle);
		sell3.selectByValue("Owner");
		
		phonenumber.click();
		phonenumber.sendKeys(Propertyutility.getproperty("phoneno"));
		
		emailid.click();
		emailid.sendKeys(Propertyutility.getproperty("email"));
	
		checkbox.click();
		policies.click();
		
		Applicationutility.chnagewindow(0, driver);
		privacystatement.click();	
		
		Applicationutility.chnagewindow(0, driver);
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
		
		noofdesigner.click();
		noofdesigner.sendKeys(Propertyutility.getproperty("noofdesigner"));
		
		typeofoffice.click();
		
		Select select = new Select(typeofoffice);
		
		if (select.isMultiple()) 
		{
		    select.deselectAll(); // Only valid for multi-select
		} 
		else
		{
		    System.out.println("This is a single-select dropdown. Deselect methods are not applicable.");
		}
		
		select.selectByVisibleText("Home office");
		
		
		librarianorstaff.click();
        Select select1 = new Select(librarianorstaff);
		
		if (select1.isMultiple()) 
		{
		    select1.deselectAll(); // Only valid for multi-select
		} 
		else
		{
		    System.out.println("This is a single-select dropdown. Deselect methods are not applicable.");
		}
		
		select1.selectByVisibleText("Yes");
		
	    Applicationutility.waitforclickible(driver, onaverageproject);
		
		onaverageproject.sendKeys(Propertyutility.getproperty("firmwork"));
		
		
		Thread.sleep(1000);
		Applicationutility.waitforclickible(driver, totalbudget);
		totalbudget.click();
		totalbudget.sendKeys(Propertyutility.getproperty("averagetotal"));
		
		Thread.sleep(1000);
		segment.click();
		Select select2 = new Select(segment);
		
		if (select2.isMultiple()) 
		{
		    select2.deselectAll(); // Only valid for multi-select
		} 
		else
		{
		    System.out.println("This is a single-select dropdown. Deselect methods are not applicable.");
		}
		
		select2.selectByVisibleText("Interior Designer");
		
		
		Thread.sleep(1000);
		urgencyfirstorder.click();
		Select select3 = new Select(urgencyfirstorder);
		
		if (select3.isMultiple()) 
		{
		    select3.deselectAll(); // Only valid for multi-select
		} 
		else
		{
		    System.out.println("This is a single-select dropdown. Deselect methods are not applicable.");
		}
		
		select3.selectByVisibleText("Within Three Months");
		
		
		previous.click();
		
		Thread.sleep(2000);
		
		
		
			
		
		}
		catch (Exception e) 
		{
			System.out.println("issue in businessoverview" +e);
		}
	}
	
}
