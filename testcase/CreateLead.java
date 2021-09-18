package testcase;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test(dataProvider = "sendData")
public class CreateLead extends ParentClass {
	@BeforeTest
	public void setfile()
	{ 
		fileName="createLead";
	}
	@Test(priority = 1, invocationCount = 1, dataProvider="sendData")
	public void createLead(String compName,String fName,String lName,String ph) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
		
		
}
	//@DataProvider
	//public String[][] sendData() throws IOException {
		// TODO Auto-generated method stub
		//return ReadExcel.readData("CreateLead", "Sheet1");
	
		
		
	//}

}







