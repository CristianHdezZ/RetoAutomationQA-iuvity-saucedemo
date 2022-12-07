package co.com.iuvity.certification.front.runners;

import co.com.iuvity.certification.front.RunnerPersonalizado;
import co.com.iuvity.certification.front.util.BeforeSuite;
import co.com.iuvity.certification.front.util.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import java.io.IOException;


@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/feature/saucedemo.feature",
        glue = "co.com.iuvity.certification.front.steps",
        tags = "@Tests",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SaucedemoRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/feature/saucedemo.feature");
    }
}
