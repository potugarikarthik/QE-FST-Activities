package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity16 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/selects");
            System.out.println(driver.getTitle());

          
            WebElement dropdownElement = driver.findElement(By.tagName("select"));
            Select dropdown = new Select(dropdownElement);

            
            dropdown.selectByVisibleText("Two");

           
            dropdown.selectByIndex(3);

        
            dropdown.selectByValue("four");

            
            List<WebElement> options = dropdown.getOptions();
            for (WebElement opt : options) {
                System.out.println(opt.getText());
            }

        } finally {
            driver.quit();
        }
    }
}