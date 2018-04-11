package roverkata.states;

import roverkata.*;

public class CreateActualRoverState extends State {
    @Override
    public State nextState(String input, App1 context) {
        createActualRover(input,context);
        return new MoveRoverState();
    }

    public void createActualRover(String input, App1 app1) {
        String[] results = input.split(" ")
                Rover currentRover = new Rover(app1.getPlateau(),
                        new Position(Integer.parseInt(results[0]),
                                Integer.parseInt(results[1]),
                                Orientation.from(results[2])));
        app1.setCurrentRover(currentRover);
        app1.setInstructionsApplyier(new InstructionsApplyier(currentRover));

    }
}
