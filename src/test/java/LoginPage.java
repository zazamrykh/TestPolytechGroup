import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final SelenideElement loginBar = $(byName("st.email"));
    private final SelenideElement passwordBar = $(byName("st.password"));
    private final SelenideElement enterButton = $(byAttribute("data-l", "t,sign_in"));

    public void login(String email, String password){
        open("https://ok.ru/");
        LoginPage loginPage = new LoginPage();
        loginPage.setLoginBar(email);
        loginPage.setPasswordBar(password);
        loginPage.clickEnterButton();
    }

    public void setLoginBar (String login) {
        loginBar.setValue(login);
    }

    public void setPasswordBar (String password) {
        passwordBar.setValue(password);
    }

    public void clickEnterButton () {
        enterButton.click();
    }

}
