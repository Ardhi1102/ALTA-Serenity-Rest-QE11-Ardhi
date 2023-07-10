Feature: Register User
  @Tugas #Positive Case
  Scenario Outline: Post register with valid json
    Given Register user with valid json
    When Send request post register with valid json
    Then Status code should be 200 OK
    And Response body page should be display id <id> and token "<token>"
    And Validate post register success JSON schema
    Examples:
      | id | token             |
      | 4  | QpwL5tke4Pnpja7X4 |

  @Tugas #Negative Case
  Scenario Outline: Post register with valid email and empty password
    Given Register user with valid valid email and empty password
    When Send request post register with valid email and empty password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post register error JSON schema
    Examples:
      | error            |
      | Missing password |

  @Tugas #Negative Case
  Scenario Outline: Post register with empty email and valid password
    Given Register user with empty email and valid password
    When Send request post register with empty email and valid password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post register error JSON schema
    Examples:
      | error                     |
      | Missing email or username |

  @Tugas #Negative Case(bug)
  Scenario Outline: Post register with valid email and invalid password
    Given Register user with valid email and invalid password
    When Send request post register with valid email and invalid password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post register error JSON schema
    Examples:
      | error                                         |
      | Note: Only defined users succeed registration |


  @Tugas #Negative Case
  Scenario Outline: Post register with invalid email and valid password
    Given Register user with invalid email and valid password
    When Send request post register with invalid email and valid password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post register error JSON schema
    Examples:
      | error                                         |
      | Note: Only defined users succeed registration |

  @Tugas #Negative Case
  Scenario Outline: Post register without email field
    Given Post register without email field
    When Send request post register without email field
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post register error JSON schema
    Examples:
      | error                     |
      | Missing email or username |

  @Tugas #Negative Case
  Scenario Outline: Post register without password field
    Given Post register without password field
    When Send request post register without password field
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post register error JSON schema
    Examples:
      | error            |
      | Missing password |
