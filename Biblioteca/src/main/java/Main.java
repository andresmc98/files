import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Andreh\\Documents\\Semetre2021-1\\GCS2\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //Entramos a la pagina de la unison
        driver.get("http://www.bibliotecas.uson.mx/");
        //Localizamos la barra de busqueda e introducimos el nombre
        WebElement findname = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBuscar"));
        findname.sendKeys("java");
        //Hacemos click en el boton de busqueda
        WebElement findclick = driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnBuscar"));
        findclick.click();
        //Y hacemos click para buscar la ficha
        WebElement ficha = driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridResultados_ctl00_ctl04_LinkButton1"));
        ficha.click();

        //driver.quit();
    }
}