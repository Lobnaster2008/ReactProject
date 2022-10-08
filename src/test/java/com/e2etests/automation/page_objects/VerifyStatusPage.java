package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.CommonFunctions;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;

public class VerifyStatusPage {

	private VerifyStatusPage verifyStatusPage ;
	private ConfigFileReader configFileReader;
	private CommonFunctions commonFunctions;
	private SeleniumUtils seleniumUtils;
	@FindBy(how = How.XPATH, using = "//input[@type = 'submit']")
	public static WebElement btnSubmit;
	@FindBy(how = How.XPATH, using = "//input[@type = 'password']")
	public static WebElement password;
	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	public static WebElement email;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Tâches')]")
	public static WebElement tasks;
	@FindBy(how = How.LINK_TEXT, using = "Déconnexion")
	public static WebElement logout;
	
	public VerifyStatusPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		commonFunctions = new CommonFunctions();
		
	}
	
	public void goToUrl() throws InterruptedException {
		
		Setup.getDriver().get(configFileReader.getProperties("url.todolist"));
		Thread.sleep(3000);
	}
	
	public void clearEmail()  {
		
		commonFunctions.clearText(email);
	}
	public void clearPassword() {
		commonFunctions.clearText(password);
	}
	public void clickOnButton(WebElement e) {
		seleniumUtils.click(e);
	}
	
	public Boolean buttonEnabled(WebElement e) {
		return e.isEnabled();
	}
}
