package roverkata.instructions;

import roverkata.Rover;

public class MoveInstrucction extends Instruction {

    @Override
    public void apply(Rover rover) {
        rover.move();
    }
}
