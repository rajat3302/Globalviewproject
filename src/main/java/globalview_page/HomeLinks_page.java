package globalview_page;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import applicationutility.Applicationutility;
import baselibrary.BaseLibrary;
import baselibrary.CustomReportListener;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import propertyutility.Propertyutility;


@Listeners(CustomReportListener.class)
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
@FindBy(xpath= "(//div[contains(@class,'input-box col-sm-12')])[2]/span")
private WebElement selectstore;
@FindBy(xpath="//span[contains(@class,'select2-dropdown--below')]//input")
private WebElement storeslection;
@FindBy(xpath="//span[contains(@class,'select2-search--dropdown')]/input/following::span/ul/child::li[3]")
private WebElement onlinestore;
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


@FindBy(xpath="(//span[text()='Shop'])[1]")
private WebElement shopmenucategory;

@FindBy(xpath = "(//a[contains(text(),'New Introductions')])[1]")
private WebElement newintroduction;
@FindBy(xpath="(//a[contains(text(),'Art Glasses')])[1]")
private WebElement arete;


@FindBy(xpath="(//a[contains(text(),'Barware')])[1]")
private WebElement barware;
//barwaresubmenu
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
//candleholdersubmenu
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
@FindBy(xpath="(//a[contains(text(),'Hurricanes/Lanterns')])[1]")
private WebElement HurricanesLanterns;
@FindBy(xpath="(//a[contains(text(),'Glass')])[1]")
private WebElement Glass;
@FindBy(xpath="(//a[contains(text(),'Crystal')])[1]")
private WebElement Crystal;
@FindBy(xpath="(//a[contains(text(),'Ceramic')])[1]")
private WebElement Ceramic;
@FindBy(xpath="(//a[contains(text(),'Brass & Bronze')])[1]")
private WebElement BrassBronze;


@FindBy(xpath="(//a[contains(text(),'Candles')])[1]")
private WebElement  Candles;
@FindBy(xpath="(//a[contains(text(),'Clear Glass')])[1]")
private WebElement ClearGlass;


@FindBy(xpath="(//a[contains(text(),'Decorative Items')])[1]")
private WebElement DecorativeItems;
//submenu decorative items 
@FindBy(xpath = "(//a[contains(text(),'Decorative Items')])[1]/span")
private WebElement submenuDecorativeItems;
@FindBy(xpath="(//a[contains(text(),'Accent Pieces')])[1]")
private WebElement AccentPieces;
@FindBy(xpath="(//a[contains(text(),'Plate Stands')])[1]")
private WebElement PlateStands;
@FindBy(xpath="(//a[contains(text(),'Picture Frames')])[1]")
private WebElement PictureFrames;
@FindBy(xpath="(//a[contains(text(),'Spheres')])[1]")
private WebElement Spheres;
@FindBy(xpath="(//a[contains(text(),'Risers')])[1]")
private WebElement Risers;
@FindBy(xpath="(//a[contains(text(),'Bookends')])[1]")
private WebElement Bookends;
@FindBy(xpath="(//a[contains(text(),'Vases & Urns')])[1]")
private WebElement VasesUrns;
@FindBy(xpath="(//a[contains(text(),'Chargers & Plates')])[1]")
private WebElement ChargersPlates;
@FindBy(xpath="(//a[contains(text(),'Compotes & Bowls')])[1]")
private WebElement CompotesBowls;
@FindBy(xpath="(//a[contains(text(),'Bottles & Jars')])[1]")
private WebElement BottlesJars;
@FindBy(xpath="(//a[contains(text(),'Animals')])[1]")
private WebElement Animals;


@FindBy(xpath="(//a[contains(text(),'Electrified Lighting')])[1]")
private WebElement ElectrifiedLighting;
//submenuelectified lighting 
@FindBy(xpath = "(//a[contains(text(),'Electrified Lighting')])[1]/span")
private WebElement submenuElectrifiedLighting;
@FindBy(xpath="(//a[contains(text(),'Chandeliers')])[1]")
private WebElement Chandeliers;
@FindBy(xpath="(//a[contains(text(),'Buffet Lamps')])[1]")
private WebElement BuffetLamps;
@FindBy(xpath="(//a[contains(text(),'Table Lamps')])[1]")
private WebElement TableLamps;
@FindBy(xpath="(//a[contains(text(),'Sconces')])[1]")
private WebElement Sconces;
@FindBy(xpath="(//a[contains(text(),'Floor Lamps')])[1]")
private WebElement FloorLamps;
@FindBy(xpath="(//a[contains(text(),'Pendants')])[1]")
private WebElement Pendants;
@FindBy(xpath="(//a[contains(text(),'Accent Lamps')])[1]")
private WebElement AccentLamps;


