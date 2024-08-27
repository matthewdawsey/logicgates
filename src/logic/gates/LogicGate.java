package logic.gates;

public abstract class LogicGate {
	
	protected boolean A = false;	// first input bit
	protected boolean B = false;	// second input bit
	protected boolean S = false;	// output bit
	
	protected boolean[] aInputs;
	protected boolean[] bInputs;
	
	public LogicGate(boolean[] aInputs, boolean[] bInputs) {
		this.aInputs = aInputs;
		this.bInputs = bInputs;
	}
	
	public void update() {
		if (this.aInputs != null) {
			for (boolean aFlag : this.aInputs) {
				if (aFlag) {
					A = true;
					break;
				}
				
				A = false;
			}
		}
		
		if (this.bInputs != null) {
			for (boolean bFlag : this.bInputs) {
				if (bFlag) {
					B = true;
					break;
				}
				
				B = false;
			}
		}
		
		S = this.logic();
	}
	
	public boolean read() {
		return S;
	}
	
	protected boolean logic() {
		return false;
	}
}
