import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    public void openMainPage() {
        open("https://www.avito.ru");
    }
    public void addModelCar() {
        $(".input-input-Zpzc1").setValue("Rorsche Cayenne").pressEnter();
    }
    public void clickNewModification() {
        $(".popular-rubricator-row-xX6S9").click();
    }
    public void checkResult() {
        $(".items-items-kAJAg").find(String.valueOf(text("Rorsche Cayenne")));
    }
}
