package step_def_Feature;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//Farook//eclipse-workspace//WebDriverTwo//DigitalPulse//src//test//java//Feature//DigitalPulseHome.feature", 
			glue = "step_def_Feature", 
			plugin = {"pretty", "html:target/report.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml" }, 
			dryRun = false, // mapping between feature and stepdefination is proper or not
			monochrome = true // display the console output in a proper readable format
)
public class TestRunner {
	
}
