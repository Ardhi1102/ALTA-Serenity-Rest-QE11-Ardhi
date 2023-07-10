Feature: API Automation Testing
#  @Latihan
#  Scenario: Post create new user with valid JSON
#    Given Post create user with valid json
#    When Send request post creaete user
#    Then Status code should be 201 created
#    And Response body name was "Ardhi Wiranata" and job was "QA Engineer"

#  @Latihan
#  Scenario Outline: Get list users with valid parameter page
#    Given Get list user with valid parameter <page>
#    When Send request get list users
#    Then Status code should be 200 OK
#    And Response body should be <page>
#    And Validate get list user JSON schema
#    And Print if status code 200 OK
#    And Get log all
#    And Get log body
#    Examples:
#      | page |
#      | 1    |
#      | 2    |

#  @Latihan
#  Scenario: Post create new user with valid JSON
#    Given Post create user with valid json
#    When Send request post creaete user
#    Then Status code should be 201 created
#    And Response body name was "Ardhi Wiranata" and job was "QA Engineer"

#  @Latihan
#  Scenario Outline: Put update user with valid parameter ID and json
#    Given Put update user with valid id <id> and json
#    When Send request put update user
#    Then Status code should be 200 OK
#    And Response body name was "Ardhi Wiranata Edit" and job was "QA Engineer Edit"
#    Examples:
#      | id |
#      | 1  |
#      | 2  |

  #  @Latihan
#  Scenario Outline: Delete user with valid parameter id
#    Given Delete user with valid id <id>
#    When Send request delete user
#    Then Status code should be 204 No Content
#    Examples:
#      | id |
#      | 1  |
#      | 2  |