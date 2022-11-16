package main;

import junit.framework.TestCase;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;



public class MainTest extends TestCase {

    Main main = new Main();

    @Test
    public void testFindFile() {
        assertEquals(new File("E:\\СиТАиРИС\\BSUIR_Labs_SiTAiRIS\\lab4\\XML_doc\\Computer_store.xml"), main.findFile());
    }

    @Test
    public void testParse() throws ParserConfigurationException, IOException, SAXException {
        assertEquals(4, main.parse().size());
    }
}