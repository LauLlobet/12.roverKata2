package roverkata;

import roverkata.states.StartPlateauState;
import roverkata.states.State;

public class App1 {
    private Plateau plateau;
    private Rover currentRover;
    private int step =0;
    private InstructionsApplyier instructionsApplyier;
    private String output = "";
    private State state = new StartPlateauState();

    public int getPlateauHeigth() {
        return plateau.getHeigth();
    }




    public void sendInput(String input) {
        state = state.nextState(input, this);
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

    public void setInstructionsApplyier(InstructionsApplyier instructionsApplyier) {
        this.instructionsApplyier = instructionsApplyier;
    }

    public InstructionsApplyier getInstructionsApplyier() {
        return instructionsApplyier;
    }
}
