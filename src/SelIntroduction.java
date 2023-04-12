import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		
		// Invoking Browser
				// Chrome - ChromeDriver - Methods close(), get(), click()
				// Firefox - FireFoxDriver - Methods close(), get(), click()
				// Safari - SafariDriver - Method close(), get(), click()
				// WebDriver interface has all that methods close(), get(), click()

				/*
				 
				chromedriver.exe --> use to invoke Chrome Browser
				webdriver.chrome.driver --> Key Value of path
				WebDriver driver = new ChromeDriver(); // Class can access only WebDriver interface's method
				ChromeDriver driver = new ChromeDrive(); // Here Class can access their own methods as well as webdriver interface methods
				
				*/
				
				//To invoke chrome driver
				//System.setProperty("webdriver.chrome.driver", "D:/Udemy_Selenium/Drivers/chromedriver_win32/chromedriver.exe");
				 
				//Create an object of ChromeDriver Class
				//WebDriver driver = new ChromeDriver();
				
				/*
				//To invoke FireFox driver
				System.setProperty("webdriver.gecko.driver", "D:\\Udemy_Selenium\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				//Create an object of FireFoxDriver Class
				WebDriver driver = new FirefoxDriver();
				*/
		
		
				//To invoke Microsoft Edge browser
				System.setProperty("webdriver.edge.driver", "D:\\Udemy_Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
				//Create an object of FireFoxDriver Class
				WebDriver driver = new EdgeDriver();
				
				
				driver.get("https://rahulshettyacademy.com"); //to hit URL 
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close(); // Closes the original window only
				// driver.quit(); // close all associate windows
				}

}


