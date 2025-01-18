package StrategyDesignPatter;

import StrategyDesignPatter.Computer.AppleMacBook;
import StrategyDesignPatter.Computer.ChromeBook;
import StrategyDesignPatter.Computer.HpPavillion;

public class Runner {

    public static void main(String[] args){
        HpPavillion hpPavillion = new HpPavillion();
        hpPavillion.powerOn();
        hpPavillion.display();
        hpPavillion.powerOff();

        AppleMacBook appleMacBook = new AppleMacBook();
        appleMacBook.powerOn();
        appleMacBook.display();
        appleMacBook.powerOff();

        ChromeBook chromeBook = new ChromeBook();
        chromeBook.powerOn();
        chromeBook.display();
        chromeBook.powerOff();
    }
}
