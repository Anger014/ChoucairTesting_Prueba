package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Button that show us the form to login").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li/a"));

    public static final Target INPUT_USERNAME = Target.the("Where we going to write username").located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("Where we going to write password").located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("Button to confirm login").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));




}
