package com.epam.christmasgift.run;

import com.epam.christmasgift.creation.CreatorGift;
import com.epam.christmasgift.entity.Gift;
import com.epam.christmasgift.report.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class RunnerApplication {
    public static final Logger LOGGER = Logger.getLogger("RunnerApplication.class");

    static {
        new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
    }

    public static void main(String[] args) {
        Gift gift = CreatorGift.createGift(1000);
        new Reporter().christmasGiftReport(gift);
    }
}