@FindBy(xpath="(//a[contains(text(),'Furniture')])[1]")
private WebElement Furniture;
//submenu furniture 
@FindBy(xpath = "(//a[contains(text(),'Furniture')])[1]/span")
private WebElement furnituresubmenu;
@FindBy(xpath="(//a[contains(text(),'Pedestals')])[1]")
private WebElement Pedestals;
@FindBy(xpath="(//a[contains(text(),'Media Cabinets')])[1]")
private WebElement MediaCabinets;
@FindBy(xpath="(//a[contains(text(),'Cabinets & Chests')])[1]")
private WebElement CabinetsChests;
@FindBy(xpath="(//a[contains(text(),'Bookcases & Shelves')])[1]")
private WebElement BookcasesShelves;
@FindBy(xpath="(//a[contains(text(),'Bedroom')])[1]")
private WebElement Bedroom;

@FindBy(xpath="(//a[contains(text(),'Mirrors')])[1]")
private WebElement  Mirrors;
@FindBy(xpath="(//a[contains(text(),'Office')])[1]")
private WebElement Office;
@FindBy(xpath="(//a[contains(text(),'Sculpture')])[1]")
private WebElement Sculpture;

@FindBy(xpath="(//a[contains(text(),'Seating')])[1]")
private WebElement Seating;
//submenu seating 
@FindBy(xpath="(//a[contains(text(),'Seating')])[1]/span")
private WebElement seatingsubmenu;
@FindBy(xpath="(//a[contains(text(),'Stools')])[1]")
private WebElement Stools;
@FindBy(xpath="(//a[contains(text(),'Ottomans')])[1]")
private WebElement Ottomans;
@FindBy(xpath="(//a[contains(text(),'Sofas')])[1]")
private WebElement Sofas;
@FindBy(xpath="(//a[contains(text(),'Occasional Chairs')])[1]")
private WebElement OccasionalChairs;
@FindBy(xpath="(//a[contains(text(),'Dining Chairs')])[1]")
private WebElement DiningChairs;
@FindBy(xpath="(//a[contains(text(),'Benches')])[1]")
private WebElement Benches;


@FindBy(xpath="(//a[contains(text(),'Storage')])[1]")
private WebElement Storage;
//submenu storage 
@FindBy(xpath="(//a[contains(text(),'Storage')])[1]/span")
private WebElement submenuStorage;
@FindBy(xpath="(//a[contains(text(),'Umbrella Stands')])[1]")
private WebElement UmbrellaStands;
@FindBy(xpath="(//a[contains(text(),'Magazine Caddies')])[1]")
private WebElement MagazineCaddies;
@FindBy(xpath="(//a[contains(text(),'Storage Boxes')])[1]")
private WebElement StorageBoxes;
@FindBy(xpath="(//a[contains(text(),'Jewelry Boxes')])[1]")
private WebElement JewelryBoxes;

@FindBy(xpath="(//a[contains(text(),'Tables')])[1]")
private WebElement Tables;
//submenutables
@FindBy(xpath="(//a[contains(text(),'Tables')])[1]/span")
private WebElement submenuTables;
@FindBy(xpath="(//a[contains(text(),'Bar')])[1]")
private WebElement Bar;
@FindBy(xpath="(//a[contains(text(),'Occasional')])[1]")
private WebElement Occasional;
@FindBy(xpath="(//a[contains(text(),'End Table')])[1]")
private WebElement EndTable;
@FindBy(xpath="(//a[contains(text(),'Dining')])[1]")
private WebElement Dining;
@FindBy(xpath="(//a[contains(text(),'Desk')])[1]")
private WebElement Desk;
@FindBy(xpath="(//a[contains(text(),'Console')])[1]")
private WebElement Console;
@FindBy(xpath="(//a[contains(text(),'Cocktail')])[1]")
private WebElement Cocktail;


@FindBy(xpath="(//a[contains(text(),'Textiles')])[1]")
private WebElement Textiles;
//submenutextiles

