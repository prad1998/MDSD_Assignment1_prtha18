package main;

import main.metamodel.Transition;
import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
	
	private Machine machine; // metamodel (i.e., state machine program) to execute
	private State currentState; // runtime state
	
	
	public void run(Machine m) {
		this.machine = m;
	//	this.currentState = m.getInitialState();
	}

	public State getCurrentState() {
		return machine.getInitialState();
	}

	public void processEvent(String string) {
		for(Transition t: currentState.getTransitions()) {
			if(t.getEvent().equals(string)) {
				t.effect();
				currentState = t.getTo();
				return;
			}
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
