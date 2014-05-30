package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckCookiesLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckCookiesLink(WebDriver browser) {
		this.browser = browser;
	}

	//click on the cookies link
	public void clickCookiesLink() throws Exception {
		browser.findElement(resources.Footer.CookiesLink).click();
				
	}

	//verify the cookies link
	public void verifyCookiesLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/article.aspx?storycode=6229959", url);	
	}
	
}
