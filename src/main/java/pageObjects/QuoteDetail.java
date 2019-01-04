package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuoteDetail {

	
	public WebDriver driver;

	public QuoteDetail(WebDriver driver ) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;

	}
	

	By EditQuote=By.xpath("(//a[@class='btn btn-primary disabled q-d-disabled tt-wrapper'])[1]");
	By DelQuote=By.xpath("(//a[@class='btn btn-primary disabled q-d-disabled tt-wrapper'])[4]");
	
	By CreateOrder_Dsbl=By.xpath("(//a[@class='btn btn-primary disabled q-d-disabled tt-wrapper'])[1]");
	
	By Deletedsbl=By.xpath("(//a[@class='btn btn-primary disabled q-d-disabled tt-wrapper'])[2]");
	
	By Row_Plus = By.xpath("(//a[@class='btn-expand-content' and text()='+'])[1]");
	
	public WebElement getRow_Plus()
	{
		return driver.findElement(Row_Plus);
	}
	
	public WebElement getCreateOrder_Dsbl()
	{
		return driver.findElement(CreateOrder_Dsbl);
	}
	
	
	public WebElement getDeletedsbl()
	{
		return driver.findElement(Deletedsbl);
	}
	
			
	public WebElement getDelQuote()
	{
		return driver.findElement(DelQuote);
	}
	
	public WebElement getEditQuote()
	{
		return driver.findElement(EditQuote);
	}
	
	
}


