package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import support.customUtils.CustomUtils;


@Slf4j
public class BasePage extends PageObject {
    public static final Logger log = LoggerFactory.getLogger(BasePage.class);

	
	 Actor GigyaUser = Actor.named("GigyaUser");
	 
	
	  public void userWaitForPageToLoad(int waitingTime) {
	        try {
	            Thread.sleep(waitingTime);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	  

	    public String getFilePath() {
	        String filepath = "src/main/resources/WebElements/WebElements.properties";
	        return filepath;
	    }

	    @Step
	    public WebElementFacade getWebElementFacade(String selector) {
	        String webSelector = null;
	        try {
	            webSelector = CustomUtils.getWebElement(getFilePath("WebElements"), selector);
	        } catch (Exception e) {
	            log.info("Selector NOT found");
	        }
	        waitForCondition().until(
	                ExpectedConditions.visibilityOf($(webSelector))
	        );
	        return $(webSelector);
	    }
	    
	    
//	    public String getFilePath(String typeOfFile) {
//	        String folderPath = "src/main/resources/WebElements/WebElements.properties";
//	        
//	        return folderPath;
//	        
//	    }
	    
	    public String getFilePath(String typeOfFile) {
	        String folderPath = "src/main/resources/WebElements/WebElements.properties";
	        
	        return folderPath;
	        
	    }
	    
	    @Step
	    public WebElement getWebElement(String selector) {
	        String webSelector = null;
	        try {
	            webSelector = CustomUtils.getWebElement(getFilePath("WebElements"), selector);
	        } catch (Exception e) {
//	            log.info("Selector NOT found");
	        }
	        waitForCondition().until(
	                ExpectedConditions.visibilityOf($(webSelector))
	        );
	        return $(webSelector);
	    }
	    
	    
}
