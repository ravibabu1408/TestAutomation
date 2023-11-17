package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.BasePage;
import pages.CommonMethods;
import support.customUtils.CustomUtils;

public class CommonGherkinSteps {
	
	@Steps
    CommonMethods commonMethods;
    BasePage basePage ;

    @Given("User visit the Rediff Web Portal: {string}")
    public void userVisitTheGigyaWebPage(String url) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        System.setProperty("countryGroup", countryGroup);
//        System.setProperty("countryCode", countryCode);
        commonMethods.userVisitTheGigyaWebPage(CustomUtils.getUrls(url));
//        commonMethods.userVisitTheGigyaWebPage(CustomUtils.getUrls(countryCode));

    }


//
//    @Given("User visit the Gigya Web Portal: {string} and  {string}")
//    public void userVisitTheGigyaWebPortal(String countryGroup, String countryCode) {
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        System.setProperty("countryGroup", countryGroup);
//        System.setProperty("countryCode", countryCode);
//        commonMethods.userVisitTheGigyaWebPortal(CustomUtils.getUrlsByGroup());
//
//    }

  
    @Then("User wait {int} milliseconds for page load")
    public void userWaitForPageToLoad(int waitingTime) {
        commonMethods.userWaitForPageToLoad(waitingTime);
    }

    @Then("User clicks on WebElement: {string}")
    public void userClicksOn(String selector) {
        commonMethods.userClicksOn(selector);
    }


    @Then("User enters Data: {string} at WebElement: {string}")
    public void userEntersDataAt(String inputData, String selector) {
        commonMethods.userEntersDataAt(inputData, selector);
    }

    @Then("User verify WebElement: {string} is visible")
    public void userVerifyWebElementIsVisible(String selector) {
        commonMethods.userVerifyWebElementIsVisible(selector);
    }
    
    @Then("User Validates Label Text: {string} displayed at WebElement: {string}")
    public void userValidatesLabelTextDisplayedAtWebElement(String expectedText, String selector) {
    	commonMethods.userValidatesLabelTextDisplayedAtWebElement(expectedText, selector);
    }
    
    @Then("User Validates Button Text: {string} displayed at WebElement: {string}")
    public void userValidatesButtonTextDisplayedAtWebElement(String expectedText, String selector) {
    	commonMethods.userValidatesButtonTextDisplayedAtWebElement(expectedText, selector);
    }
    
    @Then("User Validates Error Message: {string} displayed at WebElement: {string}")
    public void userValidatesErrorMessageDisplayedAtWebElement(String expectedText, String selector) {
        commonMethods.userValidatesErrorMessageDisplayedAtWebElement(expectedText, selector);
    }



}
