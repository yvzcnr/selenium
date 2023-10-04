package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get(" http://35.175.58.98/javascript-alert-box-demo.php");

        driver.manage().window().maximize();

        //click on the first alert button and handle the alert
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(3000);
        //switch the focus of the driver to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
        alert.sendKeys("I am human");
        alert.accept();
        Thread.sleep(5000);
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        alert.dismiss();


    }
}
