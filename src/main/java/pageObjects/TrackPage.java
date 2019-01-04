package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TrackPage {
	public WebDriver driver ;
	
	public TrackPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	By SearchBox = By.xpath("//input[@name='terms']");
	
	By QuoteExpnd=By.xpath("(//a[@class='btn-expand'])[5]");
	
	By CalendarDiv = By.xpath("//*[@id='track-dashboard']/div[1]/div/div[1]/div[3]/div");
	By QuickFinder= By.xpath("//input[@class='quick-search']");
	By CalendarBtn=By.linkText("Calendar");
	By ReportsBtn=By.linkText("Reports");
	By OrdersBtn=By.linkText("Orders");
	By Purchase_Analysis_Btn=By.linkText("Purchase Analysis");
	By SavedReports=By.xpath("//a[@class='my-reports']");
	By View_Full_Calendar=By.linkText("View full calendar");
	By AllOrdersLink=By.linkText("See all orders");
	By SeeAllQuotes=By.linkText("See all quotes");
	By FooterTxt=By.xpath("//div[@class='alert alert-info permission-box']");
	By Notification_Section = By.xpath("(//div[@class='alert alert-info permission-box'])[1]");
	By Calendar_Section = By.xpath("(//div[@class='alert alert-info permission-box'])[2]");
	By BackBtn=By.xpath("(//a[text()=' Back'])[1]");
	By QuoteTab=By.xpath("(//a[text()='Quotes'])[3]");
	By SearchRslt=By.xpath("//div[@class='alert alert-info permission-box']");
	By Shop = By.xpath("(//a[text()='Shop'])[1]");
	By ROrderSect=By.xpath("(//div[@class='alert alert-info permission-box'])[1]");
	By RQuotesSec=By.xpath("(//div[@class='alert alert-info permission-box'])[2]");
	By DisEditQuote=By.xpath("(//a[@class='btn disabled tt-wrapper' and @alt='Edit Quote'])[1]");
	By DisDelQuote=By.xpath("(//a[@class='btn disabled tt-wrapper' and @alt='Delete Quote'])[1]");
	By QuoteDetails=By.xpath("//a[text()='Quote details' and @class='order-link']");
	By Disbl_CreateOrdr=By.xpath("(//a[@class='btn disabled tt-wrapper'])[1]");
	
	
	public WebElement getDisbl_CreateOrdr()
	{
		return driver.findElement(Disbl_CreateOrdr);
	}
	
	
	public WebElement getSearchBox()
	{
		return driver.findElement(SearchBox);
	}
	
	public WebElement getQuoteDetails()
	{
		return driver.findElement(QuoteDetails);
	}
	
	public WebElement getDisEditQuote()
	{
		return driver.findElement(DisEditQuote);
	}
	
	public WebElement getDisDelQuote()
	{
		return driver.findElement(DisDelQuote);
	}
	
	public WebElement getQuoteExpnd()
	{
		return driver.findElement(QuoteExpnd);
	}
	
	public WebElement getROrderSect()
	{
		return driver.findElement(ROrderSect);
	}
	public WebElement getRQuotesSec()
	{
		return driver.findElement(RQuotesSec);
	}
	
	public WebElement getShop()
	{
		return driver.findElement(Shop);
	}
	
	public WebElement getSearchRslt()
	{
		return driver.findElement(SearchRslt);
	}
	
	public WebElement getQuoteTab()
	{
		return driver.findElement(QuoteTab);
	}
	
	
	public WebElement getBackBtn()
	{
		return driver.findElement(BackBtn);
	}
	
	public WebElement getNotification_Section()
	{
		return driver.findElement(Notification_Section);
	}
	public WebElement getCalendar_Section()
	{
		return driver.findElement(Calendar_Section);
	}
	
	public WebElement getFooterTxt()
	{
		return driver.findElement(FooterTxt);
	}
	
	public WebElement getQuickFinder()
	{
		return driver.findElement(QuickFinder);
	}
	
	public WebElement getCalendarBtn()
	{
		return driver.findElement(CalendarBtn);
	}
	public WebElement getReportsBtn()
	{
		return driver.findElement(ReportsBtn);
	}
	
	public WebElement getOrdersBtnBtn()
	{
		return driver.findElement(OrdersBtn);
	}
	
	public WebElement get_Purchase_Analysis_BtnBtn()
	{
		return driver.findElement(Purchase_Analysis_Btn);
	}
	
	public WebElement getSavedReports()
	{
		return driver.findElement(SavedReports);
	}
	
	public WebElement getView_Full_Calendar()
	{
		return driver.findElement(View_Full_Calendar);
	}
	
	public WebElement getAllOrdersLink()
	{
		return driver.findElement(AllOrdersLink);
	}
	
	public WebElement getSeeAllQuotes()
	{
		return driver.findElement(SeeAllQuotes);
	}
	
	public WebElement getCalendarDiv()
	{
		return driver.findElement(CalendarDiv);
	}
	
}
