import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Udemy_Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//div[@class='left-align']//table"));
		int coloumn = ele.findElements(By.tagName("th")).size();
		System.out.println("No. of Coloumn:" + coloumn);

		int row = ele.findElements(By.tagName("tr")).size();
		System.out.println("No of Row:" + row);

		System.out.println(driver.findElement(By.xpath("//div[@class='left-align']//table//tr[3]//td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='left-align']//table//tr[3]//td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='left-align']//table//tr[3]//td[3]")).getText());

	}

}
