package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println(driver.getTitle());

        Actions actions = new Actions(driver);

        WebElement ball = driver.findElement(By.xpath("//img[@id='ball']"));
        WebElement dropzone1 = driver.findElement(By.xpath("//div[@id='dropzone1']"));
        WebElement dropzone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));

        actions.dragAndDrop(ball, dropzone1).perform();

        if (driver.findElement(By.xpath("//div[@id='dropzone1']/span")).getText().equals("Dropped!")) {
            System.out.println("Dropped in Dropzone-1");
        }

        actions.dragAndDrop(ball, dropzone2).perform();

        if (driver.findElement(By.xpath("//div[@id='dropzone2']/span")).getText().equals("Dropped!")) {
            System.out.println("Dropped in Dropzone-2");
        }

        driver.quit();
    }
}
