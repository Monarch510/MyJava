package designModule.PhotoHandle;

public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Photograph photograph = new Photograph();
		Filter filter = (Filter)XMLUtil.getClassBean();
		photograph.setFilter(filter);
		photograph.display();
	}

}
