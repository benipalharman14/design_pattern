package behavioral.command;

public class TurnOffTVCommand implements Command{

    private final TV tv;

    public TurnOffTVCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
