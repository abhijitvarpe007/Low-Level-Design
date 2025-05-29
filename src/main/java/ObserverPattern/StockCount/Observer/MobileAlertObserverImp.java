package ObserverPattern.StockCount.Observer;

import ObserverPattern.StockCount.Observable.StockObservable;

public class MobileAlertObserverImp implements NotificationAlertObserver{

    String mobileNumber;
    StockObservable observable;

    public MobileAlertObserverImp(StockObservable observable, String emailId){
        this.observable = observable;
        this.mobileNumber = emailId;
    }

    @Override
    public void update() {
        sendAlter(mobileNumber, "product is in stock, Hurry up!");
    }

    public void sendAlter(String mobileNumber, String message){
        System.out.println(message);
        System.out.println("Message sent to: "+mobileNumber);
    }
}
