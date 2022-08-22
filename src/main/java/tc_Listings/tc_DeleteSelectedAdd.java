package tc_Listings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class tc_DeleteSelectedAdd {

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
        driver.findElement(By.xpath("//span[text() = \"Auction - Livestock\"]")).click();

        // Verify Page Header
//        assertTrue(driver.getTitle().contains("Listings"));

        Thread.sleep(5000);

        // Click on Ad
        driver.findElement(By.xpath("(//td[text()='Engineer Hyperspace'])[1]")).click();

        // Verify Page Header
//        assertTrue(driver.getTitle().contains("Preview"));

        Thread.sleep(5000);

        // Click on Delete Button
        driver.findElement(By.xpath("//button[@id=\"deleteModalButton\"]")).click();

        Thread.sleep(5000);

        // Click on Yes Button in Popup
        driver.findElement(By.xpath("(//button[@id=\"documentYesButton\"])[3]")). click();

        Thread.sleep(5000);

        // Verify Message
        String expectedText =" Successfully Deleted ";
        Assert.assertEquals(" Successfully Deleted ",expectedText);

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
