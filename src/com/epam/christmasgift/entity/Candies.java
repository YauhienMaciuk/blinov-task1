package com.epam.christmasgift.entity;

public class Candies extends Confection {
    private CandiesType type;

    public Candies() {
    }

    public Candies(String name, double weight, double quantitySugar, CandiesType type) {
        super(name, weight, quantitySugar);
        this.type = type;
    }

    public CandiesType getType() {
        return type;
    }

    public void setType(CandiesType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Candies candies = (Candies) o;

        if (type != candies.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "type=" + type +
                "} " + super.toString();
    }
}
