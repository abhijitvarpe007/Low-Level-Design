package StrategyDesignPatter.Chipset.Imp;

import StrategyDesignPatter.Chipset.Chipset;

public class AppleM1Chipset implements Chipset {

    @Override
    public void installChipSet() {
        System.out.println("Installing Apple M1 Chipset...");
    }
}
