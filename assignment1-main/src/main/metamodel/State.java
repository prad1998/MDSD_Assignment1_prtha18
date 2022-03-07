package main.metamodel;

import java.util.ArrayList;
import java.util.List;

import main.metamodel.Transition;

public class State {
	
	private String name; 
	private List<Transition> trans = new ArrayList<>();
	
	
	public State(String name) {
		super();
		this.name = name;
	}

	public void addTransition(Transition t) {
		this.trans.add(t);
	}
	
	public String getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return trans;
	}

	public Transition getTransitionByEvent(String string) {
		for (Transition tran : trans) {	
			
			   if (tran.getEvent().toString().compareTo(string)==0) return tran;	
			}
		
			return null;	
	}

}
