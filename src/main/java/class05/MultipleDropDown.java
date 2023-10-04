package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get(" http://35.175.58.98/basic-select-dropdown-demo.php");

        driver.manage().window().maximize();
        //locate the dropdown
        WebElement multidropDown=driver.findElement(By.xpath("//Select[@id='multi-select']"));
        //create object os select class and pass in the id element
        Select sel=new Select(multidropDown);
        //use any method()
        sel.selectByVisibleText("Texas");

        sel.selectByValue("Florida");
        Thread.sleep(3000);
        sel.deselectByValue("Texas");
        //check whether the dropdown is multiselect or not
        System.out.println(sel.isMultiple());
        sel.getOptions();


    }
}
