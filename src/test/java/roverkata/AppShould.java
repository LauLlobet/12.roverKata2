package roverkata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppShould {
    private App1 app1;

    @Before
    public void
    set_up(){
        app1 = new App1();
    }
    @Test
   public void
   create_a_plateau_at_first_instrucction() {

        app1.sendInput("3 4");

      assertThat(app1.getPlateauHeigth(),is(4));
   }

   @Test
   public void
   create_a_rover_at_second_instrucction() {
        app1.sendInput("5 5");
        app1.sendInput("1 2 N");

      app1.sendInput("LMLMLMLMM");

       assertThat(app1.getCurrentRoverPosition(),is(new Position(1,3,Orientation.NORTH)));
   }

    @Test
    public void
    should_apply_instructions_at_third_command_and_output_position_after_it() {
        app1.sendInput("5 5");
        app1.sendInput("1 2 N");
        app1.sendInput("LMLMLMLMM");
        app1.sendInput("3 3 E");
        app1.sendInput("MMRMMRMRRM");

        assertThat(app1.getOutput(),is("1 3 N\n5 1 E\n"));
    }
}

