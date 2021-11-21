package BaiThiCuoiKy;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Management {
    static ArrayList<HangHoa> management = new ArrayList<HangHoa>();
    static String x;
    static float totalValue;
    public static void addHangHoa(HangHoa hangHoa){
        management.add(hangHoa);
    }
    public static void settingName(HangHoa hangHoa){
        System.out.println("Tên ban đầu: "+hangHoa.getName());
        System.out.print("Nhập tên mới <3: ");
        hangHoa.setName(InputTools.inputString());
        System.out.println("Name has been change!");
    }
    public static void settingImportPrice(HangHoa hangHoa){
        System.out.println("Giá nhập ban đầu: "+hangHoa.getInportPrice());
        System.out.println("Nhập giá mới <3: ");
        hangHoa.setInportPrice(Float.parseFloat(InputTools.inputString()));
        System.out.println("Import Price has been change!");
    }
    public static void settingInventoryNumber(HangHoa hangHoa){
        System.out.println("Số lượng tồn kho hiện tại: "+hangHoa.getInventoryNumber());
        System.out.println("Tồn kho mới <3: ");
        hangHoa.setInventoryNumber(Integer.parseInt(InputTools.inputString()));
        System.out.println("Inventory Number has been change!");
    }
    public static void settingDate(HangHoa hangHoa) throws ParseException{
        System.out.println("Ngày nhập ban đầu: "+FormatDate.dateToString(hangHoa.getInputDate()));
        System.out.print("Nhập vào ngày mới: ");
        hangHoa.setInputDate(InputTools.inputDate());
        System.out.println("Input Date has been change!");
    }
    public static void show(){
        System.out.println("================================================================================");
        System.out.println("|     Tên hàng     |    Mã hàng     |    Giá nhập    |   Tồn kho   | Ngày nhập |");
        System.out.println("===================|================|================|=============|===========|");
        for (HangHoa hangHoa : management) {
            hangHoa.print();
        }
        System.out.println("================================================================================");
        System.out.println("Đã dừng màn hình \nNhấn Enter để tiếp tục <3");
        x = InputTools.inputString();
    }
    public static void editHangHoa(String value)throws ParseException{
        for (HangHoa hangHoa : management) {
            if(hangHoa.getSeri().equalsIgnoreCase(value)){
                Menu.menuObjectEdit();
                System.out.print("Lựa chọn của bạn: ");
                int choseEdit = Integer.parseInt(InputTools.inputString());
                if(choseEdit==1){
                    settingName(hangHoa);
                }
                else if(choseEdit==2)
                    settingImportPrice(hangHoa);
                else if(choseEdit==3)
                    settingInventoryNumber(hangHoa);
                else if(choseEdit==4)
                    settingDate(hangHoa);
                else System.out.println("Bạn chọn sai!");
            }
        }
    }
    public static void deleteHangHoa(String value){
        for (HangHoa hangHoa : management) {
            if(hangHoa.getSeri().equalsIgnoreCase(value)==true){
                management.remove(hangHoa);
                System.out.println("Done Delete!");
                break;
            }
        }
    }
    public static void searchType(){
        Menu.menuHangHoa();
        int type = Integer.parseInt(InputTools.inputString());
        System.out.println("Kết quả của bạn: ");
        System.out.println("================================================================================");
        System.out.println("|     Tên hàng     |    Mã hàng     |    Giá nhập    |   Tồn kho   | Ngày nhập |");
        System.out.println("===================|================|================|=============|===========|");
        for (HangHoa hangHoa : management) {
            if(type==1){
                if(hangHoa instanceof Food){
                    hangHoa.print();
                }
            } else if(type==2){
                if(hangHoa instanceof Electric){
                    hangHoa.print();
                }
            }else if(type==3){
                if(hangHoa instanceof Ceramic){
                    hangHoa.print();
                }
            }else System.out.println("Bạn chọn sai!");
        }
        System.out.println("================================================================================");
        System.out.println("Đã dừng màn hình \nNhấn Enter để tiếp tục <3");
        x = InputTools.inputString();
    }
    public static void searchPrice(){
        System.out.println("Mời bạn nhập khoảng giá tìm kiếm!");
        System.out.print("Từ: ");
        float under = Float.parseFloat(InputTools.inputString());
        System.out.print("Đến: ");
        float hight = Float.parseFloat(InputTools.inputString());
        System.out.println("Kết quả của bạn: ");
        System.out.println("================================================================================");
        System.out.println("|     Tên hàng     |    Mã hàng     |    Giá nhập    |   Tồn kho   | Ngày nhập |");
        System.out.println("===================|================|================|=============|===========|");
        for (HangHoa hangHoa : management) {
            if(under<=hangHoa.getInportPrice() && hangHoa.getInportPrice()<=hight){
                hangHoa.print();
            }
        }
        System.out.println("================================================================================");
        System.out.println("Đã dừng màn hình \nNhấn Enter để tiếp tục <3");
        x = InputTools.inputString();
    }
    public static void searchDate()throws ParseException{
        System.out.println("Mời bạn nhập khoảng thời gian cần tìm! ");
        System.out.print("Sau ngày (dd/mm/yyyy): ");
        Date fromDate = FormatDate.stringToDate(InputTools.inputString());
        System.out.print("Đến trước ngày (dd/mm/yyyy): ");
        Date toDate = FormatDate.stringToDate(InputTools.inputString());
        System.out.println("Kết quả của bạn: ");
        System.out.println("================================================================================");
        System.out.println("|     Tên hàng     |    Mã hàng     |    Giá nhập    |   Tồn kho   | Ngày nhập |");
        System.out.println("===================|================|================|=============|===========|");
        for (HangHoa hangHoa : management) {
            if(hangHoa.getInputDate().after(fromDate) && hangHoa.getInputDate().before(toDate)){
                hangHoa.print();
            }
        }
        System.out.println("================================================================================");
        System.out.println("Đã dừng màn hình \nNhấn Enter để tiếp tục <3");
        x = InputTools.inputString();
    }
    public static void statistic(){
        System.out.println("==============================================");
        System.out.println("|Tổng số lượng hàng hóa: "+management.size());
        System.out.println("|Số hàng hóa loại thực phẩm: "+Food.count);
        System.out.println("|Số hàng hóa loại điện máy: "+Electric.count);
        System.out.println("|Số hàng hóa loại sành sứ: "+Ceramic.count);
        for (HangHoa hangHoa : management) {
            totalValue = totalValue+ hangHoa.getInportPrice();
        }
        System.out.println("|Tổng giá trị nhập kho: "+totalValue);
        System.out.println("==============================================");
        System.out.println("Enter để tiếp tục <3");
        x = InputTools.inputString();
    }
    public static void sortUpPrice(){
        ArrayList<HangHoa> listSort = new ArrayList<>();
        System.out.println("Đây là sắp xếp tăng dần giá của một loại hàng hóa! <3");
        Menu.menuHangHoa();
        int choseSortType = Integer.parseInt(InputTools.inputString());
        if(choseSortType==1){
            for (HangHoa hangHoa : management) {
                if(hangHoa instanceof Food)
                    listSort.add(hangHoa);
            }
        }else if(choseSortType==2){
                for (HangHoa hangHoa : management) {
                    if(hangHoa instanceof Electric)
                        listSort.add(hangHoa);
                }
        }else if(choseSortType==3){
            for (HangHoa hangHoa : management) {
                if(hangHoa instanceof Ceramic)
                    listSort.add(hangHoa);
            }
        }else System.out.println("Bạn chọn sai! ");
        for(int i =0;i<listSort.size();i++){
            for(int j = i;j<listSort.size();j++){
                if(listSort.get(j).getInportPrice() <= listSort.get(i).getInportPrice()){
                    HangHoa temp = listSort.get(i);
                    listSort.set(i, listSort.get(j));
                    listSort.set(j, temp);
                }
            }
        }
        if(choseSortType>0 && choseSortType <4){
            if(listSort.size()!=0){
                System.out.println("Kết quả của bạn: ");
                System.out.println("================================================================================");
                System.out.println("|     Tên hàng     |    Mã hàng     |    Giá nhập    |   Tồn kho   | Ngày nhập |");
                System.out.println("===================|================|================|=============|===========|");
                for (HangHoa hangHoa : listSort) {
                    hangHoa.print();
                }
                System.out.println("================================================================================");
                System.out.println("Enter để tiếp tục! ");
                x=InputTools.inputString();
            }else{
                System.out.println("Không có loại hàng hóa bạn cần ");
                System.out.println("Enter để tiếp tục!");
                x = InputTools.inputString();
            }
        }
    }
    public static void sortLatest(){
        ArrayList<HangHoa> listSort = new ArrayList<>();
        System.out.println("Đây là sắp xếp của một loại hàng hóa từ mới đến cũ! ");
        Menu.menuHangHoa();
        int choseSortDate = Integer.parseInt(InputTools.inputString());
        if(choseSortDate==1){
            for (HangHoa hangHoa : management) {
                if(hangHoa instanceof Food)
                    listSort.add(hangHoa);
            }
        }else if(choseSortDate==2){
                for (HangHoa hangHoa : management) {
                    if(hangHoa instanceof Electric)
                        listSort.add(hangHoa);
                }
        }else if(choseSortDate==3){
            for (HangHoa hangHoa : management) {
                if(hangHoa instanceof Ceramic)
                    listSort.add(hangHoa);
            }
        }else System.out.println("Bạn chọn sai! ");

    }
}
