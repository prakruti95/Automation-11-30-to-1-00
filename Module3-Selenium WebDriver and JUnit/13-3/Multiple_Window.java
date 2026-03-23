import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Multiple_Window 
{
	public static void main(String[] args) 
	{
		WebDriver driver = MyConnection.connect("http://demo.guru99.com/popup.php");
		
		String mainWin = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allwins =  driver.getWindowHandles();
		for(String win : allwins)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			} 
		}
		
		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
	}
}
