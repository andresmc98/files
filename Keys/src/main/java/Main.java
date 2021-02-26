import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //Inicializamos el driver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Andreh\\Documents\\Semetre2021-1\\GCS2\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //Entramos a la pagin
        driver.get("http://formy-project.herokuapp.com/keypress");
        //Buscamos el elemento por ID
        WebElement element = driver.findElement(By.id("name"));
        //Escribimos en el
        element.sendKeys("Andres Montiel");
        //Hacemos otro elemento para el botton
        WebElement element2 = driver.findElement(By.id("button"));
        //Clickeqamos
        element2.click();

        driver.quit();
    }
}
