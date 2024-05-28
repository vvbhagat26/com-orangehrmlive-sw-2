package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //Click on forgot password link
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        //Verify the text 'Reset password'
        String expectedText = "Reset Password";
        WebElement welcomeText = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualText = welcomeText.getText();
        Assert.assertEquals("Not expected text", expectedText, actualText);
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
