package CoinDiary;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class CreatePost {
	
	public static AndroidDriver driver;


	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
        DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
     	capabilities.setCapability("platformVersion", "14");
 		capabilities.setCapability("appPackage", "com.coindiary");
	    capabilities.setCapability("appActivity", "com.coindiary.MainActivity");
	    
        driver =new AndroidDriver(new URL("http://192.168.1.196:4723/wd/hub/"),capabilities);
        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@class='android.widget.EditText']")).sendKeys("ssuganyadev11@gmail.com");
	    driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText\n"
	    		+ "")).sendKeys("dare2login");
	    
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Remember me\"]/android.view.ViewGroup")).click();
	    
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"][1]")).click();
	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.ImageView)[1]"))).click();
//	    
//	    
	    // Create Post
	    driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Public\"]")).click();
	    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Send\"]/android.view.View")).click();
	    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"\"]")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"What are you thinking?\"]")).sendKeys("Hi CoinDiary");
	    driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]")).click();
	    driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[3]")).click();
	    driver.findElement(By.id("com.google.android.providers.media.module:id/button_add")).click();
	    driver.findElement(By.id("//android.widget.TextView[@text=\"Send\"]")).click();	    
	    
	}
}
