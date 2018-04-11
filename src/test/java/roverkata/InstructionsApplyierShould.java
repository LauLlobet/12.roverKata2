package roverkata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructionsApplyierShould {

    private Rover rover;
    private InstructionsApplyier instructionsApplyier;

    @Before
    public void setUp(){
        rover = new Rover(new Plateau(3,3),new Position(0,0,Orientation.WEST));
        instructionsApplyier = new InstructionsApplyier(rover);
    }

    @Test
    public void
    apply_repeated_instructions_to_rover() {
        instructionsApplyier.applyInstruction("MMMMM");
        assertEquals(rover.getPosition(),new Position(1,0,Orientation.WEST));
    }
}
