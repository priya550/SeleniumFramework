package ui.pages.actions;

import org.openqa.selenium.WebDriver;

import ui.pages.repo.HomePageRepo;

public class HomePageActions extends HomePageRepo {

WebDriver driver;
	
	public void searchCategory(){
		searchText.sendKeys("Toys");
		searchBtn.click();
	}

}
