package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println(driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());

        driver.findElement(By.xpath("//input[@id='checkbox']")).click();

        System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());

        driver.quit();
    }
}
