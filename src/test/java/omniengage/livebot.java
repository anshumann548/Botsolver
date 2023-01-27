package omniengage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class livebot extends Nodes{

	WebDriver driver;
	WebDriverWait wait;
	
@Test(priority=1)
public void livebotopener () throws AWTException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "/home/anshumann/Downloads/chromedriver");
	 driver = new ChromeDriver();
    this.driver.navigate().to("https://live.outgrow.chat/anshumann.singh-421");
		Thread.sleep(4000);
	
    }
}
