package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckTesOnTwitterLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckTesOnTwitterLink(WebDriver browser) {
		this.browser = browser;
	}

	//click on the twitter link
	public void clickTwitterLink() throws Exception {
		browser.findElement(resources.Footer.TwitterLink).click();
					
	}
	
	//switch to new window
	public void switchToNewWindow() throws Exception {
		for (String winHandle : browser.getWindowHandles()) {
		browser.switchTo().window(winHandle);// switch focus of WebDriver to the next found window handle (that's the newly opened window)	
	}
	}	

	//verify the twitter link
	public void verifyTwitterLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("https://twitter.com/tesresources", url);
		
	
	
	}

	

}
