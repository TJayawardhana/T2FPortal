package tc_Listings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.testng.AssertJUnit.assertTrue;

public class tc_CreateNewListing {

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
        Thread.sleep(5000);
        action.moveToElement(we).perform();
        driver.findElement(By.xpath("(//span[text() = \"Auction - Livestock\"])[1]")).click();

        // Verify Page Header
//        assertTrue(driver.getTitle().contains("Listings"));

        Thread.sleep(5000);

        // Click on Create New Button
        driver.findElement(By.xpath("//button[@class=\"btn btn-secondary create-new-button\"]")).click();

        // Enter Choose Category
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.id("category")));
                dropdown.selectByVisibleText("Cattle");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // Enter Animal Location Eircode
        driver.findElement(By.id("erpcode")).clear();
        driver.findElement(By.id("erpcode")).sendKeys("1234567");

        // Enter type
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.id("type")));
                dropdown.selectByVisibleText("Beef");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //Date Picker (Start Date)
        WebElement DateTime = driver.findElement(By.id("startDate"));
        DateTime.sendKeys("12232021");
        DateTime.sendKeys(Keys.TAB);
        DateTime.sendKeys("0130PM");
        //Date Picker (End Date)
        DateTime = driver.findElement(By.id("endDate"));
        DateTime.sendKeys("12252021");
        DateTime.sendKeys(Keys.TAB);
        DateTime.sendKeys("0130PM");

        // Enter Sub category
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.id("sub_category")));
                dropdown.selectByVisibleText("Cattle");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // Image Upload
        driver.findElement(By.id("cvp_up")).sendKeys("D:\\T2FPortal\\image\\Congress Passes Bill Defining Horses as Livestock.jpg");

        // Click on Next Button
        driver.findElement(By.xpath("//button[text()='Next']")).click();

        // Enter Stock Type
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.id("stockType")));
                dropdown.selectByVisibleText("Dry/Fat Cows");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // Enter Average Age
        driver.findElement(By.id("avgAge")).clear();
        driver.findElement(By.id("avgAge")).sendKeys("12");

        // Enter Average Weight
        driver.findElement(By.id("avgWeight")).clear();
        driver.findElement(By.id("avgWeight")).sendKeys("60");

        // Enter Tag Number
        driver.findElement(By.id("tagNo")).clear();
        driver.findElement(By.id("tagNo")).sendKeys("101");

        // Enter Breed
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.id("breed")));
                dropdown.selectByVisibleText("AUX");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // Enter Reserve price
        driver.findElement(By.id("reservePrice")).clear();
        driver.findElement(By.id("reservePrice")).sendKeys("100");

        // Add Vaccinations
        {
            try {

                Thread.sleep(5000);
                Select dropdown = new Select(driver.findElement(By.xpath("//span[@class=\"dropdown-btn\"]")));
                dropdown.selectByVisibleText("Bovilis BVD");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        Thread.sleep(5000);

        // Add More Information
//        driver.findElement(By.id("moreInfo")).clear();
        driver.findElement(By.id("moreInfo")).sendKeys("Test Information");

        Thread.sleep(5000);

        // Enter Account Holder Name
        driver.findElement(By.id("account_holder_name")).clear();
        driver.findElement(By.id("account_holder_name")).sendKeys("Timalka Jayawardhana");

        Thread.sleep(5000);

        // Enter Sort Code
        driver.findElement(By.id("sort_code")).clear();
        driver.findElement(By.id("sort_code")).sendKeys("20");

        Thread.sleep(5000);

        // Enter Account Number
        driver.findElement(By.id("account_number")).clear();
        driver.findElement(By.id("account_number")).sendKeys("4242424242424242");

        Thread.sleep(5000);

        // Click on Done Button
        driver.findElement(By.xpath("//button[text()='Done']")).click();
    }
}
