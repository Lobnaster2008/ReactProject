package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.UpdateToDoPage;
import com.e2etests.automation.page_objects.VerifyStatusPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UpdateToDoStepDefinition {
	
	public String statusBefore;
	public String statusAfter;
	private VerifyStatusPage verifyStatusPage;
	private UpdateToDoPage updateToDoPage;
	public UpdateToDoStepDefinition() {
		updateToDoPage = new UpdateToDoPage();
		
	}
	@When("Je saisie l email {string}")
	public void jeSaisieLEmail(String string) {
		updateToDoPage.fillEmail(string);
	}
	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String string) {
		updateToDoPage.fillPassword(string);
	}
	@When("Je saisie nom tache {string}")
	public void jeSaisieNomTache(String string) throws InterruptedException {
		Thread.sleep(3000);
		updateToDoPage.fillNameTask(string);
	}
	@When("Je saisie une description {string}")
	public void jeSaisieUneDescription(String string) {
		updateToDoPage.fillTaskDescription(string);
	}
	@When("Je clique sur le boutton ajouter la tache")
	public void jeCliqueSurLeBouttonAjouterLaTache() {
		updateToDoPage.clickOnButton(updateToDoPage.btnAddTask);
	}
	@Then("la tache {string} s ajoute")
	public void laListeDesTachesSIncremente(String task) {
	    Assert.assertTrue(updateToDoPage.taskIsAdded(task));
	}
	
	/* suppression d'une taches*/
	

	@When("Je clique sur le boutton supprimer")
	public void jeCliqueSurLeBouttonSupprimer() {
		updateToDoPage.clickOnButton(updateToDoPage.btnDeleteTask);
	}
	@Then("la tache {string} est supprimee")
	public void laListeDesTachesSDincremente(String task) {
		Assert.assertFalse(updateToDoPage.taskIsDeleted(task));
	}

/**/
	
	@When("Je clique sur le boutton satus actuel")
	public void jeCliqueSurLeBouttonSatusActuel() throws InterruptedException {
		Thread.sleep(3000);
		statusBefore = updateToDoPage.btnStatus.getText();
		updateToDoPage.clickOnButton(updateToDoPage.btnStatus);
		statusBefore = updateToDoPage.btnStatus.getText();
	
	}
	@Then("le status de la tache change")
	public void leStatusDeLaTacheChange() {
	   Assert.assertNotEquals(statusAfter , statusBefore);
	}

}
