package week6day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
	@Test
	public void Login() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expTitle="Leaftaps - TestLeaf Automation Platform";
		//String expTitle="TestLeaf Automation Platform";
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		
		//if(expTitle.equals(actTitle)) {
			//System.out.println("Title Matching");
		//}
		//else {
			//System.out.println("Title not  Matching");
		//}
		//Assert.assertEquals(actTitle, expTitle);
		
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	boolean displayed=driver.findElement(By.id("logout")).isDisplayed();
	driver.findElement(By.linkText("CRM/SFA")).click();
	//Assert.assertTrue(displayed);
	Assert.assertFalse(displayed);
	
	driver.findElement(By.linkText("Leads")).click();
	
		
	}
}


