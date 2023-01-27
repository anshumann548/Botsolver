package omniengage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Botsolver extends livebot{
	@Test(priority=2)
	public void botsolver () throws AWTException, InterruptedException

	
	{
		
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/button")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[3]/div[2]/div/div")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[5]/div[2]/div/div")).click();
		Thread.sleep(2000);
		this.driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/div[7]/div[2]/div/div")).click();
	
	}
}