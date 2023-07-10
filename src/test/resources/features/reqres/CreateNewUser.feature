Feature: Create New User
  @Tugas #Negative Case (bug)
  Scenario: Post create new user with empty job field
    Given Post create new user with empty job field
    When Send request post create new user with empty job field
    Then Status code should be 400 bad request

  @Tugas #Negative Case (bug)
  Scenario: Post create new user with empty name field
    Given Post create new user with empty name field
    When Send request post create new user with empty name field
    Then Status code should be 400 bad request

  @Tugas #Negative Case (bug)
  Scenario: Post create new user with empty name and job field
    Given Post create new user with empty name and job field
    When Send request post create new user with empty name and job field
    Then Status code should be 400 bad request

  @Tugas #Negative Case (bug)
  Scenario: Post create new user without name field
    Given Post create without name field
    When Send request post create without name field
    Then Status code should be 400 bad request

  @Tugas #Negative Case
  Scenario: Post create new user without job field
    Given Post create without job field
    When Send request post create without job field
    Then Status code should be 400 bad request