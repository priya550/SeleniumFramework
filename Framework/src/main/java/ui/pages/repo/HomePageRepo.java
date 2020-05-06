package ui.pages.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageRepo {

	@FindBy(xpath="//input[@id='gh-ac']") 
	public WebElement searchText;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement searchBtn;


}
