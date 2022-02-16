package weeek2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafTapsApplication {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.partialLinkText("Create")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemapriya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sri");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select source=new Select(dropDown1);
source.selectByVisibleText("Employee");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/14/99");

WebElement dropDown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select industry=new Select(dropDown2);
industry.selectByIndex(2);
WebElement dropDown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select ownership=new Select(dropDown3);
ownership.selectByValue("OWN_SCORP");
WebElement dropDown4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select campaign=new Select(dropDown4);
campaign.selectByVisibleText("Automobile");
WebElement dropDown5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
Select currency=new Select(dropDown5);
currency.selectByValue("INR");

	}

}
