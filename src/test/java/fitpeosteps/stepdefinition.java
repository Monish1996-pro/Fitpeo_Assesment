package fitpeosteps;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fitpeorunner.runnerfitpeo;


public class stepdefinition {
	
	public static WebDriver driver = runnerfitpeo.driver;
	
//-------------I am on the FitPeo Homepage----------------
	@Given("^I am on the FitPeo Homepage$")
	
	public void i_am_on_the_FitPeo_Homepage() throws Throwable {
		
		driver.get("https://fitpeo.com/");
	}
//-------------I navigate to the Revenue Calculator Page----------------
	@When("^I navigate to the Revenue Calculator Page$")
	
	public void i_navigate_to_the_Revenue_Calculator_Page() throws Throwable {
		
		WebElement revenuecalc = driver.findElement(By.xpath("//div[text()='Revenue Calculator']"));
		
		revenuecalc.click();
		
	}
//------------I scroll down to the Slider section-----------
	@When("^I scroll down to the Slider section$")
	
	public void i_scroll_down_to_the_Slider_section() throws Throwable {
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/h4"));
		  
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 js.executeScript("arguments[0].scrollIntoView();",element);
		
		}
//-------------I adjust the slider to set its value to 822----------
	@When("^I adjust the slider to set its value to (\\d+)$")
	
	  public void i_adjust_the_slider_to_set_its_value_to(int arg1) throws Throwable {
		
		 WebElement slider = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));
		 
         ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', 820);", slider);
         
         slider.sendKeys("820");

		
		
		
	}
//-----------------I update the text field to 560--------------------
	@When("^I update the text field to (\\d+)$")
	
	public void i_update_the_text_field_to(int arg1) throws Throwable {
		
		 WebElement textField = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")); // Adjust locator as needed
         textField.clear();
         textField.sendKeys("560");

		
	}
	
//------------I select the CPT codes CPT-99091, CPT-99453, CPT-99454, and CPT-99474---------------
	@When("^I select the CPT codes CPT-(\\d+), CPT-(\\d+), CPT-(\\d+), and CPT-(\\d+)$")
	
	public void i_select_the_CPT_codes_CPT_CPT_CPT_and_CPT(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	

		WebElement element = driver.findElement(By.xpath("//*[contains(@class,'css-1p19z09')]"));
		  
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 js.executeScript("arguments[0].scrollIntoView();",element);
			
		  WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		  WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		  WebElement checkbox3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		  WebElement checkbox4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));

		  checkbox1.click();
		  checkbox2.click();
		  checkbox3.click();
		  checkbox4.click();
		  
	}
	
//----------the_Total_Recurring_Reimbursement_should_show_the_value_$-------------------------
	@Then("^the Total Recurring Reimbursement should show the value \\$(\\d+),(\\d+)$")
	
	public void the_Total_Recurring_Reimbursement_should_show_the_value_$(int arg1, int arg2) throws Throwable {
		
		WebElement result = driver.findElement(By.xpath("//*[contains(@class,'css-1lnu3ao')]"));
		
		boolean displayed = result.isDisplayed();
		
		System.out.println(displayed);
	}



}
