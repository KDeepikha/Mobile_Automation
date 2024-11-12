package Utilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
	private static AndroidDriver<MobileElement> driver;
	
		public static AndroidDriver<MobileElement> IniDriver()
		{
		try
		{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("appium:platformName", "Android");
		capability.setCapability("appium:platformVersion", "15.0");
		capability.setCapability("appium:deviceName", "emualtor-5554");
		capability.setCapability("appium:app", "C:\\Users\\deepikhak\\Downloads\\mi-calculator-15-0-22.apk");
		capability.setCapability("appium:automationName", "UIAutomator2");
		driver = new AndroidDriver<MobileElement> (new URL(" http://127.0.0.1:4723/"), capability);
				}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		return driver;
		}
	}
