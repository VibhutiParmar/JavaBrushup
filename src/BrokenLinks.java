import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Udemy_Selenium\\\\Drivers\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//broken URL
		//Step 1 - To get all URL tied up to  the link using Selenium
		//Step 2 - Java method will call URL and gets you the status code
		//step 3 - if status code > 400 then url is not working -> link which tied up to url is broken
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with text " +link.getText()+ " is broken with code " +respCode);
			/*
					if(respCode>400) {
				System.out.println("The link with text " +link.getText()+ " is broken with code " +respCode);
				Assert.assertTrue(false);
			}
			*/
		}
		a.assertAll();
		
	}

}
