package logic.gates;

public class OR extends LogicGate{
	public OR(boolean[] ain, boolean[] bin) {
		super(ain, bin);
	}
	
	@Override
	protected boolean logic() {
		return (A||B);
	}
}
