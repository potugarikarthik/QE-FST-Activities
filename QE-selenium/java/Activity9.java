package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println(driver.getTitle());

        WebElement textInput = driver.findElement(By.xpath("//h1[@class='mt-3 text-center text-4xl font-semibold text-black']"));

        actions.click(textInput).sendKeys("Karthik").perform();

        System.out.println(textInput.getText());

        driver.quit();
    }
}
