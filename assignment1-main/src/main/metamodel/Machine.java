package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
	
	private List<State> states = new ArrayList<State>();
	private Map<String, Integer> variables = new HashMap<>();
	private State initialState; 
	
	public Machine(Collection<State> states, State initialState,Collection<String> variables) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
		
		for (String variable : variables) {
			this.variables.put(variable, 0);
		}
		
	}

	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
     //  return states.get(states.indexOf(string));
		
	for (State state : states) {	
		
	   if (state.getName().compareTo(string)==0) return state;	
	}
	return null;
		
	}

	public int numberOfIntegers() {
		return variables.size();
	}

	public boolean hasInteger(String string) {
		
		return false;
	}

}
