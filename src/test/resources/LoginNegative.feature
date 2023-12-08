Feature: User enters own info into the login page and pass the home page

  Background:
    Given user goes to login page

    #Keyword Driven Testing

  @login
  @negative

    Scenario Outline: User shouldn't be login with invalid user name or user password

    When user should enter valid user name into the user name box
    And user enters invalid "<password>" into the password box
    And user should click the login box
    Then user receives an error message and remains on the home page
    # Asagida Kullandigimiz tablo yöntemi ile DDT yani Data Driven Testing yapmis oluyoruz.
    Examples:
    |password|
    |Ps.4567?|
    |ps4567? |
    |Ps.asdf?|
    |Ps.4567,|

          # TDD (Test Driven Development)
      # BDD (Beheviour Driven Development)

      # DDT (Data Driven Testing)
      # KDT (Keyword Driven Testing)