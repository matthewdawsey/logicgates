package logic.gates;

public class NOT extends LogicGate {
	public NOT(boolean[] ain) {
		super(ain, null);
	}
	
	@Override
	protected boolean logic() {
		return !A;
	}
}
