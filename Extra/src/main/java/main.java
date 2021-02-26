import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Andreh\\Documents\\Semetre2021-1\\GCS2\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement singin = driver.findElement(By.id("u_0_2"));
        singin.click();

        Thread.sleep(1000);

        WebElement name = driver.findElement(By.id("u_1_b"));
        name.sendKeys("Gabriela Alejandra");

        WebElement lastName = driver.findElement(By.id("u_1_d"));
        lastName.sendKeys("Lopez Contreras");

        WebElement mail = driver.findElement(By.id("u_1_g"));
        mail.sendKeys("GabyLopez@gmail.com");

        WebElement mailConf = driver.findElement(By.id("u_1_j"));
        mailConf.sendKeys("GabyLopez@gmail.com");

        WebElement pass = driver.findElement(By.id("password_step_input"));
        pass.sendKeys("@123Tamarindo");

       WebElement dayDate = driver.findElement(By.id("day"));
       dayDate.sendKeys("24");

       WebElement monthDate = driver.findElement(By.id("month"));
       monthDate.sendKeys("oct");

       WebElement yearDate = driver.findElement(By.id("year"));
       yearDate.sendKeys("2000");

       WebElement sex = driver.findElement(By.id("u_1_2"));
       sex.click();


        //driver.quit();
    }
}