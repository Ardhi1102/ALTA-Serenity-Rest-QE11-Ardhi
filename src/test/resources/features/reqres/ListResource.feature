Feature: List resource
  @Tugas #Positive Case
  Scenario: Get list resource
    Given Get list resource
    When Send list resource
    Then Status code should be 200 OK
    And Validate Get list resource JSON schema