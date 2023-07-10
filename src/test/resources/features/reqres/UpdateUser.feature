Feature: Update User
  @Tugas
  Scenario Outline: Put update user with empty name and valid job
    Given Put update user with empty name and valid job on id <id>
    When Send request put update user with empty name and valid job
    Then Status code should be 400 bad request
    Examples:
      | id |
      | 2  |
      | 4  |
      | 10 |

  @Tugas
  Scenario Outline: Put update user with valid name and empty job
    Given Put update user with valid name and empty job on id <id>
    When Send request put update user with empty name and valid job
    Then Status code should be 400 bad request
    Examples:
      | id |
      | 2  |
      | 4  |
      | 10 |

  @Tugas
  Scenario Outline: Put update user without name field
    Given Put update user without name field on id <id>
    When Send request put update user without name field
    Then Status code should be 400 bad request
    Examples:
      | id |
      | 2  |
      | 4  |
      | 10 |

  @Tugas
  Scenario Outline: Put update user without job field
    Given Put update user without job field on id <id>
    When Send request put update user without job field
    Then Status code should be 400 bad request
    Examples:
      | id |
      | 2  |
      | 4  |
      | 10 |

  @Tugas
  Scenario Outline: Put update user with invalid parameter id
    Given Put update user with invalid parameter id "<id>"
    When Send request put update user with invalid parameter id
    Then Status code should be 400 bad request
    Examples:
      | id      |
      | adhb213 |
      | !@#kds0 |

#PATCH
  @Tugas
  Scenario Outline: Patch update user with valid json
    Given Patch update user with valid json on id <id>
    When Send request Patch update user with valid json on id
    Then Status code should be 200 OK
    And Response body name was "Ardhi Wiranata Edit" and job was "QA Engineer Edit"
    And Validate update user JSON schema
    Examples:
      | id |
      | 2  |
      | 4  |
      | 10 |

  @Tugas
  Scenario Outline: Patch update user with invalid parameter id
    Given Patch update user with invalid parameter id "<id>"
    When Send request patch update user with invalid parameter id
    Then Status code should be 400 bad request
    Examples:
      | id      |
      | adhb213 |
      | !@#kds0 |


