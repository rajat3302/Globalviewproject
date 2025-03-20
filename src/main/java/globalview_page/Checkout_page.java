package globalview_page;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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

@FindBy(xpath="//div[text()='Shipping Address']")
private WebElement shippingadderesstext;
@FindBy(xpath="//select[@name='shipping_address_id']")
private WebElement selectshippingaddress;
@FindBy(xpath="//div[contains(@class,'shipping-address-item selected-item')]")
private WebElement addressmodal;


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

@FindBy(xpath="//span[text()='Go back to edit your po number']")
private WebElement editponumber;
@FindBy(xpath="//button[@title='Proceed to Checkout']")
private WebElement checkout;

@FindBy(xpath="//input[@id='ponumber_code']")
private WebElement ponumber;
@FindBy(xpath="//div[text()='Billing Address:']")
private WebElement billingaddreesheading;

@FindBy(xpath="//div[contains(@class,'billing-address-details')]/span[1]")
private WebElement billingaddress;
@FindBy(xpath="//div[contains(@class,'shipping-address-details')]")
private WebElement shippingadreess;

@FindBy(xpath="//th[text()='Cart Subtotal']/following::td[1]")
private WebElement cartsubtotal;
@FindBy(xpath="(//td[contains(@class,'amount')])[2]")
private WebElement shippingcharges;
@FindBy(xpath="//tr[contains(@class,'grand totals')]/td/strong/span")
private WebElement grandtotalverify;

@FindBy(xpath="//span[contains(@class,'cart-price')]/span")
private WebElement priceonitem;
@FindBy(xpath="//strong[contains(@class,'product-item-name')]")
private WebElement verifyitemnameinbox;


@FindBy(xpath="//span[text()='Po Number:']")
private WebElement ponumberverify;
@FindBy(xpath="//span[text()='Order Notes:']")
private WebElement ordernotesverify;
@FindBy(xpath="//span[text()='Shipping Method:']")
private WebElement shippingmethodverify;
@FindBy(xpath="//span[text()='Shipping Method:']/following::button[1]/following::span[1]")
private WebElement shippingstandarddelivery;
@FindBy(xpath="//div[text()='Payment Method']")
private WebElement paymentmethod;

@FindBy(xpath="//span[text()='Credit Card']")
private WebElement creditcardtext;
@FindBy(xpath="//span[text()='Use registered card:']")
private WebElement useregisteredcard;
@FindBy(xpath="//span[text()='Use registered card:']/following-sibling::div[1]/input")
private WebElement firstexistingcard;
@FindBy(xpath="//span[text()='Use registered card:']/following-sibling::div[2]/input")
private WebElement secondexistingcard;
@FindBy(xpath="//span[text()='Use registered card:']/following-sibling::div[4]/input")
private WebElement registercardnewone;

@FindBy(xpath="//input[@id='sage_name']")
private WebElement cardholdername;
@FindBy(xpath="//input[@id='sage_addres']")
private WebElement cardholderadderess;
@FindBy(xpath="//input[@id='sage_city']")
private WebElement cardholdercity;
@FindBy(xpath="//input[@id='sage_state']")
private WebElement cardholderstate;
@FindBy(xpath="//input[@id='sage_zip']")
private WebElement cardholderzipcode;
@FindBy(xpath="//input[@id='sage_country']")
private WebElement cardholdercountry;
@FindBy(xpath="//input[@name='payment[cc_number]']")
private WebElement ccnumber;

@FindBy(xpath="//select[@name='payment[cc_exp_month]']")
private WebElement selectmonth;
@FindBy(xpath="//select[@name='payment[cc_exp_year]']")
private WebElement selectyear;





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

@FindBy(xpath="//div[text()='This is a required field.']")
private WebElement validationerror;
@FindBy(xpath="//label[@for='agreement_sage_1']")
private WebElement checkbox;

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

