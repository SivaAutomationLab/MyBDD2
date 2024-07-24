package prac.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/features", glue="src/main/java/prac/stepDef")
public class RunnerClass {
}
