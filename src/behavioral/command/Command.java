package behavioral.command;

/**
 *  Whenever we have situation we want to separate out the object that invokes
 *  the operation from the object that actually performs the operation.
 *  Example TV Remote
 *  Different from state pattern as it separate out object and object change but state preserves the number of commands
 *  We will see the code in the library
 *
 *  Example Xerox machine
 */
public interface Command {

    void execute();

}
