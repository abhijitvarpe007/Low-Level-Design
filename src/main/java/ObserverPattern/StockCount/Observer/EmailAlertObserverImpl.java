package ObserverPattern.StockCount.Observable.Observer;

import ObserverPattern.StockCount.Observable.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(StockObservable observable, String emailId){
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendAlter(emailId, "product is in stock, Hurry up!");
    }

    public void sendAlter(String emailId, String message){
        System.out.println(message);
        System.out.println("Email sent to: "+emailId);
    }
}
