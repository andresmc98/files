import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Andres\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.mx/imghp?hl=es");

        WebElement file = driver.findElement(By.className("LM8x9c"));
        file.click();

        ((JavascriptExecutor) driver).executeScript("document.getElementById('FQt3Wc').style.display='block';");
        ((JavascriptExecutor) driver).executeScript("document.getElementById('dRSWfb').style.display='none';");

        WebElement device = driver.findElement(By.id("awyMjb"));
        //device.sendKeys("C:\\Users\\Andreh\\file-to-upload.png");


    }
    public static void submitForm(WebDriver driver){
        WebElement file = driver.findElement(By.className("LM8x9c"));
        file.click();

        ((JavascriptExecutor) driver).executeScript("document.getElementById('FQt3Wc').style.display='block';");
        ((JavascriptExecutor) driver).executeScript("document.getElementById('dRSWfb').style.display='none';");

        WebElement device = driver.findElement(By.id("awyMjb"));
        //device.sendKeys("C:\\Users\\Andreh\\file-to-upload.png");

    }
    public static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        String alertText=alert.getText();
    }
}