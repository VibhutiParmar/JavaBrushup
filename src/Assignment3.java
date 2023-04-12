import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] phoneModels = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		System.setProperty("webdriver.chrome.driver",
				"D:\\Udemy_Selenium\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		WebDriverWait webWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		logIn(driver, webWait);

		iteamNeedToAdd(driver, phoneModels);

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

	public static void logIn(WebDriver driver, WebDriverWait webWait) {

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div//label[@class='customradio'][2]//span[2]")).click();
		webWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement staticDD = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select menu = new Select(staticDD);
		menu.selectByValue("consult");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		webWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='my-4']")));
	}

	public static void iteamNeedToAdd(WebDriver driver, String[] phoneModels) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText();

			List<String> iteamsNeededlist = Arrays.asList(phoneModels);

			if (iteamsNeededlist.contains(name)) {

				j++;
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

				if (j == phoneModels.length) {
					break;
				}

			}
		}
	}

}

/*
 * Rahul Shetty's code
 * 
 * import java.time.Duration;
 * import java.util.List;
 * import java.util.concurrent.TimeUnit;
 * import org.openqa.selenium.By;
 * import org.openqa.selenium.Keys;
 * import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; 
 * import org.openqa.selenium.chrome.ChromeDriver;
 * import org.openqa.selenium.support.ui.ExpectedConditions;
 * import org.openqa.selenium.support.ui.Select;
 * import org.openqa.selenium.support.ui.WebDriverWait;

 * public class Assignment2 {

 * public static void main(String[] args) throws InterruptedException {

 * System.setProperty("webdriver.chrome.driver",
 * "/Users/rahulshetty/Documents/chromedriver");

 * WebDriver driver=new ChromeDriver();

 * driver.get("https://rahulshettyacademy.com/loginpagePractise/");
 
 * driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
 * 
 * driver.findElement(By.id("password")).sendKeys("learning");
 * 
 * driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
 * 
 * //Thread.sleep(3000);
 * 
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
 * 
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
 * 
 * driver.findElement(By.id("okayBtn")).click();
 * 
 * WebElement options =
 * driver.findElement(By.xpath("//select[@class='form-control']"));
 * 
 * Select dropdown = new Select(options);
 * 
 * dropdown.selectByValue("consult");
 * 
 * driver.findElement(By.id("signInBtn")).click();

 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(
 * "Checkout")));
 * 
 * List <WebElement> products =
 * driver.findElements(By.cssSelector(".card-footer .btn-info"));
 * 
 * for(int i =0;i<products.size();i++)
 * 
 * {
 * 
 * products.get(i).click();
 * 
 * }
 * 
 * driver.findElement(By.partialLinkText("Checkout")).click();}

 * }
 
 * 
 * 
 */
