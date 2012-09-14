package org.dacel.maven.plugins.wsdl;

import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

public class Generator {

	public static void main(String[] args) throws TransformerException, TransformerConfigurationException,
	SAXException, IOException {

		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer(
				new StreamSource("D:\\Prog\\workspace-esb\\propagation_coordonnees\\PROPAGATION_modification_coordonnees_BPEL\\src\\wsdl-viewer.xsl"));

		transformer.transform(new StreamSource("D:\\Prog\\workspace-esb\\propagation_coordonnees\\PROPAGATION_modification_coordonnees_BPEL\\src\\PROPAGATION_modification_coord.wsdl"), new StreamResult("D:\\tmp\\test.htm"));
	}
}
