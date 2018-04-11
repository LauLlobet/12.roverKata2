package roverkata;

import java.util.Arrays;
import java.util.stream.Collector;

public class App1 {
    private Plateau plateau;
    private Rover currentRover;
    private int step =0;
    private InstructionsApplyier instructionsApplyier;
    private String output = "";

    public int getPlateauHeigth() {
        return plateau.getHeigth();
    }

    public void sendInput(String input) {
        if(step == 0) {
            Integer[] inputInts = Arrays.stream(input.split(" ")).map(x -> Integer.parseInt(x)).toArray(Integer[]::new);
            plateau = new Plateau(inputInts[0], inputInts[1]);
        }
        if(step == 1){
            String[] results = input.split(" ");
            currentRover = new Rover(plateau,new Position(Integer.parseInt(results[0]),(int)Integer.parseInt(results[1]),Orientation.from(results[2])));
            instructionsApplyier = new InstructionsApplyier(currentRover);
        }
        if(step == 2){
            instructionsApplyier.applyInstruction(input);
            output += currentRover.toString();
            step = 1;
            return;
        }
        step++;
    }

    public Position getCurrentRoverPosition() {
        return currentRover.getPosition();
    }

    public String getOutput() {
        return output;
    }
}
