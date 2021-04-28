package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {
    String
            base_url = "https://www.ibank.priorbank.by/",
            clientName = "ООО \"ФИРМА\"",
            clientUnp = "УНП 111111116",
            userName = "Иванов Иван Иванович";

    @Step("Открываем страницу входа в Приорбанк для Бизнеса")
    public void openMainPage() {
        open(base_url);
    }

    @Step("Вводим данные в поля логин и пароль")
    public void insertTestData() {
        $("[name=UserName]").setValue("demotest");
        $("[name=Password]").setValue("123/*---");
    }

    @Step("Нажимаем кнопку \"Войти в банк\"")
    public void clickSubmit() {
        $("[type=submit]").click();
    }

    @Step("Проверяем в хэдере данные пользователя")
    public void checkHeader() {
        $("#header").shouldHave(text(clientName),
                text(clientUnp),
                text(userName));
    }

}

