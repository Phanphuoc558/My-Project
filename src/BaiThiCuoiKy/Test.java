package BaiThiCuoiKy;

import java.text.ParseException;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException{
        Management.addHangHoa(new Food("Rice", "FD0", (float) 18000, 50, FormatDate.stringToDate("30/9/2021")));
        Management.addHangHoa(new Food("Sweet Bread", "FD1", (float) 10000, 150, FormatDate.stringToDate("10/11/2021")));
        Management.addHangHoa(new Food("Cream", "FD2", (float) 5000, 100, FormatDate.stringToDate("9/11/2021")));
        Management.addHangHoa(new Food("Potatoes", "FD3", (float) 7000, 15, FormatDate.stringToDate("17/11/2021")));
        Management.addHangHoa(new Food("Corn", "FD4", (float) 8000, 20, FormatDate.stringToDate("10/11/2021")));
        Management.addHangHoa(new Food("Peas", "FD5", (float) 9000, 50, FormatDate.stringToDate("16/11/2021")));
        Management.addHangHoa(new Food("Oshj Snack", "FD6", (float) 5000, 200, FormatDate.stringToDate("15/11/2021")));
        Management.addHangHoa(new Food("Rice Cake", "FD7", (float) 3000, 250, FormatDate.stringToDate("17/11/2021")));
        Management.show();
        // String value = InputTools.inputString();
        // Management.deleteHangHoa(value);
        Management.sortUpPrice();
        
        
    }
}
