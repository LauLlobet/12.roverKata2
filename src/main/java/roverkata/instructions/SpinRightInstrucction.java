package roverkata.instructions;

import roverkata.Rover;

public class SpinRightInstrucction extends Instruction {
    @Override
    public void apply(Rover rover) {
        rover.spinRight();
    }
}
