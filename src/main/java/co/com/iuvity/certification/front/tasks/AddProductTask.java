package co.com.iuvity.certification.front.tasks;

import co.com.iuvity.certification.front.interactions.SelectProduct;
import co.com.iuvity.certification.front.model.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.iuvity.certification.front.userinterface.AddProduct.*;

public class AddProductTask implements Task {

    private final Product product;

    public AddProductTask(Product product) {
        this.product = product;
    }

    public static AddProductTask in(Product product) {
        return Tasks.instrumented(AddProductTask.class,product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectProduct.keyValues(product.getProduct()),
                Scroll.to(BUTTON_CAR),
                Click.on(BUTTON_CAR),
                Click.on(BUTTON_checkout),
                Enter.keyValues(product.getFirstname()).into(INPUT_firstname),
                Enter.keyValues(product.getLastname()).into(INPUT_lastname),
                Enter.keyValues(product.getPostalCode()).into(INPUT_postalcode),
                Click.on(BUTTON_continue)

        );
    }
}