@FindBy(xpath="(//a[contains(text(),'Textiles')])[1]/span")
private WebElement submenuTextiles;
@FindBy(xpath="(//a[contains(text(),'Throws')])[1]")
private WebElement Throws;
@FindBy(xpath="(//a[contains(text(),'Pillows')])[1]")
private WebElement Pillows;
@FindBy(xpath="(//a[contains(text(),'Rugs')])[1]")
private WebElement Rugs;


@FindBy(xpath="(//a[contains(text(),'Trays')])[1]")
private WebElement Trays;

@FindBy(xpath="(//a[contains(text(),'Wall Decor')])[1]")
private WebElement WallDecor;
//submenu walldecor
@FindBy(xpath="(//a[contains(text(),'Wall Decor')])[1]/span")
private WebElement WallDecorsubmenu;
@FindBy(xpath="(//a[contains(text(),'Wall Art')])[1]")
private WebElement WallArt;
@FindBy(xpath="(//a[contains(text(),'Wall Objects')])[1]")
private WebElement WallObjects;
@FindBy(xpath="(//a[contains(text(),'Wall Shelves')])[1]")
private WebElement WallShelves;
@FindBy(xpath="(//a[contains(text(),'Wall Sconces')])[1]")
private WebElement WallSconces;
@FindBy(xpath="(//a[contains(text(),'Wall Panels')])[1]")
private WebElement WallPanels;


@FindBy(xpath="(//a[contains(text(),'Online Only')])[1]")
private WebElement OnlineOnly;
@FindBy(xpath="(//a[contains(text(),'Special Buys')])[1]")
private WebElement SpecialBuys;

//Footer more
@FindBy(xpath ="//h3[contains(@class,'tooglecont')]")
private WebElement more;
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
@FindBy(xpath="//h3[text()='Brands']")
private WebElement BRANDS;
@FindBy(xpath="//a[text()='Surya']")
private WebElement surya;
@FindBy(xpath="//a[@title='Mitchell Gold + Bob Williams']")
private WebElement mitchellgold;
@FindBy(xpath="//a[text()='RST Brands']")
private WebElement rstbrand;

//customer service

@FindBy(xpath="//h3[contains(@class,'custservisdesk')]/a")
private WebElement customservice;
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



@FindBy(xpath ="//div[contains(@class,'f-signup')]/h4")
private WebElement dontmissout;
@FindBy(xpath="//a[@title='Sign Me Up']")
private WebElement signupme;

@FindBy(xpath="//span[contains(@class,'base')]")
private WebElement fignforupdates;
@FindBy(xpath= "//input[@title='First Name']")
private WebElement fname;
@FindBy(xpath= "//input[@placeholder='Last Name*']")
private WebElement lname;
@FindBy(xpath="//input[@name='loffield_c32']")
private WebElement email;
@FindBy(xpath="//input[@title='Company']")
private WebElement company;

@FindBy(xpath="//span[@title='-- Please Select --']")
private WebElement city;
@FindBy(xpath="//input[@type='search']")
private WebElement selectcity;

@FindBy(xpath="//input[@placeholder='ZIP CODE']")
private WebElement zipcode;
@FindBy(xpath="//input[@type='checkbox']")
private WebElement checkboxlabel;
@FindBy(xpath="//div[contains(@class,'recaptcha-checkbox-checkmark')]")
private WebElement recaptcha;
@FindBy(xpath="//button[@title='Submit']")
private WebElement submit;

@FindBy(xpath="//div[text()='Please check reCaptcha and try again.']")
private WebElement verifyerrorcaptcha;



//brand partnerrs shop menu validation
@FindBy(xpath="//a[text()='BRAND PARTNERS']")
private WebElement brandpartnersheading;
@FindBy(xpath="//div[text()='ANN GISH']")
private WebElement ANNGISH;
@FindBy(xpath="//div[text()='ARETE']")
private WebElement ARETE;
@FindBy(xpath="//div[text()='BARBARA BARRY']")
private WebElement BARBARABARRY;
@FindBy(xpath="//div[text()='MCFCHAN']")
private WebElement MCFCHAN;
@FindBy(xpath="//div[text()='JULIA BUCKINGHAM']")
private WebElement JULIABUCKINGHAM;
@FindBy(xpath="//div[text()='Lemieux Et Cie']")
private WebElement LemieuxEtCie;
@FindBy(xpath="//div[text()='WILLIAMSBURG']")
private WebElement WILLIAMSBURG;
@FindBy(xpath="//div[text()='CITIZEN ARTIST']")
private WebElement CITIZENARTIST;
@FindBy(xpath="//div[text()='Ashley Childers']")
private WebElement AshleyChilders;
@FindBy(xpath="//div[text()='Edward Nader']")
private WebElement EdwardNader;

