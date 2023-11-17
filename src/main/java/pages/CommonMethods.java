package pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

@Slf4j
public class CommonMethods extends BasePage {
	
	
	@Step
	
	public void userVisitTheGigyaWebPage(String url) {
		getDriver().get(url);
		log.info("Site is Launched successfully : "+url);
	}

	@Step
	public void userClicksOn(String selector) {
		// TODO Auto-generated method stub
        GigyaUser.attemptsTo(Click.on(getWebElementFacade(selector)).afterWaitingUntilEnabled());
		log.info("User clicked on webelement : "+selector);


	}



	@Step
	public void userEntersDataAt(String inputData, String selector) {

		GigyaUser.attemptsTo(Enter.theValue(inputData).into(getWebElementFacade(selector)));
		log.info("Data Entered: " + inputData + " @==> " + selector);

	}

	@Step
	public void userVerifyWebElementIsVisible(String selector) {
		getWebElement(selector).isDisplayed();
		
	}
	
	
	@Step

	public void userValidatesErrorMessageDisplayedAtWebElement(String expectedText, String selector) {
//		log.info("Original Text (Key): ==>>" + expectedText);
        expectedText = getUserLocalizationTestData(expectedText).trim();
        log.info("Expected Error Message: " + expectedText + " @==> " + selector);
        String displayedText = getWebElement(selector).getText().trim();
        log.info("Displayed Error Message: " + displayedText + " @==> " + selector);
        GigyaUser.attemptsTo(Ensure.that(displayedText).isEqualTo(expectedText));
        //  GigyaUserAssertUsingASCII(expectedText,displayedText);		
	}
	
	@Step
	public void userValidatesLabelTextDisplayedAtWebElement(String expectedText, String selector) {
//        log.info("Original Label Text (Key): " + expectedText + " @==> " + selector);
        expectedText = getUserLocalizationTestData(expectedText).trim();
        //expectedText = getLocalizationFromSession(expectedText).trim();
        log.info("Expected Label Text (Value): " + expectedText + " @==> " + selector);
        String displayedText = getWebElement(selector).getText().trim();
        if (displayedText.endsWith(" i")) {
            displayedText = displayedText.substring(0, displayedText.length() - 2);

        }
        log.info("Displayed Label Text: " + displayedText + " @==> " + selector);
        GigyaUser.attemptsTo(Ensure.that(displayedText).isEqualTo(expectedText));
    }

	
	  @Step
	    public void userValidatesButtonTextDisplayedAtWebElement(String expectedText, String selector) {
//	        log.info("Original Text (Key): ==>>" + expectedText);
	        expectedText = getUserLocalizationTestData(expectedText).trim();
	        log.info("Expected Button Text: " + expectedText + " @==> " + selector);
	        String displayedText = getWebElement(selector).getAttribute("value").trim();
	        log.info("Displayed Button Text: " + displayedText + " @==> " + selector);
	        GigyaUser.attemptsTo(Ensure.that(displayedText).isEqualTo(expectedText));
	    }

	
	  @Step
	    public void userLoadDataFromLocalizationSheet(String localizationSheet) {
	        loadLocalizationData(localizationSheet);
	    }
	
	

}
