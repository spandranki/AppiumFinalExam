package examFInal;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Omnivox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AndroidDriver driver;

		try {
						
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("deviceName","Pixel_2_Api_29");
			dc.setCapability("udid", "emulator-5554");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "10");
			dc.setCapability("browserName", "Chrome");
			dc.setCapability("chromedriverExecutable", "C:\\Users\\sameera\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
			
		
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
			 
			 System.out.println("Application Started");
			 
			 driver.get("https://montrealcollege.omnivox.ca/");
			 driver.findElementById("Identifiant").sendKeys("201907816");
			 driver.findElementById("Password").sendKeys("Hasini123");
			 driver.findElementByXPath("//*[@id=\"formLogin\"]/div[4]/div/button/span").click();
			 
			 
		}
		
		
			catch(Exception exp) {
			
			System.out.println("Message is : " +exp.getMessage());
			System.out.println("Cause is : "+exp.getCause());
			
			
		}
	
	
	}
		

}
