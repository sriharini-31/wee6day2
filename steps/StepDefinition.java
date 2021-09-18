package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  extends BaseClass {

	
	//public ChromeDriver driver;
		//@Given("Open the chrome Browser")
		//public void openBrowser() {
			//WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
			//driver.manage().window().maximize();
		//}
		//@Given("Load the Application Url {string}")
	     //public void loadApplication(String url) {
		//driver.get(url);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//}
		@Given("Enter the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
		@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Home page displayed");
		}
		else {
			System.out.println("Home page not displayed");
		}
	}

	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}
	@When("Click crmsfa link")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}



	}