//imageclick verify 

@FindBy(xpath="//div[text()='ANN GISH']/following-sibling::div")
private WebElement angishimageclick;
@FindBy(xpath="//div[text()='ARETE']/following-sibling::div")
private WebElement areteimageclick;
@FindBy(xpath="//div[text()='BARBARA BARRY']/following-sibling::div")
private WebElement BARBARABARRYimageclick;
@FindBy(xpath="//div[text()='MCFCHAN']/following-sibling::div")
private WebElement MCFCHANimageclick;
@FindBy(xpath="//div[text()='JULIA BUCKINGHAM']/following-sibling::div")
private WebElement JULIABUCKINGHAMimageclick;
@FindBy(xpath="//div[text()='Lemieux Et Cie']/following-sibling::div")
private WebElement LemieuxEtCieimageclick;
@FindBy(xpath="//div[text()='WILLIAMSBURG']/following-sibling::div")
private WebElement WILLIAMSBURGimageclick;
@FindBy(xpath="//div[text()='CITIZEN ARTIST']/following-sibling::div")
private WebElement CITIZENARTISTimageclick;
@FindBy(xpath="//div[text()='Ashley Childers']/following-sibling::div")
private WebElement AshleyChildersimageclick;
@FindBy(xpath="//div[text()='Edward Nader']/following-sibling::div")
private WebElement EdwardNaderimageclick;

//validate explore links 

@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Ann Gish Collection')]/following::a[1]")
private WebElement angishexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Barbara Barry Collection')]/following::a[1]")
private WebElement BarbaraBarryCollectionexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Arete Collection Collection')]/following::a[1]")
private WebElement ARETEexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'MCFCHAN Collection')]/following::a[1]")
private WebElement MCFCHANcollecionexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Julia Buckingham Collection')]/following::a[1]")
private WebElement juliaexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Williamsburg Collection')]/following::a[1]")
private WebElement WilliamsburgCollectionexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Lemieux Et Cie Collection')]/following::a[1]")
private WebElement LemieuxCollectionexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Citizen Artist Collection')]/following::a[1]")
private WebElement CitizenCollectionexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Ashley Childers Collection')]/following::a[1]")
private WebElement AshleyCollectionexplore;
@FindBy(xpath="//div[contains(@class,'viewcollection-block-inner')]/h3[contains(text(),'Edward Nader Collection')]/following::a[1]")
private WebElement EdwardCollectionexplore;



//socailmedia links 
@FindBy(xpath="//a[@title='Pinterest']")
private WebElement pinerest;
@FindBy(xpath="//a[@title='Instagram']")
private WebElement insta;
@FindBy(xpath="//a[@title='Facebook']")
private WebElement facebook;
@FindBy(xpath="//a[@title='Twitter']")
private WebElement Twitter;
@FindBy(xpath="//a[@title='Linkedin']")
private WebElement Linkedin;
@FindBy(xpath="//a[@title='YouTube']")
private WebElement YouTube;





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
			Thread.sleep(1000);
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
		Thread.sleep(2000);
	}
	catch (Exception e)
	{
	  System.out.println("issue in expection" +e);
	}
}


public void signuplatestupadtes() throws InterruptedException


