package tests;

import Utils.Browser;
import Utils.Utils;
import org.junit.After;
import org.junit.Before;

public class BaseTests {

    @Before
    public void setup(){
        Browser.loadPage(Utils.getBaseURL());
    }

    @After
    public void tearDow(){
        Browser.close();
    }
}
