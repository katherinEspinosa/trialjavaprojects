package model;

abstract class Husband {

    private String husbandID;
    private String husbandName;
    private String husbandDescription;
    private double husbandPrice;
    private String husbandImage;
    private boolean isSelected = false;
    private int qty;

    public String getHusbandID() {
        return this.husbandID;
    }

    public void setHusbandID(String id) {
        this.husbandID = id;
    }

    public String getHusbandName() {
        return this.husbandName;
    }

    public void setHusbandName(String name) {
        this.husbandName = name;
    }

    public String getHusbandDescription() {
        return this.husbandDescription;
    }

    public void setHusbandDescription(String description) {
        this.husbandDescription = description;
    }

    public double getHusbandPrice() {
        return this.husbandPrice;
    }

    public void setHusbandPrice(double price) {
        this.husbandPrice = price;
    }

    public String getHusbandImage() {
        return this.husbandImage;
    }

    public void setHusbandImage(String path) {
        this.husbandImage = path;
    }

    public boolean getHusbandStatus() {
        return this.isSelected;
    }

    public void setHusbandStatus(boolean status) {
        this.isSelected = status;
    }

    public int getHusbandQuantity() {
        return this.qty;
    }

    public void setHusbandQuantity(int quantity) {
        this.qty = quantity;
    }
}