{
	try
	{
		
	Applicationutility.getscroll(latestupdate, driver);
	String expected = Propertyutility.getproperty("latestnews");
	String actual =  latestupdate.getText();
	System.out.println(actual);
	assertEquals(actual, expected);
	System.out.println("Actual & expected match");
	
	Thread.sleep(1000);
	Applicationutility.myClick(searchbar);
	emailsignup.sendKeys(Propertyutility.getproperty("email"));
	
	
	Thread.sleep(1000);
	Applicationutility.waitforVisible(driver, selectstore);
	Thread.sleep(1000);
	Applicationutility.myClick(selectstore);
	Thread.sleep(1000);
	Applicationutility.waitforVisible(driver, storeslection);
	Thread.sleep(1000);
	Applicationutility.myClick(storeslection);
	
	Thread.sleep(1000);
	Applicationutility.myClick(onlinestore);
	
//	storeslection.sendKeys(Propertyutility.getproperty("storeshop"));
//	Thread.sleep(1000);
//	storeslection.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	Applicationutility.myClick(signup);
	
	Thread.sleep(2000);
	Applicationutility.myClick(close);
	Thread.sleep(1000);
	
	
	studio.click();
	Thread.sleep(1000);
	
	driver.navigate().back();
	signature.click();
	Thread.sleep(1000);
	driver.navigate().back();
	backtotop.click();
	}
	catch (Exception e)
	{
		System.out.println("issue in the signuplatestupdates" +e);
	}
}


