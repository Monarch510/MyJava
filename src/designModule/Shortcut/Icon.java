package designModule.Shortcut;

public class Icon implements Subject{
	private Subject subject;
	
	public Icon(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		subject.run();
	}
	
}
