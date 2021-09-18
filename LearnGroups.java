package week6day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;


public class LearnGroups {
	
	@Test(groups= {"functional","smoke"})
	public void createLead() {
		System.out.println("createlead");
		throw new NoSuchElementException();
		
	}

	@Test(groups= "functional")
	public void editLead() {
		System.out.println("editlead");
	}

	@Test(groups= "regrssion",dependsOnGroups="smoke",alwaysRun=true)
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}


