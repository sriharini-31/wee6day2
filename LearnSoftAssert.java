package week6day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSoftAssert {
	
	@Test
	public void Login() {
		SoftAssert softAssert = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String expTitle="Leaftaps - TestLeaf Automation Platform";
		String expTitle="TestLeaf Automation Platform";
		String actTitle=driver.getTitle();
		System.out.println("Actual title: "+actTitle);
		System.out.println("Expected title: "+expTitle);
		softAssert.assertEquals(expTitle, actTitle);
		
		
		
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//boolean displayed=driver.findElement(By.id("logout")).isDisplayed();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	
	driver.findElement(By.linkText("Leads")).click();
	
	softAssert.assertAll();
	}


}
