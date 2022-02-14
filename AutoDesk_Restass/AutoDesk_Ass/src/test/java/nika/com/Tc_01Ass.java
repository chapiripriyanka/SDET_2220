package nika.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc_01Ass {
	@Test
	public void mainTest() {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("pune");
		 List<WebElement> Pune = driver.findElements(By.xpath("//span[text()='PUNE JN - PUNE']"));
		 for(int i=0;i<Pune.size();i++) {
				String From = Pune.get(i).getText();
				if(Pune.contains("Hyd")){
				Pune.get(i).click();
					break;
				}
		 }
			
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']")).sendKeys("Hyd");
		List<WebElement> hyd = driver.findElements(By.xpath("//span[text()='HYDERABAD DECAN - HYB']"));
		for(int i=0;i<hyd.size();i++) {
			String To = hyd.get(i).getText();
			if(hyd.contains("Hyd")){
				hyd.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c66-12']")).click();;
		driver.findElement(By.xpath("//li[@aria-label='TATKAL']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-11 pi pi-chevron-down']")).click();
		//driver.findElement(By.xpath("//li[@aria-label='First Class (FC)']")).click();
	
	}
}
