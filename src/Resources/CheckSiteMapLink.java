package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;

import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class CheckSiteMapLink {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public CheckSiteMapLink(WebDriver browser) {
		this.browser = browser;
	}

	//click on the site map link
	public void clickSiteMapLink() throws Exception {
		browser.findElement(resources.Footer.SitemapLink).click();
					
	}

	//verify the site map link
	public void verifySiteMapLinkIsCorrect() throws Exception {
		String url = browser.getCurrentUrl();
		verifyEquals("http://test4-www.tes.co.uk/sitemap.aspx?navCode=12", url);	
		
	}

}
