package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http:www.facebook.com");
        driver.manage().window().maximize();
       WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("yvzgzd17022020@gmail.com");
        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("asd123");
        WebElement loginBttn=driver.findElement(By.name("login"));
        loginBttn.click();







    }
}
