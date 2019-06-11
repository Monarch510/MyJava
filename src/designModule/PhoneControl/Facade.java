package designModule.PhoneControl;

public class Facade {
	private MessageManagement mm;
	private AddressManagement am;
	private PhotoManagement pm;
	private SongManagement sm;
	
	public Facade() {
		mm = new MessageManagement();
		am = new AddressManagement();
		pm = new PhotoManagement();
		sm = new SongManagement();
	}
	
	public void backupSD() {
		mm.backupSD();
		am.backupSD();
		pm.backupSD();
		sm.backupSD();
	}
	
	public void backupMMC() {
		mm.backupMMC();
		am.backupMMC();
		pm.backupMMC();
		sm.backupMMC();
	}

}
