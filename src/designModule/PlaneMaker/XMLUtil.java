package designModule.PlaneMaker;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static ArrayList<Object> getClassBean()  {
		ArrayList<Object> object = new ArrayList<Object>();
		try {
			File file = new File("src\\designModule\\PlaneMaker\\config.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			NodeList nod = doc.getElementsByTagName("className");
			String[] string = new String[2];
			for(int i = 0;i < nod.getLength();i++) {
				string[i] = nod.item(i).getFirstChild().getNodeValue();
				Class c = Class.forName(string[i]);
				object.add(c.newInstance());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return object;
	}
}
