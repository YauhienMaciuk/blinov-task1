package com.epam.christmasgift.action;

import com.epam.christmasgift.entity.Confection;
import com.epam.christmasgift.entity.Gift;

import java.util.*;

public class WeighingGift {
    public double doWeighingGift(Gift gift) {
        List<Confection> confectionList = gift.getConfectionList();
        double weightGift = 0;
        for (Confection confection : confectionList) {
            weightGift += confection.getWeight();
        }
        return weightGift;
    }
}
