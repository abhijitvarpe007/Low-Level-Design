package ObserverPattern.NewsLetterSubscriber.Observable;

import ObserverPattern.NewsLetterSubscriber.Observer.Observer;

public interface NewsLetterObservable {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void notifyObserver();
}
