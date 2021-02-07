package cucumberJava;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;



public class CucumberJava { 
	public AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;
	
	public AndroidDriver prepareDevice() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel XL");
		caps.setCapability("udid", "HT6CP0203020"); //DeviceId from "adb devices" command
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("skipUnlock","true");
		caps.setCapability("language", "en");
		caps.setCapability("locale", "us");
		caps.setCapability("appPackage", "com.jogatina.tranca");
		caps.setCapability("appActivity","com.jogatina.menu.Splash");
		caps.setCapability("noReset","false");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		return driver;
	}
	
	
	@Given("^I open app$") 
	public void basicTest () throws InterruptedException, MalformedURLException {
		driver = prepareDevice();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.id("com.jogatina.tranca:id/buttonSinglePlayer")));

	}
	
	
	@Then("^The texts should appear in english$") 
	public void getTexts() {
		ArrayList<String> textsfound = new ArrayList<String>();
		MobileElement playnow = driver.findElement(By.id("com.jogatina.tranca:id/buttonSinglePlayer"));
		MobileElement multiplayer = driver.findElement(By.id("com.jogatina.tranca:id/buttonMultiPlayer"));
		MobileElement playersonline = driver.findElement(By.id("com.jogatina.tranca:id/textViewPlayersOnline"));
		textsfound.add(playnow.getText().toString().toLowerCase());
		textsfound.add(multiplayer.getText().toString().toLowerCase());
		textsfound.add(playersonline.getText().toString().toLowerCase());
		textsfound.get(0).contains("play now!");
		textsfound.get(1).contains("multiplayer");
		textsfound.get(2).contains("players online");
	}

	@And("^Click in Play now button$")
	public void clickPlay() throws MalformedURLException {
		driver.findElement(By.id("com.jogatina.tranca:id/buttonSinglePlayer")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.jogatina.tranca:id/btn2Players")));
	}

	@When("^The text is in correct language$")
	public void readText() {
		MobileElement playnow = driver.findElement(By.id("com.jogatina.tranca:id/btn2Players"));
		playnow.toString().toLowerCase().contains("Play Now!");
	}

	@Then("^I click in two players button$")
	public void clickPlayers() {
		driver.findElement(By.id("com.jogatina.tranca:id/btn2Players")).click();
	}
	
	@When("^Play tutorial$")
	public void playTutorial() throws InterruptedException {
		Thread.sleep(2000);
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(707,1266)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(652,1827)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(652,1827)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(652,1827)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(652,1827)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(637,856)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(196,1148)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(659,1015)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(606,1089)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(704,2386)).release().perform();
		Thread.sleep(500);
		action.press(PointOption.point(807,2386)).release().perform();
		Thread.sleep(500);
		action.press(PointOption.point(904,2386)).release().perform();
		Thread.sleep(500);
		action.press(PointOption.point(1012,2386)).release().perform();
		Thread.sleep(500);
		action.press(PointOption.point(1108,2386)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(652,1827)).release().perform();
		Thread.sleep(2000);
		action.press(PointOption.point(700,1021)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(652,1827)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(637,856)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(1079,2386)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(720,1176)).release().perform();
		Thread.sleep(2000);
		action.press(PointOption.point(665,744)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(1303,567)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(662,1750)).release().perform();
		Thread.sleep(1000);
		action.press(PointOption.point(706,1250)).release().perform();
		Thread.sleep(1000);
		driver.findElement(By.id("com.jogatina.tranca:id/ad_container"));
	}


	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}