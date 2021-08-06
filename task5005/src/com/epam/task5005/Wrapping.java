package com.epam.task5005;

import java.util.Objects;

public class Wrapping {
    private final String color;
    private final String printType;

    public Wrapping(String color, String printType) {
        this.color = color;
        this.printType=printType;
    }

    @Override
    public String toString() {
        return "Wrapping{" +
                "color='" + color + '\'' +
                ", printType='" + printType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrapping wrapping = (Wrapping) o;
        return color.equals(wrapping.color) &&
                printType.equals(wrapping.printType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, printType);
    }
}
