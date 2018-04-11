package roverkata.states;

import roverkata.App1;
import roverkata.Plateau;

import java.util.Arrays;

public class StartPlateauState extends State{
    @Override
    public State nextState(String input, App1 context) {
        startPlateau(input,context);
        return new CreateActualRoverState();
    }

    public void startPlateau(String input, App1 context) {
        Integer[] inputInts = Arrays.stream(input.split(" ")).map(x -> Integer.parseInt(x)).toArray(Integer[]::new);
        context.setPlateau( new Plateau(inputInts[0], inputInts[1]));
    }
}
