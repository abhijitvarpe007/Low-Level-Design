package ObserverPattern.StockCount.Observable;

import ObserverPattern.StockCount.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void setStockCount(int newStockCount);

    public int getStockCount();

    public void notifySubscribers();

}
