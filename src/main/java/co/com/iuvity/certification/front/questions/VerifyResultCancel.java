package co.com.iuvity.certification.front.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.iuvity.certification.front.userinterface.AddProduct.*;


public class VerifyResultCancel implements Question<Boolean> {
    private final String strResult;

    public VerifyResultCancel(String strResult) {
        this.strResult = strResult;
    }

    public static VerifyResultCancel with(String strResult) {
        return new VerifyResultCancel(strResult);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !Text.of(BUTTON_STATUS).answeredBy(actor).equalsIgnoreCase(strResult);
    }
}
