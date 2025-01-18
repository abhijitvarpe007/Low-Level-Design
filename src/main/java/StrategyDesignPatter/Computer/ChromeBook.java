package StrategyDesignPatter.Computer;

import StrategyDesignPatter.Chipset.IntelChipset;
import StrategyDesignPatter.GraphicsCard.AmdRandeon;

public class ChromeBook extends Computer {
    public ChromeBook() {
        super(new AmdRandeon(), new IntelChipset());
    }

    @Override
    public void display() {
        System.out.println("Starting the display...");
    }

    @Override
    public void powerOn() {
        System.out.println("ChromeBook Powering On!");
    }

    @Override
    public void powerOff() {
        System.out.println("ChromeBook Powering Off!");
    }
}
