Feature: Addition of Numbers

  
  Scenario: Addition of Two whole numbers
    Given Verify app is Launched
    And Enter First number "5"
    And Enter Operator as "+"
    And Enter Second number "5"
    When Operator is given as "="
    Then Result should be calculated and assertion was done with "5" and "5"

