package CoinDiary;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;



public class SwipeFunctionality {
	
	static AndroidDriver driver;

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
	    
	    
	    // Replace the following with the actual element you want to swipe on
        By swipeElement = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.coindiary:id/action_bar_root\"]");

        // Swipe from left to right twice
        swipeLeftToRight(swipeElement);
        swipeLeftToRight(swipeElement);
    }

	public static void swipeLeftToRight(By element) {
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        int startX = (int) (screenWidth * 0.1);    // Start from left (10% of the screen width)
        int endX = (int) (screenWidth * 0.9);      // Move to right (90% of the screen width)
        int y = screenHeight / 2;                  // Vertical center

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.press(PointOption.point(startX, y))
                   .waitAction()
                   .moveTo(PointOption.point(endX, y))
                   .release()
                   .perform();
    }
}

