package fitpeorunner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//fitpeofeature//fitpeo.feature",
glue = "fitpeosteps",
plugin = {
		"html:Reports/Html_Report",
		 "pretty",
		 "json:Reports/Json_Report.json",
		 "com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_report.html"
} )

public class runnerfitpeo {
	
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();
		
		driver.get("https://fitpeo.com/");
		
		
		driver.manage().window().maximize();
		
	
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
//	
//	@AfterClass
//	public static void teardown() {
//		
//		driver.close();

	}
	


