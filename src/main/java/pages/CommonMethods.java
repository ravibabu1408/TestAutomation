package pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
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

	
	
	

}
