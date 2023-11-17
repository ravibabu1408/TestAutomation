@Login

Feature: Login to Rediff site
 
  Scenario Outline: Login to Rediff with valid user credentials
    Given User visit the Rediff Web Portal: "siteName"
    When User wait 2000 milliseconds for page load
    When User clicks on WebElement: "LandingPage_Button_Consent"
    When User wait 2000 milliseconds for page load
    When User clicks on WebElement: "LandingPage_Link_Rediffmail"
    When User enters Data: "UserName" at WebElement: "LoginPage_Input_UserName"
    When User enters Data: "Password" at WebElement: "LoginPage_Input_Password"
    Then User clicks on WebElement: "LoginPage_Button_SignIn"
    When User wait 2000 milliseconds for page load
    Then User Validates Label Text: "" displayed at WebElement: "LoginPage_Heading_ErrorMessage"
    Then User Validates Label Text: "" displayed at WebElement: "LoginPage_Heading_ErrorMessage"

    
    

    Examples: 
      | UserName  | Password | countryGroup  |
      | UserName |Password | https://www.rediff.com/ |
    