package smokeTest;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.Header;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.QuickSearchResultPage;
import pageObjects.QuoteDetail;
import pageObjects.SearchResultPage;
import pageObjects.TrackPage;
import resources.base;

public class UserRights extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
	public WebDriver driver;

	@Test(priority = 0)

	public void P_Analysis() throws IOException, InterruptedException {
		driver = initializedriver1();
		LoginPage lp = new LoginPage(driver);
		// prop1 = base.prop;
		try {
			lp.getusername().sendKeys("arpatechpurchaseanalysis@connection.com");
			lp.getpassword().sendKeys("q-'7!/JC");
			lp.getloginbtn().click();
			Log.info("User has entered User's credentials on the login page");
		} catch (Exception e) {
			Log.error("User not able to login because the login screen's element has issues");
			Log.error(e.getMessage());
			driver.close();
		}
		Header hd = new Header(driver);
		try {
			hd.getTrackBtn().click();
			Thread.sleep(5000);
			Log.info("User has clicked on Track button");
		} catch (Exception e) {
			Log.error("User not able to click on the track button from the home page");
			Log.error(e.getMessage());
			driver.close();
		}
		TrackPage tp = new TrackPage(driver);
		String footertxtexp = "To access this section, please contact your Account Team.";
		String footertxtact = tp.getFooterTxt().getText();

		Log.info("System is extracting text from the purchase analysis section of the track page");
		Assert.assertEquals(footertxtact, footertxtexp,
				"User not having purchase analysis right is not getting access denied text on footer purchase analysis section of track page");

		Assert.assertEquals(footertxtact, footertxtexp,
				"User not having purchase analysis right is not getting access denied text on footer purchase analysis section of track page");
		try {
			hd.getPAnalysisBtn().click();
			Log.info("User has clicked on Purchase Analysis link on the Track Page");
			Thread.sleep(5000);
			Assert.assertEquals(driver.getTitle(), "403 - Access Denied - MarkITplace",
					"User not having purchase analysis right is not nevigating to the access denied page when clicking on Purchase Analysis Link");
		} catch (Exception e) {
			Log.error("User not able to click on purchase analysis link on the track page");
			Log.error(e.getMessage());
			driver.close();
		}
		Assert.assertEquals(driver.getTitle(), "403 - Access Denied - MarkITplace",
				"User not having purchase analysis right is not nevigating to the access denied page when clicking on Purchase Analysis Link");
		driver.close();
	}

	@Test(priority = 1)

	public void calendar_check() throws IOException, InterruptedException {
		driver = initializedriver1();
		LoginPage lp = new LoginPage(driver);
		// prop1 = base.prop;
		String Not_txt = null;
		String Cal_txt = null;
		String Not_txtexp = null;
		String Not_Calexp = null;
		String Cal_title = null;

		try {
			lp.getusername().sendKeys("ArpatechCalendars@connection.com");
			lp.getpassword().sendKeys("qZ+$V6{j");
			lp.getloginbtn().click();
			Log.info("User has entered credentials on the login page");
			Header hd = new Header(driver);
			hd.getTrackBtn().click();
			Thread.sleep(5000);
			Log.info("User has clicked on Track button");
			TrackPage tp = new TrackPage(driver);
			Not_txt = tp.getNotification_Section().getText();
			Cal_txt = tp.getCalendar_Section().getText();
			Not_txtexp = "To access this section, please contact your Account Team.";
			Not_Calexp = "To access this section, please contact your Account Team.";

			Assert.assertEquals(Cal_txt, Not_Calexp,
					"Access Denied text is not appearing on the calendar Section when user not having calendar right is accessing the track Page");
			Assert.assertEquals(Not_txt, Not_txtexp,
					"Access Denied text is not appearing on the notification Section when user not having calendar right is accessing the track Page");

			hd.getCalendar().click();

			Cal_title = driver.getTitle();
			Assert.assertEquals(Cal_title, "403 - Access Denied - MarkITplace",
					"Access Denied Page is not appearing on Calendar Page for user not having calendar right is accessing the Calendar Page ");

		}

		catch (Exception e) {
			Log.error("User not able to login because the login screen's element has issues");
			Log.error(e.getMessage());
			driver.close();
		}
		Assert.assertEquals(Cal_txt, Not_Calexp,
				"Access Denied text is not appearing on the calendar Section when user not having calendar right is accessing the track Page");
		Assert.assertEquals(Not_txt, Not_txtexp,
				"Access Denied text is not appearing on the notification Section when user not having calendar right is accessing the track Page");
		Assert.assertEquals(Cal_title, "403 - Access Denied - MarkITplace",
				"Access Denied Page is not appearing on Calendar Page for user not having calendar right is accessing the Calendar Page ");

	}

	

	@Test(priority = 2)

	public void Report_check() throws IOException, InterruptedException {
		try
		{
		driver = initializedriver1();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys("ArpatechReport@connection.com");
		lp.getpassword().sendKeys("(L6aXWqf");
		lp.getloginbtn().click();
		Log.info("User has entered credentials on the login page");
		Header hd = new Header(driver);
		hd.getTrackBtn().click();
		hd.getReports().click();
		List<WebElement> reportsPath = driver.findElements(By.xpath("/html/body/nav[3]/div[4]/div/ul/li/a"));
		for (int a = 1; a <= reportsPath.size(); a++) {
			String ClickOnRptLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.findElement(By.xpath("(/html/body/nav[3]/div[4]/div/ul/li/a)[" + a + "]")).sendKeys(ClickOnRptLink);
			Thread.sleep(3000);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> xyz = abc.iterator();
		driver.switchTo().window(xyz.next());

		while (xyz.hasNext()) {
			driver.switchTo().window(xyz.next());
			String title1 = driver.getTitle();
			if (!title1.contains("Expiration Report - MarkITplace")) {
				Assert.assertEquals(title1, "403 - Access Denied - MarkITplace",
						"User not having reports rights is still able to access reports");
			} else {
				Assert.assertEquals(title1, "Expiration Report - MarkITplace",
						"User not having reports rights is still able to access reports");
			}
		}
		String DeniedText = "To access this section, please contact your Account Team.";
		TrackPage tp = new TrackPage(driver);
		tp.getBackBtn().click();

		tp.getOrdersBtnBtn().click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "403 - Access Denied - MarkITplace",
				"User not having reports rights is still able to access reports");
		tp.getBackBtn().click();
		Thread.sleep(5000);
		tp.getQuoteTab().click();
		Assert.assertEquals(driver.getTitle(), "403 - Access Denied - MarkITplace",
				"User not having reports rights is still able to access reports");
		tp.getBackBtn().click();
		Thread.sleep(4000);
		// tp.getBackBtn().click();
		Assert.assertEquals(tp.getROrderSect().getText(), DeniedText,
				"User not having reports rights but order section on the track page is still not showing Access Denied Text");

		Assert.assertEquals(tp.getRQuotesSec().getText(), DeniedText,
				"User not having reports rights but quotes section on the track page is still not showing Access Denied Text");

		tp.getSavedReports().click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "403 - Access Denied - MarkITplace",
				"User not having reports rights is still able to access reports");
		tp.getBackBtn().click();
		Thread.sleep(4000);
		tp.getQuickFinder().sendKeys("118" + Keys.ENTER);
		Thread.sleep(4000);
		tp.getSearchRslt().getText();
		// String DeniedText = "To access this section, please contact your Account
		// Team.";
		Assert.assertEquals(tp.getSearchRslt().getText(), DeniedText,
				"User not having reports rights but still searching on Track Page is not nevigating to Access Denied Page");
		Thread.sleep(4000);
		tp.getShop().click();
		Header hdr = new Header(driver);
		hdr.getStanCatalogLink().click();
		Assert.assertEquals(driver.getTitle(), "403 - Access Denied - MarkITplace",
				"User not having reports rights is still able to access reports");
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			Assert.assertEquals(false, true,e.getMessage());
		
		}
		}
	
	@Test(priority = 3)

	public void Quotes_check() throws IOException, InterruptedException {

		driver = initializedriver1();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys("ArpatechQuote@connection.com");
		lp.getpassword().sendKeys("]7C6=pRM");
		lp.getloginbtn().click();
		Log.info("User has entered credentials on the login page");
		Header hd = new Header(driver);
		
		hd.getTrackBtn().click();
		Thread.sleep(5000);
		
		hd.getQuoteLink().click();
		
		
		Thread.sleep(5000);
		
		QuoteDetail qd = new QuoteDetail(driver);
		qd.getRow_Plus().click();
		
		
		boolean DsblQuote_btn ;
		try
		{
			qd.getCreateOrder_Dsbl().isDisplayed();
			qd.getDeletedsbl().isDisplayed();
					
			DsblQuote_btn = true;
			Assert.assertEquals(DsblQuote_btn, true,"Create and delete quote is not appearing disable in quote listing page for the user not having Create quote Right");
		}
		
		catch(Exception e)
		{
			DsblQuote_btn = false;
			Assert.assertEquals(DsblQuote_btn, true,"Create and delete quote is not appearing disable in quote listing page for the user not having Create quote Right");
		}
		
		
		hd.getTrackBtn().click();
		Thread.sleep(5000);
		TrackPage tp = new TrackPage(driver);
		tp.getQuoteExpnd().click();
		Thread.sleep(1000);
		boolean disbtn_present;
		try
		{
			tp.getDisEditQuote().click();
			tp.getDisDelQuote().click();
			disbtn_present = true;
		}
		catch(NoSuchElementException e)
		{
			disbtn_present = false;
		}
		Assert.assertEquals(disbtn_present, true,"Edit Quote and Delete Quote button is not appearing disabled for the user not having Edit and Delete Quote rights");
		tp.getQuoteDetails().click();
		//QuoteDetail qd = new QuoteDetail(driver);
		boolean Quotebtn_present;
		try
		{
			qd.getEditQuote().click();
			qd.getDelQuote().click();
			Quotebtn_present = true;
		}
		catch(NoSuchElementException e)
		{
			Quotebtn_present = false;
		}
		
		Assert.assertEquals(Quotebtn_present, true,"Edit Quote and Delete Quote button is not appearing disabled for the user not having Edit and Delete Quote rights on the quote detail page");
		
		Header hd1 = new Header(driver);
		hd1.getTrackBtnFF().click();
		Thread.sleep(5000);
		TrackPage tk = new TrackPage(driver);
		tk.getSearchBox().sendKeys("118" + Keys.ENTER);
		Thread.sleep(20000);
		QuickSearchResultPage qsr = new QuickSearchResultPage(driver);
		qsr.getQuotesTab().click();
		Thread.sleep(2000);
		qsr.getExpand1().click();
		Thread.sleep(1000);
		
		
		boolean SRP_Quotebtn_present;
		try
		{
			qsr.getEditQuotedsbl().click();
			qsr.getDelQuotedsbl().click();
			SRP_Quotebtn_present = true;
		}
		catch(NoSuchElementException e)
		{
			SRP_Quotebtn_present = false;
		}
		
		Assert.assertEquals(SRP_Quotebtn_present, true,"Edit Quote and Delete Quote button is not appearing disabled for the user not having Edit and Delete Quote rights on the Search Result page");
		}	
	@Test(priority = 4)

	public void OrderCheckOut_check() throws IOException, InterruptedException {

		
		driver = initializedriver1();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys("ArpatechOrderCheckOut@connection.com");
		lp.getpassword().sendKeys(",r+T8`X{");
		lp.getloginbtn().click();
		Log.info("User has entered credentials on the login page");
		Header hd = new Header(driver);
		hd.getTrackBtn().click();
		Thread.sleep(5000);
		TrackPage tp = new TrackPage(driver);
			
		tp.getQuoteExpnd().click();
		Thread.sleep(1000);
			
		boolean Crtordrdisable_btn ;
		try
		{
			tp.getDisbl_CreateOrdr().isDisplayed();
					
			Crtordrdisable_btn = true;
			Assert.assertEquals(Crtordrdisable_btn, true,"Create Order is not appearing disable in track page for the user not having Create Order Right");
		}
		
		catch(Exception e)
		{
			Crtordrdisable_btn = false;
			Assert.assertEquals(Crtordrdisable_btn, true,"Create Order is not appearing disable in track page for the user not having Create Order Right");
		}
		
		
		tp.getQuickFinder().sendKeys("118" + Keys.ENTER);
		
		Thread.sleep(15000);
		QuickSearchResultPage qsr = new QuickSearchResultPage(driver);
		qsr.getQuotesTab().click();
		Thread.sleep(2000);
		qsr.getExpand1().click();
		Thread.sleep(1000);
		
		
		boolean Crtordrdisable_srp ;
		try
		{
			qsr.getCreateOrder_Disbl().isDisplayed();
					
			Crtordrdisable_srp = true;
			Assert.assertEquals(Crtordrdisable_srp, true,"Create Order is not appearing disable in quick search page for the user not having Create Order Right");
		}
		
		catch(Exception e)
		{
			Crtordrdisable_srp = false;
			Assert.assertEquals(Crtordrdisable_srp, true,"Create Order is not appearing disable in quick search page for the user not having Create Order Right");
		}
		
		//Header hd2 = new Header(driver);
		hd.getTrackBtnFF().click();
		Thread.sleep(5000);
		
		tp.getQuoteExpnd().click();
		Thread.sleep(1000);
		tp.getQuoteDetails().click();
		
		Thread.sleep(5000);
		
		QuoteDetail qd = new QuoteDetail(driver);
		boolean disable_btn ;
		try
		{
			qd.getCreateOrder_Dsbl().isDisplayed();
			qd.getDeletedsbl().isDisplayed();
			
			disable_btn = true;
			Assert.assertEquals(disable_btn, true,"Create Order and disable button is not appearing disable in quote details page for the user not having Create Order Right");
		
		}
		
		catch(Exception e)
		{
			disable_btn = false;
			Assert.assertEquals(disable_btn, true,"Create Order and disable button is not appearing disable in quote details page for the user not having Create Order Right");
		}
	}
	
	
	@Test(priority = 5)

	public void QuoteCheckOut_Check() throws IOException, InterruptedException {

		//ArpatechQuoteCheckout@connection.com
		//2<Bjj4]Y
		
		//ArpatechOrderCheckOut@connection.com
		//,r+T8`X{
		
		driver = initializedriver1();
		LoginPage lp = new LoginPage(driver);
		WebDriverWait wt = new WebDriverWait(driver, 50);
		
		lp.getusername().sendKeys("ArpatechQuoteCheckout@connection.com");
		lp.getpassword().sendKeys("2<Bjj4]Y");
		lp.getloginbtn().click();
		Log.info("User has entered credentials on the login page");
		
		
		
		Header hd = new Header(driver);
		hd.getsearchbox().sendKeys("Printers" + Keys.ENTER);
	
		Thread.sleep(5000);
		
		SearchResultPage Srp = new SearchResultPage(driver);
		
		wt.until(ExpectedConditions.elementToBeClickable(Srp.getAdd2Cart()));
		
		//Thread.sleep(5000);
		Srp.getAdd2Cart().click();
		
		wt.until(ExpectedConditions.elementToBeClickable(Srp.getCloseIcon1()));
		boolean CreateQuote_Btn;
		try
		{
			Srp.getCreateQuoteBtn().isDisplayed();
			CreateQuote_Btn = false;
			Assert.assertEquals(CreateQuote_Btn, true,"Create QUote button is displaying for the User on Add to Cart Module which dont have Create Quote rights");
			
		}
			
		catch(Exception e)
		{
			CreateQuote_Btn = true;
			Assert.assertEquals(CreateQuote_Btn, true,"Create QUote button is displaying for the User on Add to Cart Module which dont have Create Quote rights");
		}
		
		Srp.getCloseIcon1().click();
	
		Srp.getCartBtn().click();
		
		CartPage cp = new CartPage(driver);
		
		Thread.sleep(5000);
		boolean button ;
		try
		{
			cp.getQuote_Btn().isDisplayed();
			button = false;
			Assert.assertEquals(button, true,"Create QUote button is displaying for the User on Cart Page which dont have Create Quote rights");
			
		}
			
		catch(Exception e)
		{
			button = true;
			Assert.assertEquals(button, true,"Create QUote button is displaying for the User on Cart Page which dont have Create Quote rights");
		}
				
	}	
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	}