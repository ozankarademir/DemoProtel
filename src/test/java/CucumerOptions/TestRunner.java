package CucumerOptions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="Stepdefinition",tags="@SeleniumTests",
        monochrome=true)

public class TestRunner { }