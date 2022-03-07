package main.metamodel;

import main.metamodel.State;

public class Transition {
	
	private boolean hasSetOperation;
	private boolean hasIncrementOperation;
	private boolean hasdecrementOperation;
	private boolean isconditional;
	
	private String conditionVariableName;
	private Integer conditionComparedValue;
	
	
	private boolean hasOperation;
	private String operationVariableName;
	private Integer operationVariableValue;	
	
	
	private boolean equal;
	private boolean less;
	private boolean greater;
	
	//*************************
	private String event;
	private State to;
	private Runnable effect;
	
	
	
	public Transition(String event, State to) {
		super();
		this.event = event;
		this.to = to;
		
		
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return to;
	}

	public boolean hasSetOperation() {
		return this.hasSetOperation;
	}

	public boolean hasIncrementOperation() {
		return this.hasIncrementOperation;
	}

	public boolean hasDecrementOperation() {
		return this.hasdecrementOperation;
	}

	public Object getOperationVariableName() {
		return this.operationVariableName;
	}

	public boolean isConditional() {
		return this.isconditional;
	}

	public Object getConditionVariableName() {
		return this.conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		return this.conditionComparedValue;
	}

	public boolean isConditionEqual() {
		return equal;
	}

	public boolean isConditionGreaterThan() {
		return greater;
	}

	public boolean isConditionLessThan() {
		return less;
	}

	public boolean hasOperation() {
		return hasOperation;
	}

		
	public void IncrementalOperation(Boolean hasincrementOperation) {
		this.hasIncrementOperation = hasincrementOperation;
		this.hasOperation = true;
	}

	public void setDecrementOperation(Boolean decrementOperation) {
		this.hasdecrementOperation = decrementOperation;
		this.hasOperation = true;
	}

	public void setConditional(Boolean isconditional) {
		this.isconditional = isconditional;
		this.hasOperation = true;
	}

	public void setOperationalVariable(String string, int i) {
		this.operationVariableName = string;
		this.operationVariableValue = i;
		this.hasSetOperation = true;
		this.hasOperation = true;
	}

	public void setOperationVariableName(String operationVariableName) {
		this.operationVariableName = operationVariableName;
	}
	
	public void setCoditionalValue(String name, int value) {
		this.conditionVariableName = name;
		this.conditionComparedValue = value;
	}
	
	public void setEqual(boolean isEqual) {
		this.equal = isEqual;
	}

	public void setLess(boolean isLess) {
		this.less = isLess;
	}

	public void setGreater(boolean isGreater) {
		this.greater = isGreater;
	}
	
	public void setConditionalBoolean() {
		this.isconditional = true;
		
	}

	public Integer getOperationVariableValue() {
		return operationVariableValue;
	}
	
	
	
	
	
}
