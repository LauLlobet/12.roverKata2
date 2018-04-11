package roverkata.states;

import roverkata.App;
import roverkata.Plateau;

import java.util.Arrays;

public class StartPlateauState extends State{

    @Override
    protected State nextState(App context) {
        startPlateau(context);
        return new CreateNewRoverState();
    }

    private void startPlateau(App context) {
        Integer[] inputInts = Arrays.stream(cliCommandArguments)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        context.setPlateau( new Plateau(inputInts[0], inputInts[1]));
    }
}
