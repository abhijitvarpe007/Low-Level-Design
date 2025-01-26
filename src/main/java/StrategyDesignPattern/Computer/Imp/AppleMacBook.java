package StrategyDesignPattern.Computer.Imp;

import StrategyDesignPattern.Chipset.Imp.AppleM1Chipset;
import StrategyDesignPattern.Computer.Computer;
import StrategyDesignPattern.GraphicsCard.Imp.NvidiaGeForce;

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
