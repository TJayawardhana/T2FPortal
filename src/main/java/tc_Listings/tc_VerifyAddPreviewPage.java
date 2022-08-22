package tc_Listings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.AssertJUnit.assertTrue;

public class tc_VerifyAddPreviewPage {

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
        driver.findElement(By.id("password")).sendKeys("Hyperspace123");

        // Click on SignIn Button
        driver.findElement(By.xpath("//button[text()=' Log In ']")).click();

        // Verify Page Header
//        assertTrue(driver.getTitle().contains("Overview"));

        Thread.sleep(5000);

        // Click on Listing Tab And Listing Sub Menu
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("(//span[text()=\"Listings\"])[1]"));
        Thread.sleep(7000);
        action.moveToElement(we).perform();
        driver.findElement(By.xpath("(//span[text() = \"Auction - Livestock\"]")).click();

        // Verify Page Header
//        assertTrue(driver.getTitle().contains("Listings"));

        Thread.sleep(5000);

        // Click on Ad
        driver.findElement(By.xpath("(//a[text()=' Dairy '])[1]")).click();

        // Verify Page Header
        assertTrue(driver.getTitle().contains("Preview"));

        Thread.sleep(5000);

        // Click on User Icon
        driver.findElement(By.id("userDropdown")).click();

        Thread.sleep(5000);

        // Click on Sign Out
        driver.findElement(By.xpath("//button[text()='Sign out']")).click();

        // Driver Quit
        driver.quit();
    }
}
