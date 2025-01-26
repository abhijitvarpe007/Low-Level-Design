package StrategyDesignPattern.Computer;

import StrategyDesignPattern.Chipset.Chipset;
import StrategyDesignPattern.GraphicsCard.GraphicsCard;

public abstract class Computer {
    private GraphicsCard graphicsCard;
    private Chipset chipset;

    public Computer(GraphicsCard graphicsCard, Chipset chipset){
        this.graphicsCard = graphicsCard;
        this.chipset = chipset;
        Configure();
    }

    private void Configure(){
        System.out.println();
        System.out.println("Configuring the computer...");
        this.chipset.installChipSet();
        this.graphicsCard.installGraphicsCard();
        System.out.println("Successfully configure computer!!!");
    }

    public abstract void display();
    public abstract void powerOn();
    public abstract void powerOff();
}
