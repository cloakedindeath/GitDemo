package cloaktesting;

import org.testng.annotations.Test;

public class SeleniumTest {

	//testing xml file from maven
	//how to execute all test cases from Test folder - mvn test
	@Test
	public void browserAutomation() {
		System.out.println("Browser Automation");
	}
	
	@Test
	public void elementsUI() {
		System.out.println("Elements UI");
	}
}
