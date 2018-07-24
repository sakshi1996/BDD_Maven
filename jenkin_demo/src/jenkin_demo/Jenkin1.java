package jenkin_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkin1 {
	
	@Test
	public void test123() {
	
  
  WebDriver ffdriver =new FirefoxDriver();
	ffdriver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	ffdriver.manage().window().maximize();
	ffdriver.findElement(By.xpath("//*[@id='txtUsername'and @name='txtUsername']")).sendKeys("Admin");
	ffdriver.findElement(By.xpath("//*[@id='txtPassword'and @name='txtPassword']")).sendKeys("admin123");
	ffdriver.findElement(By.xpath("//*[@id='btnLogin'and @name='Submit']")).click();
	String title=ffdriver.getTitle();
	System.out.println(title);
  
	}
	


}
