package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert_ {
    @Test
    public void geekforgeeks() {
        String actualRersult="bbbbbbbbbbbbbbbbbbbbbb";
        String expectedResult="aaaaaaaaaaaaaaaaaa";

        SoftAssert sf=new SoftAssert();
        sf.assertEquals(expectedResult,actualRersult);
       // sf.assertAll();  will pass
        sf.assertAll();
        //java.lang.AssertionError: The following asserts failed:
//        expected [bbbbbbbbbbbbbbbbbbbbbb] but found [aaaaaaaaaaaaaaaaaa]
//        Expected :bbbbbbbbbbbbbbbbbbbbbb
//        Actual   :aaaaaaaaaaaaaaaaaa
//                <Click to see difference>
    }
}
