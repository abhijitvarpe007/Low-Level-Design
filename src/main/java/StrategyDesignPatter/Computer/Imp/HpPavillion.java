package StrategyDesignPatter.Computer.Imp;

import StrategyDesignPatter.Chipset.Imp.IntelChipset;
import StrategyDesignPatter.Computer.Computer;
import StrategyDesignPatter.GraphicsCard.Imp.NvidiaGeForce;

public class HpPavillion extends Computer {

    public HpPavillion() {
        super(new NvidiaGeForce(), new IntelChipset() );
    }

    @Override
    public void display() {
        System.out.println("Starting the display");
    }

    @Override
    public void powerOn() {
        System.out.println("HP Pavillion Powering on!");
    }

    @Override
    public void powerOff() {
        System.out.println("HP Pavillion Powering Off!");
    }
}
