package Resources;

// JUnit Assert framework can be used for verification

import static com.thoughtworks.twist.core.execution.TwistVerification.verifyEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.WaitForCondition;
import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.springframework.beans.factory.annotation.Autowired;

import ui.masthead;
import ui.resources;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class UploadNewWebAddressResource {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public UploadNewWebAddressResource(WebDriver browser) {
		this.browser = browser;		
	}

	public void selectWebAddressOption() throws Exception {
		browser.findElement(resources.AddNewResourcePage.AddItems.WebAddressButton).click();
	}

	public void enterResourceUrl(String string1) throws Exception {
		browser.findElement(resources.AddNewResourcePage.AddItems.WebAddressInput).sendKeys(string1);
		browser.findElement(resources.AddNewResourcePage.AddItems.AddButton).click();
	}

	public void selectResourceType(String string1, String string2) throws Exception {
		Select Type = new Select(browser.findElement(resources.AddNewResourcePage.AddItems.ResourceTypeDropdown));
			Type.selectByVisibleText(string1);
		Thread.sleep(2000);
		Select Format = new Select(browser.findElement(resources.AddNewResourcePage.AddItems.ResourceFormatDropdown));
			Format.selectByVisibleText(string2);
	}

	public void selectResourceMappings(String string1, String string2, String string3, String string4) throws Exception {
		WebDriverWait wait = new WebDriverWait(browser, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(resources.AddNewResourcePage.MapYourResource.PhaseDropdown));
		Select Phase = new Select(browser.findElement(resources.AddNewResourcePage.MapYourResource.PhaseDropdown));
			Phase.selectByVisibleText(string1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(resources.AddNewResourcePage.MapYourResource.SubjectDropdown));
		Select Subject = new Select(browser.findElement(resources.AddNewResourcePage.MapYourResource.SubjectDropdown));
			Subject.selectByVisibleText(string2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(resources.AddNewResourcePage.MapYourResource.TopicDropdown));	
		Select Topic = new Select(browser.findElement(resources.AddNewResourcePage.MapYourResource.TopicDropdown));
			Topic.selectByVisibleText(string3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(resources.AddNewResourcePage.MapYourResource.SubTopicDropdown));
		Select SubTopic = new Select(browser.findElement(resources.AddNewResourcePage.MapYourResource.SubTopicDropdown));
			SubTopic.selectByVisibleText(string4);
	}

	public void enterResourceTitleAndDescription(String string1, String string2) throws Exception {
		browser.findElement(resources.AddNewResourcePage.SupportingInformation.TitleInput).sendKeys(string1);
		browser.findElement(resources.AddNewResourcePage.SupportingInformation.DescriptionInput).sendKeys(string2);
	}

	public void submitNewResource() throws Exception {
		browser.findElement(resources.AddNewResourcePage.Finish.AgreeAndFinishButton).click();
	}

	public void verifyResourceDetailContains(String string1, String string2) throws Exception {
		verifyEquals(browser.findElement(resources.DetailPage.ResourceTitle).getText(), string1);
		verifyEquals(browser.findElement(resources.DetailPage.ResourceDescription).getText(), string2);
		verifyEquals(browser.findElement(resources.DetailPage.ResourceClassification).getText(), "KS2 / English / Poetry texts / Free verse");
	
	}

}
