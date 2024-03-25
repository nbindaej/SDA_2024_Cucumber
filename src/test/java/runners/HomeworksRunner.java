package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions/Homeworkes",
        features = "src/test/resources/features/Homeworks",
        tags = "@Samsung or @Clicking or @Japan"
)
public class HomeworksRunner {
}
