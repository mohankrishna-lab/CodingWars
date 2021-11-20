package zprac;

public class DEF implements Sellers{
	private int ledTV;
	private int projector;
	private int cctvSystem;
	private int address;
	
	public DEF(int ledTV, int projector, int cctvSystem, int address) {
		super();
		this.ledTV = ledTV;
		this.projector = projector;
		this.cctvSystem = cctvSystem;
		this.address = address;
	}
	public int getLedTV() {
		return ledTV;
	}
	public void setLedTV(int ledTV) {
		this.ledTV = ledTV;
	}
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	public int getCctvSystem() {
		return cctvSystem;
	}
	public void setCctvSystem(int cctvSystem) {
		this.cctvSystem = cctvSystem;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "ABC [ledTV=" + ledTV + ", projector=" + projector + ", cctvSystem=" + cctvSystem + ", address="
				+ address + "]";
	}
	
	public int total() {
		int total = 0;
		total = ledTV + projector + cctvSystem + address;
		return total;
	}
}
