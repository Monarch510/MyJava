package designModule.War;

public abstract class Officer {
	protected Officer officer;
	
	public void setOfficer(Officer officer) {
		this.officer = officer;
	}
	
	public abstract void handle(Mission mission);
}
