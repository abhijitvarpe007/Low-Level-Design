package ObserverPattern;

import ObserverPattern.StockCount.Observable.IphoneObservableImp;
import ObserverPattern.StockCount.Observable.StockObservable;
import ObserverPattern.StockCount.Observer.EmailAlertObserverImpl;
import ObserverPattern.StockCount.Observer.MobileAlertObserverImp;

public class Stock {

    public static void main(String[] args){

        StockObservable observable = new IphoneObservableImp();

        EmailAlertObserverImpl emailObserver = new EmailAlertObserverImpl(new IphoneObservableImp(), "abhijit.varpe@gmail.com");
        MobileAlertObserverImp mobileObserver = new MobileAlertObserverImp(new IphoneObservableImp(), "9876543210");

        observable.add(emailObserver);
        observable.add(mobileObserver);

        observable.setStockCount(30);
        observable.setStockCount(0);
        observable.setStockCount(50);
    }
}
