package step_def_Feature;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjects.DigitalHomePage;
import PageObjects.DigitalPulseSubscribe;
import step_def_Feature.DigitalPulseHome;


public class BaseClass {
	public WebDriver driver;
	public DigitalHomePage DPH;
	public WebDriverWait wait;
	public DigitalPulseSubscribe DPS;
	public Logger log = Logger.getLogger(DigitalPulseHome.class);
}
