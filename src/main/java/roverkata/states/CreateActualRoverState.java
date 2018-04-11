package roverkata.states;

import roverkata.*;

public class CreateActualRoverState extends State {

    @Override
    protected State nextState(App context) {
        createActualRover(context);
        return new MoveRoverState();
    }

    public void createActualRover(App app) {
        Rover currentRover = createRoverFormInput(app.getPlateau(), cliCommandArguments);

        app.setCurrentRover(currentRover);
        app.prepareInstructionApplyierFromCurrentRover();
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
