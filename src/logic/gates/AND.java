package logic.gates;

public class AND extends LogicGate {
	
	public AND(boolean[] ain, boolean[] bin) {
		super(ain, bin);
	}
	
	@Override
	protected boolean logic() {
		return (A&&B);
	}
	
}
