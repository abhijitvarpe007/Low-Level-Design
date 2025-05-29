package ObserverPattern.NewsLetterSubscriber.Observer;

import ObserverPattern.NewsLetterSubscriber.Observable.NewsLetterObservable;

public class IndividualSubscriber implements Observer{
    NewsLetterObservable newsLetterObservable;
    private String name;
    private String articleContent;

    public IndividualSubscriber(NewsLetterObservable newsLetterObservable, String name) {
        this.newsLetterObservable = newsLetterObservable;
        this.name = name;
    }

    @Override
    public void update(String articleContent) {
        this.articleContent = articleContent;
        sentToSubscribers();
    }

    public void sentToSubscribers(){
        System.out.println();
        System.out.println(
                this.name + " is sending the article content to all the Individuals members"
        );
        System.out.println("Article name : " + this.articleContent);
        System.out.println();
        System.out.println();
    }
}
