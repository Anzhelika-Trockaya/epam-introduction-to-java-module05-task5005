package com.epam.task5005.giftBuilder;

import com.epam.task5005.Sweetness;
import com.epam.task5005.Wrapping;

public class KidsGiftBuilder extends GiftBuilder {
    @Override
    public void buildSweets() {
        Sweetness[] sweets = {new Sweetness("Bubble gam", 15), new Sweetness("Kinder surprise", 50)};
        gift.setSweets(sweets);
    }

    @Override
    public void buildWrapping() {
        gift.setWrapping(new Wrapping("yellow", "balloons"));
    }
}
