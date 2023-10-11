package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Class07Hw3 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        List<WebElement> options = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int i = 0;
        for (WebElement option : options) {
            if (option.getText().equals("in progress")) {
                //System.out.println("the row number in which IN PROGRESS is present " + i);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr [" + (i + 1) + "]"));
                System.out.println(row.getText());
            }
            i++;
        }

        closeBrowser();

    }
}
