package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.BasicPage;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    private final SelenideElement searchField = $(By.id("search"));
    private final SelenideElement searchButton = $(By.xpath("//button[contains(text(), \"Знайти\")]"));
    private final SelenideElement bookName = $(By.xpath("//a[contains(text(), \"Harry Potter Poster Colouring Book\")]"));
    private final SelenideElement addToCartButton = $(By.cssSelector("div[class='product-sidebar__ordering'] button[class='ui-btn-primary add-to-cart']"));
    private final SelenideElement basketButton = $(By.xpath("//span[contains(text(), \"Кошик\")]"));
    private final SelenideElement orderButton = $(By.xpath("//button[contains(text(), \"Оформити замовлення\")]"));
    private final SelenideElement closeButton = $(By.xpath("//button[@class=\"ui-btn-close product-layout__close\"]"));
    private final SelenideElement updButton = $(By.xpath("//button[@class=\"ui-btn-close product-layout__close\"]"));

    @Given("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @And("Click {string}button")
    public void clickSubmitButton(String arg0) {
        basicPage.clickSubmitButton(arg0);
    }

    @Then("check is {string} visible")
    public void checkIsVisible(String arg0) {
        basicPage.checkLogo(arg0);
    }

    @And("input book name in search field")
    public void inputBookNameInSearchField() {
        searchField.click();
        searchField.val("harry potter");
    }

    @And("click on Search button")
    public void clickOnSearchButton() {
        searchButton.click();
    }

    @And("wait for book's name")
    public void waitForBookSName() {
        bookName.shouldHave(exactText("Harry Potter Poster Colouring Book"));

    }

    @Then("add book to the basket")
    public void addBookToTheBasket() {
        bookName.click();
        addToCartButton.click();
    }

    @Then("check book in the basket")
    public void checkBookInTheBasket() {
        basketButton.click();
        orderButton.click();
        bookName.shouldHave(exactText("Harry Potter Poster Colouring Book"));
    }
}
