Feature: Delete User
  @Tugas #Negative Case (bug)
  Scenario Outline: Delete user with invalid parameter id
    Given Delete user with valid parameter id "<id>"
    When Send request delete user
    Then Status code should be 400 bad request
    Examples:
      | id      |
      | aezakmi |
      | hesoyam |