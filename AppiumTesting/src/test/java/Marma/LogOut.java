package Marma;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LogOut {
	
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "emulator-5554");
    	capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
     	capabilities.setCapability("platformVersion", "14");
 		capabilities.setCapability("appPackage", "com.marma");
	    capabilities.setCapability("appActivity", "com.marma.MainActivity");
	
	
		
		driver =new AndroidDriver(new URL("http://192.168.1.196:4723/wd/hub/"),capabilities);
		
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Email\"]")).sendKeys("suganyadevi@throughbit.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Password\"]")).sendKeys("kjFOhVmgG]j2ry1udLfqI");
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]")).click();
		
		//click menu
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Logout\"]")).click();
		
		
		

	}

}
