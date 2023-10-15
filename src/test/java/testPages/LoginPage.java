package testPages;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		driver.findElement(By.name("HR")).click();
		driver.findElement(By.name("Address")).sendKeys("453 pointer ln");
		driver.findElement(By.name("city")).sendKeys("Atlanta");
		driver.findElement(By.id("pincode")).sendKeys("675456");
		driver.findElement(By.name("StreetAddress")).sendKeys("test");
		driver.findElement(By.id("EmployeeInformation")).click();
		driver.findElement(By.id("EmployeeHolidays")).click();
		
		

	}

}
