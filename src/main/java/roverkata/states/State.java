package roverkata.states;

import roverkata.App1;

public abstract class State {

    public abstract State nextState(String input, App1 context);

}
