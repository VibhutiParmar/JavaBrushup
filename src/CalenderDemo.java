import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Udemy_Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();

		for (int l = 0; l < 12; l++) {

			String month = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
			System.out.println(month);

				if (month.equalsIgnoreCase("August")) {
					// Grab the common attribute --> Put into List --> Iterate
					List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
					for (int i = 0; i < dates.size(); i++) {
						String datesText = driver.findElements(By.className("flatpickr-day")).get(i).getText();
						if (datesText.equalsIgnoreCase("15")) {
							driver.findElements(By.className("flatpickr-day")).get(i).click();
							break;
						}
					}
					break;
				}
				driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
				Thread.sleep(1000);
			}

		}

	}


