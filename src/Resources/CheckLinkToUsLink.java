package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckLinkToUsLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckLinkToUsLink(WebDriver browser) {
		this.browser = browser;
	}

	//click on the link to us link
	public void clickLinkToUsLink() throws Exception {
		browser.findElement(resources.Footer.LinkToUsLink).click();
						
	}
	
	//verify the link to us link
	public void verifyLinkToUsLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/article.aspx?storyCode=6082387", url);	
		
	}

}
