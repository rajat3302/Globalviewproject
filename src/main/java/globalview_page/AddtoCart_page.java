package globalview_page;

import static org.testng.Assert.assertEquals;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

public class AddtoCart_page extends BaseLibrary  


{
	//SignIn_page ob;
	HomeLinks_page ob;
	Applicationutility ob1;
	
    public AddtoCart_page()
    {
    	
    	ob = new HomeLinks_page();
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="(//span[text()='Shop'])[1]")
    private WebElement shopmenu;
    @FindBy(xpath="//div[text()='BARBARA BARRY']/following-sibling::div")
    private WebElement BARBARABARRYimageclick;
    @FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Barbara Barry Collection')]/following::a[1]")
    private WebElement BarbaraBarryCollectionexplore;
    @FindBy(xpath="//a[@title='Clearlight Orb-Bronze']")
    private WebElement clearlight;
    @FindBy(xpath= "//div[contains(@class,'grouped-product-name_t')]")
    private WebElement verifynameonpdp;
    @FindBy(xpath="//*[text()='Delivery and Returns']")
    private WebElement delivery;
    @FindBy(xpath = "//button[@aria-label='Next']")
    private WebElement slideimage;
    @FindBy(xpath="//div[@id='img-container-1']/img")
    private WebElement zoominimage;
    @FindBy(xpath="//div[contains(@class,'qty-inc')]")
    private WebElement incitems;
    @FindBy(xpath="//div[contains(@class,'qty-dec')]")
    private WebElement decitems;
    
    @FindBy(xpath = "(//a[contains(text(),'New Introductions')])[1]")
    private WebElement newintroduction;
    @FindBy(xpath="//span[text()='Duncan Chair-Black Velvet']")
    private WebElement channelblack;
    @FindBy(xpath="//h1[text()='Duncan Chair-Black Velvet']")
    private WebElement verifyproductpdp;
    @FindBy(xpath="//button[@title='Add to Cart']")
    private WebElement addtocart;
    @FindBy(xpath="//a[@title='Cart']/child::span[3]")
    private WebElement countercart;
    @FindBy(xpath="//span[text()='Cart']")
    private WebElement cartbucket;
    @FindBy(xpath="//span[text()='Shopping Cart']")
    private WebElement shoppingcartnameverify;
    @FindBy(xpath="//div[@id='out_stock_checkout_popup']")
    private WebElement outofstockvalidation;
    
    @FindBy(xpath = "(//div[@title='Availability'])[1]/span")
    private WebElement firstprodavaibility;
    @FindBy(xpath="(//div[@title='Availability'])[2]/span")
    private WebElement secondprodavibility;
    @FindBy(xpath = "(//span[contains(@class,'cart-price')])[1]/span")
    private WebElement pricefirstitem;
    @FindBy(xpath="(//span[contains(@class,'cart-price')])[3]/span")
    private WebElement priceseconditem;
    @FindBy(xpath="(//input[@title='Qty'])[1]")
    private WebElement quantiyfirstitems;
    @FindBy(xpath="(//input[@title='Qty'])[2]")
    private WebElement quantityseconditem;
    
    
    @FindBy(xpath="(//td[@data-th='Subtotal'])[1]/span/span/span")
    private WebElement firstsubtotal;
    @FindBy(xpath="(//td[@data-th='Subtotal'])[2]/span/span")
    private WebElement secondsubtotal;
    @FindBy(xpath="//tr[contains(@class,'grand totals')]/td/strong/span")
    private WebElement carttotal;
   
