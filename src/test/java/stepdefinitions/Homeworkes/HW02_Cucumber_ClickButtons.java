package stepdefinitions.Homeworkes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW02_Cucumber_ClickButtons {
    WebDriver driver;
    @Given("open the website {string}")
    public void openTheWebsite(String link) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(link);
    }

    @Then("Click on {string} button and wait")
    public void clickOnButtonAndWait(String buttonName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement button = driver.findElement(By.xpath("//button[text()='"+buttonName+"']"));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

    @Then("Verify {string} message Displayed")
    public void verifyMessageDisplayed(String text) {
        WebElement message = driver.findElement(By.id("buttonmessage"));
        Assert.assertTrue(message.getText().contains(text));
    }

    @And("close the page")
    public void closeThePage() {
        driver.close();
    }
}
