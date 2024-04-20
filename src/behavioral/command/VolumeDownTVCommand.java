package behavioral.command;

import behavioral.command.Command;
import behavioral.command.TV;

public class VolumeDownTVCommand implements Command {

    private final TV tv;

    public VolumeDownTVCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}