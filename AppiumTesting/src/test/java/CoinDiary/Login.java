package CoinDiary;

import java.net.MalformedURLException;
import org.testng.Assert;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class Login {
	
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
	    		+ "")).sendKeys("darelogin");
	    
 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Remember me\"]/android.view.ViewGroup")).click();
	    
	    
	    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.View")).click();
	    
	    
	    //incorrect password pop up message 
	  //incorrect password pop up message 
	    String ExpectedResult = "Incorrect Password";
	    String ActualResult = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Incorrect Password\"]")).getText();
	    Assert.assertEquals(ExpectedResult, ActualResult, "Text mismatch: Actual vs. Expected");
	    logMessage("Incorrect Password");
	   	    

	}


	private static void logMessage(String message) {
		// TODO Auto-generated method stub
		
		System.out.println(message);
		
		
	}

}
