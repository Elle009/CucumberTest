package steps;

import config.userConfig;
import pages.SignInPage;
import io.cucumber.java.en.Then;

public class SignInPageDef {

    SignInPage signInPage = new SignInPage();

    @Then("input login")
    public void inputLogin() {
        signInPage.inputLogin(userConfig.USER_LOGIN);
    }

    @Then("input password")
    public void inputPassword() {
        signInPage.inputPassword(userConfig.USER_PASSWORD);
    }
}
