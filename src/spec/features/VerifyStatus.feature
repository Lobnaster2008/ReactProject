@buttonStatus
Feature: verification de l etat des bouttons
  En tant d utilisateur je veux verifier que les boutons des différents formulaires  (connexion / ajout de tâches) 
  Afin de s assurer qu on peut pas accesder au site lorsque les tous les champs ne sont pas rempli 

  Background: 
    Given Je me connect sur le projet todo List
    When Je vide le champ email
    And Je vide le champ password

  @submitDisabled
  Scenario: boutton submit est deactive
    And Je clique sur le boutton submit
    Then Je verifie que je suis dans la meme page 

  @newTaskDisabled
  Scenario: boutton nouvelle tache est deactive
    And Je clique sur le boutton taches
    Then le boutton est deactive

  @disconnectDisabled
  Scenario: boutton deconnexion est deactive
    And Je clique sur le boutton deconnexion
    Then le boutton n est pas cliquable
