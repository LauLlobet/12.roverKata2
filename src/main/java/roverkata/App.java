package roverkata;

import roverkata.states.StartPlateauState;
import roverkata.states.State;

public class App {
    private Plateau plateau;
    private Rover currentRover;
    private InstructionsApplyier instructionsApplyier;
    private String output = "";
    private State state = new StartPlateauState();

    public void sendInput(String input) {
        state = state.parseInputAndDoState(input, this);
    }

    public int getPlateauHeigth() {
        return plateau.getHeigth();
    }

    public Position getCurrentRoverPosition() {
        return currentRover.getPosition();
    }

    public String getOutput() {
        return output;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setCurrentRover(Rover currentRover) {
        this.currentRover = currentRover;
    }

    public void prepareInstructionApplyierFromCurrentRover() {
        this.instructionsApplyier = new InstructionsApplyier(currentRover);
    }

    public InstructionsApplyier getInstructionsApplyier() {
        return instructionsApplyier;
    }

    public void addCurrentRoverToOutput() {
        output+= currentRover.toString()+"\n";
    }
}
