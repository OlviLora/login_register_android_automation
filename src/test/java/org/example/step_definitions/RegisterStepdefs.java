package org.example.step_definitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.BaseFunction;
import org.example.elements.RegisterElements;
import static org.testng.AssertJUnit.assertEquals;

public class RegisterStepdefs extends BaseFunction {
    RegisterElements element = new RegisterElements();

    @Then("user in register page")
    public void userInRegisterPage() {
        String page = driver.findElement(AppiumBy.id(element.registerBtn)).getText();
        assertEquals("register", page.toLowerCase());
    }

    @And("user click register button in register")
    public void userClickRegisterButtonInRegister() {
        driver.findElement(AppiumBy.id(element.registerBtn)).click();
    }

    @When("user input field username {string} in register")
    public void userInputFieldUsernameInRegister(String username) {
        driver.findElement(AppiumBy.id(element.registerNameField)).sendKeys(username);
    }

    @And("user input field email {string} in register")
    public void userInputFieldEmailInRegister(String email) {
        driver.findElement(AppiumBy.id(element.registerEmailField)).sendKeys(email);
    }

    @And("user input field password {string} in register")
    public void userInputFieldPasswordInRegister(String password) {
        driver.findElement(AppiumBy.id(element.registerPasswordField)).sendKeys(password);
    }

    @And("user input field confirm {string} in register")
    public void userInputFieldConfirmInRegister(String confirmPassword) {
        driver.findElement(AppiumBy.id(element.registerConfirmField)).sendKeys(confirmPassword);
    }

    @And("user tap back button")
    public void userTapBackButton() {
        driver.navigate().back();
    }

    @Then("user see warning message {string} in register")
    public void userSeeWarningMessageInName(String message) {
        String result_message = driver.findElement(AppiumBy.className(element.warningInvalidName)).getText();
        assertEquals(message, result_message.toLowerCase());
    }
}
