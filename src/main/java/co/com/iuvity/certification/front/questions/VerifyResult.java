package co.com.iuvity.certification.front.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.iuvity.certification.front.userinterface.AddProduct.BUTTON_finish;
import static co.com.iuvity.certification.front.userinterface.AddProduct.LABEL_FINISH;

public class VerifyResult implements Question<Boolean> {
    private final String strResult;

    public VerifyResult(String strResult) {
        this.strResult = strResult;
    }

    public static VerifyResult with(String strResult) {
        return new VerifyResult(strResult);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(BUTTON_finish),
                Scroll.to(LABEL_FINISH)
        );
        return Text.of(LABEL_FINISH).answeredBy(actor).equalsIgnoreCase(strResult);
    }
}
