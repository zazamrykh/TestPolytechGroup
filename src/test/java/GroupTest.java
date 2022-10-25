import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GroupTest {

    @Test
    public void main() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("technoPol18", "technoPolis2022");
        open("https://ok.ru/groups/");
        GroupPage groupPage = new GroupPage();
        groupPage.searchPolytechGroup("Санкт-Петербургский политехнический университет");
    }
}
