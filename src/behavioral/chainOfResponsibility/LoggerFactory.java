package behavioral.chainOfResponsibility;

public class LoggerFactory {


    private static LoggerHandler instance;

    public static synchronized LoggerHandler getInstance(){
        if(instance == null){
           instance = createChain();
        }
        return instance;
    }

    private static LoggerHandler createChain(){
        LoggerHandler info = new InfoLogger();
        ErrorLogger error = new ErrorLogger();
        LoggerHandler debug = new DebugLogger();


        info.setNext(error);
        error.setNext(debug); //info-->error--> debug
        return info;
    }
}
