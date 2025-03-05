package globalview_page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

public class Checkout_page extends BaseLibrary

{

	AddtoCart_page ob;
	public Checkout_page()
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//span[text()='Checkout']")
private WebElement checkouttitle;
@FindBy(xpath="//span[text()='Shipping']")
private WebElement shippinglogo;
@FindBy(xpath="//span[text()='Review & Payments']")
private WebElement reviewpayments;
@FindBy(xpath="//li[contains(@class,'checkout-shipping-address')]/child::div[contains(text(),'Shipping Address')]")
private WebElement shippingadderess;
@FindBy(xpath="//span[text()='Order Summary']")
private WebElement ordersummary;
@FindBy(xpath="//span[text()='Item in Cart']")
private WebElement itemsincart;
@FindBy(xpath = "//div[contains(@class,'product-item-name-block')]/strong")
private WebElement itemnameverify;
@FindBy(xpath="//span[contains(@class,'product-image-wrapper')]/img")
private WebElement itemsimageverify;

@FindBy(xpath="//span[contains(@class,'cart-price')]/span")
private WebElement itemspriceverify;

@FindBy(xpath="//select[@name='shipping_address_id']")
private WebElement dhippingaddress;
@FindBy(xpath="//div[contains(@class,'shipping-address-item selected-item')]")
private WebElement selectedshippingsdd;

@FindBy(xpath="//h1[contains(@class,'modal-title')]")
private WebElement modaltitle;
@FindBy(xpath="(//input[@name='firstname'])[2]")
private WebElement firstname;
@FindBy(xpath="(//input[@name='lastname'])[2]")
private WebElement lastname;
@FindBy(xpath="(//input[@name='company'])[2]")
private WebElement company;
@FindBy(xpath="(//input[@placeholder='Address 1'])[2]")
private WebElement address1;
@FindBy(xpath="(//select[@name='country_id'])[2]")
private WebElement countryname;
@FindBy(xpath="(//select[@name='region_id'])[2]")
private WebElement regionid;
@FindBy(xpath="(//input[@name='city'])[2]")
private WebElement cityname;
@FindBy(xpath="(//input[@name='postcode'])[2]")
private WebElement postcode;
@FindBy(xpath="(//input[@name='telephone'])[2]")
private WebElement phoneno;
@FindBy(xpath="//span[text()='Save to address book']")
private WebElement savetoadderess;
@FindBy(xpath="//footer[contains(@class,'modal-footer')]//span[contains(text(),'Update')]")
private WebElement update;
@FindBy(xpath="//footer[contains(@class,'modal-footer')]//span[contains(text(),'Cancel')]")
private WebElement cancel;
@FindBy(xpath="//a[text()='View Our Shipping & Handling Page']")
private WebElement handlingpage;

@FindBy(xpath="//div[contains(@class,'checkout-shipping-method')]/div[contains(text(),'Shipping Methods')]")
private WebElement shippingmethod;
@FindBy(xpath="//td[text()='Standard Delivery']")
private WebElement standarddelivery;
@FindBy(xpath="//td[text()='Additional Rush Fee']")
private WebElement additionalrush;
@FindBy(xpath="//td[text()='Hot Rush Fee']")
private WebElement hotrush;
@FindBy(xpath="//label[text()='WHITE GLOVE - FEE']")
private WebElement whiteglove;
@FindBy(xpath="//label[text()='DROP SHIP - FEE']")
private WebElement dropship;

@FindBy(xpath="//span[text()='$132.72']")
private WebElement standarddeliveryprice;
@FindBy(xpath="//span[text()='Next']")
private WebElement next;


@FindBy(xpath="//div[text()='Billing Address:']")
private WebElement billingaddreesheading;

@FindBy(xpath="//div[contains(@class,'billing-address-details')]")
private WebElement billingaddress;
@FindBy(xpath="//div[contains(@class,'shipping-address-details')]")
private WebElement shippingadreess;

@FindBy(xpath="//th[text()='Cart Subtotal']/following::td[1]")
private WebElement cartsubtotal;
@FindBy(xpath="(//td[contains(@class,'amount')])[2]")
private WebElement spiingcharges;
@FindBy(xpath="//tr[contains(@class,'grand totals')]/td/strong/span")
private WebElement grandtotalverify;

@FindBy(xpath="//strong[contains(@class,'product-item-name')]")
private WebElement verifyitemnameinbox;


@FindBy(xpath="//span[text()='Po Number:']")
private WebElement ponumberedit;
@FindBy(xpath="//span[text()='Order Notes:']")
private WebElement ordernotesedit;
@FindBy(xpath="//span[text()='Shipping Method:']")
private WebElement shippingmethodverify;
@FindBy(xpath="//span[text()='Shipping Method:']/following::button[1]/following::span[1]")
private WebElement shippingstandarddelivery;
@FindBy(xpath="//div[text()='Payment Method']")
private WebElement paymentmethod;

@FindBy(xpath="//div[contains(@class,'checkout-agreement field choice required')]/input/following::label")
private WebElement clickcheckbox;
@FindBy(xpath="//div[contains(@class,'checkout-agreement field choice required')]/input/following::label/button")
private WebElement reviewcheck;

@FindBy(xpath="//h3[text()='WHOLESALE PRICES']")
private WebElement whoelprices;
@FindBy(xpath="//h3[text()='RETURNS']")
private WebElement returns;
@FindBy(xpath="//footer[contains(@class,'modal-footer')]/button/span")
private WebElement closemodal;

@FindBy(xpath="//button[contains(@class,'action primary checkout')]/span")
private WebElement placeorder;


@FindBy(xpath="//a[contains(@class,'order-number')]/strong")
private WebElement ordernumber;
@FindBy(xpath = "//span[text()='Thank you for your purchase!']")
private WebElement thankyoumessage;
@FindBy(xpath="//a[contains(@class,'order-number')]/strong/following::p[1]")
private WebElement messageonlastpage;
@FindBy(xpath="//*[text()='Print receipt']")
private WebElement printreceipt;
@FindBy(xpath="//span[text()='Cancel']")
private WebElement cancelprint;
@FindBy(xpath="//span[text()='Continue Shopping']")
private WebElement continueshopping;


@FindBy(xpath="//a[text()='Dashboard']")
private WebElement dashboard;
@FindBy(xpath="//strong[text()='Recent Orders']")
private WebElement recentorders;
@FindBy(xpath="//caption[text()='Recent Orders']/following::tr[1]/following::td[1]")
private WebElement verifytheordernumber;
@FindBy(xpath="//caption[text()='Recent Orders']/following::tr[1]/following::td[5]")
private WebElement verifystatus;
@FindBy(xpath="//caption[text()='Recent Orders']/following::tr[1]/following::td[6]/a[1]")
private WebElement vieworder;
@FindBy(xpath="//caption[text()='Recent Orders']/following::tr[1]/following::td[6]/a[2]")
private WebElement reorder;

@FindBy(xpath="//span[text()='Reorder']")
private WebElement Reorderonprintrecipt;



public void validatepagetitlecheckout() throws InterruptedException
{
	Thread.sleep(1000);
	String expcheckouttitle =  Propertyutility.getproperty("checkout");
	String actcheckouttitle =  checkouttitle.getText();
	System.out.println(actcheckouttitle);
	assertEquals(expcheckouttitle, actcheckouttitle);
	
	System.out.println("title verified Checkout");
	
	Thread.sleep(1000);
	String expshippinglogo = Propertyutility.getproperty("shipping");
	String actshippinglogo = shippinglogo.getText();
	System.out.println(actshippinglogo);
	assertEquals(actcheckouttitle, expshippinglogo, actshippinglogo);
	
	System.out.println("verified shippinglogo");
}

public void ordersummery() throws InterruptedException
{
	Thread.sleep(1000);
	ob = new AddtoCart_page();
	String exporedrsummary = Propertyutility.getproperty("ordersummary");
	String actordersummary =  ordersummary.getText();
	System.out.println(actordersummary);
	assertEquals(exporedrsummary, actordersummary);
	
	System.out.println("verified text order summary");
	
	try
	{
			
	Applicationutility.myClick(itemsincart);
	Applicationutility.myClick(itemsincart);
	
	String itemincart = itemsincart.getText();
	
    System.out.println("Text inside the element: " + itemincart);
	}
	catch (Exception e) 
	{
    System.out.println("An error occurred: " + e.getMessage());
	}
	
	String expitemname = Propertyutility.getproperty("pnamecheckout");
	String actitemname = itemnameverify.getText();
	System.out.println(actitemname);
	assertEquals(expitemname, actitemname);
	System.out.println("name verified in summary box");
	
	
	Thread.sleep(1000);
	String expitempricecheckout =  itemspriceverify.getText().trim();
	System.out.println("expected price" +expitempricecheckout);
    
    
    Applicationutility.myClick(itemsimageverify);
    boolean isImageDisplayed = itemsimageverify.isDisplayed();
    System.out.println("Is the image displayed? " + isImageDisplayed);
    Assert.assertTrue(isImageDisplayed, "Image is not displayed on the page!");
    
    
    
    
    Thread.sleep(2000);
    
	
	
}













































}
