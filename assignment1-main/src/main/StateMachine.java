package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.metamodel.Transition;
import main.metamodel.Machine;
import main.metamodel.State;

public class StateMachine {
	private Map<String,State> states = new HashMap<>();
	private State initial;
	private State current; 
	private String currentEvent;
	private Transition currentTrans; 
	private List<String> integerList = new ArrayList<>();
	private Map<String,Integer> integerList2 = new HashMap<>();
	private Map<String,Integer> values = new HashMap<>();
	private Set<String> StringVariables= new HashSet<>();
	
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}

	public Machine build() {
		
		return new Machine(states.values(),initial, StringVariables);
	}

	public StateMachine state(String string) {
		current = getState(string);
		return this;
	}

	public StateMachine initial() {
		initial = current;
		return this;
	}

	public StateMachine when(String string) {
		currentEvent = string;
		return this; 
	}

	public StateMachine to(String string) {
		 currentTrans = new Transition(currentEvent,getState(string));
		current.addTransition(currentTrans);
		return this;
	}

	public StateMachine integer(String string) {
		StringVariables.add(string);
		return this;
	}

	public StateMachine set(String string, int i) {
		currentTrans.setOperationalVariable(string,i);
		return this;
	}

	public StateMachine increment(String string) {
		currentTrans.setOperationVariableName(string);
		currentTrans.IncrementalOperation(true);
		return this;
	}

	public StateMachine decrement(String string) {
		currentTrans.setOperationVariableName(string);
		currentTrans.setDecrementOperation(true);
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentTrans.setCoditionalValue(string, i);
		currentTrans.setConditionalBoolean();
		currentTrans.setEqual(true);
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		currentTrans.setCoditionalValue(string, i);
		currentTrans.setConditionalBoolean();
		currentTrans.setGreater(true);;
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		currentTrans.setCoditionalValue(string, i);
		currentTrans.setConditionalBoolean();
		currentTrans.setLess(true);
		return this;
	}

}
