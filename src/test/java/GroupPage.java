import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GroupPage {

    public void searchPolytechGroup(String groupName){
        $(By.xpath(GroupLocators.SEARCH_BUTTON_LOC)).setValue(groupName).pressEnter();
        compareGroupName();
    }

    public void compareGroupName(){
         $(By.xpath("//*[@href='/polytechpetra']")).lastChild().should(Condition.exist);
         checkCheckMark();
    }

    public void checkCheckMark(){
        $(By.xpath(GroupLocators.CHECK_MARK_LOC)).shouldBe();
    }
}