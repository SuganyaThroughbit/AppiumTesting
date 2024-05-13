package Marma;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CreatAccount {
	
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		

		DesiredCapabilities capabilities = new DesiredCapabilities();
	
		capabilities.setCapability("deviceName", "emulator-5556");
    	capabilities.setCapability("udid", "emulator-5556");
		capabilities.setCapability("platformName", "Android");
     	capabilities.setCapability("platformVersion", "14");
 		capabilities.setCapability("appPackage", "com.marma");
	    capabilities.setCapability("appActivity", "com.marma.MainActivity");
	
	
		
		driver =new AndroidDriver(new URL("http://192.168.1.196:4723/wd/hub/"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		
		
	    
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Create Account\"]")).click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Name\"]")).sendKeys("Suganya");
	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Email\"]")).sendKeys("suganyadevi@throughbit.com");
	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Emp Id\"]")).sendKeys("0007");
	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Role\"]")).sendKeys("Software Test Engineer");
	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Password\"]")).sendKeys("dare2login");
	    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Create\"]/android.view.View")).click();
	    
	       
	    
	    

	}

}
