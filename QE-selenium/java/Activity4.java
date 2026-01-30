package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
     public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/target-practice");
    System.out.println(driver.getTitle());
    System.out.println(driver.findElement(By.xpath("//h3[@class='text-3xl font-bold text-orange-600']")).getText());
    System.out.println(driver.findElement(By.xpath("//h3[@class='text-3xl font-bold text-orange-600']")).getCssValue("color"));
    System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Purple')]")).getAttribute("class"));
    System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Slate')]")).getText());
    driver.quit();
}
}
