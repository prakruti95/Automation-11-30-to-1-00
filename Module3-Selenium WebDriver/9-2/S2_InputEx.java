import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S2_InputEx 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\New\\New2\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("mobile")).click();
		driver.findElement(By.id("mobile")).sendKeys("9909742674");
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("990974267");
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		//driver.close();
		//driver.quit();
		
	}
}
