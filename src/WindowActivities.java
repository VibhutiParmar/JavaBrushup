import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Udemy_Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); //in get() selenium wait untill page will fully loaded
		driver.navigate().to("http://rahulshettyacademy.com"); //to() selenium will not  wait
		driver.navigate().back();
		Thread.sleep(200);
		driver.navigate().forward();

	}

}
