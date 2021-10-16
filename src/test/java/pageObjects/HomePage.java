package pageObjects;

import Utils.Browser;
import elementMapper.HomePageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends HomePageElementMapper {

        public HomePage(){
            PageFactory.initElements(Browser.getCurrentDriver(),this);
        }
    public void clickBtnlogin(){
         login.click();
        }
    }

