@java
Feature: Digital pack subscription on the times

  As a user
  I should Subscribe digital pack
  So that I can Services for 8 weeks

  Scenario: user should subscribe the digital pack subscription successfully
    Given user is on home page
    When user click on subscribe services
    And user select digital pack for 8 week
    Then user should get digital services subscription for 8 weeks