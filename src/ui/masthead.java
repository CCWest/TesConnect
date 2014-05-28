package ui;

import org.openqa.selenium.By;

public class masthead {
	
	public static final By CookieAcceptButton = By.linkText("ACCEPT");
	
	public static class UCP {
		public static final By LoginLink = By.cssSelector(".login a");
		public static final By LogoutLink = By.cssSelector(".log-out");
		
		public static final By UserName = By.cssSelector(".personName");
		
		public static final By Searchbox = By.id("search");
	}

	public static class Navigation {
		public static final By TeachingResourcesLink = By.cssSelector(".teachresources");
	}

	public static class TeachingResourcesSubNavigation {
		public static final By AddNewResourceLink = By.linkText("Add new resource");
		public static final By SavedSearchesLink = By.linkText("Saved searches");
	}
}