    @FindBy(xpath="(//a[@title='Remove item'])[2]")
    private WebElement removeitem2;
    @FindBy(xpath="//button[@title='Update Shopping Cart']")
    private WebElement upadtecart;
    @FindBy(xpath="//button[@title='Print Cart']")
    private WebElement printcart;
    @FindBy(xpath="//input[@name='add_contact_info']")
    private WebElement addcontact;
    @FindBy(xpath="//input[@name='contact_name']")
    private WebElement contactname;
    @FindBy(xpath="//input[@name='contact_email']")
    private WebElement contcatemail;
    @FindBy(xpath="//input[@name='contact_company']")
    private WebElement namecompany;
    @FindBy(xpath="//input[@name='contact_phone']")
    private WebElement contactphone;
    @FindBy(xpath="//h5[text()='QUANTITY OF ITEMS PER PAGE']")
    private WebElement quantitypage;
    @FindBy(xpath="//h5[text()='QUANTITY OF ITEMS PER PAGE']/following-sibling::div[1]")
    private WebElement firtforemat;
    @FindBy(xpath = "//h5[text()='QUANTITY OF ITEMS PER PAGE']/following-sibling::div[2]")
    private WebElement secondformat;
    @FindBy(xpath="//h5[text()='QUANTITY OF ITEMS PER PAGE']/following-sibling::div[3]")
    private WebElement thirdformat;
    @FindBy(xpath="//textarea[@name='notes']")
    private WebElement textarea;
    @FindBy(xpath="//button[text()='SAVE AS PDF']")
    private WebElement savepdf;
    @FindBy(xpath="(//span[text()='Close'])[1]")
    private WebElement closepopup;
    
   
    @FindBy(xpath="//input[@id='ponumber_code']")
    private WebElement ponumber;
    @FindBy(xpath="//*[@id='order_notes']")
    private WebElement ordrnotes;
    @FindBy(xpath="//span[text()='Clear Shopping Cart']")
    private WebElement clearcart;
    @FindBy(xpath="//button[@title='Proceed to Checkout']")
    private WebElement checkout;
    
    @FindBy(xpath="//li[contains(@class,'item CHECKOUT')]/strong/following::h1/span")
    private WebElement checkoutpage;
    @FindBy(xpath = "//div[contains(@class,'cart-empty')]/p[contains(text(),'You have no items in your shopping cart.')]")
    private WebElement emptycart;
    @FindBy(xpath = "//div[contains(@class,'cart-empty')]/p[contains(text(),'You have no items in your shopping cart.')]/following-sibling::p/a")
    private WebElement continueshooping;
  
    
 public void shopmodule() throws InterruptedException
 {
	 ob1 = new Applicationutility();
	 ob1.mousehover(shopmenu, driver);
	 Thread.sleep(1000);
	 Applicationutility.myClick(BARBARABARRYimageclick);
	 Thread.sleep(2000);
	 Applicationutility.myClick(BarbaraBarryCollectionexplore);
	 Applicationutility.waitforclickible(driver, clearlight);
 }
 
