package com.epam.christmasgift.action;

import com.epam.christmasgift.entity.Confection;
import com.epam.christmasgift.entity.Gift;

import java.util.ArrayList;
import java.util.List;

public class SearchConfection {
    public static List<Confection> searchConfectionForSugar(Gift gift, double minQuantitySugar, double maxQuantitySugar) {
        List<Confection> listRequiredConfection = new ArrayList<Confection>();
        List<Confection> confectionList = gift.getConfectionList();
        for (Confection confection : confectionList) {
            if (maxQuantitySugar >= confection.getQuantitySugar() && confection.getQuantitySugar() >= minQuantitySugar) {
                listRequiredConfection.add(confection);
            }
        }
        return listRequiredConfection;
    }
}
