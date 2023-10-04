package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //        find the button create new account
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Yeni hesap oluştur']"));
        createNewAccount.click();
        Thread.sleep(2000);
        //       fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");
        System.out.println(driver.getTitle());
    }
}
