package step_def_Feature;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import PageObjects.DigitalPulseSubscribe;
import PageObjects.DigitalHomePage;

public class DigitalPulseHome extends BaseClass {
	
	/* Launching chrome browser and maximize screen with wait */
	@Given("I navigate to the PwC Digital Pulse website")
	public void i_navigate_to_the_pw_c_digital_pulse_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize screen
		driver.manage().window().maximize();
		// add implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		DPH = new DigitalHomePage(driver);
	}
	
	// Calling PwC digital pulse URL
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}
	
	// Expected page validation
	@When("I am viewing the Home page")
	public void i_am_viewing_the_home_page() {
		wait.until(ExpectedConditions.titleContains("Digital Pulse"));
		DPH = new DigitalHomePage(driver);
		Assert.assertEquals("Digital Pulse", DPH.getPageTitle());
	}
	
	//Home page articles validation
	@Then("I am presented with {int} columns of articles")
	public void i_am_presented_with_columns_of_articles(Integer int1) {
		DPH.LeftColumnArticle();
		DPH.middleColumnArticle();
		DPH.rightColumnArticle();
	}
	
	//Left colum articles validation
	@And("The left column is displaying {int} articles")
	public void the_left_column_is_displaying_articles(Integer int1) {
		DPH.LeftColumnArticle();
		DPH.LeftArtcle();
	}
	
	//Middile column srticles validation
	@And("The middle column is displaying {int} articles")
	public void the_middle_column_is_displaying_articles(Integer int1) {
		DPH.middleColumnArticle();
	}
	
	//Right column article validation
	@And("The right column is displaying {int} articles")
	public void the_right_column_is_displaying_articles(Integer int1) {
		DPH.rightColumnArticle();
		DPH.rightDigitalTRans();
		DPH.rightmetaverse();
		DPH.rightcloud();
	}
	
	
	//Scenatio-2 Digital pulse subscription validation
	
	//Click digital pulse subscription 
	@When("I click on the Subscribe navigation link")
	public void i_click_on_the_subscribe_navigation_link() throws InterruptedException {
		DPS = new DigitalPulseSubscribe(driver);
		Thread.sleep(3000);
		DPS.clickSubscribe();
	}
		
	//Landing subscription page validation
	@Then("I am taken to the Subscribe page")
	public void i_am_taken_to_the_subscribe_page() {
		DPS = new DigitalPulseSubscribe(driver);
		Assert.assertEquals("Subscribe to Digital Pulse",DPS.getPageTitle());
	}
	
	
	
	@Then("I am presented with the below fields")
	public void i_am_presented_with_the_below_fields() throws InterruptedException {
		log.debug("Enter first name");
		//Enter firstname
		driver.findElement(By.xpath("(//input[@id='firstName_1950035316_rightcol1'])[1]")).sendKeys("Smith");
		Thread.sleep(1000);
		//enter lastname
		driver.findElement(By.xpath("(//input[@id='lastName_2060796822_rightcol1'])[1]")).sendKeys("John");
		Thread.sleep(1000);
		//enter Organisation
		driver.findElement(By.xpath("(//input[@id='company_593863178_rightcol1'])[1]")).sendKeys("PwC");
		Thread.sleep(1000);
		//select industry
		WebElement n = driver.findElement(By.xpath("(//select[@id='industrydrop-down_394004703'])[1]"));
		Select sl = new Select(n);
		sl.selectByValue("Technology");
		
	//Select title of job
		WebElement m = driver.findElement(By.xpath("(//select[@id='jobtitledrop-down_1052213514'])[1]"));
		Select jb = new Select(m);
		jb.selectByValue("Director");
		Thread.sleep(1000);
		
	//Job title:
		driver.findElement(By.xpath("(//input[@id='job_title_other_1720121896_rightcol1'])[1]")).sendKeys("Automation tester");
		Thread.sleep(1000);
		
	//Business email id
		driver.findElement(By.xpath("(//input[@id='email_943727051_rightcol1'])[1]")).sendKeys("Farook@pwc.com");
		Thread.sleep(1000);
	
		//Select state
		WebElement state = driver.findElement(By.xpath("(//select[@id='statedrop-down_1046877367'])[1]"));
		Select st = new Select(state);
		st.selectByValue("SA");
		Thread.sleep(1000);
		
		//Countries or regions
		WebElement country = driver.findElement(By.xpath("(//select[@id='country_1021073128'])[1]"));
		Select ctr = new Select(country);
		ctr.selectByValue("Argentina");
		Thread.sleep(1000);
		
		//Areas of 
		driver.findElement(By.xpath("(//div[@class='control__indicator'])[1]")).click();
		Thread.sleep(1000);
		//Areas of Interest
		driver.findElement(By.xpath("(//input[@id='areas_of_interest_other_117107248_rightcol1'])[1]")).sendKeys("Utilize skills to support end user");
		Thread.sleep(1000);
	}
	
	//Magnifying glass
	
	@When("I click on the Magnifying glass icon to perform a search")
	public void i_click_on_the_magnifying_glass_icon_to_perform_a_search() throws InterruptedException {
		//click magnifying glass icon
		DPS = new DigitalPulseSubscribe(driver);
		Thread.sleep(3000);
		DPS.magnify();
		
	}
	//enter Single page applications
	@When("I enter the text {string}")
	public void i_enter_the_text(String string) {
		driver.findElement(By.xpath("(//input[@id='slimSearch'])[1]")).sendKeys(string);
	}
	
	//taken to the results page
	@Then("I am taken to the search results page")
	public void i_am_taken_to_the_search_results_page() {
		driver.findElement(By.xpath("(//button[normalize-space()='View All Results'])[1]")).click();
	}
	
	//presented atleat one result
	@Then("I am presented with at least {int} search result")
	public void i_am_presented_with_at_least_search_result(Integer int1) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[normalize-space()='Uncovered: Single page applications'])[1]")));
	}
	
	// close browser
	@And("close browser")
	public void close_the_browser() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}
}
