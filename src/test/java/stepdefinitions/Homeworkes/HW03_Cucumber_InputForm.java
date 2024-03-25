package stepdefinitions.Homeworkes;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HW03_Cucumber_InputForm {
    WebDriver driver;
    @Given("open the website")
    public void open_the_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    }
    @Then("Insert {string} and {string} and {string}")
    public void insert_and_and(String firstname, String lastname, String age) {
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("surname")).sendKeys(lastname);
        driver.findElement(By.id("age")).sendKeys(age);
    }
    @Then("Select the {string}")
    public void select_the(String country) {
        WebElement countrySelect = driver.findElement(By.id("country"));
        Select select = new Select(countrySelect);
        select.selectByVisibleText(country);
    }
    @Then("Click on submit button")
    public void click_on_submit_button() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Then("Verfiy {string} Displayed")
    public void verfiy_displayed(String message) {
        WebElement validationMessage = driver.findElement(By.xpath("//*[text()='Input Validation Response']"));
        Assert.assertTrue(validationMessage.getText().contains(message));
    }

    @And("Close the browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
