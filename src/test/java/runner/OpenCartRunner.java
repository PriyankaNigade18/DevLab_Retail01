package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * Single scenario tags="@Login"
 * Multiple Scenario= "@Login  or Register"
 * Skip any one scenario tags="not @Register"
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/OpenCartLogin.feature",
				 glue="stepdef",
				 tags="not @Register")
public class OpenCartRunner {

}
