package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/dynamic-content");
            System.out.println(driver.getTitle());

            WebElement button = driver.findElement(By.xpath("//button[@id='genButton']"));

            new Actions(driver).click(button).perform();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.xpath("//h2[@id='word']"), "release"
            ));

            System.out.println(driver.findElement(By.xpath("//h2[@id='word']")).getText());

        } finally {
            driver.quit();
        }
    }
}
