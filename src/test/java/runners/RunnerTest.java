package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/funtional_Test",
		glue = {"stepDefinations"},
		plugin = {"pretty", "html:target/cucumber.html"},
		dryRun = false,
		monochrome = true
		)
public class RunnerTest {

}
