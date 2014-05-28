package Authentication;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

import ui.authentication;
import ui.masthead;

public class LogInAsExistingUser {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public LogInAsExistingUser(WebDriver browser) {
		this.browser = browser;
	}

	public void goToLoginPage() throws Exception {
		browser.findElement(masthead.UCP.LoginLink).click();
	}

	public void logInAs(String string1) throws Exception {
		browser.findElement(authentication.LoginPage.UsernameInput).sendKeys(string1);
		browser.findElement(authentication.LoginPage.PasswordInput).sendKeys("password");
		browser.findElement(authentication.LoginPage.LogInButton).click();
	}

	public void verifyUserIsLoggedInAs(String string2) throws Exception {
		verifyEquals(browser.findElement(masthead.UCP.UserName).getText(), string2.toUpperCase());
	}

	public void logOut() throws Exception {
		browser.findElement(masthead.UCP.LogoutLink).click();
	}


}
