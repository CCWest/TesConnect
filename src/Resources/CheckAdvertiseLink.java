package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckAdvertiseLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckAdvertiseLink(WebDriver browser) {
		this.browser = browser;
	}

	
	//click on the advertise link
	public void clickAdvertiseLink() throws Exception {
		browser.findElement(resources.Footer.AdvertiseLink).click();
	
	}


	
	//verify the advertise link
	public void verifyAdvertiseLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/article.aspx?storyCode=6000015&navcode=102", url);	
	
	}

}
