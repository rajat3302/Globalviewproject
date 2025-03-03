package globalview_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Checkout_page extends BaseLibrary

{

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
private WebElement standaerdshippingverify;
















































}
