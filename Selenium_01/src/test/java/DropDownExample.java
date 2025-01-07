import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownExample {
    WebDriver driver;
    @BeforeMethod
    public void DropDownTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void leafGroundDropDownTest() throws InterruptedException {
        //01). ways of select values in basic dropdown.
        driver.get("https://www.leafground.com/select.xhtml");
        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");
        Thread.sleep(3000);
        //02). Get the number of dropdown options.

        List<WebElement> listofOptions = select.getOptions(); //generics
        int size = listofOptions.size();
        System.out.println("Number of elements in dropdown: " + size);

        for(WebElement element:listofOptions){
            System.out.println(element.getText());
        }

        //03). Using sendkeys select dropdown value.
        dropDown.sendKeys("Puppeteer");
        Thread.sleep(3000);

        //04). Selecting value in a Bootstrap dropdown
        WebElement dropDown2 =  driver.findElement(By.xpath("//*[@id=\"j_idt87:country\"]"));
        dropDown2.click();
        List<WebElement> listOfDropDown = driver.findElements(By.xpath("//*[@id=\"j_idt87:country_items\"]"));
        for(WebElement element: listOfDropDown){
            String dropDownValue = element.getText();
            if(dropDownValue.equals("USA")){
                element.click();
                break;
            }
        }

}
    //05). Google search - pick a value from suggestions
        @Test
        public void googleSearch() throws InterruptedException {
            driver.get("https://www.google.lk/");
            driver.findElement(By.name("q")).sendKeys("Shah");
            Thread.sleep(2000);
            List<WebElement> googleSearch = driver.findElements(By.xpath("//*[@id=\"ERWdKc\"]/div[1]/span"));
            System.out.println(googleSearch.size());
            for(WebElement element:googleSearch){
                System.out.println(element.getText());
            }

        }
    //06). Handle hidden auto suggestions Drop down and search using DOM Debugger  Trick.


}
