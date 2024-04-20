package behavioral.chainOfResponsibility;

abstract class LoggerHandler {

    private LogLevel logLevel;

    private LoggerHandler next;

    public LoggerHandler(LogLevel logLevel){
        this.logLevel=logLevel;
    }

    public void setNext(LoggerHandler logger){
        this.next = logger;
    }

    public void log(LogLevel level, String message){
        if(this.logLevel.getLevel() <= level.getLevel()){
            write(message);
        }
        if(next!=null){
            next.log(level,message);
        }
    }

    abstract void write(String message);


}
