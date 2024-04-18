package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions/Homeworkes",
        features = "src/test/resources/features/Homeworks/HW01_Cucumber.feature",
        plugin = {"html:cucumber-reports/html/report.html",
                "json:cucumber-reports/json/report.json",
        "pretty"},
        monochrome = true,
        dryRun = false

)
public class Runner {
}
