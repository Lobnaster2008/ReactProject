@update
Feature: Creation nouvelle tache
  En tant qu utilisateur je veux ajouter, supprimer et modifier l etat d une tache afin

  Background: 
    Given Je me connect sur le projet todo List
    When Je saisie l email "test@test.com"
    And Je saisie le mot de passe "test"
    And Je clique sur le boutton submit
    And Je saisie nom tache "new task"
    And Je saisie une description "add a new task"
    And Je clique sur le boutton ajouter la tache
  
  @addNewTask
  Scenario: ajout d une tache
    Then la tache "new task" s ajoute

  @deleteTask
  Scenario: suppression d une tache
    And Je clique sur le boutton supprimer
    Then la tache "new task" est supprimee

  @modifySatus
  Scenario: mise a jour d une tache
    And Je clique sur le boutton satus actuel
    Then le status de la tache change
