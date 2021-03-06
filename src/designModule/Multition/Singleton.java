package designModule.Multition;

public class Singleton {
	
	private Singleton() {	
		
	}
	
    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }
	
    public static Singleton getInstance() {
        return HolderClass.instance;
    }

}
