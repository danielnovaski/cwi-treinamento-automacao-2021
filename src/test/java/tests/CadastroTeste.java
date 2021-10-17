package tests;

import Utils.Browser;
import Utils.Utils;
import elementMapper.MyAccountPageElementMapper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.CadastroPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

import static org.junit.Assert.assertTrue;


public class CadastroTeste extends BaseTests{






    @Test
    public  void testCadastroValido(){

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CadastroPage cadastro = new CadastroPage();
        MyAccountPage myAccount = new MyAccountPage();
        home.clickBtnlogin();
        login.preencherEmailCadastro();
        System.out.println("preencheu o email");

        login.clickBtnSubmitCadastro();
        System.out.println("clicou no botao de cadastro");

        cadastro.preencherCampoPrimeiroNome();
        System.out.println("preencheu o campo primeiro nome");

        cadastro.preencherCampoUltimoNome();
        System.out.println("preencheu o campo ultimo nome");

        cadastro.preencherCampoSenha();
        System.out.println("prencheu a senha");

        cadastro.preencherCampoEndereco();
        System.out.println("preencheu o campo endereco");

        cadastro.preencherCampocidade();
        System.out.println("preencheu o campo cidade");

        cadastro.clicarSelectEstado();
        System.out.println("selecionou o estado");

        cadastro.clicarOpcaoEstado();
        System.out.println("confirmou o estado selecionado");

        cadastro.preencherCep();
        System.out.println("preencheu o campo cep");

        cadastro.clicarSelectPais();
        System.out.println("selecionou o pais");

        cadastro.preencherPhone();
        System.out.println("preencheu o campo phone");

        cadastro.clicarSelectRegistro();
        System.out.println("clicou no botao registro");
        System.out.println(myAccount.getTituloDaPagina());
        assertTrue(myAccount.getTituloDaPagina()
                .contains("MY ACCOUNT"));
        System.out.println("registrou minha conta no site");

    }


}
