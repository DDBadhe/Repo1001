Feature: Dataprovider assignment

  Scenario Outline: to fetch data from dataprovider
    Given getting <site> website
    When getting response from website provided
    Then validating the response code for all sites

    Examples: 
      | site                     |
      | https://www.google.com/  |
      | https://in.yahoo.com/    |
      | https://api.ratesapi.io/ |
