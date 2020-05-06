package test.web.homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ui.pages.actions.HomePageActions;
//import ui.pages.repo.HomePageRepo;

public class SearchCatagoryTest {

public WebDriver driver;
	
	@BeforeTest
	public void openBro() {
		// Chrome Browser Launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Priyanga\\Drivers19\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser has launched Successfully");
		Reporter.log("Browser has launched Successfully");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
	}
	
	/*
	@Test
	public void searchText() {
		HomePageActions hpa = PageFactory.initElements(driver, HomePageActions.class);
		hpa.searchCategory();
		System.out.println(driver.getTitle());
	}
	*/
	@Test
	public void searchText()
	{
	
		String HomePageTitle = driver.getTitle();
		System.out.println("Home Page Tile : "+HomePageTitle);
	}
	
	@AfterTest
	public void exitBro() {
		// quit will close all your windows
		driver.quit();
		System.out.println("Browser has closed successfully");
		Reporter.log("Browser has closed successfully");
	}

}
