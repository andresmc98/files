import org.openga.selenium.chrome.ChromeDriver;
import org.openga.selenium.WebDriiver;
import org.openga.selenium.By;
import org.openga.selenium.WebElement;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Andreh\\Documents\\Semetre2021-1\\GCS2\\chromedriver_win32");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        String originalHandle = driver.getWindowHandle();

        for (String handle1= driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);

        //driver.quit();
    }
}

