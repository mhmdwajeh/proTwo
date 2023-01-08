package xyzbank;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Xyz {

	public Xyz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
		
		Thread.sleep(1000);	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
	Thread.sleep(1000);	
				
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("mhmd");

	Thread.sleep(1000);	
	
	
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("hussen");
Thread.sleep(1000);	
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("45450");
Thread.sleep(1000);	

driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
Thread.sleep(1000);	
//driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);
driver.switchTo().alert().accept();
Thread.sleep(1000);	
driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
Thread.sleep(1000);	
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div/select")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[7]")).click();



driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();







	}

}
