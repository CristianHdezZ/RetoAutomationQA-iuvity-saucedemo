package co.com.iuvity.certification.front.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProduct {
    public static final Target BUTTON_ADD_PRODUCT = Target.the("").locatedBy("//div[contains(text(),'{0}')]/../../../div/button");
    public static final Target BUTTON_CAR = Target.the("").located(By.xpath("//a[@class='shopping_cart_link']"));
    public static final Target BUTTON_checkout = Target.the("").located(By.id("checkout"));
    public static final Target INPUT_firstname = Target.the("").located(By.id("first-name"));
    public static final Target INPUT_lastname = Target.the("").located(By.id("last-name"));
    public static final Target INPUT_postalcode = Target.the("").located(By.id("postal-code"));
    public static final Target BUTTON_continue = Target.the("").located(By.id("continue"));
    public static final Target BUTTON_finish = Target.the("").located(By.id("finish"));
    public static final Target LABEL_FINISH = Target.the("").located(By.xpath("//h2[@class='complete-header']"));
    public static final Target BUTTON_CANCEL = Target.the("").located(By.id("cancel"));
    public static final Target BUTTON_STATUS = Target.the("").located(By.xpath("//button[contains(text(),'Remove')]"));

}
