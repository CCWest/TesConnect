package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckContactLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckContactLink(WebDriver browser) {
		this.browser = browser;
	}

	
	//click on the contact link
	public void clickContactLink() throws Exception {
		browser.findElement(resources.Footer.ContactLink).click();
	
	}

	
	//Verify the contact link
	public void verifyContactLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/_contacts.aspx?navcode=274", url);	
	
	}

}
