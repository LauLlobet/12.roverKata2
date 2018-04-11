package roverkata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverShould {
    private Rover rover;

    @Before
    public void setUp(){
        rover = new Rover(new Plateau(3,3), new Position(0, 0, Orientation.NORTH));
    }

    @Test
    public void
    spin() {

        rover.spinLeft();
       assertThat(rover.getOrientation(),is(Orientation.WEST));

       rover.spinRight();
        assertThat(rover.getOrientation(),is(Orientation.NORTH));
    }

    @Test
    public void
    move() {
        rover.move();
       assertThat(rover.getPosition(),is(new Position(0,1,Orientation.NORTH)));
    }

    @Test
    public void
    wrap_around_defined_plateau_coordinates() {
        rover.spinLeft();
        for(int i=0; i<5;i++){
            rover.move();
        }
       assertThat(rover.getPosition(),is(new Position(1,0,Orientation.WEST)));
    }
}
