package ui;

import org.openqa.selenium.By;

public class authentication {
	
	public static class LoginPage {
		public static final By MastheadImage = By.cssSelector("H1");
		public static final By UsernameInput = By.id("Username");
		public static final By PasswordInput = By.id("Password");
		public static final By LogInButton = By.id("Login");
		public static final By ValidationErrorText = By.cssSelector(".field-validation-error");

	}



}
