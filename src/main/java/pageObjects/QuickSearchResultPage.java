package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuickSearchResultPage {
	
	public WebDriver driver ;
	
	public QuickSearchResultPage(WebDriver driver) 
	{
		
		this.driver=driver;
	}
	
	By CreateOrder_Disbl=By.xpath("(//a[@class='btn btn-primary disabled q-d-disabled tt-wrapper'])[1]");
	
	By EditQuotedsbl=By.xpath("(//a[@class='btn btn-primary disabled q-d-disabled tt-wrapper'])[1]");
	By DelQuotedsbl=By.xpath("(//a[@class='btn btn-primary disabled q-d-disabled tt-wrapper'])[2]");
	By OrdersTab= By.xpath("//div[@class='tab-wrapper clearfix']/div/span[1]");
	By QuotesTab= By.xpath("//div[@class='tab-wrapper clearfix']/div/span[2]");
	By AssetsTab= By.xpath("//div[@class='tab-wrapper clearfix']/div/span[3]");
	By LoadMoreButton=By.xpath("//button[@class='btn load-more-link order-load-more']");
	By Expand1=By.xpath("(//a[@class='btn-expand-content'])[1]");
	
	
	
	public WebElement getCreateOrder_Disbl()
	{
		return driver.findElement(CreateOrder_Disbl);
	}
	
	public WebElement getExpand1()
	{
		return driver.findElement(Expand1);
	}
	
	public WebElement getEditQuotedsbl()
	{
		return driver.findElement(EditQuotedsbl);
	}
	
	public WebElement getDelQuotedsbl()
	{
		return driver.findElement(DelQuotedsbl);
	}
	
	public WebElement getOrdersTab()
	{
		return driver.findElement(OrdersTab);
	}
	
	public WebElement getQuotesTab()
	{
		return driver.findElement(QuotesTab);
	}
	
	public WebElement getAssetsTab()
	{
		return driver.findElement(AssetsTab);
	}
	
	public WebElement getLoadMoreButton()
	{
		return driver.findElement(LoadMoreButton);
	}
}
