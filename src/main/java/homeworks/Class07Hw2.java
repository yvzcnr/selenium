package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class Class07Hw2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-waits.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement clickMeBtn = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        clickMeBtn.click();
        WebElement textBox = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));

        System.out.println(textBox.getText());


    }
}
