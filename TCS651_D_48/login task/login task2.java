################################################################
############################ Task 2   ##########################
package selProj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Wdb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions(); 
		//options.addArguments("disable-infobars"); 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	//driver.manage().window().maximize();
	//driver.findElement(By.id("u_0_j")).sendKeys("***");
	driver.findElement(By.id("email")).sendKeys("*****4958");
	driver.findElement(By.id("pass")).sendKeys("*******");
	//driver.findElement(By.name("lastname")).sendKeys("***");
	//driver.findElement(By.id("u_0_o")).sendKeys("******");
	//driver.findElement(By.id("u_0_v")).sendKeys("*******");
		driver.findElement(By.id("u_0_2")).click();
		
	}

}