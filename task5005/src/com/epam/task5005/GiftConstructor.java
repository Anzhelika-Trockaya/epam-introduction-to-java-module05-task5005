package com.epam.task5005;

import com.epam.task5005.giftBuilder.Gift;
import com.epam.task5005.giftBuilder.GiftBuilder;

public class GiftConstructor {
    private GiftBuilder giftBuilder;
    public void setGiftBuilder(GiftBuilder giftBuilder){
        this.giftBuilder=giftBuilder;
    }
    public Gift getGift(){
        return giftBuilder.getGift();
    }

    public void constructGift(){
        giftBuilder.createNewGift();
        giftBuilder.buildSweets();
        giftBuilder.buildWrapping();
    }
}
