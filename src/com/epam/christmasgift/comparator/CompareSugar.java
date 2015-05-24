package com.epam.christmasgift.comparator;

import com.epam.christmasgift.entity.Confection;

import java.util.Comparator;

public class CompareSugar implements Comparator<Confection> {
    @Override
    public int compare(Confection o1, Confection o2) {
        return (int) (o1.getQuantitySugar() - o2.getQuantitySugar());
    }
}
