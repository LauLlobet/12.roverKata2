package roverkata.states;

import roverkata.App;

public class State {

    String[] cliCommandArguments;
    public State parseInputAndDoState(String input, App context){
        cliCommandArguments = input.split(" ");
        return nextState(context);
    }
    protected State nextState(App context){
        return this;
    }

}
