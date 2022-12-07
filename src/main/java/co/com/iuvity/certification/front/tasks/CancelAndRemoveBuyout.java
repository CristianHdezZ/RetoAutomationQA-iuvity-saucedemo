package co.com.iuvity.certification.front.tasks;

import co.com.iuvity.certification.front.interactions.SelectProduct;
import co.com.iuvity.certification.front.model.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.iuvity.certification.front.userinterface.AddProduct.BUTTON_CANCEL;

public class CancelAndRemoveBuyout implements Task {

    private final Product product;

    public CancelAndRemoveBuyout(Product product) {
        this.product = product;
    }

    public static CancelAndRemoveBuyout with(Product product) {
        return Tasks.instrumented(CancelAndRemoveBuyout.class,product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CANCEL),
                SelectProduct.keyValues(product.getProduct())
        );

    }
}
