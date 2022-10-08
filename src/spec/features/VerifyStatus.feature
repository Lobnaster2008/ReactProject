@buttonStatus
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given Je me connect sur le projet todo List
    When Je vide le champ email
    And Je vide le champ password

  @submitDisabled
  Scenario: connexion au projet react todolist
    And Je clique sur le boutton submit
    Then Je verifie que je suis dans la meme page 

  @newTaskDisabled
  Scenario: connexion au projet react todolist
    And Je clique sur le boutton taches
    Then le boutton est deactive

  @deconnexionDisabled
  Scenario: connexion au projet react todolist
    And Je clique sur le boutton deconnexion
    Then le boutton n est pas cliquable
