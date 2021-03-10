Feature: Dataprovider assignment

  Scenario: to fetch data from dataprovider
    Given getting website
    When getting response from website provided
    Then validating the response code for all sites
