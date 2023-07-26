package pages;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void clickButton(String text){
        $(By.xpath("//span[contains(text(), \"Увійти\")]")).click();
    }

    public void clickSubmitButton(String text){
        $(By.xpath("//button[contains(text(), \"Увійти\")]")).click();
    }

    public void checkLogo(String text){
        $(By.xpath("//*[text()=\"ЕБ\"]")).shouldBe(Condition.exactText("ЕБ"));
    }
}
