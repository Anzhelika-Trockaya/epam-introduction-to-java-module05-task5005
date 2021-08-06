package com.epam.task5005.giftBuilder;

public abstract class GiftBuilder {
    protected Gift gift;

    public Gift getGift(){
        return gift;
    }
    public void createNewGift(){
        gift=new Gift();
    }

    public abstract void buildSweets();
    public abstract void buildWrapping();
}
