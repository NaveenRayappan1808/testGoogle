package SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGoogle {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
        
//username 
		 WebElement username= driver.findElement(By.name("username"));
		 username.sendKeys("Admin");
//password
		 WebElement password= driver.findElement(By.name("password"));
		 username.sendKeys("admin123");
//submit
		 WebElement submit1= driver.findElement(By.xpath("//*[@type='submit']"));
		 System.out.println("Successfully you will click this button i know");
		 submit1.click();
		 
		 

		
	}

}
