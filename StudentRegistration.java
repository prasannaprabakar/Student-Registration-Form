import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class StudentRegistration
{
    public static void main(String[] args)
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstName.sendKeys("Prasanna");
        WebElement LastName=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        LastName.sendKeys("Prabakar");
        WebElement Email =driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.sendKeys("prasannaprabakar44@gmail.com");
        WebElement Gender =driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        Gender.click();
        WebElement number=driver.findElement(By.xpath("//input[@id='userNumber']"));
        number.sendKeys("9080239182");
        driver.close();
       // WebElement Year=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div/div"));
        //Year.clear();
        //Select select=new Select(Year);
        //select.selectByVisibleText("2000");




    }
}
