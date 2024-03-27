package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions/Homeworkes",
        features = "src/test/resources/features/Homeworks/HW04_Day02_Cucumber.feature"

)
public class HomeworksRunner {
}
