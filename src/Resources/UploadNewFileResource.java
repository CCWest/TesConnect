package Resources;

// JUnit Assert framework can be used for verification

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

import org.sikuli.script.*;

public class UploadNewFileResource {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public UploadNewFileResource(WebDriver browser) {
		this.browser = browser;
	}

	public void selectChooseFileButton() throws Exception {
		Thread.sleep(3000);
		//browser.findElement(resources.AddNewResourcePage.AddItems.ChooseFileButton).click();
		System.out.println("!!1");
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
		
	}

	public void enterFilePathAndUpload() throws Exception {
		System.out.println("!!4");
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
