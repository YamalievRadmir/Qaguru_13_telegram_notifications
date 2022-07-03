import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AvitoTestWithStep extends TestBase{

    String Renault = "Renault Logan";
    @Test
    void avitoTestCars() {
        step("Открываем сайт avito.ru", () -> {
            open("https://www.avito.ru");
        });
        step("Пишем в строке поиска: Renault Logan", () -> {
            $(".input-input-Zpzc1").setValue(Renault).pressEnter();
        });
        step("Выбираем последнюю модификацию автомобиля", () -> {
            $(".popular-rubricator-link-Hrkjd").click();
        });
        step("Проверяем результат на странице", () -> {
            $(".items-items-kAJAg").find(String.valueOf(text(Renault)));
        });
    }

    @Test
    void avitoTestPorsche() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.addModelCar();
        steps.clickNewModification();
        steps.checkResult();
    }
}
