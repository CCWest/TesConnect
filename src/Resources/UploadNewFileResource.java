package Resources;

// JUnit Assert framework can be used for verification

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadNewFileResource {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public UploadNewFileResource(WebDriver browser) {
		this.browser = browser;
	} 

	
	
	public void selectChooseFileButton() throws Exception {
		Thread.sleep(3000);
		
		
		 FlashObjectWebDriver flashApp = new FlashObjectWebDriver(browser, "swfUploadOverlay");
		 flashApp.callFlashObject("click"); // first number

		 
		Thread.sleep(3000);

		
		
		/**
		
		Actions builder = new Actions(browser);

		builder.moveToElement(browser.findElement(resources.AddNewResourcePage.AddItems.FileLabel), 20, 10 );
		builder.click();
		//builder.release();
		builder.perform();
		Thread.sleep(3000);
		//browser.findElement(By.id("swfUploadOverlay")).click();
		//FlashObjectWebDriver flashApp = new FlashObjectWebDriver(browser, ", "swfUploadOverlay");
		 //flashApp.callFlashObject("click", "swfUploadOverlay");
		 //flashApp.click(browser, "swfUploadOverlay");
		 
		**/
		
		//browser.findElement(resources.AddNewResourcePage.AddItems.ChooseFileButton).click();
		
		
		/**
		Screen s = new Screen();
        try{
                s.click("imgs/choosefile.png", 0);
                s.wait("imgs/filename.png");
                s.type(null, "C:\\Program Files\\Common Files\\Services\\verisign.bmp", 0);
                System.out.println("!!2");
        }
        catch(FindFailed e){
                e.printStackTrace();
                System.out.println("!!3");
        }
		**/
	}
	
	public static void setClipboardData(String string) {
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}

	public void enterFilePathAndUpload() throws Exception {
		System.out.println("!!4");

		//Utils.setClipboardData("C:\\Program Files\\Common Files\\Services\\verisign.bmp");
		//native key strokes for CTRL, V and ENTER keys
		setClipboardData("C:\\Program Files\\Common Files\\Services\\verisign.bmp");
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
