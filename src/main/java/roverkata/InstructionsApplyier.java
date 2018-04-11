package roverkata;

public class InstructionsApplyier {

    private final Rover rover;

    public InstructionsApplyier(Rover rover) {
        this.rover = rover;
    }

    public void applyInstruction(String instruction) {
        rover.applyInstruction(instruction);
    }
}
