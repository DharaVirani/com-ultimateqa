package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver= new ChromeDriver();
//        Open the Url
        driver.get(baseUrl);
//        Maximise the window
        driver.manage().window().maximize();
//        Implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        Print the title of the page
        System.out.println("Title of the page is: "+ driver.getTitle());
//        Print the current Url
        System.out.println("Current Url is: "+ driver.getCurrentUrl());
//        Print the Page source
        System.out.println("Page source is: " + driver.getPageSource());
//        Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("xyzabc34@gmail.com");
//        Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("proud123");
//        Browser closing
       driver.close();


    }

}
