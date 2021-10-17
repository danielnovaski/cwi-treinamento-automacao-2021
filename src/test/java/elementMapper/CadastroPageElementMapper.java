package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPageElementMapper {
    @FindBy(id="customer_firstname")
    public WebElement primeiroNome;

    @FindBy(id="customer_lastname")
    public WebElement ultimoNome;

    @FindBy(id="passwd")
    public WebElement senha;

    @FindBy(id="address1")
    public WebElement endereco;

    @FindBy(id="city")
    public WebElement cidade;

    @FindBy(id="uniform-id_state")
    public WebElement estado;

    @FindBy(css="#uniform-id_state option[value='4']")
    public WebElement opcaoEstado;

    @FindBy(id="postcode")
    public WebElement cep;

    @FindBy(id="uniform-id_country")
    public WebElement pais;

    @FindBy(id="phone_mobile")
    public WebElement phone;

    @FindBy(id="submitAccount")
    public WebElement registro;



}
