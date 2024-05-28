package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    /**1. Create the package ‘browserfactory’ and create the
     class with the name ‘BaseTest’ inside the
     ‘browserfactory’ package. And write the browser setup
     code inside the class ‘Base Test’.
     2. Create the package ‘testsuite’ and create the
     following classes inside the ‘testsuite’ package.

     1. LoginTest
     2. ForgotPasswordTest

     3. Write down the following test into ‘LoginTest’ class
     1. userSholdLoginSuccessfullyWithValidCredentials

     * Enter “Admin” username
     * Enter “admin123 password
     * Click on ‘LOGIN’ button
     * Verify the ‘Dashboard’ text is display

     4. Write down the following test into
     ‘ForgotPasswordTest’ class
     1. userShouldNavigateToForgotPasswordPageSuccessfully
     * click on the ‘Forgot your password’ link
     * Verify the text ‘Reset Password’
     *
     */
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on login button
        driver.findElement(By.tagName("button")).click();

        //verify the 'Dashboard' text is displayed
         String expectedText="Dashboard";
         WebElement welcomeText=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
         String actualText=welcomeText.getText();
         Assert.assertEquals("Not expected",expectedText,actualText);
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
