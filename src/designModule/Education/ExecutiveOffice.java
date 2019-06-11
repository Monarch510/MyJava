package designModule.Education;

public class ExecutiveOffice extends EducationComponent{
	
	public ExecutiveOffice() {
		
	}
	
	public ExecutiveOffice(String name) {
		this.name = name;
	}
	@Override
	public void add(EducationComponent educationComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(EducationComponent educationComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendPaper() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " ’µΩ");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public EducationComponent getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
