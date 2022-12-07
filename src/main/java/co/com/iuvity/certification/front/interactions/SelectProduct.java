package co.com.iuvity.certification.front.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.iuvity.certification.front.userinterface.AddProduct.BUTTON_ADD_PRODUCT;

public class SelectProduct implements Interaction {
    private final String product;

    public SelectProduct(String product) {
        this.product = product;
    }

    public static SelectProduct keyValues(String product) {
        return Tasks.instrumented(SelectProduct.class,product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (String strProduct : product.split(",")) {
            actor.attemptsTo(
                    Scroll.to(BUTTON_ADD_PRODUCT.of(strProduct)),
                    Click.on(BUTTON_ADD_PRODUCT.of(strProduct))
            );
        }

    }
}
