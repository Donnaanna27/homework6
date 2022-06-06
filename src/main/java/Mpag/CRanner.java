package Mpag;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class CRanner {
    @BeforeTest
    public void Setup(){

        Selenide.open("https://ee.ge/registration");
        Configuration.browserSize="1920X1080";

    }


}
