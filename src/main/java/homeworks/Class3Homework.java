package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3Homework {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement fullName =driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("yavuz");
        WebElement userEmail= driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmail.sendKeys("yavuzcinar@gmail.com");
        WebElement currentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("TURKEY");
        WebElement permanentAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("IN TURKEY");



    }
}
