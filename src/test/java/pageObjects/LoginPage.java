package pageObjects;

import Utils.Browser;
import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginPageElementMapper {

    public  LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }

    public void fillEmail(){
        email.sendKeys("novaskidaniel@gmail.com");
    }

    public void fillPaswd(){
        passwd.sendKeys("tdi48364836");

    }

    public void clickBtnSubmitLogin(){
      SubmitLogin.click();
    }


}
