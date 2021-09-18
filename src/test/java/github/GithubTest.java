package github;

import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubTest {
    @Test
    void ShouldFindSoftAssertionsPage(){
        open("https://github.com/");
        $( "[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        $(byText("Wikis")).click();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
