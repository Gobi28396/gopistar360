Feature: To validating Search functionality

  Scenario Outline: To verify the Search Functionality with Valid Credentials.
    Given User in home page
    When User enters the products name "<products>"
    Then click enter button

    Examples: 
      | products      |
      | nike air max  |
      | puma shoes    |
      | addidas shoes |
