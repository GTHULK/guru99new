package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeatureFiles"},
		glue= {"StepDefinition"},
		dryRun=false,
		monochrome=true
		
	
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
