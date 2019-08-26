package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddDetails {
	public static WebDriver driver;
	@Given("User launch the Browser")
	public void user_launch_the_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\cucumber\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
	   
	}

	@And("Use click the Add customer button")
	public void use_click_the_Add_customer_button() {

		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User provide the details in details form {string},{string},{string},{string},{string}")
	public void user_provide_the_details_in_details_form(String fname, String lname, String email, String Address, String Mob) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(Address);
		driver.findElement(By.id("telephoneno")).sendKeys(Mob);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("User verify the customer id")
	
		public void to_verify_the_customer_id_is_Displayed() {
			Assert.assertTrue((driver.findElement(By.xpath("//td[@align='center']")).isDisplayed()));
	}



}

	