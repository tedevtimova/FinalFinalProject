package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:Features/"},
        glue = {"classpath:StepDefinitions", "classpath:Helpers"},
        tags = "@test",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class RunnerClass {

}
