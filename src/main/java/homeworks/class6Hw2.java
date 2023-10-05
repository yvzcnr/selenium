package homeworks;
//HW2:
//goto gmail.com
//click on help
//click on privacy
//click on terms
//switch the focus on terms page and get the title and print on screeen
//then switch the focus back to the gmail page
//and print the title of the main page on screen

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


public class class6Hw2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/InteractiveLogin/identifier?service=mail&ifkv=AYZoVhe8sjRyK69zjhyrKC5LG5sNdz9td2XTZBQjB5FY7zERoEu4jFR1-NQhLimpHCQ9Psy8OIcC&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.manage().window().maximize();


        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Yardım']"));

//
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Gizlilik']"));

        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Şartlar']"));


        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();


        Set<String> allHandles = driver.getWindowHandles();


        for (String handle : allHandles) {

            driver.switchTo().window(handle);

            String title = driver.getTitle();

            if (title.equalsIgnoreCase("Google Hizmet Şartları – Gizlilik ve Şartlar – Google")) {
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Set<String> allHandles2 = driver.getWindowHandles();


        for (String handle : allHandles2) {

            driver.switchTo().window(handle);

            String title = driver.getTitle();


            if (title.equalsIgnoreCase("Gmail")) {
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
