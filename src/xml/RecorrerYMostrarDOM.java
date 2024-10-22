package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;


//
public class RecorrerYMostrarDOM {
	public static void main(String[]args) {
		
	}
	
	public Document crearArbol(File fichero) {
		Document doc;
		doc=null;
		try {
			DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
			dbf.setIgnoringComments(true);
			dbf.setIgnoringElementContentWhitespace(true);
			
			DocumentBuilder db =dbf.newDocumentBuilder();
			
			doc = db.parse(fichero);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return doc;
		
		
	}
	
	
}//fin main