public void Verifyshopcategorylinks() throws InterruptedException
{
	try 
	{
	    Thread.sleep(1000);
		ob=  new Applicationutility();
		
		ob.mousehover(shopmenucategory, driver);
		Applicationutility.waitforclickible(driver, newintroduction);
		ob.mousehover(shopmenucategory, driver);
		Applicationutility.waitforclickible(driver, arete);
		ob.mousehover(shopmenucategory, driver);
		Applicationutility.waitforclickible(driver, barware);
		ob.mousehover(shopmenucategory, driver);
		Applicationutility.waitforclickible(driver, barwaresubmenu);
		Thread.sleep(1000);
		

        // Get all links within the submenu
            List<WebElement> links = barwaresubmenu.findElements(By.tagName("a"));
        
        // Iterate through each link
            for (int i = 0; i < links.size(); i++)
            {
            links = barwaresubmenu.findElements(By.tagName("a"));
            
            WebElement linkbarware = links.get(i);
            System.out.println("Clicking on link: " +linkbarware.getText());
            linkbarware.click();
            
            // Perform any post-click validation if needed
            System.out.println("Page Title: " +driver.getTitle());
            
            // Navigate back to the submenu to click the next link
            driver.navigate().back();
            
            System.out.println("links are open in barware submenu ");
            }
           
          Applicationutility.waitforclickible(driver, candelholders);  
          ob.mousehover(shopmenucategory, driver);
          Applicationutility.waitforclickible(driver, candelholderssubmenu);
          
          List<WebElement> linkss = candelholderssubmenu.findElements(By.tagName("a"));
          
          
              for (int k = 0; k < linkss.size(); k++) 
              {
              linkss = barwaresubmenu.findElements(By.tagName("a"));
              
              WebElement linkcandleholder = links.get(k);
              System.out.println("Clicking on link: " +linkcandleholder.getText());
              linkcandleholder.click();
              System.out.println("Page Title: " +driver.getTitle());
              driver.navigate().back();
              ob.mousehover(shopmenucategory, driver);
              System.out.println("links are open in linkcandleholder submenu ");
              }
           
           Applicationutility.waitforclickible(driver, Candles);  
           ob.mousehover(shopmenucategory, driver);
           Applicationutility.waitforclickible(driver, ClearGlass);  
           ob.mousehover(shopmenucategory, driver);
           Applicationutility.waitforclickible(driver, DecorativeItems);  
           ob.mousehover(shopmenucategory, driver);
           Applicationutility.waitforclickible(driver, submenuDecorativeItems);  
           
           List<WebElement> linksss = submenuDecorativeItems.findElements(By.tagName("a"));
           
           
	           for (int k = 0; k < linksss.size(); k++) 
	           {
	           linksss = submenuDecorativeItems.findElements(By.tagName("a"));
	           
	           WebElement submenuDecorativeItems = links.get(k);
	           System.out.println("Clicking on link: " +submenuDecorativeItems.getText());
	           submenuDecorativeItems.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in submenuDecorativeItems ");
	           }
	           
	           
	       Applicationutility.waitforclickible(driver, ElectrifiedLighting);
	       ob.mousehover(shopmenucategory, driver);
	       Applicationutility.waitforclickible(driver, submenuElectrifiedLighting);
	       List<WebElement> linkssss = submenuElectrifiedLighting.findElements(By.tagName("a"));
           
           
	           for (int j = 0; j < linkssss.size(); j++) 
	           {
	           linkssss = submenuElectrifiedLighting.findElements(By.tagName("a"));
	           
	           WebElement submenuElectrifiedLighting = links.get(j);
	           System.out.println("Clicking on link: " +submenuElectrifiedLighting.getText());
	           submenuElectrifiedLighting.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in submenuElectrifiedLighting ");
	           }
	        
	        Applicationutility.waitforclickible(driver, Furniture);
	        ob.mousehover(shopmenucategory, driver);
	        
	        Thread.sleep(2000);  
		    Applicationutility.myClick(furnituresubmenu);
		    List<WebElement> linksssss = furnituresubmenu.findElements(By.tagName("a"));
	           
	           
	           for (int k = 0; k < linksssss.size(); k++) 
	           {
	           linksssss = furnituresubmenu.findElements(By.tagName("a"));
	           
	           WebElement furnituresubmenu = links.get(k);
	           System.out.println("Clicking on link: " +furnituresubmenu.getText());
	           furnituresubmenu.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in furnituresubmenu ");
	           }
	        Thread.sleep(1000);   
	        Applicationutility.waitforclickible(driver, Mirrors);
		    ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, Office);
		    ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, Sculpture);
		    ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, Seating);
		    ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, seatingsubmenu);
		    
		    List<WebElement> linkssssss = seatingsubmenu.findElements(By.tagName("a"));
	           
	           
	           for (int l = 0; l < links.size(); l++) 
	           {
	           linkssssss = seatingsubmenu.findElements(By.tagName("a"));
	           
	           WebElement seatingsubmenu = links.get(l);
	           System.out.println("Clicking on link: " +seatingsubmenu.getText());
	           seatingsubmenu.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in seatingsubmenu ");
	           }
	           
	        Thread.sleep(1000);
	        Applicationutility.waitforclickible(driver, Storage);
	        ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, submenuStorage);
		    List<WebElement> linksssssss = submenuStorage.findElements(By.tagName("a"));
	           
	           
	           for (int m = 0; m < links.size(); m++) 
	           {
	           linksssssss = submenuStorage.findElements(By.tagName("a"));
	           
	           WebElement submenuStorage = links.get(m);
	           System.out.println("Clicking on link: " +submenuStorage.getText());
	           submenuStorage.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in submenuStorage ");
	           }   
	           
	         Applicationutility.waitforclickible(driver, Tables);
		     ob.mousehover(shopmenucategory, driver);
		     Applicationutility.waitforclickible(driver, submenuTables);
		     List<WebElement> linkssssssss = submenuTables.findElements(By.tagName("a"));
	           
	           
	           for (int n = 0; n < links.size(); n++) 
	           {
	           linkssssssss = submenuTables.findElements(By.tagName("a"));
	           
	           WebElement submenuTables = links.get(n);
	           System.out.println("Clicking on link: " +submenuTables.getText());
	           submenuTables.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in submenuTables ");
	           }   
	           
	        Applicationutility.waitforclickible(driver, Textiles);
	        ob.mousehover(shopmenucategory, driver);
			Applicationutility.waitforclickible(driver, submenuTextiles);
			List<WebElement> linksssssssss = submenuTextiles.findElements(By.tagName("a"));
	           
	           
	           for (int o = 0; o < links.size(); o++) 
	           {
	           linksssssssss = submenuTextiles.findElements(By.tagName("a"));
	           
	           WebElement submenuTextiles = links.get(o);
	           System.out.println("Clicking on link: " +submenuTextiles.getText());
	           submenuTextiles.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in submenuTables ");
	           } 	
	           
	        Applicationutility.waitforclickible(driver, Trays);
		    ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, WallDecor);
		    ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, WallDecor);
		    ob.mousehover(shopmenucategory, driver);
		    Applicationutility.waitforclickible(driver, WallDecorsubmenu);
            
		    List<WebElement> linkssssssssss = WallDecorsubmenu.findElements(By.tagName("a"));
	           
	           
	           for (int p = 0; p < links.size(); p++) 
	           {
	           linkssssssssss = WallDecorsubmenu.findElements(By.tagName("a"));
	           
	           WebElement WallDecorsubmenu = links.get(p);
	           System.out.println("Clicking on link: " +WallDecorsubmenu.getText());
	           WallDecorsubmenu.click();
	           System.out.println("Page Title: " +driver.getTitle());
	           driver.navigate().back(); 
	           System.out.println("links are open in submenuTables ");
	           } 	
	           
	       Applicationutility.waitforclickible(driver, OnlineOnly);    
	       ob.mousehover(shopmenucategory, driver);
		   Applicationutility.waitforclickible(driver, SpecialBuys);    
		   
		   
		   Thread.sleep(2000);
           System.out.println("Verified all links");
		       
             
	
}
	catch (Exception e) 
	{
		System.out.println("issue in exception" +e);
	}
}