 public void pdppage() throws InterruptedException
 {
	 Thread.sleep(1000);
	 String nameexp = Propertyutility.getproperty("pnameonpdp");
	 String nameact =  verifynameonpdp.getText();
	 System.out.println(nameact);
	 assertEquals(nameexp, nameact);
	 
	 
	 System.out.println("name assertion verified");
	 
	 verifynameonpdp.click();
	 Thread.sleep(1000);
     Applicationutility.scrolltobottom();
	 Thread.sleep(1000);
	 Applicationutility.scrolltotop();
	 
	 Thread.sleep(1000);
	 
	 for(int i=0; i<3; i++)
	 {
		 Applicationutility.myClick(slideimage);
		 System.out.println("Clicked" + (i+1));
	 }
	 Thread.sleep(2000);
	 
	 Applicationutility.getscroll(delivery, driver);
	 Thread.sleep(1000);
	 Applicationutility.myClick(delivery);
	 Applicationutility.myClick(delivery);
	
	 Applicationutility.scrolltotop();
	 Thread.sleep(1000);
	 for(int k= 0; k<4 ;k++)
	 {
		 Applicationutility.myClick(incitems);
		 System.out.println("increase items quantity" +(k+1));
	 }
	 
	 Thread.sleep(1000);
	 
	 for(int j=4; j>2; j--)
	 {
		 Applicationutility.myClick(decitems);
		 System.out.println("decrease items quantity" +(j-1));
	 }
	 
	Thread.sleep(1000);
	
	int initialquantitycart = Integer.parseInt(countercart.getText());
	Thread.sleep(1000);
	System.out.println(initialquantitycart);
	Applicationutility.myClick(addtocart);
	Thread.sleep(3000);
	int updatedqauntitycart =  Integer.parseInt(countercart.getText());
	System.out.println(updatedqauntitycart);
	
	assertEquals(updatedqauntitycart, initialquantitycart+ 1, "Cart quantity didnot increase correctly!");
		
	Thread.sleep(1000);
}	 
 
 
public void addproductnewintro() throws InterruptedException
{
	ob1 = new Applicationutility();
	ob1.mousehover(shopmenu, driver);
	Applicationutility.myClick(newintroduction);
	
	Thread.sleep(1000);
	Applicationutility.myClick(channelblack);
	
	Thread.sleep(1000);
	String expectedsenodproduct = Propertyutility.getproperty("secondproduct");
	String actualsecondproduct = verifyproductpdp.getText();
	System.out.println(actualsecondproduct);
	assertEquals(actualsecondproduct, expectedsenodproduct);
	
	 for(int i=0; i<5; i++)
	 {
		 Applicationutility.myClick(slideimage);
		 System.out.println("Clicked" + (i+1));
	 }
	 
	 Thread.sleep(1000);
	 
	 for(int k= 0; k<4 ;k++)
	 {
		 Applicationutility.myClick(incitems);
		 System.out.println("increase items quantity" +(k+1));
	 }
	 
     Thread.sleep(1000);
	 
	 for(int j=4; j>2; j--)
	 {
		 Applicationutility.myClick(decitems);
		 System.out.println("decrease items quantity" +(j-1));
	 }
	 
	 Thread.sleep(1000);
	
}

public void Addtocart() throws InterruptedException
{
	int initialquantitycart1 = Integer.parseInt(countercart.getText());
	Thread.sleep(1000);
	System.out.println(initialquantitycart1);
	Applicationutility.myClick(addtocart);
	Thread.sleep(2000);
	int updatedqauntitycart1 =  Integer.parseInt(countercart.getText());
	System.out.println(updatedqauntitycart1);
	
	assertEquals(updatedqauntitycart1, initialquantitycart1 + 1, "Cart quantity didnot increase correctly!");
		
	Thread.sleep(1000);
	
}

public void validateavaivaility() throws InterruptedException
{
	 Applicationutility.myClick(cartbucket);
	 
	 String expshoppingcart = Propertyutility.getproperty("shoppingcartname");
	 String actshppingcart = shoppingcartnameverify.getText();
	 System.out.println(actshppingcart);
	 assertEquals(expshoppingcart, actshppingcart);
	 
	 System.out.println("page name is verified");	 
	 
	 // validate avibility status first item
	 String stockText = firstprodavaibility.getText().trim();
     System.out.println("Stock Status Displayed: " + stockText);

     // Verify and print the stock status
     if (stockText.equalsIgnoreCase("IN STOCK")) 
     {
         System.out.println("Product is IN STOCK");
     } 
     else if (stockText.equalsIgnoreCase("OUT OF STOCK")) 
     {
         System.out.println("Product is OUT OF STOCK");
     } 
     else 
     {
         System.out.println("Stock status is unknown: " + stockText);
     }

     // Assert that stock status is either "IN STOCK" or "OUT OF STOCK"
     Assert.assertTrue(stockText.equalsIgnoreCase("IN STOCK") || stockText.equalsIgnoreCase("OUT OF STOCK"),
             "Stock status is not recognized!");
     
     
     // validate avibility status second item
	 String stockText2 = secondprodavibility.getText().trim();
     System.out.println("Stock Status Displayed: " + stockText2);

     // Verify and print the stock status
     if (stockText2.equalsIgnoreCase("IN STOCK")) 
     {
         System.out.println("Product is IN STOCK");
     } 
     else if (stockText2.equalsIgnoreCase("OUT OF STOCK")) 
     {
         System.out.println("Product is OUT OF STOCK");
     } 
     else 
     {
         System.out.println("Stock status is unknown: " + stockText2);
     }

     // Assert that stock status is either "IN STOCK" or "OUT OF STOCK"
     Assert.assertTrue(stockText2.equalsIgnoreCase("IN STOCK") || stockText2.equalsIgnoreCase("OUT OF STOCK"),
             "Stock status is not recognized!");
     
     Thread.sleep(2000);
   
     // verified the validation error message out of atock product
     
     String expshiplater = Propertyutility.getproperty("outofstockerror");
     String actshiplater =  outofstockvalidation.getText();
     System.out.println(actshiplater);
     assertEquals(expshiplater, actshiplater);
     
     System.out.println("Actual & expected errortext is verified.");
          
     
 }
	 
public void verifytheproductpricesubtotal() throws InterruptedException, ParseException
{
	//Verified first price of an item
      String priceText1 = pricefirstitem.getText().replace("$", "").trim(); // Remove '$' if present
      double price1 = Double.parseDouble(priceText1);
      System.out.println("Product Price: $" + price1);

      // Locate and fetch product quantity
      Thread.sleep(1000);
      String quantityText1 = quantiyfirstitems.getAttribute("value").trim(); // Get quantity value from input field
      int quantity1 = Integer.parseInt(quantityText1);
      System.out.println("Product Quantity: " + quantity1);

      Thread.sleep(1000);
      // Calculate expected subtotal
      double expectedSubtotal1 = price1 * quantity1;
      System.out.println("Expected Subtotal1: $" + expectedSubtotal1);

      // Locate and fetch actual subtotal displayed on the page
    
      Thread.sleep(1000);
      String subtotalText1 = firstsubtotal.getText().replace("$", "").trim();
      double actualSubtotal1 = Double.parseDouble(subtotalText1);
      System.out.println("Displayed Subtotal: $" + actualSubtotal1);

      // Verify if expected subtotal matches actual subtotal
      Assert.assertEquals(actualSubtotal1, expectedSubtotal1, "Subtotal mismatch! Test Failed.");
      System.out.println("Test Passed: Expected and Displayed Subtotals Match.");
      
      Thread.sleep(1000);
      
      Applicationutility.getscroll(outofstockvalidation, driver);
      Thread.sleep(1000);
      String priceText2 = priceseconditem.getText().replace("$", "").trim(); // Remove '$' if present
      double price2 = Double.parseDouble(priceText2);
      System.out.println("Product Price: $" + price2);

      // Locate and fetch product quantity
      Thread.sleep(1000);
      
      String quantityText2 = quantityseconditem.getAttribute("value").trim(); // Get quantity value from input field
      int quantity2 = Integer.parseInt(quantityText2);
      System.out.println("Product Quantity: " + quantity2);

      Thread.sleep(1000);
      // Calculate expected subtotal
      double expectedSubtotal2 = price2 * quantity2;
      System.out.println("Expected Subtotal2: $" + expectedSubtotal2);

      // Locate and fetch actual subtotal displayed on the page
    
      Thread.sleep(1000);
      String subtotalText2 = secondsubtotal.getText().replace("$", "").trim();
      
      NumberFormat format = NumberFormat.getInstance(Locale.US); // Adjust locale as needed
      double actualSubtotal2 = format.parse(subtotalText2).doubleValue();
      System.out.println("Displayed Subtotal: $" + actualSubtotal2);
      
//      double actualSubtotal2 = Double.parseDouble(subtotalText2);
//      System.out.println("Displayed Subtotal: $" + actualSubtotal2);

      // Verify if expected subtotal matches actual subtotal
      Assert.assertEquals(actualSubtotal2, expectedSubtotal2, "Subtotal mismatch! Test Failed.");
      System.out.println("Test Passed: Expected and Displayed Subtotals Match.");
      
      Thread.sleep(1000);
}     
public void verifythecarttotal() throws ParseException, InterruptedException


{
	 String subtotalText1 = firstsubtotal.getText().replace("$", "").trim();
     double actualSubtotal1 = Double.parseDouble(subtotalText1);
     System.out.println("Displayed Subtotal: $" + actualSubtotal1);
     
     String subtotalText2 = secondsubtotal.getText().replace("$", "").trim();     
     NumberFormat format = NumberFormat.getInstance(Locale.US); // Adjust locale as needed
     double actualSubtotal2 = format.parse(subtotalText2).doubleValue();
     System.out.println("Displayed Subtotal: $" + actualSubtotal2);
     
     Thread.sleep(1000);
     double expectedTotal = actualSubtotal1 + actualSubtotal2;
     System.out.println("Expected Cart Total: $" + expectedTotal);
     

     String carttotaltext = carttotal.getText().replace("$", "").trim(); 
     NumberFormat formatcart = NumberFormat.getInstance(Locale.US); // Adjust locale as needed
     double totalcart = formatcart.parse(carttotaltext).doubleValue();
     System.out.println("Displayed Subtotal: $" + totalcart);
     
     Assert.assertEquals(totalcart, expectedTotal, "Cart total does not match the sum of product prices!");

     System.out.println("Test Passed: Cart total matches sum of both product prices.");
     
     Thread.sleep(1000);
     
 }

public void removeproductoncart() throws InterruptedException
{
	Applicationutility.getscroll(ponumber, driver);
	Thread.sleep(1000);
	Applicationutility.myClick(removeitem2);
	Thread.sleep(2000);
	
	System.out.println("one product remove from cart successffully");
	
	// verify the minimum order fee in cart total
	
	System.out.println("increase quantity of product again");
	 for(int k= 0; k<5 ;k++)
	 {
		 Applicationutility.myClick(incitems);
		 System.out.println("increase items quantity" +(k+1));
	 }
	 
	 Thread.sleep(1000);
	 
	 Applicationutility.myClick(upadtecart);
	 Thread.sleep(1000);
	 
	 System.out.println("updatecartsuccessfully");
	 
}

public void verifysubtotalagainfirstitem() throws InterruptedException
{
	String priceText1 = pricefirstitem.getText().replace("$", "").trim(); // Remove '$' if present
    double price1 = Double.parseDouble(priceText1);
    System.out.println("Product Price: $" + price1);

    // Locate and fetch product quantity
    Thread.sleep(1000);
    String quantityText1 = quantiyfirstitems.getAttribute("value").trim(); // Get quantity value from input field
    int quantity1 = Integer.parseInt(quantityText1);
    System.out.println("Product Quantity: " + quantity1);

    Thread.sleep(1000);
    // Calculate expected subtotal
    double expectedprice1 = price1 * quantity1;
    System.out.println("Expected Subtotal1: $" + expectedprice1);

    // Locate and fetch actual subtotal displayed on the page
  
    Thread.sleep(1000);
    String subtotalText1 = firstsubtotal.getText().replace("$", "").trim();
    double actualSubtotal1 = Double.parseDouble(subtotalText1);
    System.out.println("Displayed Subtotal: $" + actualSubtotal1);

    // Verify if expected subtotal matches actual subtotal
    Assert.assertEquals(actualSubtotal1, expectedprice1, "Subtotal mismatch! Test Failed.");
    System.out.println("Test Passed: Expected and Displayed Subtotals Match.");
    
    Thread.sleep(1000);
    
    
    // verify the subtotal with cart total again
    
    String carttotaltext = carttotal.getText().replace("$", "").trim(); 
    double totalcart = Double.parseDouble(carttotaltext);
    System.out.println("Displayed Carttotal: $" + totalcart); 
    
    Assert.assertEquals(totalcart, actualSubtotal1, "Cart total does not match the sum of product prices!");

    System.out.println("Test Passed: Cart total matches with sutotal of product.");
    
    Thread.sleep(1000);
    
    
}

public void printcartvaldate() throws InterruptedException
{
	Applicationutility.getscroll(ordrnotes, driver);
	Thread.sleep(1000);
	Applicationutility.myClick(printcart);
	Applicationutility.myClick(addcontact);
	Applicationutility.myClick(contactname);
	contactname.sendKeys(Propertyutility.getproperty("billtoname"));
	contcatemail.sendKeys(Propertyutility.getproperty("email"));
	contactphone.sendKeys(Propertyutility.getproperty("phoneno"));
	namecompany.sendKeys(Propertyutility.getproperty("Companyname"));
	Thread.sleep(1000);
	
	String expquantityperpage =  Propertyutility.getproperty("quantityprpage");
	String actquantityperpage =  quantitypage.getText();
	System.out.println(actquantityperpage);
	assertEquals(expquantityperpage, actquantityperpage);
	
	Thread.sleep(1000);
	Applicationutility.myClick(firtforemat);
	
	Applicationutility.myClick(textarea);
	
	textarea.sendKeys(Propertyutility.getproperty("message"));
	Thread.sleep(1000);
	
	Applicationutility.myClick(savepdf);
	
	Thread.sleep(1000);
	Applicationutility.myClick(closepopup);
	
	System.out.println("download print cart successfully");
	
	Thread.sleep(1000);
	
	
}

public void securecheckout() throws InterruptedException
{
	Applicationutility.myClick(ponumber);
	ponumber.sendKeys(Propertyutility.getproperty("ponumber"));
	Thread.sleep(1000);
	Applicationutility.myClick(ordrnotes);
	ordrnotes.sendKeys(Propertyutility.getproperty("ordernote"));
	
	// click on checkout 
	Thread.sleep(1000);
	Applicationutility.myClick(checkout);
	Thread.sleep(1000);
}

public void clearshopingcart() throws InterruptedException
{
	Applicationutility.waitforVisible(driver, checkoutpage);
	driver.navigate().back();
	Thread.sleep(2000);
	Applicationutility.getscroll(ponumber, driver);
	Applicationutility.myClick(clearcart);
	Thread.sleep(1000);
	
	String expclearcartmessge =  Propertyutility.getproperty("clearcart");
	String actclearcartmessge =  emptycart.getText();
	System.out.println(actclearcartmessge);
	assertEquals(expclearcartmessge, actclearcartmessge);
		
	Applicationutility.waitforclickible(driver, continueshooping);
	Thread.sleep(1000);
	
}

}
      
      









	 

 
    
    

