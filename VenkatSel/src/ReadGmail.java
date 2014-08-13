import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadGmail { 
static String email="secretescapes2014"; 
static String passwd="Venkat1234"; 
static String subjectName="Naukri.com Jobs";

public static void main(String[] args) 
{ 
WebDriver driver=new FirefoxDriver(); 
driver.get("https://mail.yahoo.com"); 
driver.findElement(By.id("username")).clear(); 
driver.findElement(By.id("username")).sendKeys(email); 
System.out.println("Email"); 
driver.findElement(By.id("passwd")).clear(); 
driver.findElement(By.id("passwd")).sendKeys(passwd); 
System.out.println("Passwd"); 
driver.findElement(By.id(".save")).click(); 
//System.out.println("signIn"); 
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
/*
 List<WebElement> li = driver.findElements(By.name(subjectName)); 
System.out.println("webElement Text are as follows:"); 
for (WebElement webElement : li) 
{

System.out.println("Text:"+webElement.getText()); 
} 
System.out.println("Size are:"+li.size()); 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

// For SingOut Purpose 
driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click(); 
driver.findElement(By.linkText("Sign out")).click(); 
System.out.println("SignOut from Gmail"); 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

 */


} 
}