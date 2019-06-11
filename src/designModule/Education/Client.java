package designModule.Education;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EducationComposite educationComposite = new EducationComposite("北京总部");
		educationComposite.add(new EducationOffice("教务办公室"));
		educationComposite.add(new EducationComposite("湖南分校"));
		educationComposite.add(new ExecutiveOffice("行政办公室"));
		educationComposite.getChild(1).add(new EducationOffice("教务办公室"));
		educationComposite.getChild(1).add(new EducationComposite("长沙教学点"));
		educationComposite.getChild(1).add(new EducationComposite("湘潭教学点"));
		educationComposite.getChild(1).add(new ExecutiveOffice("行政办公室"));
		educationComposite.getChild(1).getChild(1).add(new EducationOffice("教务办公室"));
		educationComposite.getChild(1).getChild(1).add(new ExecutiveOffice("行政办公室"));
		educationComposite.getChild(1).getChild(2).add(new EducationOffice("教务办公室"));
		educationComposite.getChild(1).getChild(2).add(new ExecutiveOffice("行政办公室"));
		educationComposite.sendPaper();
	}

}
