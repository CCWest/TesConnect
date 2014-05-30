package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckTAndCsLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckTAndCsLink(WebDriver browser) {
		this.browser = browser;
	}


	
	
	//click on the t&cs link
	public void clickTAndCsLink() throws Exception {
			browser.findElement(resources.Footer.TCsLink).click();
		
		}


		
	//verify the t&cs link
	public void verifyTAndCsLinkIsCorrect() throws Exception {
			String url = browser.getCurrentUrl();
			verifyEquals("http://test4-www.tes.co.uk/article.aspx?storyCode=6000125&navCode=287", url);	
		
		}

}