public void selectshippingadderess() throws InterruptedException
{
	String expshippingadresstext =   Propertyutility.getproperty("shippingaddress");
	String actshippingadresstext =   shippingadderesstext.getText();
	System.out.println(actshippingadresstext);
	assertEquals(expshippingadresstext, actshippingadresstext);
	
	System.out.println("Shiping adderess text verified");
	
	Thread.sleep(1000);
	Applicationutility.myClick(selectshippingaddress);
	System.out.println("click on option select shipping adderess");
	
	Applicationutility.dropdown(selectshippingaddress, "Naveen Sharma, Interior design home, ARIZONA, Arizona 12345, United States");
	System.out.println("address selected");
	Thread.sleep(1000);
	
    Applicationutility.myClick(addressmodal);
	Assert.assertTrue(addressmodal.isDisplayed(), "Selected Address Modal is not displayed!");
	Thread.sleep(2000);
}
	
	
public void validatenewshippingaddressform() throws InterruptedException
{
	
	Applicationutility.myClick(selectshippingaddress);
	Thread.sleep(1000);
	Applicationutility.dropdown(selectshippingaddress, "New Address");
	Thread.sleep(1000);
	
	String exptextnewadderess =  Propertyutility.getproperty("newaddress");
	String acttextnewadderess =  modaltitle.getText();
	System.out.println(acttextnewadderess);
	assertEquals(exptextnewadderess, acttextnewadderess);
	System.out.println("Verified text New Address");
	
	Applicationutility.myClick(firstname);
	firstname.sendKeys(Propertyutility.getproperty("ffname"));
	Applicationutility.myClick(lastname);
	lastname.sendKeys(Propertyutility.getproperty("llname"));
	Applicationutility.myClick(company);
	company.sendKeys(Propertyutility.getproperty("ccompany"));
	Applicationutility.myClick(address1);
	address1.sendKeys(Propertyutility.getproperty("enteraddress"));
	Applicationutility.myClick(regionid);
	Applicationutility.dropdown(regionid, "Arizona");
	Applicationutility.myClick(cityname);
	cityname.sendKeys(Propertyutility.getproperty("cityus"));
	Applicationutility.myClick(postcode);
	postcode.sendKeys(Propertyutility.getproperty("zipcode"));
	Applicationutility.myClick(phoneno);
	phoneno.sendKeys(Propertyutility.getproperty("phoneno"));
	Thread.sleep(1000);
	
	Applicationutility.myClick(savetoadderess);
	Applicationutility.myClick(update);
	
	//driver.switchTo().alert().dismiss();
	//Applicationutility.myClick(addressmodal);
	
//	Assert.assertTrue(addressmodal.isDisplayed(), "Selected Address Modal is not displayed!");
//	System.out.println("shipping adderess modal displayed");
	
	
}

public void selectshippingmethod () throws InterruptedException
{
	try
	{
//	String expshippingmethod =  Propertyutility.getproperty("shpingmethodvalidate");
//	String actshippingmethod =  shippingmethod.getText();
//	System.out.println(actshippingmethod);
//	assertEquals(expshippingmethod, actshippingmethod);
//	System.out.println("verified text shipping method");
	
	Applicationutility.myClick(handlingpage);
	Thread.sleep(2000);
	Applicationutility.chnagewindow(0, driver);
	Thread.sleep(1000);
	
	Applicationutility.waitforclickible(driver, standarddelivery);
	Applicationutility.waitforclickible(driver, additionalrush);
	Applicationutility.waitforclickible(driver, hotrush);
	
	Thread.sleep(1000);
	Applicationutility.myClick(standarddelivery);
	
	// white glove check 
	Applicationutility.myClick(whiteglove);
	Thread.sleep(1000);
	Applicationutility.myClick(whiteglove);
	Thread.sleep(1000);
	Applicationutility.myClick(dropship);
	Thread.sleep(1000);
	Applicationutility.myClick(dropship);
	
	Applicationutility.myClick(next);
	System.out.println("Move to the next checkout page");
	Thread.sleep(2000);

	}
	catch (Exception e) 
	{
		System.out.println("issue in select shipping method" +e);
	}
}

