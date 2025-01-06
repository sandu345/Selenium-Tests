import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    // open google
    //go to Google Home page
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\sandu\\Downloads\\Drivers\\chromedriver-win64\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }
}
