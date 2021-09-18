package week6day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnDependency {
	
	
	// public static final String[] CreateLead = null;

	@Test
	public void createLead() {
		System.out.println("createlead");
		//throw new NoSuchElementException();
	}

	@Test(dependsOnMethods="createLead")
	public void editLead() {
		System.out.println("editlead");
	}

	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	}


