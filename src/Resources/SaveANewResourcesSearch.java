package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;
import static com.thoughtworks.twist.core.execution.TwistVerification.verifyTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.seleniumemulation.IsTextPresent;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.springframework.beans.factory.annotation.Autowired;

import ui.masthead;
import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class SaveANewResourcesSearch {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public SaveANewResourcesSearch(WebDriver browser) {
		this.browser = browser;
	}

	public void searchForResourcesCalled(String string1) throws Exception {
		browser.findElement(masthead.UCP.Searchbox).sendKeys(string1);
		Actions action = new Actions(browser); 
		action.sendKeys(Keys.ENTER).perform();
	}

	public void verifySearchResultsContain(String string1) throws Exception {
		verifyEquals(browser.findElement(resources.SearchResultsPage.SearchForPhrase).getText(), "Search for '" + string1 + "'");
	}

	public void saveTheSearch() throws Exception {
		browser.findElement(resources.SearchResultsPage.SaveSearchButton).click();
		WebDriverWait wait = new WebDriverWait(browser, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(resources.SearchResultsPage.SaveSearchConfirmText));
		verifyEquals(browser.findElement(resources.SearchResultsPage.SaveSearchConfirmText).getText(), "Search saved");
	}

	public void verifySearchTermHasBeenSaved(String string1) throws Exception {
		browser.findElement(masthead.TeachingResourcesSubNavigation.SavedSearchesLink).click();
		verifyEquals(browser.findElement(resources.SavedSearchesPage.FirstSavedSearchLink).getAttribute("href"),"http://test4-www.tes.co.uk/taxonomySearchResults.aspx?area=resources&keywords=" + string1 + "&page=1&SFBC_FilterOption=2");
		browser.findElement(resources.SavedSearchesPage.FirstSavedSearchRemoveButton).click();
		try {
	        Alert alert = browser.switchTo().alert();
	        String AlertText = alert.getText();
	        System.out.println(AlertText);
	        alert.accept();
	    } catch (Exception e) {
	        System.out.println("No alert - search not deleted");
	    }
	}

}
