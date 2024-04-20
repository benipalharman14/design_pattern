package behavioral.chainOfResponsibility;

public class InfoLogger extends LoggerHandler{

    public InfoLogger(){
        super(LogLevel.INFO);

    }
    @Override
    void write(String message) {
        System.out.println("INFO>> "+message);
    }
}
