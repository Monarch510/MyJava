package designModule.MessageSystem;

public class FacadeXML implements FacadeImp{
	private ReadFile rdf;
	private AnalyseData ad;
	private ReportForm rf;
	
	public FacadeXML() {
		rdf = new ReadFile();
		ad = new AnalyseData();
		rf = new ReportForm();
	}

	@Override
	public void dataHanding() {
		// TODO Auto-generated method stub
		rdf.action();
		System.out.println("��ȡ�ļ��Ѿ���.xml�ļ�");
		ad.action();
		rf.action();
	}

}
