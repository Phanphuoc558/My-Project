package BaiThiCuoiKy;

import java.util.Date;


public abstract class HangHoa {
    private String name;
    private String seri;
    private float inportPrice;
    private int inventoryNumber;
    private Date inputDate;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSeri() {
        return seri;
    }
    public Float getInportPrice() {
        return inportPrice;
    }
    public void setInportPrice(Float inportPrice) {
        this.inportPrice = inportPrice;
    }
    public int getInventoryNumber() {
        return inventoryNumber;
    }
    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }
    public Date getInputDate() {
        return inputDate;
    }
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
    public HangHoa(String name, String seri, Float inportPrice, int inventoryNumber, Date inputDate) {
        this.name = name;
        this.seri = seri;
        this.inportPrice = inportPrice;
        this.inventoryNumber = inventoryNumber;
        this.inputDate = inputDate;
    }
    public void print(){
        System.out.printf("|%18s|%16s|%14.2f $|%13d|%11s|\n",this.getName(),this.getSeri(),this.getInportPrice(),this.getInventoryNumber(),FormatDate.dateToString(this.getInputDate()));
    }
}
