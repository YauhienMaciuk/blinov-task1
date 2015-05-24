package com.epam.christmasgift.report;

import com.epam.christmasgift.action.SearchConfection;
import com.epam.christmasgift.action.WeighingGift;
import com.epam.christmasgift.comparator.CompareSugar;
import com.epam.christmasgift.entity.Confection;
import com.epam.christmasgift.entity.Gift;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reporter {
    public static final Logger LOGGER = Logger.getLogger("Reporter.class");
    public static final String REPORT_FILE = "report.txt";

    public void christmasGiftReport(Gift gift) {
        String str = null;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(REPORT_FILE));) {
            writer.write("Отсортированный подарок по количеству сахара в конфете: " + '\n');
            List<Confection> confectionList = gift.getConfectionList();
            List<Confection> copyConfectionList = new ArrayList<>();
//            for (Confection confection : confectionList) {
//                copyConfectionList.add(confection);
//            }
            copyConfectionList.addAll(confectionList);
            Collections.sort(copyConfectionList, new CompareSugar());
            for (Confection confection : copyConfectionList) {
                writer.write(confection.toString());
            }
            writer.write("Вес подарка: ");
            writer.write(String.valueOf(new WeighingGift().doWeighingGift(gift)) + '\n');
            writer.write("Конфеты, которые содержат сахар в диапазоне от 30 до 50 грамм: " + '\n');
            List<Confection> listRequiredConfection = new SearchConfection().searchConfectionForSugar(gift, 30, 50);
            for (Confection confection : listRequiredConfection) {
                writer.write(confection.toString());
            }
        } catch (IOException e) {
            LOGGER.error("IOException");
        }
    }
}
