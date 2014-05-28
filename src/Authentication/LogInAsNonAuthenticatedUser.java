package Authentication;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.authentication;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class LogInAsNonAuthenticatedUser {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public LogInAsNonAuthenticatedUser(WebDriver browser) {
		this.browser = browser;
	}

	public void verifyValidationMessageIsPresented(String string1) throws Exception {
		verifyEquals(browser.findElement(authentication.LoginPage.ValidationErrorText).getText(), string1);
	}

	public void goToHomepage() throws Exception {
		browser.findElement(authentication.LoginPage.MastheadImage).click();	
	}

}
