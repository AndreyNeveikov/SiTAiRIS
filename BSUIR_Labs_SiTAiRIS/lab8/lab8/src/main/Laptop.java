package main;

public class Laptop {
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

    public Laptop() {
        shop = "autoShop";
        product_id = 0;
        manufacturer = "autoManufacturer";
        pc_model = "autoPCModel";
        processor_model = "autoProcessorModel";
        RAM = 0;
        SSD = 0;
        HDD = 0;
        description = "autoDescription";
        price = 0.0;
    }

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
                "Showcase number: " + product_id + '\n' +
                "__________________________________________________________";
    }
}
