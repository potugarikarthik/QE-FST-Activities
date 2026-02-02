package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/dynamic-controls");
            System.out.println(driver.getTitle());

            Actions actions = new Actions(driver);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            
            actions.click(driver.findElement(By.xpath("//button[contains(text(),'Toggle Checkbox')]")))
                   .perform();

            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.xpath("//input[@id='checkbox']"))
            );
            System.out.println("Waited Until the checkbox is dissappeared");

           
            actions.click(driver.findElement(By.xpath("//button[contains(text(),'Toggle Checkbox')]")))
                   .perform();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@id='checkbox']"))
            );
            System.out.println("Waited Until the checkbox is appeared");

        } finally {
            driver.quit();
        }
    }
}