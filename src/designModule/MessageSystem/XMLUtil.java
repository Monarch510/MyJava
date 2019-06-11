package designModule.MessageSystem;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getClassBean()  {
		Object object = null;
		try {
			File file = new File("src\\designModule\\MessageSystem\\config.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			NodeList nod = doc.getElementsByTagName("className");
			String string = nod.item(0).getFirstChild().getNodeValue();
			Class c = Class.forName(string);
			object = c.newInstance();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return object;
	}
}
