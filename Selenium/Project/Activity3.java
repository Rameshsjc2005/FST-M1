package ProjectActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity3 {
	public WebDriver driver;
  @Test
  public void verifyJobBoardPageHeadingImageURL() {
	  System.out.println("TestNG TestCase3");
	  String titleImage = driver.findElement(By.xpath("//*[@id='post-16']/header/div/img")).getAttribute("src");
	  //assertEquals(titleImage,"Welcome to Alchemy Jobs");
	  System.out.println("Page Title Image URL is :" + titleImage);
  }
  @BeforeMethod
  public void launchBrowser() {
	  System.out.println("TestNG Before Method");
	  driver = new FirefoxDriver();
      driver.get("https://alchemy.hguy.co/jobs/");
      System.out.println("After Selenium Driver object created");
  }

  @AfterMethod
  public void closeBrowser() throws InterruptedException {
	  System.out.println("TestNG Before Method");
	  Thread.sleep(3000);
      driver.close();
  }

}
