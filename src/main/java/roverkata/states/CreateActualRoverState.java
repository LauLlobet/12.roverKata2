package roverkata.states;

import roverkata.*;

public class CreateActualRoverState extends State {
    @Override
    public State nextState(String input, App1 context) {
        createActualRover(input,context);
        return new MoveRoverState();
    }

    public void createActualRover(String input, App1 app1) {
        String[] results = input.split(" ");

        Rover currentRover = createRoverFormInput(app1.getPlateau(), results);

        app1.setCurrentRover(currentRover);
        app1.prepareInstructionApplyierFromCurrentRover();
    }

    private Rover createRoverFormInput(Plateau plateau, String[] results) {
        return new Rover(plateau,
                createPositionFromInput(results));
    }

    private Position createPositionFromInput(String[] results) {
        return new Position(Integer.parseInt(results[0]),
                            Integer.parseInt(results[1]),
                            Orientation.from(results[2]));
    }
}
