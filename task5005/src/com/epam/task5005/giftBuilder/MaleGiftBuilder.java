package com.epam.task5005.giftBuilder;

import com.epam.task5005.Sweetness;
import com.epam.task5005.Wrapping;

public class MaleGiftBuilder extends GiftBuilder {
    @Override
    public void buildSweets() {
        Sweetness[] sweets={new Sweetness("Dark chocolate", 200), new Sweetness("M&M's", 120)};
        gift.setSweets(sweets);
    }

    @Override
    public void buildWrapping() {
        gift.setWrapping(new Wrapping("blue", "lines"));
    }
}
