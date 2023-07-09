package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DigitalPulseSubscribe {
	WebDriver driver;
	public DigitalPulseSubscribe(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//Click subcription button	
	By Clk_subscribe = By.xpath("(//a[@class='levelOneLink '][normalize-space()='Subscribe'])[1]");
	public void clickSubscribe() {
		driver.findElement(Clk_subscribe).click();
	}
//Click magnify glass
	
	By clk_Magnify = By.xpath("(//button[normalize-space()='Search'])[1]");
	
	public void magnify() {
		driver.findElement(clk_Magnify).click();
	}
	
	
	
	
	
	//Action methods
	
	//verify the title of the page
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	
}
