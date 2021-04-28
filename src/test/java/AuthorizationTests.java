import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTests {
    String
            clientName = "ООО \"ФИРМА\"",
            clientUnp = "УНП 111111116",
            userName = "Иванов Иван Иванович";
    @Test
    void demoTestAuthorization() {
        open("https://www.ibank.priorbank.by/");
        $("[name=UserName]").setValue("demotest");
        $("[name=Password]").setValue("123/*---");
        $("[type=submit]").click();
        $("#header").shouldHave(text(clientName),
                text(clientUnp),
                text(userName));
    }
}
