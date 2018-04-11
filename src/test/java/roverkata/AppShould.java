package roverkata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppShould {
    private App app;

    @Before
    public void
    set_up(){
        app = new App();
    }
    @Test
   public void
   create_a_plateau_at_first_instrucction() {

        app.sendInput("3 4");

      assertThat(app.getPlateauHeigth(),is(4));
   }

   @Test
   public void
   create_a_rover_at_second_instrucction_and_apply_instrucctions_at_third_input() {
        app.sendInput("5 5");
        app.sendInput("1 2 N");

      app.sendInput("LMLMLMLMM");

       assertThat(app.getCurrentRoverPosition(),is(new Position(1,3,Orientation.NORTH)));
   }

    @Test
    public void
    should_apply_instructions_at_third_command_and_output_position_after_it() {
        app.sendInput("5 5");
        app.sendInput("1 2 N");
        app.sendInput("LMLMLMLMM");
        app.sendInput("3 3 E");
        app.sendInput("MMRMMRMRRM");

        assertThat(app.getOutput(),is("1 3 N\n5 1 E\n"));
    }
}

