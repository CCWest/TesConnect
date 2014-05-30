package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckHomeLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckHomeLink(WebDriver browser) {
		this.browser = browser;
		
	}
	
	//Click on the Home link
	public void clickHomeLink() throws Exception {
		browser.findElement(resources.Footer.HomeLink).click();
	
	}
	
	//Verify the Home link
	public void verifyHomeLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/", url);
	
	}
	
	
	
}
