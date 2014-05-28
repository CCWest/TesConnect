// JUnit Assert framework can be used for verification

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import Authentication.LogInAsExistingUser;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

import ui.authentication;
import ui.masthead;

public class GoToAddNewResourcePage {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public GoToAddNewResourcePage(WebDriver browser) throws Exception {
		this.browser = browser;
		browser.findElement(masthead.UCP.LoginLink).click();
		LogInAsExistingUser loginas = new LogInAsExistingUser(this.browser);
		loginas.logInAs("mattaus1");		
		browser.findElement(masthead.Navigation.TeachingResourcesLink).click();
		Thread.sleep(2000);
		browser.findElement(masthead.TeachingResourcesSubNavigation.AddNewResourceLink).click();
	}

	public void setUp() throws Exception {
		//This method is executed before the scenario execution starts.
	}

	public void tearDown() throws Exception {
		//This method is executed after the scenario execution finishes.
	}

}