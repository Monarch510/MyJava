package designModule.Diary;

public class Diary implements Subject{
	private Subject subject;
	
	public Diary(Subject subject) {
		this.subject = subject;
	}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		subject.action();
	}
	
}
