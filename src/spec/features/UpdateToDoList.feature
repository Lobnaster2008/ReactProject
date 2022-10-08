@update
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given Je me connect sur le projet todo List
    When Je saisie l email "test@test.com"
    And Je saisie le mot de passe "test"
    And Je clique sur le boutton submit
    And Je saisie nom tache "new task"
    And Je saisie une description "add a new task"
    And Je clique sur le boutton ajouter la tache
  
  @addNewTask
  Scenario: Title of your scenario
    Then la liste des taches s incremente

  @deleteTask
  Scenario: Title of your scenario
    And Je clique sur le boutton supprimer
    Then la liste des taches s dincremente

  @modifySatus
  Scenario: Title of your scenario
    And Je clique sur le boutton satus actuel
    Then le status de la tache change
