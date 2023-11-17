package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = RunnerConstants.featureFilePath,
        glue = RunnerConstants.gluePath,
       // tags = "@UCAN and @FI and @RegistrationE2E"
        tags = "@Login"
)
public class Test_Runner {
}