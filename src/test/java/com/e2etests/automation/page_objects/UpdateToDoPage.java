package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.CommonFunctions;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;

public class UpdateToDoPage {
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
	@FindBy(how = How.XPATH, using = "//input[@name='taskName']")
	public static WebElement taskName;
	@FindBy(how = How.XPATH, using = "//input[@name='TaskDescription']")
	public static WebElement taskDescription;
	@FindBy(how = How.ID, using = "addTask")
	public static WebElement btnAddTask;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Supprimer')]")
	public static WebElement btnDeleteTask;
	@FindBy(how = How.XPATH, using = "//*[@name='status']")
	public static WebElement btnStatus;
	public UpdateToDoPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		commonFunctions = new CommonFunctions();
	}
	
	public void fillEmail(String name) {
		seleniumUtils.writeText(email, name);		
	}
	public void fillPassword(String name) {
		seleniumUtils.writeText(password, name);		
	}
	public void fillTaskDescription(String description) {
		seleniumUtils.writeText(taskDescription, description);		
	}
	public void clickOnButton(WebElement e) {
		seleniumUtils.click(e);	
	}
	public Boolean taskIsAdded(String task) {
		return Setup.getDriver().getPageSource().contains(task);
	}
	public Boolean taskIsDeleted(String task) {
		return Setup.getDriver().getPageSource().contains(task);
	}

	public void fillNameTask(String name) {
		seleniumUtils.writeText(taskName, name);		
		
	}
}
