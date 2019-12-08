package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Given("^Abriendo el navegador e Ingresar Link de Trazabiliada$")
    public void abriendoElNavegadorEIngresarLinkDeTrazabiliada() {
        System.setProperty("webdriver.chrome.driver", "D:\\juancito\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appmovil-backend-test.mybluemix.net/login.xhtml");
    }

    @When("^Seleccionar Tipo de Documento (\\d+)$")
    public void seleccionarTipoDeDocumentoDocumentType(int documentType) {
        Select documentTypeSelect = new Select(driver.findElement(By.id("boxSelect")));
        documentTypeSelect.selectByValue(String.valueOf(documentType));
    }

    @And("^Ingreso de Numero de Documento (\\d+)$")
    public void ingresoDeNumeroDeDocumentoDocumentNumber(String documentNumber) {
        driver.findElement(By.id("nrodocumento")).sendKeys(documentNumber);
    }

    @And("^Aceptamos Terminos y Condiciones$")
    public void aceptamosTerminosYCondiciones() {
        driver.findElement(By.id("checkterms")).sendKeys(Keys.SPACE);
    }

    @And("^Realizar el Login$")
    public void realizarElLogin() {
        WebElement option = driver.findElement(By.xpath("//a[@class='btn btnmovistar']"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();
    }

    @Then("^Se muestra pantalla del token$")
    public void seMuestraPantallaDelToken() {
        driver.close();
    }


}
