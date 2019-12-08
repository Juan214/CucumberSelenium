package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FijaSteps {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Given("^Abriendo el navegador e Ingresar Link de la web fija$")
    public void abriendoElNavegadorEIngresarLinkDeLaWebFija() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:\\juancito\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tdp-web-venta-fija-qa.mybluemix.net/");
    }

    @When("^Ingresar un usuario$")
    public void ingresarUnUsuario() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/main[1]/login[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/main[1]/login[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).
                sendKeys("158829");
    }

    @And("^Darle click en continuar$")
    public void darleClickEnContinuar() throws Throwable {
        WebElement option = driver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/main[1]/login[1]/div[2]/div[1]/div[1]/form[1]/div[2]/a[1]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();
    }
   /* @And("^Limpiar contraseña$")
    public void limpiarContraseña() throws Throwable {
        driver.findElement(By.id("password")).clear();
    }*/

    @And("^Ingresar una contraseña$")
    public void ingresarUnaContraseña() throws Throwable{

        driver.findElement(By.id("password")).sendKeys("Vent@s2019");

    }

   /* @And("^Ingresar token$")
    public void ingresarToken() throws Throwable {
        driver.findElement(By.id("token")).sendKeys("vd74");
    }*/

    @And("^Iniciar sesion$")
    public void iniciarSesion() throws Throwable {
        WebElement option = driver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/main[1]/completelogin[1]/div[2]/div[1]/div[1]/form[1]/div[3]/a[1]"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();

    }

    @Then("^Se muestra la web de ventas$")
    public void seMuestraLaWebDeVentas() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);


    }


    @And("^Darle click en Altas Nuevas$")
    public void darleClickEnAltasNuevas() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
        WebElement option = driver.findElement(By.linkText("ALTAS NUEVAS"));
        option.click();
    }

    @And("^Darle clik en obviar y continuar$")
    public void darleClikEnObviarYContinuar() {
        WebElement option = driver.findElement(By.id("continuar_"));
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();
    }

    @And("^Seleccionar Tipo de Documento$")
    public void seleccionarTipoDeDocumento() throws Throwable {
        Select objDriver = new Select(driver.findElement(By.id("documentType")));
        objDriver.selectByVisibleText("DNI");
    }

    @And("^Ingreso de Numero de Documento$")
    public void ingresoDeNumeroDeDocumento() throws Throwable {
        driver.findElement(By.id("docNroDni")).
                sendKeys("43797420");
    }

    @And("^Selecciono el departamento$")
    public void seleccionoElDepartamento() throws Throwable {
        driver.findElement(By.id("department")).click();
        Select objDriver = new Select(driver.findElement(By.id("department")));
        objDriver.selectByValue("15");
    }

    @And("^Selecciono la provincia$")
    public void seleccionoLaProvincia() throws Throwable {
        Select objDriver = new Select(driver.findElement(By.id("city")));
        objDriver.selectByValue("01");
    }

    @And("^Selecciono el distrito$")
    public void seleccionoElDistrito() throws Throwable {
        Select objDriver = new Select(driver.findElement(By.id("district")));
        objDriver.selectByValue("01");
    }


    @And("^click en evaluar$")
    public void clickEnEvaluar() throws Throwable {
        WebElement option = driver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/main[1]/searchuser[1]/div[1]/div[1]/div[2]/form[1]/div[6]/button[1]"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();

    }

    @And("^click en continuar$")
    public void clickEnContinuar() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
        WebElement option =  driver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/main[1]/searchuser[1]/div[1]/div[1]/div[2]/div[4]/button[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.sendKeys(Keys.ENTER);
    }

    @And("^click en elegir nombre$")
    public void clickEnElegirNombre() throws Throwable{

        /*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
        driver.findElement(By.id("parentescoSelect")).click();
        */

    }


    @And("^elegir nombre de la madre$")
    public void elegirNombreDeLaMadre() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select objDriver = new Select(driver.findElement(By.id("parentescoSelect")));
        objDriver.selectByVisibleText("AMELIA");

    }


    @And("^click en btn siguiente$")
    public void clickEnBtnSiguiente() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
        driver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/main[1]/saleprocess[1]/div[1]/div[1]/div[1]/reniec[1]/div[2]/div[1]/div[2]/div[4]/a[1]")).click();

    }

    @And("^seleccionar direccion$")
    public void seleccionarDireccion() throws Throwable {

        WebElement option = driver.findElement(By.id("direccion"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.sendKeys("AV AREQUIPA 1105 UR SANTA BEATRIZ ");
        option.sendKeys(Keys.SPACE);
        option.sendKeys(Keys.SPACE);

    }

    @And("^Ubicar en el mapa$")
    public void ubicarEnElMapa() throws Throwable {

        WebElement option = driver.findElement(By.id("direccion"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.sendKeys(Keys.ENTER);
        option.sendKeys(Keys.SPACE);
        option.sendKeys(Keys.ENTER);
        option.sendKeys(Keys.SPACE);
        option.sendKeys(Keys.ENTER);

    }

    @And("^Click en continuar_mapa$")
    public void clickEnContinuar_mapa() throws Throwable {
        WebElement continuardireccion = driver.findElement(By.className("boton_greentdp"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", continuardireccion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", continuardireccion);
        By continuardireccionBtnLocator=By.className("boton_greentdp");

      /*  WebElement option = driver.findElement(By.xpath("/html/body/my-app/main/direccion/div/div[2]/div/div[2]/div[2]/div/div/a"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click(); */
    }

    @And("^Click en masiva$")
    public void clickEnMasiva() throws Throwable {/*

        WebElement option = driver.findElement(By.id("campanais"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();*/
    }

    @And("^Click en producto a elegir$")
    public void clickEnProductoAElegir() throws Throwable {

        WebElement option = driver.findElement(By.xpath("/html/body/my-app/main/offering/div/div/div[2]/div[3]/div/div/div[1]/div[2]/a"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();

    }

    @And("^Elegir SVAs$")
    public void elegirSVAs()  throws Throwable{
/*
        WebElement option = driver.findElement(By.id("RSWCheck"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.click();

        WebElement option2 = driver.findElement(By.id("SVAICheck"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option2.click();

         driver.findElement(By.id("RSWCheck")).click();
        driver.findElement(By.id("SVAICheck")).click();
 */



        Select objDriver = new Select(driver.findElement(By.id("RSW")));
        objDriver.selectByValue("0: Object");

        Select objDriver2 = new Select(driver.findElement(By.id("SVAL")));
        objDriver2.selectByValue("1: Object");


    }

    @And("^Click en continuar_sva$")
    public void clickEnContinuar_sva() throws Throwable{
        WebElement option = driver.findElement(By.xpath("/html/body/my-app/main/sva/div/div/div[2]/div[1]/div[2]/a"));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(option));
        option.sendKeys(Keys.ENTER);
    }
}
