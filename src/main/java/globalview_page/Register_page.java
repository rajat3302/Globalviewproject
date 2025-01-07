package globalview_page;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	@FindBy(xpath = "//label[@for='certificate']/following-sibling::div/input")
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
	
	
	
	// user select design in businesstype 
	

	@FindBy(xpath="(//*[@id=\"website\"])[1]")
	private WebElement website1;
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
	@FindBy(xpath = "(//a[contains(@class,'business_overview_previous')])[1]")
	private WebElement previous1;
	
	
	// user select retail in business type 
	
	@FindBy(xpath="(//label[@for='website'])[2]/following-sibling::input")
	private WebElement website2;
	@FindBy(xpath = "//input[@id='retail_locations']")
	private WebElement retaillocation;
	@FindBy(xpath="//select[@id='home_design_services']")
	private WebElement homedesignservice;
	@FindBy(xpath = "//select[@id='retail_value']")
	private WebElement salesaccessories;
	@FindBy(xpath = "//select[@id='lighting_at_retail_value']")
	private WebElement saleslighting;
	@FindBy(xpath = "//label[@for='Segment_retail']/following-sibling::select")
	private WebElement segment1;
	@FindBy(xpath = "//input[contains(@class,'sales_associates input_pluse_minus')]")
	private WebElement salesassociates;
	@FindBy(xpath = "//input[@id='average_square_feet']")
	private WebElement averagesquare;
	@FindBy(xpath="//select[@id='retail_first_rder']")
	private WebElement firstorder;
	@FindBy(xpath  ="//div[contains(@class,'row business_overview_retail')]/div[1]/following-sibling::div/a[1]")
	private WebElement previous2;
	
	
	//user select e-commerce in business type 
	
	@FindBy(xpath = "(//label[@for='website'])[3]/following-sibling::input")
	private WebElement website3;
	@FindBy(xpath="//div[contains(@class,'goliveDate')]")
	private WebElement datepicker;
	@FindBy(xpath = "//input[@id='Ecomhome_Decor']")
	private WebElement homedecor;
	@FindBy(xpath = "//select[@id='Ecom_retail_value']")
	private WebElement ecomsalesassesories;
	@FindBy(xpath = "//select[@id='EcomLighting_Retailvalue']")
	private WebElement ecomsaleslighting;
	@FindBy(xpath = "//div[contains(@class,'row business_overview_Ecommerce')]/div[1]/following-sibling::div/a[1]")
	private WebElement previous3;
	
	// user select Contract in buiseness type
	
	@FindBy(xpath = "//label[@for='cont_website']/following-sibling::input")
	private WebElement website4;
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
	
	@FindBy(xpath = "//label[@for='Cont_purchase']//following::a/following::a[contains(@class,'business_overview_save_contract')]")
	private WebElement savecontinue;
	
	
	//billing information page 
	
	@FindBy(xpath = "//label[@for='bill_to_name']/following-sibling::input")
	private WebElement billtoname;
	@FindBy(xpath="//label[@for='street1']/following-sibling::input")
	private WebElement street1;
	@FindBy(xpath= "//label[@for='street2']/following-sibling::input")
	private WebElement street2;
	@FindBy(xpath = "//label[@for='street3']/following-sibling::input")
	private WebElement street3;
	@FindBy(xpath="//label[@for='zip_code']/following-sibling::input")
	private WebElement zipcode;
	@FindBy(xpath= "//label[@for='city']/following-sibling::input")
	private WebElement city;
	@FindBy(xpath="//label[@for='state']/following-sibling::select")
	private WebElement state;
	@FindBy(xpath="//label[@for='country']/following-sibling::input")
	private WebElement country;
	@FindBy(xpath="//label[@for='phone']/following-sibling::input")
	private WebElement phone;
	@FindBy(xpath = "//label[@for='address_type']/following-sibling::select")
	private WebElement addresstype;
	
	//Account payable
	@FindBy(xpath="//input[contains(@class,'accounts_checkbox')]")
	private WebElement sameasprimary;
	@FindBy(xpath="//label[@for='first_name_1']/following-sibling::input")
	private WebElement fname;
	@FindBy(xpath = "//label[@for='last_name_1']/following-sibling::input")
	private WebElement lname;
	@FindBy(xpath = "//label[@for='email_1']/following-sibling::input")
	private WebElement email;
	@FindBy(xpath = "//*[@id='billing_information_save']")
	private WebElement save;
	
	//Review page 
	@FindBy(xpath = "//a[@id='company_edit']")
	private WebElement comapnyinfoedit;
	@FindBy(xpath = "(//a[@id='business_edit'])[4]")
	private WebElement businessoveredit;
	@FindBy(xpath="//a[@id='billing_edit']")
	private WebElement billinginfoedit;
	@FindBy(xpath = "//div[contains(@class,'review-check')]//input")
	private WebElement checkboxconfirm;
	@FindBy(xpath="//span[@aria-labelledby='recaptcha-anchor-label']/child::div[1]")
	private WebElement captchacode;
	@FindBy(xpath = "//button[@id='review_submit']")
    private WebElement reviewsubmit;
	
	
	
	
	
	

	public void ClickonRegister() 
	
	{
		registerbutton.click();
	}

	public void companydetails() 
	{
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
		Applicationutility.waitforVisible(driver, website1);
		website1.click();
		website1.sendKeys(Propertyutility.getproperty("website"));
		
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
		
		
		previous1.click();
		
		Thread.sleep(2000);
		
		Applicationutility.dropdown(businesstype, "Retail");
		
		Thread.sleep(1000);
		submit.click();
		
		
		Thread.sleep(1000);
		
		Applicationutility.scrolltotop();
		Applicationutility.waitforVisible(driver, website2);
		website2.click();
		website2.sendKeys(Propertyutility.getproperty("website"));
		
		Thread.sleep(1000);
		retaillocation.click();
		retaillocation.sendKeys(Propertyutility.getproperty("locationretail"));
		
		homedesignservice.click();
		Applicationutility.dropdown(homedesignservice, "Yes");
		
		salesaccessories.click();
		Applicationutility.dropdown(salesaccessories, "$1-$50,000");
		
		saleslighting.click();
		Applicationutility.dropdown(saleslighting, "$1-$50,000");
		
		segment1.click();
		Applicationutility.dropdown(segment1, "Furniture");
		
		Thread.sleep(2000);
		salesassociates.click();
		salesaccessories.sendKeys(Propertyutility.getproperty("noassociates"));
		
		averagesquare.click();
		averagesquare.sendKeys(Propertyutility.getproperty("squareaverage"));
		
	
		Thread.sleep(1000);
		firstorder.click();
		
		Applicationutility.dropdown(firstorder, "Within A Month");
		
		Thread.sleep(1000);
		
		
		previous2.click();
		
		
		
		Applicationutility.dropdown(businesstype, "Ecommerce");
		Thread.sleep(1000);
		submit.click();
		
		
		Applicationutility.scrolltotop();
		website3.click();
		website3.sendKeys(Propertyutility.getproperty("website3"));
//		datepicker.click();
//		
//		Thread.sleep(1000);
//		datepicker.sendKeys("05-01-2025"); // Enter desired date in the required format
		Thread.sleep(1000);
		homedecor.sendKeys(Propertyutility.getproperty("homedecorvendors"));
		
		ecomsalesassesories.click();
		Applicationutility.dropdown(ecomsalesassesories, "$1-$50,000");
		
		ecomsaleslighting.click();
		Applicationutility.dropdown(ecomsaleslighting, "$1-$50,000");
		
		Thread.sleep(1000);
		
		previous3.click();
		Thread.sleep(1000);
		Applicationutility.dropdown(businesstype, "Contract");
		
		submit.click();
		Applicationutility.scrolltotop();
		website4.click();
		website4.sendKeys(Propertyutility.getproperty("website3"));
		
		countdesigner.click();
		countdesigner.sendKeys(Propertyutility.getproperty("countdesigner"));
		
		stafflibrariiancount.click();
		Applicationutility.dropdown(stafflibrariiancount, "Yes");
		
		projectnumber.click();
		projectnumber.sendKeys(Propertyutility.getproperty("noproject"));
		
		countbudget.click();
		countbudget.sendKeys(Propertyutility.getproperty("budgetproject"));
		
		purchase.click();
		Applicationutility.dropdown(purchase, "Purchase");
		
		savecontinue.click();
		
		Applicationutility.scrolltotop();
		billtoname.sendKeys(Propertyutility.getproperty("billtoname"));
		street1.sendKeys(Propertyutility.getproperty("street1"));
		street2.sendKeys(Propertyutility.getproperty("street2"));
		street3.sendKeys(Propertyutility.getproperty("street3"));
		zipcode.sendKeys(Propertyutility.getproperty("zipcode"));
		city.sendKeys(Propertyutility.getproperty("city"));
		state.sendKeys(Propertyutility.getproperty("state"));
		Thread.sleep(1000);
		//country.sendKeys(Propertyutility.getproperty("country"));
		phone.sendKeys(Propertyutility.getproperty("phone"));
		
		Applicationutility.dropdown(addresstype, "Residential");
		
		sameasprimary.click();
		
		  // Assertion same as primary details 
//			String expectedtext1 = Propertyutility.getproperty("firstname");
//		    String actualtext1  = fname.getText();
//		    System.out.println("actualtext is :" +actualtext1);
//		    assertEquals(actualtext1, expectedtext1);
//		    
//		    String expectedtext2 = Propertyutility.getproperty("lastname");
//		    String actualtext2 =  lname.getText();
//		    System.out.println("actualtext is" +actualtext2);
//		    assertEquals(actualtext2, expectedtext2);
//		    
//		    String expectedtext3 = Propertyutility.getproperty("email");
//		    String actualtext3 = email.getText();
//		    System.out.println("actual text is" +actualtext3);
//		    assertEquals(actualtext3, expectedtext3);
		    
		    
	    
		Thread.sleep(1000);
		save.click();
		
		
		
		
		}
		catch (Exception e) 
		{
			System.out.println("issue in businessoverview" +e);
		}
	}
	public void review()
	{
		try 
		{
			comapnyinfoedit.click();
			hearaboutus.click();
			Applicationutility.dropdown(hearaboutus, "Trade Association/Buying Group");
			Thread.sleep(1000);
			blnumber.click();
			blnumber.clear();
			Thread.sleep(1000);
			blnumber.sendKeys(Propertyutility.getproperty("bnumber2"));
			submit.click();
			savecontinue.click();
			save.click();
			
			Thread.sleep(1000);
			businessoveredit.click();
			
			
			billinginfoedit.click();
			street1.click();
			street1.clear();
			Thread.sleep(1000);
			street1.sendKeys(Propertyutility.getproperty("stret1"));
			save.click();
			
			
			Applicationutility.getscroll(checkboxconfirm, driver);
			Thread.sleep(1000);
			checkboxconfirm.click();
			Thread.sleep(1000);
//			captchacode.click();
//			Thread.sleep(1000);
			reviewsubmit.click();
			
			Thread.sleep(2000);
			
			
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("issue in finalreview page"+ e);
			
		}
	}
	
}
