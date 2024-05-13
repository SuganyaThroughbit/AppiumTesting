package CoinDiary;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class CreateAccountwithPhNo {
	
	private static final String MobileCapabilityType = null;
	public static AndroidDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "pnkz45s4pzjbj7lv");
    	//capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
     	capabilities.setCapability("platformVersion", "13");
 		capabilities.setCapability("appPackage", "com.coindiary");
	    capabilities.setCapability("appActivity", "com.coindiary.MainActivity");
	    
	    
	
		driver =new AndroidDriver(new URL("http://192.168.1.196:4723/wd/hub/"),capabilities);
		
	    driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
	    
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text=\"Create Account\"]")).click();
	    
		
		
		driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")).sendKeys("sugnaya");
		driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")).sendKeys("9360498858");
		driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")).sendKeys("dare2login");
		driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")).sendKeys("dare2login");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sign in\"]")).click();
		
		
		// driver.startActivity(new Activity("com.google.android.apps.messaging" , "com.google.android.apps.messaging.ui.ConversationListActivity"));
		
		// Start Messaging application
       Process process =  Runtime.getRuntime().exec("adb shell am start -n com.google.android.apps.messaging/com.google.android.apps.messaging.ui.ConversationListActivity");
       process.waitFor();
       
		 
		Thread.sleep(5000);
		
		//OTP
		
		
		
		
	

		
	

		

	}

}
