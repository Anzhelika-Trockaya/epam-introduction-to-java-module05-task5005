package com.epam.task5005.giftBuilder;

import com.epam.task5005.Sweetness;
import com.epam.task5005.Wrapping;

import java.util.Arrays;

public class Gift {
    private Wrapping wrapping;
    private Sweetness[] sweets;

    public void setWrapping(Wrapping wrapping){
        this.wrapping=wrapping;
    }

    public void setSweets(Sweetness[] sweets) {
        this.sweets = sweets;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "wrapping=" + wrapping +
                ", sweets=" + Arrays.toString(sweets) +
                '}';
    }
}
