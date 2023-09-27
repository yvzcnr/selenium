package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
       WebElement textBox1= driver.findElement(By.xpath("//input[@id='title']"));
       textBox1.sendKeys("batch 17");
        WebElement textBox2= driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("yavuz");
        WebElement textBox3= driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        textBox3.sendKeys("what is the color of sun");
        WebElement textBox4= driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(textBox4.getText());
        WebElement textBox5= driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBox5.sendKeys("abracabra");
        //        get the email
        WebElement Email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        Email1.sendKeys("hello1@gmail.com");
        WebElement Email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        Email2.sendKeys("canicomein@gmail.com");
        WebElement Email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        Email3.sendKeys("welcome@gmail.com");
        //        get the below fields

        WebElement Field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        Field1.sendKeys("cat");
        WebElement Field2 = driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        Field2.sendKeys("catterpillar");
        WebElement xField1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        xField1.sendKeys("dog");
        WebElement xField2 = driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        xField2.sendKeys("giraffe");

    }
}
