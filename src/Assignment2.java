import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Udemy_Selenium\\\\Drivers\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Vibhuti");
		driver.findElement(By.name("email")).sendKeys("vibhuti@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		WebElement GenderDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select(GenderDropDown);
		dropDown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("10-10-1990");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div//strong[contains(text(), 'Success!')]")).getText());
		//System.out.println(driver.findElement(By.xpath("//strong[contains(text(), 'Success!')]/following-sibling::text()[1]")).getText());
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		driver.quit();

	}

}
