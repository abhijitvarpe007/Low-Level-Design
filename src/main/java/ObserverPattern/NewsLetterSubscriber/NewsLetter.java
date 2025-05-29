package ObserverPattern.NewsLetterSubscriber;

import ObserverPattern.NewsLetterSubscriber.Observable.SystemThatScale;
import ObserverPattern.NewsLetterSubscriber.Observer.CummunitySubscriber;
import ObserverPattern.NewsLetterSubscriber.Observer.IndividualSubscriber;
import ObserverPattern.NewsLetterSubscriber.Observer.Observer;

public class NewsLetter {

    public static void main(String[] args){
        SystemThatScale systemThatScale = new SystemThatScale();

        Observer abhijit = new IndividualSubscriber(systemThatScale, "Abhijit");

        Observer ram = new IndividualSubscriber(systemThatScale, "Ram");

        Observer cummunity = new CummunitySubscriber(systemThatScale , "DevOops");

        systemThatScale.register(abhijit);
        systemThatScale.register(ram);
        systemThatScale.register(cummunity);

        systemThatScale.newNewsLetter("Observer Design Pattern");
    }
}
