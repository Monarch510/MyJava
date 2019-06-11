package designModule.PlaneMaker;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaneMaker planeMaker = (PlaneMaker) XMLUtil.getClassBean().get(0);
		Plane plane = (Plane) XMLUtil.getClassBean().get(1);
		planeMaker.setPlane(plane);
		planeMaker.createPlane();
	}

}
