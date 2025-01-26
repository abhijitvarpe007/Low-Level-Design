package StrategyDesignPattern.GraphicsCard.Imp;

import StrategyDesignPattern.GraphicsCard.GraphicsCard;

public class AmdRandeon implements GraphicsCard {
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing AmdRandeon graphics card...");
    }
}
