package Authentication;

import org.openqa.selenium.WebDriver;

public class Users {

	private WebDriver browser;

	private String username;

	private String password;

	private String type;

	public Users(WebDriver browser) {
		this.browser = browser;
	}

	public void setPassword(String password) throws Exception {
		this.password = password;
	}

	public void setType(String type) throws Exception {
		this.type = type;
	}

	public void setUp() throws Exception {
		//Put the code to be executed before execution of each row
	}

	public void setUsername(String username) throws Exception {
		this.username = username;
	}

	public void tearDown() throws Exception {
		//Put the code to be executed after execution of each row
	}

}
