package test;

import locators.Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Collections;
import java.util.List;

public class TestCases extends TestBase {

    Locators commenwealth = new Locators();
    @Test
    public void test(){
        commenwealth.openurl();

       List<WebElement> list = Collections.singletonList(commenwealth.programs);

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i).getText());
        }

        commenwealth.amIEligible.click();
        commenwealth.Exit.click();
    }
}
