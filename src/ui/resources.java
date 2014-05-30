package ui;

import org.openqa.selenium.By;

public class resources {

	public static class AddNewResourcePage {
		
		public static class AddItems {
			public static final By WebAddressButton = By.id("typeLink");
			public static final By WebAddressInput = By.cssSelector("input.item");
			public static final By AddButton = By.id("addItem");
			public static final By ChooseFileButton = By.id("swfUploadOverlay");
			public static final By ResourceTypeDropdown = By.id("typeSelect-1");
			public static final By ResourceFormatDropdown = By.id("formatSelect-1");
		}
		
		public static class MapYourResource {
			public static final By PhaseDropdown = By.cssSelector(".whoFor");
			public static final By SubjectDropdown = By.cssSelector(".subject");
			public static final By TopicDropdown = By.cssSelector(".topic");
			public static final By SubTopicDropdown = By.cssSelector(".subTopic");

		}
		
		public static class SupportingInformation {
			public static final By TitleInput = By.id("ContentPlaceHolder2_txtTitle");
			public static final By DescriptionInput = By.id("ContentPlaceHolder2_txtDescription");

		}

		public static class Finish {
			public static final By AgreeAndFinishButton = By.id("ContentPlaceHolder2_SaveButton");
			
		}
		
		

	}
	
	
	public static class DetailPage {
		
		public static final By ResourceTitle = By.id("ContentPlaceHolder2_lblAuthorResourceTitle");
		public static final By ResourceDescription = By.id("ContentPlaceHolder2_spnDescription");
		public static final By ResourceWebAddressLink = By.id("lnkAttachment");
		public static final By ResourceClassification = By.id("ContentPlaceHolder2_rptClassification_lnkClassification_0");

	}
	
	
	public static class SearchResultsPage {
		public static final By SearchForPhrase = By.cssSelector("h1");
		public static final By SaveSearchButton = By.id("ContentPlaceHolder2_hypSaveSearch");
		public static final By SaveSearchConfirmText = By.cssSelector("#saveSearchContainer span");
		
	}
	
	
	public static class SavedSearchesPage {
		public static final By FirstSavedSearchRemoveButton = By.id("ContentPlaceHolder2_ucSavedSearch_rptSavedSearches_hypDeleteSaveSearch_0");
		public static final By FirstSavedSearchLink = By.cssSelector(".savedSearchItem>.savedSearch>a");
		
	}
	
	public static class Footer {
		public static final By HomeLink = By.cssSelector("div.nav>ul>li:nth-child(1)>a");
		public static final By SubscribeLink = By.cssSelector("div.nav>ul>li:nth-child(2)>a");
		public static final By AdvertiseLink = By.cssSelector("div.nav>ul>li:nth-child(3)>a");
		public static final By ContactLink = By.cssSelector("div.nav>ul>li:nth-child(4)>a");
		public static final By TCsLink = By.cssSelector("div.nav>ul>li:nth-child(5)>a");
		public static final By PrivacyLink = By.cssSelector("div.nav>ul>li:nth-child(6)>a");
		public static final By CookiesLink = By.cssSelector("div.nav>ul>li:nth-child(7)>a");
		public static final By SitemapLink = By.cssSelector("div.nav>ul>li:nth-child(8)>a");
		public static final By LinkToUsLink = By.cssSelector("div.nav>ul>li:nth-child(9)>a");
		public static final By TwitterLink = By.cssSelector("div.nav>ul>li:nth-child(10)>a");
	}
	
}
