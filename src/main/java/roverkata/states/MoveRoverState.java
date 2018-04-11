package roverkata.states;

import roverkata.App;
import roverkata.InstructionsApplyier;

public class MoveRoverState extends State {

    @Override
    protected State nextState(App context) {
        moveRover(context);
        return new CreateNewRoverState();
    }

    private void moveRover(App context) {
        InstructionsApplyier instructionsApplyier = context.getInstructionsApplyier();
        instructionsApplyier.applyInstruction(cliCommandArguments[0]);
        context.addCurrentRoverToOutput();
    }
}
