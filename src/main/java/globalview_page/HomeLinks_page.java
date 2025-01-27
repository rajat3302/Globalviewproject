package globalview_page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

public class HomeLinks_page extends BaseLibrary

{
		Applicationutility ob;
		
		public HomeLinks_page()
		{
			PageFactory.initElements(driver, this);
		}
	
 
//Headers xpath 
		
@FindBy(xpath="//div[contains(@class,'h-search-toggler')]")
private WebElement search;
@FindBy(xpath="//input[@placeholder='search global views']")
private WebElement searchbar;

@FindBy(xpath ="//img[contains(@src,'https://uat.globalviews.com/pub/media/wysiwyg/logo-header.png')]")
private WebElement verifylogoglobalview;
@FindBy(xpath="(//span[text()='Shop'])[1]")
private WebElement shopmenu;
@FindBy(xpath ="//span[text()='Catalogs']")
private WebElement catalogsmenu;
@FindBy(xpath=  "//span[text()='Get Inspired']")
private WebElement getinspired;
@FindBy(xpath="//span[text()='To The Trade']")
private WebElement tothetrade;
@FindBy(xpath="//span[text()='HD/Contract']")
private WebElement hdcontact;
@FindBy(xpath ="//span[text()='Locate Us']")
private WebElement locateus;
@FindBy(xpath="//*[@title='HOW CAN WE HELP?']")
private WebElement howhelp;
@FindBy(xpath="//span[text()='Customer Service']")
private WebElement customerservice;

@FindBy(xpath = "//div[contains(@class,'owl-dots')]/child::div[1]")
private WebElement dot1;
@FindBy(xpath="//div[contains(@class,'owl-dots')]/child::div[2]")
private WebElement dot2;
@FindBy(xpath = "//div[contains(@class,'owl-dots')]/child::div[3]")
private WebElement dot3;
@FindBy(xpath = "//div[contains(@class,'owl-dots')]/child::div[4]")
private WebElement dot4;


@FindBy(xpath = "//div[contains(@class,'owl-nav')]/child::div[1]")
private WebElement pervarrow;
@FindBy(xpath="//div[contains(@class,'owl-nav')]/child::div[2]")
private WebElement nextarrow;
@FindBy(xpath="//div[contains(@class,'customDesc')]/child::a")
private WebElement validateexplore;

@FindBy(xpath="//img[@alt='Global Views']")
private WebElement logoverify;
@FindBy(xpath = "//div[contains(@class,'homepage-aboutus-block-text')]/child::a/button")
private WebElement learnmoreaboutus;
@FindBy(xpath="//img[contains(@src,'https://uat.globalviews.com/pub/media/GV_About_US_012024.png')]")
private WebElement imageglobal;


@FindBy(xpath="//*[text()='NEW INTRODUCTIONS']")
private WebElement newindroductions;
@FindBy(xpath="//div[contains(@class,'products-grid')]//ul/li[1]/button")
private WebElement slider1;
@FindBy(xpath = "//div[contains(@class,'products-grid')]//ul/li[2]/button")
private WebElement slider2;
@FindBy(xpath = "//div[contains(@class,'products-grid')]//ul/li[3]/button")
private WebElement slider3;
@FindBy(xpath="//div[contains(@class,'products-grid')]//ul/li[4]/button")
private WebElement slider4;


@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/87994.jpg')]")
private WebElement firstimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/90606.jpg')]")
private WebElement secondimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/90344.jpg')]")
private WebElement thirdimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88641.jpg')]")
private WebElement fourthimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88673.jpg')]")
private WebElement fifthimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/90341.jpg')]")
private WebElement siximage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88862.jpg')]")
private WebElement sevenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88764.jpg')]")
private WebElement eightimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88969.jpg')]")
private WebElement nineimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88772.jpg')]")
private WebElement tenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88758.jpg')]")
private WebElement elevenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/89096.jpg')]")
private WebElement twelveimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88605.jpg')]")
private WebElement thirteenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88603.jpg')]")
private WebElement fouteenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88942.jpg')]")
private WebElement fifteenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/89094.jpg')]")
private WebElement sixteenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88943.jpg')]")
private WebElement sevteenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88941.jpg')]")
private WebElement eighteenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88940.jpg')]")
private WebElement nineteenimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88938.jpg')]")
private WebElement twetyimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/89428.jpg')]")
private WebElement twetyoneimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88939.jpg')]")
private WebElement twentytwoimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88937.jpg')]")
private WebElement twentythtreeimage;
@FindBy(xpath = "//img[contains(@src,'https://gvimages.azureedge.net/images/88583.jpg')]")
private WebElement twentyfourimage;

@FindBy(xpath="//*[text()='More to explore']")
private WebElement moretoexplore;
@FindBy(xpath="//div[contains(@class,'homepage-brand-partners-slider')]/child::div/h2")
private WebElement brandpartners;
@FindBy(xpath ="(//div[contains(@class,'slick-list draggable')])[2]/following-sibling::ul/li[1]/button")
private WebElement bprslide1;
@FindBy(xpath ="(//div[contains(@class,'slick-list draggable')])[2]/following-sibling::ul/li[2]/button")
private WebElement bprslide12;



@FindBy(xpath="//div[contains(@class,'homepage-shop-our-brands')]/p")
private WebElement shop2;
@FindBy(xpath="//*[text()='OUR BRANDS']")
private WebElement ourbrand;
@FindBy(xpath= "//img[contains(@src,'https://uat.globalviews.com/pub/media/STAH_About_US_012024.png')]")
private WebElement studioimage;
@FindBy(xpath= "//img[contains(@src,'https://uat.globalviews.com/pub/media/wysiwyg/S3_About_US_March2023.jpg')]")
private WebElement signatureimage;
@FindBy(xpath = "//a[@href='https://studioa-home.com/about-us']")
private WebElement studioalearnmore;
@FindBy(xpath="//a[@href='https://signatureiii.com/about-us']")
private WebElement signaturelearnmore;
@FindBy(xpath="(//div[contains(@class,'brand-copy')])[1]/a/button")
private WebElement shopstudioshop;
@FindBy(xpath = "(//div[contains(@class,'brand-copy')])[2]/a/button")
private WebElement signatureshop;


@FindBy(xpath="//div[text()='Sign up for Our Latest Updates']")
private WebElement latestupdate;
@FindBy(xpath= "//input[@placeholder='Email']")
private WebElement emailsignup;
@FindBy(xpath= "//span[contains(@class,'select2 select2-container')]/span/span")
private WebElement selectstore;
@FindBy(xpath="//button[@title='Submit']")
private WebElement signup;
@FindBy(xpath="//span[text()='CLOSE']")
private WebElement close;
@FindBy(xpath="//*[@title='Back to the top']")
private WebElement backtotop;
@FindBy(xpath="//div[contains(@class,'footer-storefront-links-0')]/a")
private WebElement studio;
@FindBy(xpath = "//div[contains(@class,'footer-storefront-links-1')]/a")
private WebElement signature;


//validate shop category links 

@FindBy(xpath = "(//a[contains(text(),'New Introductions')])[1]")
private WebElement newintroductions;
@FindBy(xpath="(//a[contains(text(),'Art Glasses')])[1]")
private WebElement arete;
@FindBy(xpath="(//a[contains(text(),'Barware')])[1]")
private WebElement barware;
@FindBy(xpath = "(//a[contains(text(),'Barware')])[1]/span")
private WebElement barwaresubmenu;
@FindBy(xpath="(//a[contains(text(),'Serveware')])[1]")
private WebElement serveware;
@FindBy(xpath="(//a[contains(text(),'Drinkware')])[1]")
private WebElement drinware;
@FindBy(xpath = "(//a[contains(text(),'Decanters')])[1]")
private WebElement decanters;
@FindBy(xpath="(//a[contains(text(),'Candleholders')])[1]")
private WebElement candelholders;
@FindBy(xpath="(//a[contains(text(),'Candleholders')])[1]/span")
private WebElement candelholderssubmenu;
@FindBy(xpath="(//a[contains(text(),'Acrylic')])[1]")
private WebElement acrylic;
@FindBy(xpath="(//a[contains(text(),'Marble')])[1]")
private WebElement marble;
@FindBy(xpath="(//a[contains(text(),'Porcelain')])[1]")
private WebElement Porcelain;
@FindBy(xpath="(//a[contains(text(),'Aluminium')])[1]")
private WebElement Aluminium;
@FindBy(xpath="(//a[contains(text(),'Wood')])[1]")
private WebElement Wood;
@FindBy(xpath="(//a[contains(text(),'Nickel')])[1]")
private WebElement Nickel;
@FindBy(xpath="(//a[contains(text(),'Iron')])[1]")
private WebElement Iron;




//Footer more
@FindBy(xpath="//*[text()='About Us']")
private WebElement aboutus;
@FindBy(xpath="//*[text()='Contract']")
private WebElement Contract;
@FindBy(xpath="//*[text()='Showrooms']")
private WebElement Showrooms;
@FindBy(xpath="//*[text()='Market Dates']")
private WebElement MarketDates;
@FindBy(xpath="//*[text()='Catalogs']")
private WebElement Catalogs;
@FindBy(xpath="//*[text()='Blog']")
private WebElement Blog;


//Brands
@FindBy(xpath="//a[text()='Surya']")
private WebElement surya;
@FindBy(xpath="//a[@title='Mitchell Gold + Bob Williams']")
private WebElement mitchellgold;
@FindBy(xpath="//a[text()='RST Brands']")
private WebElement rstbrand;

//customer service

@FindBy(xpath="//a[text()='Terms and Conditions']")
private WebElement TermsConditions;
@FindBy(xpath="//a[text()='Privacy Policy']")
private WebElement privacy;
@FindBy(xpath="//a[text()='Shipping & Handling']")
private WebElement shipping;
@FindBy(xpath="//a[text()='Environmental Statement']")
private WebElement environmental;
@FindBy(xpath="//a[text()='Credit Application']")
private WebElement credit;
@FindBy(xpath="//a[text()='Contact Us']")
private WebElement contactus;
@FindBy(xpath="//a[text()='Site Map']")
private WebElement sitemap;



@FindBy(xpath="//a[@title='Sign Me Up']")
private WebElement signupme;

@FindBy(xpath= "//input[@title='First Name']")
private WebElement fname;
@FindBy(xpath= "Last Name")
private WebElement lname;
@FindBy(xpath="//input[@name='loffield_c32']")
private WebElement email;
@FindBy(xpath="//input[@title='Company']")
private WebElement company;
@FindBy(xpath="//span[@title='WHAT DESCRIBES YOU?']")
private WebElement describe;
@FindBy(xpath="//span[@title='-- Please Select --']")
private WebElement selectstate;
@FindBy(xpath="//input[@placeholder='REGION, STATE, PROVINCE']")
private WebElement region;
@FindBy(xpath="//input[@placeholder='ZIP CODE']")
private WebElement zipcode;
@FindBy(xpath="//button[@title='Submit']")
private WebElement submit;


public void Validatelogo() throws InterruptedException
{
	try 
	{
		
	
	 Thread.sleep(1000);
	 //Applicationutility.mousehover(verifylogoglobalview, driver);
	 Applicationutility.mousehoverclick(verifylogoglobalview, verifylogoglobalview);
	
	 Assert.assertTrue(verifylogoglobalview.isDisplayed(), "Logo is not displayed on the page!");

     // Step 2: Verify the logo's src attribute
     String actualLogoSrc = verifylogoglobalview.getAttribute("src");
     String expectedLogoSrc = "https://uat.globalviews.com/pub/media/wysiwyg/logo-header.png";
     Assert.assertEquals(actualLogoSrc, expectedLogoSrc, "Logo src URL does not match!");
	}
//     int logoWidth = verifylogoglobalview.getSize().getWidth();
//     int logoHeight = verifylogoglobalview.getSize().getHeight();
//     Assert.assertEquals(logoWidth > 0 && logoHeight > 0 , "Logo dimension is incorrect!"); 
     catch (Exception e) 
     {
 		System.out.println("issue in validatelogo" +e);
 	 }
	
}

public void validateheader() throws InterruptedException
{
	try
	{
		Thread.sleep(1000);
		
		ob = new Applicationutility();
		ob.mousehover(shopmenu, driver);
		Thread.sleep(1000);
		Assert.assertTrue(shopmenu.isDisplayed(), "Dropdown or tooltip did not appear!");
	
		ob.mousehover(catalogsmenu, driver);
		Thread.sleep(1000);
		Assert.assertTrue(catalogsmenu.isDisplayed(), "Dropdown or tooltip did not appear!");
		ob.mousehover(getinspired, driver);
		Thread.sleep(1000);
		Assert.assertTrue(getinspired.isDisplayed(), "Dropdown or tooltip did not appear!");
		ob.mousehover(tothetrade, driver);
		Thread.sleep(1000);
		Assert.assertTrue(tothetrade.isDisplayed(), "Dropdown or tooltip did not appear!");
		
		hdcontact.click();
	
		Thread.sleep(1000);
		locateus.click();
		
		
		Thread.sleep(1000);
		//Applicationutility.getscroll(howhelp, driver);
		howhelp.click();
		customerservice.click();
	    Thread.sleep(1000);
		driver.navigate().back();
	    driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	
		
		
		
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(1000);
		
	}
	catch (Exception e) 
	{
		System.out.println("issue in validateheader" +e);
	}

}

public void verifypage() throws InterruptedException
{
	try 
	{
		ob =  new Applicationutility();
		
		Thread.sleep(1000);
		Applicationutility.myClick(dot1);
		Applicationutility.myClick(dot2);
		Applicationutility.myClick(dot3);
		Applicationutility.myClick(dot4);
		Applicationutility.myClick(pervarrow);
		Applicationutility.myClick(pervarrow);
		Applicationutility.myClick(pervarrow);
		Applicationutility.myClick(pervarrow);
		Applicationutility.myClick(nextarrow);
		Applicationutility.myClick(nextarrow);
		Applicationutility.myClick(nextarrow);
		Applicationutility.myClick(nextarrow);
		
		Thread.sleep(1000);
		Applicationutility.myClick(validateexplore);
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		Applicationutility.getscroll(logoverify, driver);
		Assert.assertTrue(logoverify.isDisplayed(), "Dropdown or tooltip did not appear!");
		Assert.assertTrue(imageglobal.isDisplayed(), "Dropdown or tooltip did not appear!");
		
		learnmoreaboutus.click();
		Thread.sleep(1000);
		Applicationutility.getscroll(backtotop, driver);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
			
	} 
	catch (Exception e)
	{
		System.out.println("isssue in verifypage" +e);
	}

}

public void validatenewindrodcutions()
	{
		try 
		{
			String expected = Propertyutility.getproperty("newintroductiontext");
			String actual = newindroductions.getText();
			assertEquals(actual, expected, "The homepage text does not match!");
			System.out.println(actual);
			
			ob = new Applicationutility();
			ob.mousehover(firstimage, driver);
			ob.mousehover(secondimage, driver);
			ob.mousehover(thirdimage, driver);
			ob.mousehover(fourthimage, driver);
			ob.mousehover(fifthimage, driver);
			ob.mousehover(siximage, driver);
			
			Thread.sleep(1000);
			slider2.click();
			//Applicationutility.waitforVisible(driver, sevenimage);
			Thread.sleep(1000);
			ob.mousehover(twelveimage, driver);	
			ob.mousehover(elevenimage, driver);
			ob.mousehover(tenimage, driver);
			Applicationutility.getscroll(newindroductions, driver);
			Thread.sleep(1000);
			ob.mousehover(eighteenimage, driver);
			ob.mousehover(nineimage, driver);
			ob.mousehover(sevenimage, driver);
			
		
			slider3.click();
			Thread.sleep(1000);
			ob.mousehover(eighteenimage, driver);
			ob.mousehover(sevteenimage, driver);
			ob.mousehover(sixteenimage, driver);
			Applicationutility.getscroll(newindroductions, driver);
			Thread.sleep(1000);
			ob.mousehover(fouteenimage, driver);
			ob.mousehover(fifteenimage, driver);
			ob.mousehover(thirteenimage, driver);
			

			slider4.click();
			Thread.sleep(1000);
			ob.mousehover(twentyfourimage, driver);	
			ob.mousehover(twentythtreeimage, driver);	
			ob.mousehover(twentytwoimage, driver);
			Applicationutility.getscroll(newindroductions, driver);
			Thread.sleep(1000);
			ob.mousehover(twetyoneimage, driver);
			ob.mousehover(twetyimage, driver);
			ob.mousehover(nineteenimage, driver);

				
			
		} 
		catch (Exception e)
		{
			System.out.println("issue in newintroduction" +e);
		}
	}

public void validatebrandpartner()
{
	try 
	{
		String expected = Propertyutility.getproperty("brandp");
		String actual=  brandpartners.getText();
		System.out.println(actual);
		assertEquals(actual, expected);
		
		Thread.sleep(1000);
		bprslide1.click();
		Thread.sleep(1000);
		bprslide12.click();
		
		Thread.sleep(1000);
		bprslide1.click();
		
		
		
		String exp =  Propertyutility.getproperty("shop");
		String act =  shop2.getText();
		System.out.println(act);
		assertEquals(act, exp);
		
		String exp2 = Propertyutility.getproperty("ourbrand");
		String act2=  ourbrand.getText();
		System.out.println(act2);
		assertEquals(act2, exp2);
		
		 Assert.assertTrue(studioimage.isDisplayed(), "Logo is not displayed on the page!");
		 System.out.println("studio image is displayed");
		 
		 Assert.assertTrue(signatureimage.isDisplayed(), "Logo is not displayed on the page!");
		 System.out.println("signature is displayed");
		 
		 studioalearnmore.click();
		 driver.navigate().back();
		 
		 signaturelearnmore.click();
		 driver.navigate().back();
		 
		 Thread.sleep(1000);
		 shopstudioshop.click();
		 driver.navigate().back();
		 
		 
		 signatureshop.click();
		 driver.navigate().back();
		 
		 
		 
		
	}
	
	catch (Exception e) 
	
	{
		System.out.println("isuue in exception" +e);
	}
	
}

public void validatesearchbar()
{
	try 
	{
		//Applicationutility.waitforclickible(driver, search);
		Applicationutility.myClick(search);
		Thread.sleep(1000);
		System.out.println("serchbarclick");
		Applicationutility.myClick(searchbar);
		searchbar.sendKeys(Propertyutility.getproperty("searchanngish"));
		System.out.println("serchanngish");
		searchbar.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(1000);
//		Applicationutility.waitforclickible(driver, searchbar);
		Applicationutility.myClick(searchbar);
		searchbar.clear();
		searchbar.sendKeys(Propertyutility.getproperty("serachcandle"));
		Thread.sleep(1000);
		searchbar.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.navigate().back();
		
	}
	catch (Exception e)
	{
	  System.out.println("issue in expection" +e);
	}
}


public void signuplatestupadtes() throws InterruptedException


{
	//Applicationutility.getscroll(latestupdate, driver);
	String expected = Propertyutility.getproperty("latestnews");
	String actual =  latestupdate.getText();
	System.out.println(actual);
	assertEquals(actual, expected);
	System.out.println("Actual & expected match");
	
	Thread.sleep(1000);
	Applicationutility.myClick(searchbar);
	emailsignup.sendKeys(Propertyutility.getproperty("email"));
	
	//Applicationutility.waitforVisible(driver, selectstore);
	Thread.sleep(1000);
	selectstore.sendKeys(Propertyutility.getproperty("storeshop"));
	Thread.sleep(1000);
	emailsignup.sendKeys(Keys.ENTER);
	Applicationutility.myClick(signup);
	
	
	Applicationutility.myClick(close);
	
	
	studio.click();
	Thread.sleep(1000);
	
	driver.navigate().back();
	signature.click();
	Thread.sleep(1000);
	driver.navigate().back();
	
	backtotop.click();
	
}


public void Verifyshopcategorylinks()
{
	try 
	{
		Thread.sleep(1000);
		shopmenu.click();
		
	} 
	catch (Exception e) 
	{
		
	}
}

}	
	
	
	




	