public void verifypageFooter() throws InterruptedException
{
	try 
	{
		Thread.sleep(1000);
		
		String expected = Propertyutility.getproperty("more");
		String actual = more.getText();
		System.out.println(actual);
		assertEquals(actual, expected);
		
		
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(aboutus);
		System.out.println("aboutus verified");
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(Contract);
		System.out.println("contract verfied");
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(Showrooms);
		System.out.println("showrooms verified");
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(MarketDates);
		System.out.println("marketdates verified");
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(catalogsmenu);
		System.out.println("catalogsmenu");
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(Blog);
		System.out.println("Blog");
		Applicationutility.scrolltobottom();
		
		
		String expectedbrand = Propertyutility.getproperty("brands");
		String actualbrand =  BRANDS.getText();
		System.out.println(actualbrand);
		assertEquals(actualbrand, expectedbrand);
		
		Applicationutility.myClick(surya);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Applicationutility.myClick(mitchellgold);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Applicationutility.myClick(rstbrand);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		
		Applicationutility.myClick(customservice);
		Applicationutility.scrolltobottom();
		
		Applicationutility.myClick(TermsConditions);
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(privacy);
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(shipping);
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(environmental);
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(credit);
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(contactus);
		Applicationutility.scrolltobottom();
		Applicationutility.myClick(sitemap);
		Applicationutility.scrolltobottom();
		Thread.sleep(1000);
		
	
	} 
	catch (Exception e) 
	{
		System.out.println("issue in validate footer" +e);
	}
	
}

public void siggnupform() throws InterruptedException

