package Marma;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Example {
	
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
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	        // Login
	        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your Email']")).sendKeys("suganyadevi@throughbit.com");
	        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your Password']")).sendKeys("kjFOhVmgG]j2ry1udLfqI");
	        driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();

	        // Navigate to Settings
	        driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	        driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']")).click();

	        // Replace with your actual XPath for the name field
	        By nameFieldLocator = By.xpath("//android.widget.EditText[@text='Suganya']");

	        // Wait for the name field to be present

	        FluentWait<AndroidDriver> wait = new AppiumFluentWait<>(driver)
	                .withTimeout(java.time.Duration.ofSeconds(10))
	                .pollingEvery(java.time.Duration.ofMillis(500));
	        

	        wait.until(ExpectedConditions.presenceOfElementLocated(nameFieldLocator));

	        // Find the name field and input new text
	        String newText = "Suganyadevi";
	        driver.findElement(nameFieldLocator).clear();  // Clear existing text
	        driver.findElement(nameFieldLocator).sendKeys(newText);

	        // Get the length of the entered text
	        int textLength = driver.findElement(nameFieldLocator).getText().length();

	        // Use the backspace key to clear the text
	        for (int i = 0; i < textLength; i++) {
	            driver.pressKey(new KeyEvent(AndroidKey.DEL));
	        }

	        // Verify that the name field is now empty
	        String clearedText = driver.findElement(nameFieldLocator).getText();
	        System.out.println("Cleared Text: " + clearedText);

	        // Navigate to the password field (assuming it's 4th in the list)
	        // Adjust this step based on your actual structure
	        for (int i = 0; i < 3; i++) {
	            driver.navigate().forward();
	        }

	        // Replace with your actual XPath for the password field
	        By passwordFieldLocator = By.xpath("//android.widget.EditText[@text='Enter your Password']");

	        // Enter password "suganya"
	        String password = "suganya";
	        driver.findElement(passwordFieldLocator).sendKeys(password);

	        // Verify that the password field is updated
	        String enteredPassword = driver.findElement(passwordFieldLocator).getText();
	        System.out.println("Entered Password: " + enteredPassword);

	        // Close the app or perform further actions as needed
	        // driver.quit();
	    }
	}


