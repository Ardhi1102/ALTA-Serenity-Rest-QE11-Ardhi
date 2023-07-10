Feature: User Login
  @Tugas #Positive Case
  Scenario Outline: Post login with valid json
    Given Post login with valid json
    When Send request post login with valid json
    Then Status code should be 200 OK
    And Response body page should be display token "<token>"
    And Validate post login success JSON schema
    Examples:
      | token             |
      | QpwL5tke4Pnpja7X4 |

  @Tugas #Negative Case
  Scenario Outline: Post login with valid email and empty password
    Given Post login with valid email and empty password
    When Send request post login with valid email and empty password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post login error JSON schema
    Examples:
      | error            |
      | Missing password |

  @Tugas #Negative Case
  Scenario Outline: Post login with empty email and valid password
    Given Post login with empty email and valid password
    When Send request post login with empty email and valid password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post login error JSON schema
    Examples:
      | error                     |
      | Missing email or username |

  @Tugas #Negative Case
  Scenario Outline: Post login with empty email and empty password
    Given Post login with empty email and empty password
    When Send request post login with empty email and empty password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post login error JSON schema
    Examples:
      | error                     |
      | Missing email or username |

  @Tugas #Negative Case
  Scenario Outline: Post login with invalid email and valid password
    Given Post login with invalid email and valid password
    When Send request post login with invalid email and valid password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post login error JSON schema
    Examples:
      | error          |
      | user not found |

  @Tugas #Negative Case (bug)
  Scenario Outline: Post login with valid email and invalid password
    Given Post login with valid email and invalid password
    When Send request post login with valid email and invalid password
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post login error JSON schema
    Examples:
      | error          |
      | user not found |

  @Tugas #Negative Case
  Scenario Outline: Post login without email field
    Given Post login without email field
    When Send request post login without email field
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post login error JSON schema
    Examples:
      | error                     |
      | Missing email or username |

  @Tugas #Negative Case
  Scenario Outline: Post login without password field
    Given Post login without password field
    When Send request post login without password field
    Then Status code should be 400 bad request
    And Response body page should be display message "<error>"
    And Validate post login error JSON schema
    Examples:
      | error            |
      | Missing password |
