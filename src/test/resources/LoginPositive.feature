Feature: User enters own info into the login page and pass the home page

  Background:
    Given user goes to login page

    #Keyword Driven Testing
    @regression
    @smoke
    @login
    @positive
    # Asagidaki sekilde kullanıcının davranışlarını tanımlayan geliştirmeye BDD yani Behavior Driven Development denir.
    Scenario: user should be login successfully with valid user name and user password
      When user enters own invalid user name into the user name box
      And user enters own invalid user password into the password box
      And user clicks the login box
      Then user goes to home page

