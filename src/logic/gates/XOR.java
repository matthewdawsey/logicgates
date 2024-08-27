package logic.gates;

public class XOR extends LogicGate {
	public XOR(boolean[] ain, boolean[] bin) {
		super(ain, bin);
	}
	
	@Override
	protected boolean logic() {
		return (A!=B);
	}
}
