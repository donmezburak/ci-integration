import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;


public class Suite {

    public enum Driver {
        LOCAL,
        REMOTE,
        ROBOTIC_REMOTE,
        ROBOTIC
    }

    public static AndroidDriver driver;

    @BeforeClass
    public static void setupDriver() throws InterruptedException, MalformedURLException {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            capabilities.setCapability("autoGrantPermissions", true);

            Driver type = Driver.ROBOTIC;
            String urlString = "";
            int port = Integer.valueOf(System.getProperty("roboticPort", "4723"));

            switch (type) {
                case LOCAL:
                    File file = new File("/Users/roboticmobi/Documents/testJenkins/OtelzAmazon/src/test/resources/otelzuc.apk");
                    String absolutePath = file.getAbsolutePath();
                    capabilities.setCapability(MobileCapabilityType.APP, absolutePath);
                    capabilities.setCapability(MobileCapabilityType.UDID, "RF8M319CPJR");
                    urlString = "http://localhost:" + port + "/wd/hub";
                    driver = new AndroidDriver<AndroidElement>(new URL(urlString), capabilities);
                    break;
                case REMOTE:
                    urlString = "http://localhost:4723/wd/hub";
                    driver = new AndroidDriver<AndroidElement>(new URL(urlString), capabilities);
                    break;
                case ROBOTIC_REMOTE:
                    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJtb2JpbmF2ZWwiOiJib3VuIiwiaWF0IjoxNjM4ODc1MTA5LCJleHAiOjE2Mzg5MTExMDl9.c0O8tHRpzrYhUKVzVovFdYG6cQg1Gmv6phqyNGuXltY";
                    String appId = "1682";
                    String deviceId = "RZ8R11DQTTB";
                    /* remote*/
                    capabilities.setCapability("app_id", appId);
                    capabilities.setCapability("robotic_mobi_token",token);
                    capabilities.setCapability(MobileCapabilityType.UDID, deviceId);

                    urlString = "https://api.robotic.mobi/wd/hub";
                    driver = new AndroidDriver<AndroidElement>(new URL(urlString), capabilities);

                    break;
                case ROBOTIC:
                    urlString = "http://localhost:" + port + "/wd/hub";
                    driver = new AndroidDriver<AndroidElement>(new URL(urlString), capabilities);
                    break;
            }
            Thread.sleep(5000);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void endTest() {
        driver.quit();
    }

    @Test
    public void LaunchAppStep() throws InterruptedException {
        TestOtelz();
    }

    public void TestOtelz() throws InterruptedException, NoSuchElementException {

        Slide();
        SearchHotel();
    }

    public void Slide() throws InterruptedException {
        driver.findElement(By.xpath(AndroidElements.XPSliderSecondDot)).click();
        takeScreenshot();
        driver.findElement(By.xpath(AndroidElements.XPSliderThirdDot)).click();
        takeScreenshot();

        driver.findElement(By.id(AndroidElements.IDSliderContinue)).click();
        takeScreenshot();
        Thread.sleep(3000);
    }

    public void SearchHotel() throws InterruptedException {
        driver.findElementById(AndroidElements.IDHomeSearchLocationButton).click();
        takeScreenshot();
        driver.findElementById(AndroidElements.IDHomeSearchLocationBox).sendKeys("İlk resort test otel");
        takeScreenshot();
        Thread.sleep(5000);
    }

    public boolean takeScreenshot() throws InterruptedException {
        Thread.sleep(1000);
        //Image will be saved at folder "Report/.../Images"
        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return screenshot.renameTo(new File("/Users/roboticmobi/Documents/testJenkins/OtelzAmazon", System.currentTimeMillis() + ".png"));
    }


}
