package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckSubscribeLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckSubscribeLink(WebDriver browser) {
		this.browser = browser;
	}
	//click on the subscribe link
	public void clickSubscribeLink() throws Exception {
		browser.findElement(resources.Footer.SubscribeLink).click();
	}
	//verify the subscribe link
	public void verifySubscribeLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/article.aspx?storyCode=6000244&navCode=370&utm_source=tes&utm_medium=footer_link&utm_campaign=subscribe", url);
	}
	
}
