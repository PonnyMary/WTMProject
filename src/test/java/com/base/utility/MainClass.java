package com.base.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {

	public static void main(String[] args) {
		launchChromeBrowser();
		loadUrl("https://www.facebook.com/");

	getTitle();
	getCUrl();
	
	WebElement user=driver.findElement(By.id("email"));
	fill(user,"rytesstij0@gmail.com");

	WebElement password=driver.findElement(By.id("pass"));
	fill(password,"123456");
	WebElement date=driver.findElement(By.id("day"));
			SBI(date,12);
			WebElement date2=driver.findElement(By.id("month"));
			SBV(date2,"10");
			WebElement date3=driver.findElement(By.id("year"));
			SBVT(date3,"1990");
	
			WebElement button=driver.findElement(By.id("loginbutton"));
btnClick(button);	
}

}
