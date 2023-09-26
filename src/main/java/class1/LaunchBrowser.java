package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of webdriver
        WebDriver driver=new ChromeDriver();
        //use the driver.get() method
        driver.get("http://www.google.com");
        //maximize
        driver.manage().window().maximize();
        //get the url of the website
        String currentUrl=driver.getCurrentUrl();
        System.out.println("the current url is: "+currentUrl);
        //get the title
        String title=driver.getTitle();
        System.out.println("the title of the page is: "+title);
        //added a wait for 2 second to slow the closing of window
        Thread.sleep(2000);
        //close the browser
        driver.quit();
    }
}
