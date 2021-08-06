package com.epam.task5005;

import java.util.Objects;

public class Sweetness {
    private final String name;
    private final int weight;

    public Sweetness(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "(" + weight + "gr)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweetness sweetness = (Sweetness) o;
        return weight == sweetness.weight &&
                name.equals(sweetness.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
