package Marma;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Settings {

	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "emulator-5554");
    	capabilities.setCapability("udid", "emulator-5554");
     	capabilities.setCapability("platformVersion", "14");
 		capabilities.setCapability("appPackage", "com.marma");
	    capabilities.setCapability("appActivity", "com.marma.MainActivity");
	
	
		
		driver =new AndroidDriver(new URL("http://192.168.1.196:4723/wd/hub/"),capabilities);
		
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Email\"]")).sendKeys("suganyadevi@throughbit.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter your Password\"]")).sendKeys("suganyadevi");
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]")).click();
		
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Settings\"]")).click();
		
		// Replace with your actual XPath
         String nameFieldXPath = "//android.widget.EditText[@text=\"suganya devi\"]";
         
         
         
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement nameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(nameFieldXPath)));
        
         
         nameField.clear();
         nameField.sendKeys("suganya");
        
         
//      // Navigate to the password field (assuming it's the 5th in the list)
//         driver.navigate().forward();
//         
//         
//      // Enter password "suganya"
//         String password = "123";
//         String passwordFieldXpath = "//android.widget.EditText[@text=\"Enter your Password\"]";
//         driver.findElement(By.xpath(passwordFieldXpath)).sendKeys(password);
//         
//         
//      // Verify that the password field is updated
//         String enteredPassword = driver.findElement(By.xpath(passwordFieldXpath)).getText();
//         System.out.println("Entered Password: " + enteredPassword);
         
         WebElement framLayout = driver.findElement(By.id("com.marma:id/action_bar_root"));
         
         List<WebElement> actionBarTabs = framLayout.findElements(By.className("android.widget.EditText"));
          
         actionBarTabs.get(3).sendKeys("1234");
         
         
         driver.findElement(By.xpath("//android.widget.TextView[@text=\"Save\"]")).click();
         


       
	}

}
