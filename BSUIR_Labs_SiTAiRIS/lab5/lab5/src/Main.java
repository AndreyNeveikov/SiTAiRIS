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
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        ProgramLogger.getProgramLogger().addLogInfo("Program started!\n");
        File file = new File("E:\\СиТАиРИС\\BSUIR_Labs_SiTAiRIS\\lab4\\XML_doc\\Computer_store.xml");

            ProgramLogger.getProgramLogger().addLogInfo("Path received successfully");

        //Strategy
        ContextStrategy context = new ContextStrategy(new HalfPrice());

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element storeElement = (Element) document.getElementsByTagName("store").item(0);
        String shop = storeElement.getAttribute("shop");

        NodeList productNodeList = document.getElementsByTagName("product_id");
        List<Laptop> laptopList = new ArrayList<>();

        ProgramLogger.getProgramLogger().addLogInfo("laptopList created successfully");

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
                            }
                            break;

                            case "pc_model": {
                                laptop.setPc_model(childElement.getTextContent());
                            }
                            break;

                            case "processor_model": {
                                laptop.setProcessor_model(childElement.getTextContent());
                            }
                            break;

                            case "RAM": {
                                laptop.setRAM(Integer.valueOf(childElement.getTextContent()));
                            }
                            break;

                            case "SSD": {
                                laptop.setSSD(Integer.valueOf(childElement.getTextContent()));
                            }
                            break;

                            case "HDD": {
                                laptop.setHDD(Integer.valueOf(childElement.getTextContent()));
                            }
                            break;

                            case "description": {
                                laptop.setDescription(childElement.getTextContent());
                            }
                            break;

                            case "price": {
                                Double priceNow = context.getPrice(Double.valueOf(childElement.getTextContent()));
                                laptop.setPrice(priceNow);
                            }
                            break;

                        }
                    }
                }

                laptopList.add(laptop);
            }
        }
        ProgramLogger.getProgramLogger().addLogInfo("Element info filled successfully");

        //"Chain of responsibility" - "Цепочка обязанностей"
        MessageHandler messageHandler = new MessageAddAdvertisementHandler(
                new MessageVerifyHandler(
                        new MessagePrintHandler(null)));

        for (int i = 0; i < laptopList.size(); i++) {
            messageHandler.handle(laptopList.get(i).toString());
        }

        ProgramLogger.getProgramLogger().addLogInfo("Program finished successfully!\n\n_______\n");
    }
}

class Laptop {
    private String shop;
    private Integer product_id;
    private String manufacturer;
    private String pc_model;
    private String processor_model;
    private Integer RAM;
    private Integer SSD;
    private Integer HDD;
    private String description;
    private Double price;

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPc_model() {
        return pc_model;
    }

    public void setPc_model(String pc_model) {
        this.pc_model = pc_model;
    }

    public String getProcessor_model() {
        return processor_model;
    }

    public void setProcessor_model(String processor_model) {
        this.processor_model = processor_model;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getSSD() {
        return SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getHDD() {
        return HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sale!\n" +
                "You can buy this laptop at " + shop + '\n' +
                "Manufacturer: " + manufacturer + '\n' +
                "Model: " + pc_model + '\n' +
                "Processor: " + processor_model + '\n' +
                "RAM: " + RAM +
                "SSD: " + SSD +
                "HDD: " + HDD + '\n' +
                "Description:" + '\n' + description + '\n' +
                "Price: " + price + " BYN" + '\n' +
                "Showcase number: " + product_id + '\n';
    }
}