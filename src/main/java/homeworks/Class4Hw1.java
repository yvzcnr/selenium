package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4Hw1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php.");
        driver.manage().window().maximize();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='Checkbox-1']"));
        checkBox1.click();
        boolean enabledState = checkBox1.isEnabled();
        if (enabledState) {
            System.out.println("the checkbox1 is enabled");
        } else {
            System.out.println("the checkbox1 isnt enabled");
            WebElement disableCheckBoxBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            disableCheckBoxBtn.click();
        }

        checkBox1.click();
        System.out.println("the checkbox1 is enabled now");
        boolean lastSelectState = checkBox1.isSelected();
        if (lastSelectState) {
            System.out.println("the checkbox1 is selected");
        } else {
            System.out.println("the checkbox1 isnt selected");
        }
    }
}
