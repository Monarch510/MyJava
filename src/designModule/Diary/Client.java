package designModule.Diary;
//����ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject work = new Work();
		Subject diary = new Diary(work);
		diary.action();
	}

}
