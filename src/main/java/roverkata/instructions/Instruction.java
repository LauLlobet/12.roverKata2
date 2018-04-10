package roverkata.instructions;


import roverkata.Rover;

public abstract class Instruction {
    public static Instruction defineFrom(char instructionChar) {
        switch(instructionChar){
            case 'M':
                return new MoveInstrucction();
        }
        return null;
    }

    public abstract void apply(Rover rover);
}
