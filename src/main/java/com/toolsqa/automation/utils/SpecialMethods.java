package com.toolsqa.automation.utils;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class SpecialMethods {
    private static int counter = 0;
    public static Properties properties;

    public static void configProperties(){
        properties = new Properties();
        try {
            properties.load(new FileReader("conf.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void waitFor(int seconds) throws InterruptedException{
        Thread.sleep(2000);
    }

    public static void ScreenshotsPage(WebDriver driver){
        try{
            Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(),"jpg", new File("C:\\TestFinal\\EvidencesSQA\\" + counter +".jpg"));
            counter++;
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }
    }
}
