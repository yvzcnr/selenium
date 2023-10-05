package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get(" http://35.175.58.98/handle-iframe.php");

        driver.manage().window().maximize();
        //write down the topic
        driver.switchTo().frame(0);
       WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
       topic.sendKeys("hello");
       driver.switchTo().frame("checkboxIframe");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        //select baby cat
        driver.switchTo().defaultContent();
       WebElement framex= driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
       //
       driver.switchTo().frame(framex);
       //locate web element
        WebElement animals= driver.findElement(By.xpath("//select[@id='animals']"));
        //create an object of select class
        Select sel=new Select(animals);
        sel.selectByVisibleText("Baby Cat");

    }
}
