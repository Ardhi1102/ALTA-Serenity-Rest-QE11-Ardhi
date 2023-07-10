Feature: Single User
  @Tugas #Positive Case
  Scenario Outline: Get Single user with parameter id
    Given Get single user with valid parameter id <id>
    When Send request get single user
    Then Status code should be 200 OK
    And Response body page should be display firstName "<first_name>" and lastName "<last_name>"
    And Validate get single user JSON schema
    Examples:
      | id | first_name | last_name |
      | 2  | Janet      | Weaver    |
      | 11 | George     | Edwards   |

  @Tugas #Negative Case
  Scenario Outline: Get Single user with invalid parameter
    Given Get single user with invalid parameter "<id>"
    When Send request get single user with invalid parameter
    Then Status code should be 404 Not Found
    Examples:
      | id          |
      | syalala123 |
      | kencot&%?  |

  @Tugas #Negative Case
  Scenario Outline: Get Single user not found
    Given Get single user with invalid parameter id <id>
    When Send request get single user with invalid parameter
    Then Status code should be 404 Not Found
    Examples:
      | id |
      | 25 |
      | 39 |
