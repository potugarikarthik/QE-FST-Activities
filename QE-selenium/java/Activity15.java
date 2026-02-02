package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity15 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/dynamic-attributes");
            System.out.println(driver.getTitle());

            Actions actions = new Actions(driver);

            WebElement fullNameInput = driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"));
            actions.click(fullNameInput).sendKeys("Karthik").perform();


            WebElement emailInput = driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]/following::input"));
            actions.click(emailInput).sendKeys("kapotugari@gmail.com").perform();

           
            driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2026-04-24");

          
            driver.findElement(By.xpath("//button[contains(text(),'Submit')]/preceding::textarea"))
                  .sendKeys("Huge event");

            driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

            System.out.println(driver.findElement(By.xpath("//h3[@id='action-confirmation']")).getText());

        } finally {
            driver.quit();
        }
    }
}