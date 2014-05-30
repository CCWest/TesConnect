package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckPrivacyLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckPrivacyLink(WebDriver browser) {
		this.browser = browser;
	}

	//click on the privacy link
	public void clickPrivacyLink() throws Exception {
		browser.findElement(resources.Footer.PrivacyLink).click();
			
	}

	//verify the privacy link
	public void verifyPrivacyLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/article.aspx?storyCode=6000267&navCode=423", url);	
	}
}
