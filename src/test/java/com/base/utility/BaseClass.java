package com.base.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	
	public static void launchChromeBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PonnyMaryTijo\\eclipse-workspace\\WTM\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		}
	public static void loadUrl(String url)
	{
		driver.get(url);
	}
	public static void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);

	}
	public static void getCUrl()

{
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void fill(WebElement e, String value)
	{
		e.sendKeys(value);
	}
	
	public static void SBI(WebElement e, Integer index)
	{
Select s= new Select(e);
s.selectByIndex(index);
}
	public static void SBV(WebElement e, String value)
	{
Select s= new Select(e);
s.selectByValue(value);
}
	public static void SBVT(WebElement e, String text)
	{
Select s= new Select(e);
s.selectByVisibleText(text);
}
	public static void btnClick(WebElement e)
	{
e.click();}
}
