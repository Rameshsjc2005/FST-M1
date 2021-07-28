package ProjectActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	public WebDriver driver;
  @Test
  public void verifyJobBoardPageTitle() {
	  System.out.println("TestNG TestCase1");
	  String title = driver.getTitle();
	  assertEquals(title,"Alchemy Jobs – Job Board Application");
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
