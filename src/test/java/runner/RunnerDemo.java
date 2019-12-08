package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/Login2.feature",
        glue = {"steps"},
        monochrome = true
)
public class RunnerDemo {

    }


