#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Digital Pulse

  Scenario: Digital pulse home page
    Given I navigate to the PwC Digital Pulse website
    When User opens URL "https://www.pwc.com.au/digitalpulse.html"
    When I am viewing the Home page
    Then I am presented with 3 columns of articles
    And The left column is displaying 2 articles
    And The middle column is displaying 1 articles
    And The right column is displaying 4 articles
    And close browser

  Scenario Outline: Digital pulse subscription
    Given I navigate to the PwC Digital Pulse website
    When User opens URL "https://www.pwc.com.au/digitalpulse.html"
    And I am viewing the Home page
    When I click on the Subscribe navigation link
    Then I am taken to the Subscribe page
    And I am presented with the below fields
    And close browser

  Scenario Outline: Digital pulse magnifying glass
    Given I navigate to the PwC Digital Pulse website
    When User opens URL "https://www.pwc.com.au/digitalpulse.html"
    When I click on the Magnifying glass icon to perform a search
    And I enter the text 'Single page applications'
    Then I am taken to the search results page
    And I am presented with at least 1 search result
    And close browser
