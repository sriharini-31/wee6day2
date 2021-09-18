package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead  extends BaseClass {


	//String leadID;
	
		//Set<String> allWindows2 = driver.getWindowHandles();
		//List<String> allhandles2 = new ArrayList<String>(allWindows2);
		@Given("Click on Merge Lead")
		public void clickMergeLead() {
			driver.findElement(By.linkText("Merge Leads")).click();
		}
		@Given("Merge Records")
		public void mergeRecords() throws InterruptedException {
			driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			driver.switchTo().window(allhandles.get(1));
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Anu");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(1000);
			String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.switchTo().window(allhandles.get(0));
			
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			Set<String> allWindows2 = driver.getWindowHandles();
			List<String> allhandles2 = new ArrayList<String>(allWindows2);
			driver.switchTo().window(allhandles2.get(1));
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ram");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.switchTo().window(allhandles2.get(0));
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			driver.switchTo().alert().accept();
			
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			System.out.println("Lead ID: " + leadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			String text = driver.findElement(By.className("x-paging-info")).getText();
			if (text.equals("No records to display")) {
				System.out.println("No records to display");
			} else {
				System.out.println("Record exist");
			}
		}
		
		//@When("Click on Image1")
		//public void clickImage1() {
			//driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		//}
		
		//@Given("Move to Find Lead Window for From Lead")
		//public void moveToFindLeadWindowForFromLead() {
			//Set<String> allWindows = driver.getWindowHandles();
			//List<String> allhandles = new ArrayList<String>(allWindows);
			//driver.switchTo().window(allhandles.get(1));
		//}
		
		//@Given("Enter the First Name in Find Lead as {string}")
		//public void enterFirstNameInFindLead(String firstName) {
			//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		//}
		
		//@Given("Click on FindLead Button in Find Lead Window")
		//public void clickOnFindLeadButtonInFindLeadWindow() throws InterruptedException {
			//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			//Thread.sleep(1000);
		//}
		
		//@Given ("Get the Lead ID from Lead list")
		//public void getLeadID() throws InterruptedException {
			
			//leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		//}
		
		//@Given ("Click on the LeadID for From Lead")
		//public void clickLeadIDFromLead() {
			//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			//driver.switchTo().window(allhandles.get(0));
		//}
		
		//@When ("Click on Image2")
		//public void clickImage2() {
			//driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//}
		//@Then("Move to Find Lead Window for To Lead")
		//public void moveToFindLeadWindowForToLead() {
			
			//driver.switchTo().window(allhandles2.get(1));
		//}
		
		
		//@Given ("Click on the LeadID for To Lead")
		//public void clickLeadIDToLead() throws InterruptedException {
			//Thread.sleep(1000);
			//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			//driver.switchTo().window(allhandles2.get(0));
		//}
		
		
		//@Given ("Click on Merge")
		//public void clickMergeButton() {
			//driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//}
		
		//@Given ("Handle the Alert")
		//public void handleAlert() {
			//driver.switchTo().alert().accept();
		//}
		
	}