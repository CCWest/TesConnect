package homepages;

// JUnit Assert framework can be used for verification

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class GoToTest1Homepage {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public GoToTest1Homepage(WebDriver browser) {
		this.browser = browser;
		browser.get("http://test1-www.tes.co.uk/home.aspx");
	}

	public void goToTest1Homepage() throws Exception {
	
	}

}
