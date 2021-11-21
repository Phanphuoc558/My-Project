package BaiThiCuoiKy;

import java.util.Date;

public class Electric extends HangHoa{

    static int count;
    static int seriNumber;
    public Electric(String name, String seri, float inportPrice, int inventoryNumber, Date inputDate) {
        super(name, seri, inportPrice, inventoryNumber, inputDate);
        count++;
    }

    public Float getInportPrice() {
        return super.getInportPrice();
    }

    public Date getInputDate() {
        return super.getInputDate();
    }

    public int getInventoryNumber() {
        return super.getInventoryNumber();
    }

    public String getName() {
        return super.getName();
    }

    public String getSeri() {
        return super.getSeri();
    }

    public void setInportPrice(Float inportPrice) {
        super.setInportPrice(inportPrice);
    }

    public void setInputDate(Date inputDate) {
        super.setInputDate(inputDate);
    }

    public void setInventoryNumber(int inventoryNumber) {
        super.setInventoryNumber(inventoryNumber);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }
    
}
