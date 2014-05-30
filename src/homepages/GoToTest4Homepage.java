package homepages;

// JUnit Assert framework can be used for verification

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class GoToTest4Homepage {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public GoToTest4Homepage(WebDriver browser) {
		this.browser = browser;
		browser.get("http://test4-www.tes.co.uk/home.aspx");
	}

	public void goToTest4Homepage() throws Exception {
	
	}

}
