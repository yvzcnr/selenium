package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class class05Hw {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get(" http://35.175.58.98/no-select-tag-dropdown-demo.php");

        driver.manage().window().maximize();

        //METHOD 1

       /* WebElement selectYDreamDestnBtn=driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));

        selectYDreamDestnBtn.click();

        WebElement dd=driver.findElement(By.linkText("Kenya"));

        dd.click();*/

        //METHOD 2
       driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']")).click();
       List<WebElement> countryTypes=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
       for (WebElement country:countryTypes){
           if (country.getText().equals("japan")){
               country.click();
           }
       }
    }
}
