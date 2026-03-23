import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dynamic_Table 
{
	public static void main(String[] args) {
		
		WebDriver driver = MyConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
		String text = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[17]/span/div[1]/div[5]/table/tbody/tr[1]/td[1]/span")).getText();
		System.out.println(text);
	}	
	
}
