Feature: to validate

  Scenario: To validate response status code
    Given url is given
    When navigate to url and get response
    Then validate status code and status line