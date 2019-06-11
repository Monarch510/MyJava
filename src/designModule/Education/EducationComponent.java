package designModule.Education;

public abstract class EducationComponent {
	protected String name;
	
	public abstract void add(EducationComponent educationComponent);
	
	public abstract void remove(EducationComponent educationComponent);
	
	public abstract void sendPaper();
	
	public abstract void setName(String name);
	
	public abstract String getName();
	
	public abstract EducationComponent getChild(int i);

}
