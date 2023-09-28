package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class4Hw2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php.");
        driver.manage().window().maximize();


      WebElement femaleCheckBox= driver.findElement(By.xpath("//input[@value='gender-female']"));
        boolean female=femaleCheckBox.isDisplayed();
        System.out.println("the female radio button is displayed " + female);
        WebElement showBtn=driver.findElement(By.xpath("//button[@id='toggleRadioButtons']"));
        showBtn.click();
       Thread.sleep(3000);
        boolean lastCondition=femaleCheckBox.isDisplayed();
        System.out.println("the female radio button is displayed " +lastCondition);



}}
