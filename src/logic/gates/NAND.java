package logic.gates;

public class NAND extends LogicGate {
	
	public NAND(boolean[] ain, boolean[] bin) {
		super(ain, bin);
	}
	
	@Override
	protected boolean logic() {
		return !(A&&B);
	}
	
}
