package designModule.PlaneMaker;

public abstract class PlaneMaker {
	protected Plane plane;
	
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
	public abstract void createPlane();
}