{
	
	try
	{
	
	String expected = Propertyutility.getproperty("dontmissout");
	String actual = dontmissout.getText();
	System.out.println(actual);
	assertEquals(actual, expected);
	

	signupme.click();
	Thread.sleep(2000);
	
	String expceted1 = Propertyutility.getproperty("fignforupdates");
	String actual1= fignforupdates.getText();
	System.out.println(actual1);
	assertEquals(actual1, expceted1);
	
	
	Applicationutility.myClick(fname);
	fname.sendKeys(Propertyutility.getproperty("ffname"));
	Thread.sleep(1000);
	Applicationutility.myClick(lname);
	lname.sendKeys(Propertyutility.getproperty("llname"));
	Thread.sleep(1000);
	
	email.click();
	email.sendKeys(Propertyutility.getproperty("eemailsign"));
	
	company.click();
	company.sendKeys(Propertyutility.getproperty("ccompany"));
	
	Thread.sleep(1000);

	
	Applicationutility.myClick(city);
	Thread.sleep(1000);
	Applicationutility.myClick(selectcity);
	selectcity.sendKeys(Propertyutility.getproperty("rregion"));
	Thread.sleep(1000);
	selectcity.sendKeys(Keys.ENTER);
	
	
	Thread.sleep(1000);
	Applicationutility.myClick(zipcode);
	zipcode.sendKeys(Propertyutility.getproperty("PPINCODE"));
	
    Applicationutility.getscroll(checkboxlabel, driver);
	Applicationutility.myClick(checkboxlabel);
	Thread.sleep(1000);
    
	
//	Applicationutility.myClick(recaptcha);
//	Thread.sleep(1000);
//	
	
	Applicationutility.myClick(submit);
	Thread.sleep(2000);
	
	Applicationutility.scrolltotop();
	
	String exp = Propertyutility.getproperty("verifyrecaptchaerror");
	String act = verifyerrorcaptcha.getText();
	System.out.println(act);
	assertEquals(act, exp);
	
	System.out.println("error verified");
	
	} 
	catch (Exception e)
	{
		System.out.println("issue in exception" +e);
	}
}
public void Verifybrandpartnerinshop()
{
	
	try 
	{
		ob =  new Applicationutility();
		
		ob.mousehover(shopmenu, driver);
		String expanngish = Propertyutility.getproperty("Anngish");
		String actanngish = ANNGISH.getText();
		System.out.println(actanngish);
		assertEquals(expanngish, actanngish);
		
		Applicationutility.myClick(angishimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(angishexplore);
		
		ob.mousehover(shopmenu, driver);
		String exparete = Propertyutility.getproperty("arete");
		String actarete = ARETE.getText();
		System.out.println(actarete);
		assertEquals(exparete, actarete);
		
		Applicationutility.myClick(areteimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(ARETEexplore);
		
		ob.mousehover(shopmenu, driver);
		String expbarbara = Propertyutility.getproperty("barbara");
		String actnarbara = BARBARABARRY.getText();
		System.out.println(actnarbara);
		assertEquals(expbarbara, actnarbara);
		
		Applicationutility.myClick(BARBARABARRYimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(BarbaraBarryCollectionexplore);
		
		
		
		ob.mousehover(shopmenu, driver);
		String expmcfchan = Propertyutility.getproperty("mcchan");
		String actmcfchan = MCFCHAN.getText();
		System.out.println(actmcfchan);
		assertEquals(expmcfchan, actmcfchan);
		
		Applicationutility.myClick(MCFCHANimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(MCFCHANcollecionexplore);
		
		
		ob.mousehover(shopmenu, driver);
		String expjulia = Propertyutility.getproperty("julia");
		String actjulia = JULIABUCKINGHAM.getText();
		System.out.println(actjulia);
		assertEquals(expjulia, actjulia);
		
		Thread.sleep(1000);
		Applicationutility.myClick(JULIABUCKINGHAMimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(juliaexplore);
		
		
		ob.mousehover(shopmenu, driver);
		String expwilliams = Propertyutility.getproperty("william");
		String actwilliams = WILLIAMSBURG.getText();
		System.out.println(actwilliams);
		assertEquals(expwilliams, actwilliams);
		
		Applicationutility.myClick(WILLIAMSBURGimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(WilliamsburgCollectionexplore);
		
		
		
		ob.mousehover(shopmenu, driver);
		String explemiux = Propertyutility.getproperty("lemitex");
		String actlemiux = LemieuxEtCie.getText();
		System.out.println(actlemiux);
		assertEquals(explemiux, actlemiux);
		
		Applicationutility.myClick(LemieuxEtCieimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(LemieuxCollectionexplore);
		
		ob.mousehover(shopmenu, driver);
		String expcitizen = Propertyutility.getproperty("citizen");
		String actcitizen = CITIZENARTIST.getText();
		System.out.println(actcitizen);
		assertEquals(expcitizen, actcitizen);
		
		Applicationutility.myClick(CITIZENARTISTimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(CitizenCollectionexplore);
		
		ob.mousehover(shopmenu, driver);
		String expashley = Propertyutility.getproperty("ashley");
		String actashley = AshleyChilders.getText();
		System.out.println(actashley);
		assertEquals(expashley, actashley);
		
		Applicationutility.myClick(AshleyChildersimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(AshleyCollectionexplore);
		
		
		ob.mousehover(shopmenu, driver);
		String expedwards = Propertyutility.getproperty("edward");
		String actedwards = EdwardNader.getText();
		System.out.println(actedwards);
		assertEquals(expedwards, actedwards);
		
		Applicationutility.myClick(EdwardNaderimageclick);
		Thread.sleep(1000);
		Applicationutility.myClick(EdwardCollectionexplore);
		
		Applicationutility.scrolltobottom();
		
		Thread.sleep(1000);
	    
		
	}
	catch (Exception e)
	{
		System.out.println("issue in Verifybrandpartnerinshop" +e);
	}
	
}
	
public void verifysocialmedialinks()
{
	try 
	{
		Applicationutility.myClick(pinerest);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Applicationutility.myClick(insta);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Applicationutility.myClick(facebook);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Applicationutility.myClick(Twitter);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Applicationutility.myClick(Linkedin);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Applicationutility.myClick(YouTube);
		Thread.sleep(3000);
		Applicationutility.chnagewindow(0, driver);
		Thread.sleep(1000);
		
		Applicationutility.myClick(verifylogoglobalview);
		Thread.sleep(2000);
		
		
		
	} 
	catch (Exception e) 
	{
		System.out.println("issue in social media links" +e);
	}
}
}





	































