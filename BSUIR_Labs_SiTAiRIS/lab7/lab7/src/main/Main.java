package main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<Laptop> laptopList = new ArrayList<>();

    public void parse() throws ParserConfigurationException, IOException, SAXException {
        File file = new File("E:\\СиТАиРИС\\BSUIR_Labs_SiTAiRIS\\lab4\\XML_doc\\Computer_store.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element storeElement = (Element) document.getElementsByTagName("store").item(0);
        String shop = storeElement.getAttribute("shop");

        NodeList productNodeList = document.getElementsByTagName("product_id");


        for (int i = 0; i < productNodeList.getLength(); i++) {
            if (productNodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element productElement = (Element) productNodeList.item(i);

                Laptop laptop = new Laptop();
                laptop.setShop(shop);
                laptop.setProduct_id(Integer.valueOf(productElement.getAttribute("id")));

                NodeList childNodes = productElement.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) childNodes.item(j);

                        switch (childElement.getNodeName()) {
                            case "manufacturer": {
                                laptop.setManufacturer(childElement.getTextContent());
                            } break;

                            case "pc_model": {
                                laptop.setPc_model(childElement.getTextContent());
                            } break;

                            case "processor_model": {
                                laptop.setProcessor_model(childElement.getTextContent());
                            } break;

                            case "RAM": {
                                laptop.setRAM(Integer.valueOf(childElement.getTextContent()));
                            } break;

                            case "SSD": {
                                laptop.setSSD(Integer.valueOf(childElement.getTextContent()));
                            } break;

                            case "HDD": {
                                laptop.setHDD(Integer.valueOf(childElement.getTextContent()));
                            } break;

                            case "description": {
                                laptop.setDescription(childElement.getTextContent());
                            } break;

                            case "price": {
                                laptop.setPrice(Double.valueOf(childElement.getTextContent()));
                            } break;

                        }
                    }
                }

                laptopList.add(laptop);
            }
        }
    }
}
