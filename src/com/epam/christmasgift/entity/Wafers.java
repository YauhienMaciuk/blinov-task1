package com.epam.christmasgift.entity;

public class Wafers extends Confection {
    private boolean stuffed;

    public Wafers() {
    }

    public Wafers(String name, double weight, double quantitySugar, boolean stuffed) {
        super(name, weight, quantitySugar);
        this.stuffed = stuffed;
    }

    public boolean isStuffed() {
        return stuffed;
    }

    public void setStuffed(boolean stuffed) {
        this.stuffed = stuffed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Wafers wafers = (Wafers) o;

        if (stuffed != wafers.stuffed) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (stuffed ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Wafers{" +
                "stuffed=" + stuffed +
                "} " + super.toString();
    }
}
