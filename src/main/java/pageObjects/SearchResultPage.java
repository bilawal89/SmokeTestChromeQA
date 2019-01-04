package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
	public WebDriver driver ;
	
	public SearchResultPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By CartBtn = By.xpath("//span[@alt='Shopping Cart']");
	By Product5Cart= By.xpath("(//a[@data-product-type='PRODUCT'])[3]");
	By Compare1 = By.xpath("(//div[@class='control__indicator'])[1]");
	By Compare2 = By.xpath("(//div[@class='control__indicator'])[2]");
	By CompareBtn=By.linkText("Compare");
	
	By Products = By.xpath("//div[@class='product-list-grid clearfix print-product-list grid']");
	By Product4Cart=By.xpath("//a[@id='add_to_cart_11273675']");
	By fav1Product = By.xpath("//*[@id='fav_btn_10886231']");
	By Favdialog = By.xpath("//*[@id='products-content']/div/div[2]/div/div/div[1]/h4");
	By Product1Name = By.xpath("//*[@id='product-name-10886231']");
	By Product1Cart = By.xpath("//*[@id='add_to_cart_10886231']");
	//*[@id='add_to_cart_10886231']
	//By Product2Cart = By.xpath("//*[@id='add_to_cart_9707434']");
	By Product2Cart = By.xpath("//a[@id='add_to_cart_9707434']");
	By CloseIcon = By.xpath("//*[@id='cart-dialog']/div[1]/div[1]/div/div/div/button");
	
	By CloseIcon1=By.xpath("(//button[@type='button' and @class='mfp-close'])[2]");

	By Product3Cart = By.xpath("//*[@id='add_to_cart_11224916']");
	By AddToCartCLose = By.xpath("//button[@class='mfp-close']");
	By favClose= By.xpath("//div[@class='modal-footer']//button[@class='btn btn-default' and text()='Close'][1]");
	By prod1name=By.xpath("//h2[@id='product-name-10886231']");
	
	By Add2Cart=By.xpath("(//a[@class='add_to_cart btn btn-primary'])[1]");
	
	By CreateQuoteBtn=By.xpath("//a[@class='btn secondary left' and text() ='Create Quote']");
	
	
	public WebElement getCartBtn()
	{
		return driver.findElement(CartBtn);
	}
	
	public WebElement getCloseIcon1()
	{
		return driver.findElement(CloseIcon1);
	}
	
	
	public WebElement getCreateQuoteBtn()
	{
		return driver.findElement(CreateQuoteBtn);
	}
	

	public WebElement getAdd2Cart()
	{
		return driver.findElement(Add2Cart);
	}
	
	public WebElement getCompare1()
	{
		return driver.findElement(Compare1);
	}
	
	public WebElement getCompare2()
	{
		return driver.findElement(Compare2);
	}
	
	public WebElement getCompareBtn()
	{
		return driver.findElement(CompareBtn);
	}
	
	public WebElement getProduct4Cart()
	{
		return driver.findElement(Product4Cart);
	}
	
	public WebElement getprod1name()
	{
		return driver.findElement(prod1name);
	}
	
	public WebElement getfavClose()
	{
		return driver.findElement(favClose);
	}
	public WebElement getCloseIcon()
	{
		return driver.findElement(CloseIcon);
	}
	
	public List<WebElement> getCloseIconCount()
	{
		return driver.findElements(CloseIcon);
	}
	
	public WebElement getAddToCartCLose()
	{
		return driver.findElement(AddToCartCLose);
	}
	
	public WebElement getProduct3Cart()
	{
		return driver.findElement(Product3Cart);
	}
	
	
	public WebElement getProduct1Cart()
	{
		return driver.findElement(Product1Cart);
	}
	
	public WebElement getProduct2Cart()
	{
		return driver.findElement(Product2Cart);
	}
	
	public WebElement getAllProducts()
	{
		return driver.findElement(Products);
	}
	public WebElement getFav1Product()
	{
		return driver.findElement(fav1Product);
	}
	public WebElement getFavdialog()
	{
		return driver.findElement(Favdialog);
	}
	public WebElement getProduct1Name()
	{
		return driver.findElement(prod1name);
	}
	
	public List<WebElement> getProduct1NameCount()
	{
		return driver.findElements(prod1name);
	}
	
	public WebElement getProduct5Cart()
	{
		return driver.findElement(Product5Cart);
	}
	
	public List<WebElement> getProduct5CartCount()
	{
		return driver.findElements(Product5Cart);
	}

}
