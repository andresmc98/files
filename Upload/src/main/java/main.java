import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\Andreh\\Documents\\Semetre2021-1\\GCS2\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement file = driver.findElement(By.id("file-upload-field"));
        file.sendKeys("file-to-upload.png");
    }
}
