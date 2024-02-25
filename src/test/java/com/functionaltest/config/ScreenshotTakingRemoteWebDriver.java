package com.functionaltest.config;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * remote web driver that takes screenshot on exception if available
 *
 * @author Aleksa Vukotic
 */
public class ScreenshotTakingRemoteWebDriver extends RemoteWebDriver {

    public ScreenshotTakingRemoteWebDriver(URL remoteAddress, Capabilities desiredCapabilities) {
        super(remoteAddress, desiredCapabilities);
    }


    public <X> X getScreenshotAs(OutputType<X> target) {
        // Get the screenshot as base64.
        String base64 = execute(DriverCommand.SCREENSHOT).getValue().toString();
        // ... and convert it.
        return target.convertFromBase64Png(base64);
    }

}
