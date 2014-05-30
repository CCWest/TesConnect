package homepages;

// JUnit Assert framework can be used for verification

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class GoToTest4CommunityHomepage {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public GoToTest4CommunityHomepage(WebDriver browser) {
		this.browser = browser;
	}

	public void goToTest4CommunityHomepage() throws Exception {
		browser.get("http://devtest-community.tes.co.uk:53400/");
	}

}
