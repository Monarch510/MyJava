package designModule.Education;

import java.util.ArrayList;

public class EducationComposite extends EducationComponent{
	private ArrayList<EducationComponent> list = new ArrayList<EducationComponent>();
	
	public EducationComposite() {
		
	}
	
	public EducationComposite(String name) {
		this.name = name;
	}

	@Override
	public void add(EducationComponent educationComponent) {
		// TODO Auto-generated method stub
		list.add(educationComponent);
	}

	@Override
	public void remove(EducationComponent educationComponent) {
		// TODO Auto-generated method stub
		list.remove(educationComponent);
	}

	@Override
	public void sendPaper() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " ’µΩ");
		for(int i = 0;i < this.list.size();i++) {
			this.getChild(i).sendPaper();
		}
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
		return list.get(i);
	}

}
