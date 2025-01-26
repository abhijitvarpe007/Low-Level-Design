package StrategyDesignPattern;

import StrategyDesignPattern.Computer.Imp.AppleMacBook;
import StrategyDesignPattern.Computer.Imp.ChromeBook;
import StrategyDesignPattern.Computer.Imp.HpPavillion;

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
