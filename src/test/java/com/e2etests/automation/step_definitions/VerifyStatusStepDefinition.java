package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.VerifyStatusPage;
import com.e2etests.automation.utils.CommonFunctions;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyStatusStepDefinition {

	public VerifyStatusPage verifyStatusPage;

	public VerifyStatusStepDefinition() {
		verifyStatusPage = new VerifyStatusPage();
	}

	public CommonFunctions commonFunctions;

	@Given("Je me connect sur le projet todo List")
	public void jeMeConnectSurLeProjetTodoList() throws InterruptedException {
		verifyStatusPage.goToUrl();
		Thread.sleep(3000);
	}

	@When("Je vide le champ email")
	public void jeVideLeChampEmail() {
		verifyStatusPage.clearEmail();
	}

	@When("Je vide le champ password")
	public void jeVideLeChampPassword() {
		verifyStatusPage.clearPassword();
	}

	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		verifyStatusPage.clickOnButton(verifyStatusPage.btnSubmit);
	}

	@Then("Je verifie que je suis dans la meme page")
	public void JeVerifieQueJeSuisDansLaMemePage() {
		Assert.assertFalse(Setup.getDriver().getCurrentUrl().contains("tasks"));

	}
	/* boutton taches déactivé */

	@When("Je clique sur le boutton taches")
	public void jeCliqueSurLeBouttonTaches() {
		verifyStatusPage.clickOnButton(verifyStatusPage.tasks);
	}

	@Then("le boutton est deactive")
	public void leBouttonEstDeactive() {
		verifyStatusPage.buttonEnabled(verifyStatusPage.tasks);
	}

	/* boutton deconnexion est déactivé */

	@When("Je clique sur le boutton deconnexion")
	public void jeCliqueSurLeBouttonDeconnexion() {
		verifyStatusPage.clickOnButton(verifyStatusPage.logout);

	}

	@Then("le boutton n est pas cliquable")
	public void leBouttonNEstPasCliquable() {
		verifyStatusPage.buttonEnabled(verifyStatusPage.logout);
	}

}
