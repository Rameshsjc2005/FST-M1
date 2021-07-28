package ProjectActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity7 {
	public WebDriver driver;
  @Test
  public void verifyJobBoardPageHeading() throws InterruptedException {
	  System.out.println("TestNG TestCase7");
	  driver.findElement(By.xpath("//*[@id='menu-item-26']/a")).click();
	  driver.findElement(By.id("create_account_email")).sendKeys("test3@mail.com");
	  String jobtitle = "SOAPUI Web Tester";
	  driver.findElement(By.id("job_title")).sendKeys(jobtitle);
	  driver.findElement(By.id("job_location")).sendKeys("England");
	  driver.findElement(By.id("job_type")).sendKeys("Full Time");
	  //driver.switchTo().frame(0);
	  driver.findElement(By.id("job_description_ifr")).sendKeys("Tester");
	 // driver.switchTo().defaultContent();
	  driver.findElement(By.id("application")).sendKeys("tester3@mail.com");
	  driver.findElement(By.id("company_name")).sendKeys("Tester and Co");
	  driver.findElement(By.name("submit_job")).click();
	  driver.findElement(By.id("job_preview_submit_button")).click();
	  driver.findElement(By.id("menu-item-24")).click();
	  driver.findElement(By.id("search_keywords")).sendKeys(jobtitle);
	  driver.findElement(By.xpath("//input[contains(@value,'Search Jobs')]")).click();
	  Thread.sleep(1000);
	  //driver.findElement(By.className("load_more_jobs")).click();
	 // Thread.sleep(1000);
	 // driver.findElement(By.className("load_more_jobs")).click();
	 // Thread.sleep(1000);
	  driver.findElement(By.xpath("//h3[contains(text(),'" + jobtitle + "')]")).click();
	  driver.findElement(By.xpath("//*[@id='main']/nav/div/div/a")).click();
//	  driver.findElement(By.xpath("//input[contains(@class,'application_button button')]")).click();
//	  String email = driver.findElement(By.className("job_application_email")).getText();
//	  System.out.println("Job Application Email :"+ email);
	  
	 // String title = driver.findElement(By.xpath("//*[@id='menu-item-26']/a").click();
	 // assertEquals(title,"Welcome to Alchemy Jobs");
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
