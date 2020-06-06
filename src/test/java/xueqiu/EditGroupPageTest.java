package xueqiu;

import com.xueqiu.EditGroupPage;
import com.xueqiu.Mainpage;
import com.xueqiu.MarketPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditGroupPageTest {
    static Mainpage mainpage;
    static EditGroupPage editGroupPage;

    @BeforeEach
    void setUp() {
        mainpage=new Mainpage();
        editGroupPage=mainpage.goToMarketPage().goToEditGroupPage();
    }

    @AfterEach
    void tearDown() {
        mainpage.quitDriver();
    }


    @Test
    void deleteOptional() {
        editGroupPage.deleteOptional().complete();
    }
}