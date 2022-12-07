package co.com.iuvity.certification.front.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_USER = Target.the("Input User").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Input Pass").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("BUTTON LOGIN").located(By.id("login-button"));
}
