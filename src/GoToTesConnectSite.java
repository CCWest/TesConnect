// JUnit Assert framework can be used for verification

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.masthead;
import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class GoToTesConnectSite {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public GoToTesConnectSite(WebDriver browser) {
		this.browser = browser;
		browser.get("http://test4-www.tes.co.uk/home.aspx");
		browser.findElement(masthead.CookieAcceptButton).click();
	}

	public void setUp() throws Exception {
		//This method is executed before the scenario execution starts.
	}

	public void tearDown() throws Exception {
		//This method is executed after the scenario execution finishes.
	}

}