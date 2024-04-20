package behavioral.command;

public class TurnOnTVCommand implements Command{

    private final TV tv;

    public TurnOnTVCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
