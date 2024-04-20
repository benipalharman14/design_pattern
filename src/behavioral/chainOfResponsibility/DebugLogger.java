package behavioral.chainOfResponsibility;

public class DebugLogger extends LoggerHandler{

    public DebugLogger(){
        super(LogLevel.DEBUG);

    }
    @Override
    void write(String message) {
        System.out.println("DEBUG>> "+message);
    }
}
