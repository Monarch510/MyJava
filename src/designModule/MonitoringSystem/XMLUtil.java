package designModule.MonitoringSystem;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static double getClassName()  {
		double temperature = 0;
		try {
			File file = new File("src\\designModule\\MonitoringSystem\\config.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			NodeList nod = doc.getElementsByTagName("className");
			String string = nod.item(0).getFirstChild().getNodeValue();
			temperature = Double.parseDouble(string);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return temperature;
	}
}
