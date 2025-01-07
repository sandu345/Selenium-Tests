import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {
    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        Dimension newSize = new Dimension(800, 600);
        driver.manage().window().setSize(newSize);
        //driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");
    }

    @Test
    public void buttonTests(){
        //01). Click and confirm title
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]")).click();
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Actual Title same as expected.");
        }else{
            System.out.println("Actual Title is not same as expected.");
        }
        //02). Find the position of the submit button.
        driver.navigate().back();
        WebElement getPosition = driver.findElement(By.id("j_idt88:j_idt94"));
        Point XYPoint = getPosition.getLocation();
        int x = XYPoint.getX();
        int y = XYPoint.getY();
        System.out.println("x position is " + x + " y position is " + y);

        //03). Find the save button color.
        WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
        String color = buttonColor.getCssValue("background-color");
        System.out.println("Button color : " + color);

        //04). Find the height and width of this button
        WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
        int height = size.getSize().getHeight();
        int width = size.getSize().getWidth();
        System.out.println("Height: "+ height + " Width: " + width);


    }

}
