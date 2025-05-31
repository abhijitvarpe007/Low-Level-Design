package ChainResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args){

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(null)));

        logProcessor.log(3, "Exception haappend");
        logProcessor.log(2, "need to debug this");
        logProcessor.log(1, "just for Info");
    }
}
