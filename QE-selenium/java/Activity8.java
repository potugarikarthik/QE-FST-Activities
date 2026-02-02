package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://training-support.net/webelements/mouse-events");
        System.out.println(driver.getTitle());

        WebElement cargoLockButton = driver.findElement(By.xpath("//*[@id='stage']/div[1]/div[1]/div"));
        actions.click(cargoLockButton).perform();

        WebElement cargoTomlButton = driver.findElement(By.xpath("//h1[text()='Cargo.toml']/parent::div"));
        actions.click(cargoTomlButton).perform();

        System.out.println(driver.findElement(By.id("result")).getText());

        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']/parent::div"));
        actions.doubleClick(srcButton).perform();

        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']/parent::div"));
        actions.contextClick(targetButton).perform();

        WebElement openButton = driver.findElement(By.xpath("//*[@id='menu']/div/ul/li[1]"));
        actions.click(openButton).perform();

        System.out.println(driver.findElement(By.id("result")).getText());

        driver.quit();
    }
}