package pageObjects;

import Utils.Browser;
import elementMapper.CadastroPageElementMapper;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage extends CadastroPageElementMapper {
    public CadastroPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public void preencherCampoPrimeiroNome(){
        primeiroNome.sendKeys("daniel");
    }

    public void preencherCampoUltimoNome(){
        ultimoNome.sendKeys("novaski");
    }

    public void preencherCampoSenha(){
        senha.sendKeys("teste123");
    }

    public void preencherCampoEndereco(){
        endereco.sendKeys("dr nereu ramos 285");
    }

    public void preencherCampocidade(){
        cidade.sendKeys("Praia Grande ");
    }

     public void clicarSelectEstado(){
        estado.click();
    }

    public void clicarOpcaoEstado(){
        opcaoEstado.click();
    }

    public void preencherCep(){
        cep.sendKeys("88899");
    }

    public void clicarSelectPais(){
        pais.click();
    }

    public void preencherPhone(){
        phone.sendKeys("924853569");
    }

    public void clicarSelectRegistro(){
        registro.click();
    }




}
