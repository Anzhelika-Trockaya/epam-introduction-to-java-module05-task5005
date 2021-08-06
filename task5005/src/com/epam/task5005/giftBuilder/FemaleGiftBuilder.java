package com.epam.task5005.giftBuilder;

import com.epam.task5005.Sweetness;
import com.epam.task5005.Wrapping;

public class FemaleGiftBuilder extends GiftBuilder {
    @Override
    public void buildSweets() {
        Sweetness[] sweets = {new Sweetness("Milk chocolate", 200), new Sweetness("Marshmallow",250)};
        gift.setSweets(sweets);
    }

    @Override
    public void buildWrapping() {
        gift.setWrapping(new Wrapping("red", "roses"));
    }
}
