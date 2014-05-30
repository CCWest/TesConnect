package Resources;

// JUnit Assert framework can be used for verification

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sikuli.script.*;


public class UploadNewFileResource {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public UploadNewFileResource(WebDriver browser) {
		this.browser = browser;
	}

	public void selectChooseFileButton() throws Exception {
		
		/**
		Thread.sleep(3000);
		browser.findElement(resources.AddNewResourcePage.AddItems.ChooseFileButton).click();

			FlashObjectWebDriver flashApp = new FlashObjectWebDriver(browser, "swfUploadOverlay");
			System.out.println("I am clicked: " + flashApp);
			 flashApp.callFlashObject("Click");
			 Thread.sleep(3000);

	**/
		
		
		
		/**
		SikuliFirefoxDriver driver = new SikuliFirefoxDriver();         
		driver.get("http://code.google.com");
		ImageElement image = driver.findImageElement(new URL("http://code.google.com/images/code_logo.gif"));
		
		//
		
        SikuliFirefoxDriver driver = new SikuliFirefoxDriver();         
        
        // visit Google Map
        driver.get("https://maps.google.com/");
        

        ImageElement image;
        
        // find and click on the image of the lakewood area
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/lakewood.png"));
        image.doubleClick()     ;               
        
        // find and click on the image of the kendrick lake area
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/kendrick_lake.png"));
        image.doubleClick();

        // find and click the Satellite icon to switch to the satellite view
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/satellite.png"));             
        image.click();

        // find and click the plus button to zoom in
        image = driver.findImageElement(new URL("https://dl.dropbox.com/u/5104407/plus.png"));
        image.click();
        
        // find and click the link button
        WebElement linkButton = driver.findElement(By.id("link"));
        linkButton.click();
        
        **/
		//SikuliFirefoxDriver driver = new SikuliFirefoxDriver();  
		Thread.sleep(3000);
		
		System.out.println("!!1");
		Screen s = new Screen();
        try{
        		s.find("choosefile.png");
                s.click("choosefile.png");
                s.wait("filename.png");
                s.type(null, "C:\\Program Files\\Common Files\\Services\\verisign.bmp", 0);
                System.out.println("!!2");
        }
        catch(FindFailed e){
                e.printStackTrace();
                System.out.println("!!3");
        }
		
	}

	public void enterFilePathAndUpload() throws Exception {
		Toolkit.getDefaultToolkit().getSystemClipboard().getContents("C:\\Program Files\\Common Files\\Services\\verisign.bmp");
		//Utils.setClipboardData("C:\\Program Files\\Common Files\\Services\\verisign.bmp");
		//native key strokes for CTRL, V and ENTER keys
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

}
