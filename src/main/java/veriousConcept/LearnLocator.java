package veriousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator {
	
	WebDriver driver;
	@Before
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void locateElement() throws InterruptedException {
//		driver.findElement(By.name("firstname")).sendKeys("selenium");
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
		
//		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\soyuz\\Downloads\\Spanish project.png");
//		driver.findElement(By.cssSelector("input#tool-2")).click();
//		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("fun");
//		driver.findElement(By.cssSelector("input[id='exp-5']")).click();
//		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("a");
//		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
//		driver.findElement(By.xpath("//input[@type='checkbox' and @id='profession-0']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'API Documentations')]")).click();
		
	}
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
