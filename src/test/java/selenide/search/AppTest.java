package selenide.search;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        //set opening browser
        System.setProperty("selenide.browser", "chrome");
        //open new tab
        open("https://google.com/");
        //find search field and input
        $(By.name("q")).setValue("mojmir kubistel").pressEnter();
        //look for element and click it
        $(By.partialLinkText("Mojmír Kubistel - IMDb")).shouldBe(visible).click();
    }
}
