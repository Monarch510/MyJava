package designModule.Window;

import javax.swing.JInternalFrame;

@SuppressWarnings("serial")
public class SmallWindow extends JInternalFrame{

	private SmallWindow(String name,boolean b1,boolean b2,boolean b3,boolean b4) {
		super(name,b1,b2,b3,b4);
	}
	
	private static class HolderClass {
        private final static SmallWindow instance = new SmallWindow("×Ó´°¿Ú", true, true, true, true);
    }
	
    public static SmallWindow getInstance() {
        return HolderClass.instance;
    }

}
