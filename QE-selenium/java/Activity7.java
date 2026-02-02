package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println(driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());

        driver.findElement(By.xpath("//button[@id='textInputButton']")).click();

        System.out.println(driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());

        driver.quit();
    }
}
