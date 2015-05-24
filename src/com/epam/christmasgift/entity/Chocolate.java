package com.epam.christmasgift.entity;

public class Chocolate extends Confection {
    private String color;

    public Chocolate() {
    }

    public Chocolate(String name, double weight, double quantitySugar, String color) {
        super(name, weight, quantitySugar);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chocolate chocolate = (Chocolate) o;

        if (color != null ? !color.equals(chocolate.color) : chocolate.color != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
