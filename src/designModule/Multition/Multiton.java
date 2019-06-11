package designModule.Multition;

public class Multiton {
	private int randomNum = 0;
	
	private Multiton() {
		randomNum = (int)(0 + Math.random()*10);
	}
	
    private static class HolderClass {
        private final static Multiton[] instance = new Multiton[] {new Multiton(),new Multiton()};
    }
	
    public static Multiton getInstance() {
    	int indexNum = (int) (0 + Math.random()*2);
        return HolderClass.instance[indexNum];
    }
    
    public void setRandomNum(int randomNum) {
    	this.randomNum = randomNum;
    }
    
    public int getRandomNum() {
    	return randomNum;
    }
}
