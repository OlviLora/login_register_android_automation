package org.example.step_definitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.BaseFunction;
import org.example.elements.LoginElements;
import org.example.elements.RegisterElements;

import java.net.MalformedURLException;

import static org.testng.AssertJUnit.assertEquals;

public class LoginStepdefs extends BaseFunction {
    static BaseFunction base = new BaseFunction();
    LoginElements element = new LoginElements();

    @Given("user open install the apps")
    public void userOpenInstallTheApps() throws MalformedURLException {
        base.setAppiumLocal();
    }

    @And("user close the pop-up")
    public void userCloseThePopUp() {
        driver.findElement(AppiumBy.id(element.OKButtonPopUp)).click();
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        driver.findElement(AppiumBy.id(element.usernameField)).sendKeys(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        driver.findElement(AppiumBy.id(element.passwordField)).sendKeys(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        driver.findElement(AppiumBy.id(element.loginBtn)).click();
    }

    @And("user close the app")
    public void userCloseTheApp() {
        base.quitAppium();
    }

    @When("user click register link")
    public void userClickRegisterLink() {
        driver.findElement(AppiumBy.id(element.registerLink)).click();
    }

    @When("user input username {string} in login")
    public void userInputUsernameInLogin(String username) {
        driver.findElement(AppiumBy.id(element.usernameField)).sendKeys(username);
    }

    @And("user input password {string} in login")
    public void userInputPasswordInLogin(String password) {
        driver.findElement(AppiumBy.id(element.passwordField)).sendKeys(password);
    }

    @Then("verify user {string} is successfully login")
    public void verifyUserIsSuccessfullyLogin(String username) {
        String result_username = driver.findElements(AppiumBy.id(element.strUsername)).get(0).getText();
        assertEquals(username.toLowerCase(), result_username.toLowerCase());
    }

    @Then("user see warning message {string} in login")
    public void userSeeWarningMessageInLogin(String message) {
        String result_message = driver.findElement(AppiumBy.xpath(element.strWarningEmail)).getText();
        assertEquals(message, result_message.toLowerCase());
    }

    @Then("user still in login page")
    public void userStillInLoginPage() {
        driver.findElement(AppiumBy.id(element.loginBtn)).isDisplayed();
    }
}
