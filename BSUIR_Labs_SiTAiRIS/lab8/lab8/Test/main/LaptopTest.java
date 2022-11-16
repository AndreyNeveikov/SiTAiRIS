package main;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class LaptopTest extends TestCase {

    Laptop laptop = new Laptop();

    @Test
    public void testGetShop() {
        assertEquals("autoShop", laptop.getShop());
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("autoManufacturer", laptop.getManufacturer());
    }

    @Test
    public void testGetPc_model() {
        assertEquals("autoPCModel", laptop.getPc_model());
    }


    @Test
    public void testGetDescription() {
        assertEquals("autoDescription", laptop.getDescription());
    }

    @Test
    public void testGetPrice() {
    }

    @Test
    public void testTestToString() {
        assertEquals("Sale!\n" +
                "You can buy this laptop at autoShop" + '\n' +
                "Manufacturer: autoManufacturer" + '\n' +
                "Model: autoPCModel" + '\n' +
                "Processor: autoProcessorModel" + '\n' +
                "RAM: 0" +
                "SSD: 0" +
                "HDD: 0" + '\n' +
                "Description:" + '\n' + "autoDescription" + '\n' +
                "Price: 0.0" + " BYN" + '\n' +
                "Showcase number: 0" + '\n' +
                "__________________________________________________________",
                "Sale!\n" +
                        "You can buy this laptop at " + laptop.getShop() + '\n' +
                        "Manufacturer: " + laptop.getManufacturer() + '\n' +
                        "Model: " + laptop.getPc_model() + '\n' +
                        "Processor: " + laptop.getProcessor_model() + '\n' +
                        "RAM: " + laptop.getRAM() +
                        "SSD: " + laptop.getSSD() +
                        "HDD: " + laptop.getHDD() + '\n' +
                        "Description:" + '\n' + laptop.getDescription() + '\n' +
                        "Price: " + laptop.getPrice() + " BYN" + '\n' +
                        "Showcase number: " + laptop.getProduct_id() + '\n' +
                        "__________________________________________________________");
    }
}