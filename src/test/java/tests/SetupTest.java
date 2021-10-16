package tests;

import Utils.Browser;
import Utils.Utils;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import static org.junit.Assert.assertTrue;


public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseURL()));
        System.out.println("Abrimos o navegador e carregamos a url!");

    }
    @Test
    public  void testlogin(){
        //Iniciar as paginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnlogin();
        System.out.println("clicou em sign in e direcionou para a pagina de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseURL()
                .concat("index.php?controller=authentication&back=my-account")));
        login.fillEmail();
        System.out.println("preencheu o email");
        login.fillPaswd();
        System.out.println("preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("clicou em sign in");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseURL().concat
                ("index.php?controller=my-account")));
        System.out.println("validou a url da minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("validou minha conta no site");





    }


}
