package examFInal;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AndroidDriver driver;

		try {
						
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("deviceName","Pixel_2_Api_29");
			dc.setCapability("udid", "emulator-5554");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "10");
			dc.setCapability("appPackage", "com.google.android.youtube");
			dc.setCapability("appActivity", "com.google.android.apps.youtube.app.application.Shell$HomeActivity");
			
		
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
			 System.out.println("Application Started i.e Youtube is opened");
			 
		}
		
		
			catch(Exception exp) {
			
			System.out.println("Message is : " +exp.getMessage());
			System.out.println("Cause is : "+exp.getCause());
			
			
		}
	
		
		
		
	}

}
