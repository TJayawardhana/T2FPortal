package tc_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_T2FLoginWithInvalidPassword {

    public static void main(String[] args) throws InterruptedException {
        // Open Browser
        System.setProperty("webdriver.chrome.driver","D:\\T2FPortal\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://qa-portal.trade2farm.ie/login");

        // Maximise the Browser
        driver.manage().window().maximize();

        // Enter Valid Username
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("engineering@hyperspacehub.com");

        //Enter Valid Password
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Hyperspace");

        // Click on SignIn Button
        driver.findElement(By.xpath("//button[text()=' Log In ']")).click();

        Thread.sleep(5000);

        // Driver Quit
        driver.quit();
    }
}
