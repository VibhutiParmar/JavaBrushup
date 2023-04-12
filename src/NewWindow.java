import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Udemy_Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(2000);
		String courseName = driver.findElements(By.xpath("//*[contains(@href,'https://courses.rahulshettyacademy.com/p')]")).get(1)
				.getText();
		
		driver.switchTo().window(parentID);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		//To get dimension
		System.out.println("Height: " + name.getRect().getDimension().getHeight());
		System.out.println("Wigth: " + name.getRect().getDimension().getWidth());
		
		
	}

}
