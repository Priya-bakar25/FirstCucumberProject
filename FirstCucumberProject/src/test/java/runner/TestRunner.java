package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/json_server_test.feature",glue = {"runner"},monochrome = true,strict = false)
public class TestRunner {
	
	
	

}
