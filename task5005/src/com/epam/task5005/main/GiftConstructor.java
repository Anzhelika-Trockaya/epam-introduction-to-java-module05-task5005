package com.epam.task5005.main;

import com.epam.task5005.giftBuilder.*;

/*
 * Director
 */

public class GiftConstructor {
    private GiftBuilder giftBuilder;
    public void setGiftBuilder(GiftBuilder giftBuilder){
        this.giftBuilder=giftBuilder;
    }
    public void setGiftBuilder(String giftBuilder){
        switch (giftBuilder) {
            case "m", "M" -> setGiftBuilder(new MaleGiftBuilder());
            case "w", "W" -> setGiftBuilder(new FemaleGiftBuilder());
            case "k", "K" -> setGiftBuilder(new KidsGiftBuilder());
            default -> throw new RuntimeException(giftBuilder+" is unknown type of gift!");
        }
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
