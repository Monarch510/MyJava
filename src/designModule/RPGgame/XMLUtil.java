package designModule.RPGgame;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static String getClassName()  {
		String string = null;
		try {
			File file = new File("src\\designModule\\RPGgame\\config.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			NodeList nod = doc.getElementsByTagName("className");
			string = nod.item(0).getFirstChild().getNodeValue();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return string;
	}
}
