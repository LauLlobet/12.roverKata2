package roverkata.instructions;

import roverkata.Rover;

public class SpinLeftInstrucction extends Instruction {
    @Override
    public void apply(Rover rover) {
        rover.spinLeft();
    }
}
