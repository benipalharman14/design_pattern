package behavioral.chainOfResponsibility;

public class ErrorLogger extends LoggerHandler{

    public ErrorLogger(){
        super(LogLevel.ERROR);

    }
    @Override
    void write(String message) {
        System.out.println("ERROR>> "+message);
    }
}
