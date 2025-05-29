package ObserverPattern.StockCount.Observable.Observable;

import ObserverPattern.StockCount.Observable.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void setStockCount(int newStockCount);

    public int getStockCount();

    public void notifySubscribers();

}
