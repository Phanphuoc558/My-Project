package BaiThiCuoiKy;

import java.util.Date;

public class Food extends HangHoa{

    static int count;
    static int seriNumber;
    public Food(String name, String seri, Float inportPrice, int inventoryNumber, Date inputDate) {
        super(name, seri, inportPrice, inventoryNumber, inputDate);
        count++;
        seriNumber++;
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
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Food.count = count;
    }
    
}
    

