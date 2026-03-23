import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableEx 
{
	public static void main(String[] args) 
	{
		WebDriver driver = MyConnection.connect("https://demoqa.com/webtables");
		String name = "Cierra";
		try
		{
			WebElement a = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[3]/td[1]"));
			System.out.println(a.getText().toString());
			String b = a.getText().toString();
			
			if(name.equals(b))
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Not Found");
			}
			
			
//			WebElement text = driver.findElement(By.xpath("//*[text()='"+name+"']"));
//			if(text.isDisplayed())
//			{
//				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
//			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Not found");
		}
	}
}
