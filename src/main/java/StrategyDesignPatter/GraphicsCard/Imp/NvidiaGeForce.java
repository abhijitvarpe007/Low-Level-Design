package StrategyDesignPatter.GraphicsCard.Imp;

import StrategyDesignPatter.GraphicsCard.GraphicsCard;

public class NvidiaGeForce implements GraphicsCard {
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing NvidiaGeForce graphics card...");
    }
}