public void validateeditponumber() throws InterruptedException
{
	
    Thread.sleep(1000);
    
	Applicationutility.myClick(editponumber);
	Thread.sleep(1000);
	Applicationutility.myClick(ponumber);
	ponumber.clear();
	
	ponumber.sendKeys("GV09876");
	Thread.sleep(1000);
	Applicationutility.myClick(checkout);
	Thread.sleep(1000);
	
}
public void finalcheckoutpagevalidation() throws InterruptedException
{
	
	
    Thread.sleep(1000);
	Applicationutility.myClick(selectshippingaddress);
	Thread.sleep(1000);
	Applicationutility.dropdown(selectshippingaddress, "Naveen Sharma, Interior design home, ARIZONA, Arizona 12345, United States");
	System.out.println("address selected agian ");
	Thread.sleep(1000);
	Applicationutility.myClick(next);
	System.out.println("Move to the final checkout page agian");
	
	Thread.sleep(1000);
	Applicationutility.myClick(billingaddreesheading);
	String exptextbillingaddress = Propertyutility.getproperty("billingaddress");
	String acttextbillingaddress = billingaddreesheading.getText();
	System.out.println(acttextbillingaddress);
	assertEquals(exptextbillingaddress, acttextbillingaddress);
	System.out.println("verified billing adress");
	Thread.sleep(1000);
	
	Applicationutility.myClick(billingaddress);
	String expbilling = "BILLING ADDRESS";
	String actbilling = billingaddress.getText();
	System.out.println(actbilling);
	assertEquals(expbilling, actbilling);
	System.out.println("verified billing");
	Thread.sleep(2000);
	
//	Applicationutility.myClick(shippingadderess);
//	String expshipping = Propertyutility.getproperty("shippingaddress");
//	String actshipping = shippingadreess.getText();
//	System.out.println(actshipping);
//	assertEquals(expshipping, actshipping);
//	System.out.println("verified shpping address");
//	Thread.sleep(1000);
	
	Applicationutility.myClick(verifyitemnameinbox);
	String expitems = Propertyutility.getproperty("pnamecheckout");
	String actitems =  verifyitemnameinbox.getText();
	System.out.println(actitems);
	assertEquals(expitems, actitems);
	System.out.println("produt name verified final page");
	Thread.sleep(1000);
	
	Applicationutility.myClick(ponumberverify);
	String expponumber =  "PO NUMBER:";
	String actponumber = ponumberverify.getText();
	System.out.println(actponumber);
	assertEquals(expponumber, actponumber);
	Thread.sleep(1000);
	
	Applicationutility.myClick(ordernotesverify);
	String expordernotes = "ORDER NOTES:";
	String actordernotes = ordernotesverify.getText();
	System.out.println(actordernotes);
	assertEquals(expordernotes, actordernotes);
	Thread.sleep(1000);
	
//	Applicationutility.myClick(shippingmethodverify);
//	String expshippingmethod = Propertyutility.getproperty("shippingmethodvalidate");
//	String actshippingmethod = 	shippingmethodverify.getText();
//	System.out.println(actshippingmethod);
//	assertEquals(expshippingmethod, actshippingmethod);
//	System.out.println("verified shipping address");

	Applicationutility.myClick(shippingstandarddelivery);
	String expshippindelivery =  Propertyutility.getproperty("standarddelivery");
	String actshippingdelivery = shippingstandarddelivery.getText();
	System.out.println(shippingstandarddelivery);
	assertEquals(expshippindelivery, actshippingdelivery);
	System.out.println("vaerified shpiing method on final checkoutpage ");
	Thread.sleep(1000);
}

public void finalcheckout() throws InterruptedException
{
	
	Thread.sleep(1000);
    Applicationutility.myClick(shippingmethodverify);
	
	double cartSubtotal = Double.parseDouble(cartsubtotal.getText().replace("$", "").trim());
    double shipping = Double.parseDouble(shippingcharges.getText().replace("$", "").trim());
    double orderTotal = Double.parseDouble(grandtotalverify.getText().replace("$", "").trim());
    
    System.out.println("Cart Subtotal: $" + cartSubtotal);
    System.out.println("Shipping - Standard Delivery: $" + shipping);
    System.out.println("Order Total: $" + orderTotal);
    
    double expectedTotal = cartSubtotal + shipping;
    Assert.assertEquals(orderTotal, expectedTotal, "Order Total does not match expected sum!");
    System.out.println("Validation Passed: Order Total is correctly calculated.");
    
    
    Thread.sleep(1000);
    Applicationutility.myClick(priceonitem);
    
    double itemPrice = Double.parseDouble(priceonitem.getText().replace("$", "").trim());
    System.out.println("Cart Subtotal: $" + cartSubtotal);
    System.out.println("Item Price: $" + itemPrice);
    
    Assert.assertEquals(cartSubtotal, itemPrice, "Cart Subtotal does not match Item Price!");
    System.out.println("Validation Passed: Cart Subtotal matches Item Price.");
    Thread.sleep(1000);
    
}

