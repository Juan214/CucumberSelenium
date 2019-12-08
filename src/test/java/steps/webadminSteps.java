package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class webadminSteps {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @Given("^Abriendo el navegador e Ingresar Link de Web Admin$")
    public void abriendo_El_Navegador_E_Ingresar_Link_De_Web_Admin() throws Throwable{
        System.setProperty("webdriver.chrome.driver", "D:\\juancito\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appmovil-backend-test.mybluemix.net/login.xhtml");
    }

    @When("^Ingresar usuario$")
    public void ingresar_Usuario() throws Throwable{
        driver.findElement(By.id("frmLogin:txtUsuario")).sendKeys("Admin");

    }

    @And("^Ingresar contraseña$")
    public void ingresar_Contraseña() throws Throwable{
        driver.findElement(By.id("frmLogin:txtPassword")).sendKeys("admin");
    }

    @And("^Realizar el Login a la web$")
    public void realizarElLoginALaWeb() throws Throwable{
        WebElement option = driver.findElement(By.id("frmLogin:btnProcesarLogin"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();
    }

    @And("^Ingrear a parametros$")
    public void ingrearAParametros() {
        WebElement option = driver.findElement(By.id("menuParametro"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();


    }

    @And("^Ingresar a parametros de validacion$")
    public void ingresarAParametrosDeValidacion() {
        WebElement option = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/ul[1]/li[1]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();

        //li[@id='menuParametro']

    }



    @And("^buscar texto gps$")
    public void buscarTextoGps() {

        driver.findElement(By.id("paramTable:datatable:j_idt28:filter")).sendKeys("gps");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("^hacer click en editar$")
    public void hacerClickEnEditar() {
        WebElement option = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]"));
        wait = new WebDriverWait(driver, 10);
        option.click();
    }

    @Then("^Se muestra en pantalla el parametro$")
    public void seMuestraEnPantallaElParametro() {
        driver.findElement(By.id("f_UsuarioNuevo:paramValue")).clear();
        driver.findElement(By.id("f_UsuarioNuevo:paramValue")).sendKeys("0");


    }

}
