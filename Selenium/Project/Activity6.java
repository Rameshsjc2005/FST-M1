package ProjectActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity6 {
	public WebDriver driver;
  @Test
 public void verifyJobsPageTitle() throws InterruptedException {
	  System.out.println("TestNG TestCase6");
	  driver.findElement(By.id("menu-item-24")).click();
	  driver.findElement(By.id("search_keywords")).sendKeys("banking");
	  driver.findElement(By.xpath("//input[contains(@value,'Search Jobs')]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.className("load_more_jobs")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.className("load_more_jobs")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='post-7']/div/div/ul/li[22]/a")).click();
	  driver.findElement(By.xpath("//*[@id='main']/nav/div/div/a")).click();
	  driver.findElement(By.xpath("//input[contains(@class,'application_button button')]")).click();
	  String email = driver.findElement(By.className("job_application_email")).getText();
	  System.out.println("Job Application Email :"+ email);
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
