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
	@FindBy(how = How.CLASS_NAME, using = "form-control")
	public static WebElement btnSubmit;
	
	public UpdateToDoPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		commonFunctions = new CommonFunctions();
	}
}
