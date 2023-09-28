package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();
        WebElement profileId=driver.findElement(By.cssSelector("input[id='profileID']"));
        profileId.sendKeys("moazzsamSadiq");
        WebElement profileName=driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("hello");
        WebElement feedBackFromJenny=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedBackFromJenny.sendKeys("website isnt working");
        WebElement feedBackFromRaj=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedBackFromRaj.sendKeys("website is working");
        WebElement courseTopic=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");
        WebElement IntrotoAdvancedCSS=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        IntrotoAdvancedCSS.sendKeys("WELCOME");
        WebElement ConclusionofCSSModule=driver.findElement(By.cssSelector("input[name$='Input']"));
        ConclusionofCSSModule.sendKeys("PERFECT");
    }
}
