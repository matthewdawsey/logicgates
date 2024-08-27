package logic.gates;

public class NOR extends LogicGate {
	
	public NOR(boolean[] ain, boolean[] bin) {
		super(ain, bin);
	}
	
	@Override
	protected boolean logic() {
		return (!A&&!B) ? true : false;
	}
	
}
