package Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
		features = "./src/test/java/Feature/Addition.feature",
		glue = "Steps",
		monochrome = true
		)

public class Runner extends AbstractTestNGCucumberTests {

}
