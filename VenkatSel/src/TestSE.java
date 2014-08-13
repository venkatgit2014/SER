//to find out list of near matches when a user searches a word in google

	import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;


	class TestSE {
				    public static void main(String[] args) throws Exception {
		        // The Firefox driver supports javascript 
		        WebDriver driver = new FirefoxDriver();
		        
		        // Go to the Google Suggest home page
		        driver.get("https://www.secretescapes.com/current-sales");
		        driver.findElement(By.xpath("//section[@id='saleListContainer']/div[7]/a/div[2]/p[2]")).click();
		        driver.findElement(By.cssSelector("div.rate")).click();
		        Thread.sleep(10000);
		        driver.findElement(By.id("bookButton")).click();
		      
		        
		        driver.quit();
		    }
		}	

