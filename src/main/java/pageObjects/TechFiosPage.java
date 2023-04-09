package pageObjects;




import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class TechFiosPage extends TestBase
{

	
	public TechFiosPage()
	{
		PageFactory.initElements(driver , this);
		
	}
	
	@FindBy(xpath="//button[contains(text(),'Set SkyBlue Background')]")
	WebElement skybluebutton;
	
	@FindBy(xpath="//button[contains(text(),'Set White Background')]")
	WebElement whitebutton;
	
	@FindBy(xpath="//*[contains(@style,'background-color')]")
	WebElement backgroundcolorelement;
	
	public void clickOnSkyBlueBackgroundBtn() 
	{
		skybluebutton.click();
	}
	

	public void clickOnWhiteBackgroundBtn() {
		whitebutton.click();
	}
	
	public String getBackgroundColor() 
	{
		 String buttonColor = backgroundcolorelement.getCssValue("background-color");
		 return buttonColor;
	}
	
}


