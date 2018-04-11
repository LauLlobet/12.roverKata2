package roverkata;

import roverkata.instructions.Instruction;

public class InstructionsApplyier {

    private final Rover rover;

    public InstructionsApplyier(Rover rover) {
        this.rover = rover;
    }

    public void applyInstruction(String instructionChain) {
        char[] instructions = instructionChain.toCharArray();
        for (char instructionChar: instructions
             ) {
            Instruction instruction = Instruction.defineFrom(instructionChar);
            instruction.apply(rover);
        }
    }
}
