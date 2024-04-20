package behavioral.command;

public class VolumeUpTVCommand implements Command {

    private final TV tv;

    public VolumeUpTVCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}
