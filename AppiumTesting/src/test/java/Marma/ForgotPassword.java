package Marma;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ForgotPassword {
	
	
	
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
		
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("deviceName", "emulator-5554");
			capabilities.setCapability("udid", "emulator-5554");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "14");
			capabilities.setCapability("appPackage", "com.marma");
			capabilities.setCapability("appActivity", "com.marma.MainActivity");
			
			
			
			driver =new AndroidDriver(new URL("http://192.168.1.196:4723/wd/hub/"),capabilities);
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Forgot password?\"]")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Email\"]")).sendKeys("suganyadevi@throughbit.com");
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Send\"]")).click();
			
			
			
			
			
		

		}
		
		

	}


