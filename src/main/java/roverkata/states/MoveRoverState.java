package roverkata.states;

import roverkata.App1;
import roverkata.InstructionsApplyier;

public class MoveRoverState extends State {
    @Override
    public State nextState(String input, App1 context) {
        moveRover(input,context);
        return new CreateActualRoverState();
    }

    private void moveRover(String input, App1 context) {
        InstructionsApplyier instructionsApplyier = context.getInstructionsApplyier();
        instructionsApplyier.applyInstruction(input);
        context.addOutput(context.getCurrentRover())
        currentRover.toString());
    }
}
