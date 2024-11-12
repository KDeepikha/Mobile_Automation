package Pages;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MainPage {
	private AndroidDriver<MobileElement> driver;
	
	public MainPage(AndroidDriver<MobileElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(20)),this);

	}
	
@AndroidFindBy(id = "android:id/button1")
		private MobileElement Agree;

@AndroidFindBy(id = "com.miui.calculator:id/digit_5")
private MobileElement Digit5;

@AndroidFindBy(id = "com.miui.calculator:id/op_add")
private MobileElement Plusbtn;

@AndroidFindBy(id = "com.miui.calculator:id/btn_equal_s")
private MobileElement Eqaulbtn;

public void clickagree()
{
	Agree.click();
}


public void clickfive()
{
	Digit5.click();
}

public void clickplus()
{
	Plusbtn.click();
}

public void clickequal()
{
	Eqaulbtn.click();
}
}
