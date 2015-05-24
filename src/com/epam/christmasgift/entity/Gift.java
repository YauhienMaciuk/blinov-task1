package com.epam.christmasgift.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {
    private double weightGift;
    private List<Confection> confectionList;

    public Gift() {
        this.confectionList = new ArrayList<Confection>();
    }

    public Gift(List<Confection> confectionList) {
        this.confectionList = confectionList;
    }

    public double getWeightGift() {
        return weightGift;
    }

    public void setWeightGift(double weightGift) {
        this.weightGift = weightGift;
    }

    public List<Confection> getConfectionList() {
        return Collections.unmodifiableList(confectionList);
    }

    public void setConfectionToGift(List<Confection> confectionList) {
        this.confectionList.clear();
        this.confectionList.addAll(confectionList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gift gift = (Gift) o;

        if (Double.compare(gift.weightGift, weightGift) != 0) return false;
        if (confectionList != null ? !confectionList.equals(gift.confectionList) : gift.confectionList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weightGift);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (confectionList != null ? confectionList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "weightGift=" + weightGift +
                ", confectionList=" + confectionList +
                '}';
    }
}
