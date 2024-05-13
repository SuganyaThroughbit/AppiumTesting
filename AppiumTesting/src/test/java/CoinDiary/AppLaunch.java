package CoinDiary;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AppLaunch {
	
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
	    
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Create Account\"]")).click();
	    
	    
	    
	
	}

		
	}

