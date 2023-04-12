import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Udemy_Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String labelName = driver.findElement(By.xpath("//fieldset//label[@for='benz']")).getText();
		
		WebElement options=driver.findElement(By.id("dropdown-class-example"));
		Select option = new Select(options);
		option.selectByVisibleText(labelName);
		
		driver.findElement(By.id("name")).sendKeys(labelName);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		if(alertText.contains(labelName)) {
			driver.switchTo().alert().accept();
		}
		
	}

}
