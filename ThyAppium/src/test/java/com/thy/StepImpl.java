package com.thy;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import static element.element.*;

public class StepImpl extends HookImpl{


    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step({"Al butonuna varsa tikla"})
    public void existClickByKey() {
        MobileElement el3 = (MobileElement) driver.findElementById("com.thy.mobile:id/ll_book_a_flight");
        el3.click();
    }


}
