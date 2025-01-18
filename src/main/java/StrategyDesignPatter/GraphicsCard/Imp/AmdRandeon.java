package StrategyDesignPatter.GraphicsCard.Imp;

import StrategyDesignPatter.GraphicsCard.GraphicsCard;

public class AmdRandeon implements GraphicsCard {
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing AmdRandeon graphics card...");
    }
}
