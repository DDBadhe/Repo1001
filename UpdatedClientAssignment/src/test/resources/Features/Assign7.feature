Feature: Future date


  Scenario: Sending the future date in url  
    Given API is given for foreign exchange website
    When when posted with future date
    Then Validate the date from body
