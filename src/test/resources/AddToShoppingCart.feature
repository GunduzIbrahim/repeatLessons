Feature: User adds an item to the cart and user sees this increase in the number of these items on the cart icon.


  Background:
    Given user goes to login page

    #Keyword Driven Testing

  @smoke

    # Asagidaki sekilde kullanıcının davranışlarını tanımlayan geliştirmeye BDD yani Behavior Driven Development denir.
  Scenario: When the user adds an item to the cart, the number above the cart icon increases by one.
    When user login with valid user name and password
    And user clicks backpack add to cart button
    Then user allows the number above the cart icon increases by one
    And user clicks fleece Jacket add to cart button
    Then user allows the number above the cart icon increases by one