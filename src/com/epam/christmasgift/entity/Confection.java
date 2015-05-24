package com.epam.christmasgift.entity;

import com.epam.christmasgift.exception.ChristmasGiftException;
import org.apache.log4j.Logger;

public abstract class Confection {
    public static final Logger LOGGER = Logger.getLogger("Confection.class");
    private String name;
    private double weight;
    private double quantitySugar;

    public Confection() {
    }

    public Confection(String name, double weight, double quantitySugar) {
        this.name = name;
        this.weight = weight;
        this.quantitySugar = quantitySugar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws ChristmasGiftException {
        if (weight > 0) {
            this.weight = weight;
        } else {
            LOGGER.info("Некорректно задан вес сладости");
            throw new ChristmasGiftException("Некорректно задан вес сладости");
        }
    }

    public double getQuantitySugar() {
        return quantitySugar;
    }

    public void setQuantitySugar(double quantitySugar) throws ChristmasGiftException {
        if (quantitySugar >= 0) {
            this.quantitySugar = quantitySugar;
        } else {
            LOGGER.info("Некорректно задано количество сахара");
            throw new ChristmasGiftException("Некорректно задано количество сахара");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Confection that = (Confection) o;

        if (Double.compare(that.quantitySugar, quantitySugar) != 0) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(quantitySugar);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Confection{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", quantitySugar=" + quantitySugar +
                '}' + '\n';
    }
}