public void selectplaceorder()
{
	try
	{
	Applicationutility.myClick(paymentmethod);
	String exppaymentmethodtext = Propertyutility.getproperty("paymnetmethod");
	String actpaymentmethodtext =  paymentmethod.getText();
	System.out.println(actpaymentmethodtext);
	assertEquals(exppaymentmethodtext, actpaymentmethodtext);
	System.out.println("Text payment method verified");
	
	Thread.sleep(1000);
	
	Applicationutility.myClick(creditcardtext);
	String expcreditcardtext = Propertyutility.getproperty("creditcard");
	String actcreditcardtext = creditcardtext.getText();
	System.out.println(actcreditcardtext);
	assertEquals(expcreditcardtext, actcreditcardtext);
	System.out.println("verified text credit card");
	
	Applicationutility.myClick(useregisteredcard);
	String exptextuseregistered = Propertyutility.getproperty("useregistredcard");
	String acttextuseregistered = useregisteredcard.getText();
	System.out.println(acttextuseregistered);
	assertEquals(exptextuseregistered, acttextuseregistered);
	System.out.println("verified text USE REGISTRED CARD:");
	
	Thread.sleep(1000);
	Applicationutility.myClick(firstexistingcard);
	Applicationutility.myClick(secondexistingcard);
	Thread.sleep(1000);
	
	Applicationutility.myClick(Reorderonprintrecipt);
	Thread.sleep(1000);
	
	Applicationutility.myClick(cardholdername);
	cardholdername.sendKeys("Peter parker");
	Applicationutility.waitforclickible(driver, cardholderadderess);
	cardholderadderess.sendKeys("Interior street line");
	Applicationutility.waitforclickible(driver, cardholdercity);
	cardholderadderess.sendKeys("ARIZONA");
	Applicationutility.waitforclickible(driver, cardholderstate);
	cardholderadderess.sendKeys("ARIZONA");
	Applicationutility.waitforclickible(driver, cardholderzipcode);
	cardholderadderess.sendKeys("12345");
	Applicationutility.waitforclickible(driver, cardholdercountry);
	cardholderadderess.sendKeys("UNITED STATES");
	
	Applicationutility.waitforclickible(driver, ccnumber);
	
	String randomcard = Applicationutility.getRandomTestCard();
	ccnumber.sendKeys(randomcard);
	
	
	Applicationutility.myClick(selectmonth);
	
	// Generate random expiration month (01 to 12)
	int randomMonth = new Random().nextInt(12) + 1;
	Select monthdropdown =  new Select(selectmonth);
	monthdropdown.selectByVisibleText(String.format("%02d", randomMonth)); // Format to "01"

	// Generate random expiration year (next 5-10 years)
	
	int randomYear = new Random().nextInt(6) + 2025; // Range: 2025-2030
	Select yeardropdown =  new Select(selectyear);
	yeardropdown.selectByVisibleText(String.valueOf(randomYear));
	
	Thread.sleep(2000);
	
	Applicationutility.myClick(reviewcheck);
	Applicationutility.myClick(whoelprices);
	Thread.sleep(1000);
	Applicationutility.scrolltobottom();
	
	Thread.sleep(1000);
	Applicationutility.myClick(closemodal);
	
	Applicationutility.myClick(placeorder);
	
	Applicationutility.myClick(validationerror);
	String expvalidatonerrorcheckbox =  Propertyutility.getproperty("validationerrormessage");
	String actvalidationerrorcheckbox =  validationerror.getText();
	System.out.println(actvalidationerrorcheckbox);
	assertEquals(expvalidatonerrorcheckbox, actvalidationerrorcheckbox);
	System.out.println("validation error verified when yuser place order without click checkbox");
	
	Applicationutility.myClick(checkbox);
	Thread.sleep(1000);
	Applicationutility.myClick(placeorder);
	
	Thread.sleep(2000);
	
	}
	catch (Exception e) 
	{
	
	}
	
	
}















































}
