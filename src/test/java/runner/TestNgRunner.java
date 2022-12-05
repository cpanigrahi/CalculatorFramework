package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature/CucumberTree.feature", glue = {
		"stepdefination" }, dryRun = false, monochrome = true)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}