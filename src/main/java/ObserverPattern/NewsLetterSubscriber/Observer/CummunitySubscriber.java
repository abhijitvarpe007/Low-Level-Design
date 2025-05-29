package ObserverPattern.NewsLetterSubscriber.Observer;

import ObserverPattern.NewsLetterSubscriber.Observable.NewsLetterObservable;

public class CummunitySubscriber implements Observer{
    NewsLetterObservable newsLetterObservable;
    private String name;
    private String articleContent;

    public CummunitySubscriber(NewsLetterObservable newsLetterObservable, String name) {
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
                this.name + " is sending the article content to all the community members"
        );
        System.out.println("Article name : " + this.articleContent);
        System.out.println();
        System.out.println();
    }

}
