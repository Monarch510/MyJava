package designModule.Education;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EducationComposite educationComposite = new EducationComposite("�����ܲ�");
		educationComposite.add(new EducationOffice("����칫��"));
		educationComposite.add(new EducationComposite("���Ϸ�У"));
		educationComposite.add(new ExecutiveOffice("�����칫��"));
		educationComposite.getChild(1).add(new EducationOffice("����칫��"));
		educationComposite.getChild(1).add(new EducationComposite("��ɳ��ѧ��"));
		educationComposite.getChild(1).add(new EducationComposite("��̶��ѧ��"));
		educationComposite.getChild(1).add(new ExecutiveOffice("�����칫��"));
		educationComposite.getChild(1).getChild(1).add(new EducationOffice("����칫��"));
		educationComposite.getChild(1).getChild(1).add(new ExecutiveOffice("�����칫��"));
		educationComposite.getChild(1).getChild(2).add(new EducationOffice("����칫��"));
		educationComposite.getChild(1).getChild(2).add(new ExecutiveOffice("�����칫��"));
		educationComposite.sendPaper();
	}

}
