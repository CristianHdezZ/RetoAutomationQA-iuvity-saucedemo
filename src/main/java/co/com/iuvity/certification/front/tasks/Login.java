package co.com.iuvity.certification.front.tasks;

import co.com.iuvity.certification.front.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.iuvity.certification.front.userinterface.LoginPage.INPUT_PASSWORD;
import static co.com.iuvity.certification.front.userinterface.LoginPage.INPUT_USER;

public class Login implements Task {

    public static Login inThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("standard_user").into(INPUT_USER),
                Enter.keyValues("secret_sauce").into(INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)
        );

    }
}
