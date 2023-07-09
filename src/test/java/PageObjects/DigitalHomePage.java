package PageObjects;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;

public class DigitalHomePage {
	WebDriver driver;
	public DigitalHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// PwC digital Pulse presented with 3 columns of articles
	By LeftArtIntelligence = By.xpath("(//span[@class='hlColor'][normalize-space()='artificial intelligence'])[1]");
	By Getting_transport = By.xpath(
			"(//span[contains(@class,'ng-binding')][contains(text(),'Getting transport projects ready for day 1 and bey')])[1]");
	By MiddleDataTransformation = By
			.xpath("(//span[contains(@class,'hlColor')][normalize-space()='digital transformation'])[1]");
	By RightCyberSecurity = By.xpath("(//span[@class='hlColor'][normalize-space()='cyber security'])[1]");
	By DigitalTRans = By.xpath("(//span[@class='hlColor'][normalize-space()='digital transformation'])[2]");
	By metaverse = By.xpath("(//span[normalize-space()='metaverse'])[1]");
	By cloud = By.xpath("(//span[normalize-space()='cloud'])[1]");
	
	public void LeftColumnArticle() {
		driver.findElement(LeftArtIntelligence).isDisplayed();
	}
	// driver.findElement(Getting_transport).isDisplayed();
	public void middleColumnArticle() {
		driver.findElement(MiddleDataTransformation).isDisplayed();
	}
	public void rightColumnArticle() {
		driver.findElement(RightCyberSecurity).isDisplayed();
	}
	public void LeftArtcle() {
		driver.findElement(Getting_transport).isDisplayed();
	}
	public void rightDigitalTRans() {
		driver.findElement(DigitalTRans).isDisplayed();
	}
	public void rightmetaverse() {
		driver.findElement(metaverse).isDisplayed();
	}
	public void rightcloud() {
		driver.findElement(cloud).isDisplayed();
	}

	
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public boolean isElementPresent(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
