package designModule.MessageSystem;

public class Facade implements FacadeImp{
	private ReadFile rdf;
	private TransToXML tt;
	private AnalyseData ad;
	private ReportForm rf;
	
	public Facade() {
		rdf = new ReadFile();
		tt = new TransToXML();
		ad = new AnalyseData();
		rf = new ReportForm();
	}
	@Override
	public void dataHanding() {
		// TODO Auto-generated method stub
		rdf.action();
		tt.action();
		ad.action();
		rf.action();
	}
	
}
