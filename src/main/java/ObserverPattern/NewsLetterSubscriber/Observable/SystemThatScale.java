package ObserverPattern.NewsLetterSubscriber.Observable;

import ObserverPattern.NewsLetterSubscriber.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SystemThatScale implements NewsLetterObservable{
    List<Observer> observerList = new ArrayList<>();
    private String newsArticle;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update(newsArticle);
        }
    }

    public void newNewsLetter(String newsArticle){
        this.newsArticle = newsArticle;
        notifyObserver();
    }
}
