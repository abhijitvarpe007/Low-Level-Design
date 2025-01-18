package StrategyDesignPatter.Computer;

import StrategyDesignPatter.Chipset.AppleM1Chipset;
import StrategyDesignPatter.GraphicsCard.NvidiaGeForce;

public class AppleMacBook extends Computer {

    public AppleMacBook() {
        super(new NvidiaGeForce(), new AppleM1Chipset());
    }

    @Override
    public void display() {
        System.out.println("Starting the display...");
    }

    @Override
    public void powerOn() {
        System.out.println("Apple MacBook Powering On!");
    }

    @Override
    public void powerOff() {
        System.out.println("Apple MacBook Powering Off!");
    }
}
