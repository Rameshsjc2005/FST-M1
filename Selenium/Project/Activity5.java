package ProjectActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity5 {
	public WebDriver driver;
  @Test
 public void verifyJobsPageTitle() {
	  System.out.println("TestNG TestCase5");
	  driver.findElement(By.id("menu-item-24")).click();
	  String title = driver.getTitle();
	  System.out.println("Page Title :"+ title);
	  assertEquals(title,"Jobs � Alchemy Jobs");
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