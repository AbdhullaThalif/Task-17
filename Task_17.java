package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Task_17 {

	
	public static void main(String[] args) throws InterruptedException {
				
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.snapdeal.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				WebElement clickable =driver.findElement(By.xpath("//div[@class='accountInner']"));
				new Actions(driver)
	            .clickAndHold(clickable)
	            .perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
				Thread.sleep(3000);
				driver.switchTo().frame("loginIframe");
				driver.findElement(By.xpath("/html/body/div/div/div/div[6]/form/div/input")).sendKeys("testemailgv2000@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"checkUser\"]")).click();
				//driver.findElement(By.xpath("(//input[class='hidden ghost-input']")).sendKeys("testemailgv2000@gmail");
				//driver.findElement(By.xpath("//*[@id=\"j_number\"]")).sendKeys("6382965919");
			    //driver.findElement(By.xpath("//*[@id=\"j_name\"]")).sendKeys("ABD");
				//driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Abdsnapdeal@786");
				//driver.findElement(By.xpath("//*[@id=\"userSignup\"]")).click();
				//driver.findElement(By.xpath("//*[@id=\"registerUser\"]")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//*[@id=\"loginUsingOtp\"]")).click();
				String x = driver.getTitle();
				System.out.println(x);
				if(x.equalsIgnoreCase("Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items"))
				{
					System.out.println("Logged in Successfully");
				} else {
					System.out.println("Logged in Failure");
				}
				driver.close();
				
	
	}
}
