package StrategyDesignPattern.GraphicsCard.Imp;

import StrategyDesignPattern.GraphicsCard.GraphicsCard;

public class NvidiaGeForce implements GraphicsCard {
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing NvidiaGeForce graphics card...");
    }
}
