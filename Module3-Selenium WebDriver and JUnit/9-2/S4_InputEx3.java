import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S4_InputEx3 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\New\\New2\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Log in")).click();
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("loginusername")).sendKeys("prakruti");
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		//driver.close();
		//driver.quit();
		
	}
}
