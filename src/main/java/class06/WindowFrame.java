package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/InteractiveLogin/identifier?service=mail&ifkv=AYZoVhe8sjRyK69zjhyrKC5LG5sNdz9td2XTZBQjB5FY7zERoEu4jFR1-NQhLimpHCQ9Psy8OIcC&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.manage().window().maximize();

        //click on help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Yardım']"));

//        click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Gizlilik']"));
        helpBtn.click();
        privacyBtn.click();
       // Task1:
        // get the window handle of the main page i.e gmail.com and print it out on console

       // as our web-driver is currently focused on gmail page
       // we can use driver.getwindowshandle() to get the handle of the current page i.e gmail.com
        String gmailHandle= driver.getWindowHandle();
        System.out.println(gmailHandle);
        //        Task2:
        //  switch the focus of your webdriver to the privacy window

        // get all the handles and find the desired one
        Set<String> allHandles = driver.getWindowHandles();



//        loop through all the handles and find the one that is desired
       for(String handle:allHandles){
//            switch to the first handle in list
            driver.switchTo().window(handle);
//            get the title of the window on which the focus is
            String title = driver.getTitle();

//            check if the title matches ur desired title , if yes break the loop, if no repeat the process
            if(title.equalsIgnoreCase("Gizlilik Politikası – Gizlilik ve Şartlar – Google")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
