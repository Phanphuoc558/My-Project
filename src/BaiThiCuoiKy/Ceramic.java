package BaiThiCuoiKy;

import java.util.Date;

public class Ceramic extends HangHoa{

    public Ceramic(String name, String seri, Float inportPrice, int inventoryNumber, Date inputDate) {
        super(name, seri, inportPrice, inventoryNumber, inputDate);
    }

    @Override
    public Float getInportPrice() {
        // TODO Auto-generated method stub
        return super.getInportPrice();
    }

    @Override
    public Date getInputDate() {
        // TODO Auto-generated method stub
        return super.getInputDate();
    }

    @Override
    public int getInventoryNumber() {
        // TODO Auto-generated method stub
        return super.getInventoryNumber();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getSeri() {
        // TODO Auto-generated method stub
        return super.getSeri();
    }

    @Override
    public void setInportPrice(Float inportPrice) {
        // TODO Auto-generated method stub
        super.setInportPrice(inportPrice);
    }

    @Override
    public void setInputDate(Date inputDate) {
        // TODO Auto-generated method stub
        super.setInputDate(inputDate);
    }

    @Override
    public void setInventoryNumber(int inventoryNumber) {
        // TODO Auto-generated method stub
        super.setInventoryNumber(inventoryNumber);
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }
    
}
