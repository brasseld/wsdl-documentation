package org.dacel.maven.plugins.wsdl;

import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.Test;

public class GeneratorTest {

	@Test
	public void generate() {
		try {
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer(this.loadXSL());

			transformer.setURIResolver(new URIResolver() {
				public Source resolve(String href, String base) throws TransformerException {
					return new StreamSource(new File("D:\\Prog\\workspace-esb\\services-partenaires\\referentiel-partenaires-bpel\\src\\" + href));
				}
			});
			transformer.transform(new StreamSource("http://lap005901003:18182/referentiel-partenaires-ca-sun-http-binding/referentiel-partenaires-bpel/services.wsdl"), new StreamResult("D:\\tmp\\wsdl-generator\\test.html"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Source loadXSL() {
		return new StreamSource(
				GeneratorTest.class.getClassLoader().getResourceAsStream("wsdl-viewer.xsl"));
	}
}
