package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_COURSE =  Target.the("Selecciona el curso").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[4]/div/div/div[1]/div[2]/div/div/div[1]/div/div/div/div[1]/div/div[1]/a"));

    public static final Target COURSE_NAME = Target.the("Nombre del curso").located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
