Feature: Get List User

  @Tugas #Negative(bug)
  Scenario Outline: Get list user with invalid parameter page
    Given Get list user with invalid parameter page "<page>"
    When Send request get list user with invalid parameter page
    Then Status code should be 404 Not Found
    Examples:
      | page       |
      | syalala123 |
      | 123giubs   |

  @Tugas #Negative(bug)
  Scenario Outline: Get list user with more than available page
    Given Get list user with more than available page <page>
    When Send request get list user with more than available page
    Then Status code should be 404 Not Found
    Examples:
      | page |
      | 20   |