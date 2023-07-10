Feature: List single resource
  @Tugas #Positive Case
  Scenario Outline: Get list single resource with valid parameter id
    Given Get list single resource with valid parameter id <id>
    When Send list single resource with valid parameter id
    Then Status code should be 200 OK
    And Validate get list single resource JSON schema
    Examples:
      | id |
      | 1  |
      | 2  |

  @Tugas #Negative Case
  Scenario Outline: Get list single resource with invalid parameter id
    Given Get list single resource with invalid parameter id <id>
    When Send list single resource with invalid parameter id
    Then Status code should be 404 Not Found
    Examples:
      | id |
      | 10 |
      | 15 |