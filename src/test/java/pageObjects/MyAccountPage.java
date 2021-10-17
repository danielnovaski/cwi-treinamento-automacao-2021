package pageObjects;

import Utils.Browser;
import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends MyAccountPageElementMapper {
    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public String getTituloDaPagina() {
        return tituloDapagina.getText();
    }
}
