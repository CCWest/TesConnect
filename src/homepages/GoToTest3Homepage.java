package homepages;

// JUnit Assert framework can be used for verification

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class GoToTest3Homepage {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public GoToTest3Homepage(WebDriver browser) {
		this.browser = browser;
		browser.get("http://test3-www.tes.co.uk/home.aspx");
	}

	public void goToTest3Homepage() throws Exception {
	
	}

}
