import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Udemy_Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// 1. Give me the count of links on a page ... Hint tagName = a
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. Only from Footer count number of link
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // limiting webDriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// 3. From footer count the link of first column
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> linkLocator = columnDriver.findElements(By.tagName("a"));

		System.out.println(linkLocator.size());

		// 4. click on each link on column and check if the pages are opening and print
		// the title of that opened link

		for (int i = 1; i < linkLocator.size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			linkLocator.get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);

		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
