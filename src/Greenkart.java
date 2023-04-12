import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String[] iteamsNeeded = { "Cucumber", "Brocolli", "Beans", "Potato" };
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Udemy_Selenium\\\\Drivers\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriverWait w = new WebDriverWait(driver, 5);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		iteamAddes(driver, iteamsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']//button")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}

	public static void iteamAddes(WebDriver driver, String[] iteamsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			// Format it to get actual vegetable name
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim(); // brocoli

			// Convert array into array list for easy search
			List<String> iteamsNeededlist = Arrays.asList(iteamsNeeded);

			// check whether name you extracted is present in arrayList or not

			if (iteamsNeededlist.contains(formattedName)) {
				// click on ADD TO CART button
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// System.out.println(driver.findElements(By.xpath("//h4[@class='product-name']")).get(i).getText());
				if (j == iteamsNeeded.length) {
					break;
				}

			}
		}
	}

}
