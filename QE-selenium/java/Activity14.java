package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/tables");

            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));

            System.out.println("rows: " + rows.size());
            System.out.println("cols: " + cols.size());

            int i = 1;
            for (WebElement row : rows) {
                if (i == 3) {
                    System.out.println(row.getText());
                }
                i++;
            }

            
            System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());

            driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();

            System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());

            System.out.println(driver.getTitle());

        } finally {
            driver.quit();
        }
    }
}
