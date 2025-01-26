package StrategyDesignPattern.Chipset.Imp;

import StrategyDesignPattern.Chipset.Chipset;

public class IntelChipset implements Chipset {

    @Override
    public void installChipSet() {
        System.out.println("Installing Intel Chipset....");
    }
}
