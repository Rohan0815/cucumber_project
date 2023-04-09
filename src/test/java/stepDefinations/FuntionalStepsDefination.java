package stepDefinations;



import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import base.TestBase;
import io.cucumber.java.en.*;
import pageObjects.TechFiosPage;


public class FuntionalStepsDefination extends TestBase
{	
	
	int x=0;
	TechFiosPage techfiosobject = new TechFiosPage();

	@Then("The background color will change to sky blue")
	public void background_color_will_change_to_skyblue()  
	{
		String bckgrndcolorskyblue =  driver.findElement(By.xpath("//*[contains(@style,'background-color')]")).getCssValue("background-color");
		
		System.out.println("The background color will change to : " + bckgrndcolorskyblue);
	}
	
	@Then("The background color will change to white")
	public void background_color_will_change_to_white()  
	{
		String bckgrndcolorwhite = techfiosobject.getBackgroundColor();
		System.out.println("The background color will change to : " + bckgrndcolorwhite);
	}

	@When("I click on the button")
	public void click_on_buttonk() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 //Thread.sleep(500);
		if (x==1) 
		{
			// click on skyblue background button
			 driver.findElement(By.xpath("//button[contains(text(),'Set SkyBlue Background')]")).click();
			//techfiosobject.clickOnSkyBlueBackgroundBtn();
			System.out.println("click on skyblue button");
		} else {
			// click on white background button
			techfiosobject.clickOnWhiteBackgroundBtn();
			System.out.println("click on white button");
		}
		
	}

	@Given("{string} button exists")
	public void backgroundButtonExists(String colorName) 
	{
		if (colorName.equalsIgnoreCase("Set SkyBlue Background")) {x=1;} else { x=0;}
		
		boolean isbuttondisplay = driver.findElement(By.xpath("//button[contains(text(),'"+colorName+"')]")).isDisplayed();
		System.out.println("is button display : " + " : " + colorName + " : " + isbuttondisplay);
		assertTrue(isbuttondisplay);
	}
	
	@Given("I nevigate to techfios link")
	public void openTechfioslink() 
	{
		openBrowser();
		
	}
	
}
