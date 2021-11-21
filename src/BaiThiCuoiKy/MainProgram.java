package BaiThiCuoiKy;

import java.text.ParseException;

public class MainProgram {
    public static void main(String[] args) throws ParseException{
        int chose,choseEdit,choseSearch,choseSort,choseHang;
        String x;
        Management.addHangHoa(new Food("Rice Cake", "FD-0", (float)0.5, 250, FormatDate.stringToDate("17/11/2021")));
        Management.addHangHoa(new Food("Rice", "FD-1", (float) 1, 50, FormatDate.stringToDate("30/9/2021")));
        Management.addHangHoa(new Food("Sweet Bread", "FD-2", (float) 0.5, 150, FormatDate.stringToDate("10/11/2021")));
        Management.addHangHoa(new Food("Cream", "FD-3", (float) 0.25, 100, FormatDate.stringToDate("9/11/2021")));
        Management.addHangHoa(new Food("Potatoes", "FD-4", (float) 0.3, 15, FormatDate.stringToDate("17/11/2021")));
        Management.addHangHoa(new Food("Corn", "FD-5", (float) 0.4, 20, FormatDate.stringToDate("10/11/2021")));
        Management.addHangHoa(new Food("Peas", "FD-6", (float) 0.45, 50, FormatDate.stringToDate("16/11/2021")));
        Management.addHangHoa(new Food("Oshj Snack", "FD-7", (float) 0.25, 200, FormatDate.stringToDate("15/11/2021")));
        do{
            Menu.menuMain();
            System.out.print("Mời bạn nhập lựa chọn: ");
            chose = Integer.parseInt(InputTools.inputString());
            switch(chose){
                case 1: do{
                    Menu.menuEdit();
                    System.out.print("Mời bạn nhập lựa chọn: ");
                    choseEdit = Integer.parseInt(InputTools.inputString());
                    switch(choseEdit){
                        case 1:{
                            Menu.menuHangHoa();
                            System.out.print("Mời bạn nhập lựa chọn: ");
                            choseHang = Integer.parseInt(InputTools.inputString());
                            if(choseHang==1){
                                Management.addHangHoa(InputTools.inpFood());
                            }
                            else if(choseHang==2){
                                Management.addHangHoa(InputTools.inpElectric());
                            }
                            else if(choseHang==3)
                                Management.addHangHoa(InputTools.inpCeramic());
                            else {
                                System.out.print("Bạn chọn sai!");
                                System.out.println("Nhấn Enter để tiếp tục <3");
                                x = InputTools.inputString();
                            }
                        };break;
                        case 2:{
                            System.out.print("Nhập vào seri của hàng hóa cần sửa: ");
                            String value = InputTools.inputString();
                            Management.editHangHoa(value);
                        };break;
                        case 3:{
                            System.out.print("Nhập vào seri của hàng hóa cần xóa: ");
                            String value = InputTools.inputString();
                            Management.deleteHangHoa(value);
                        };break;
                    }
                }while(choseEdit>0 && choseEdit<4);break;
                case 2:do{
                    Menu.menuSearch();
                    System.out.print("Mời bạn nhập lựa chọn: ");
                    choseSearch = Integer.parseInt(InputTools.inputString());
                    switch(choseSearch){
                        case 1:Management.searchType();break;
                        case 2:Management.searchPrice();break;
                        case 3:Management.searchDate();break;
                        default: System.out.println("Bạn chọn sai! ");
                    }
                }while(choseSearch>0 && choseSearch<4);break;
                case 3:{
                    Menu.menuSort();
                    choseSort = Integer.parseInt(InputTools.inputString());
                    switch(choseSort){
                        case 1:Management.sortUpPrice();break;
                        case 2:Management.sortLatest();break;
                        default: System.out.println("Bạn chọn sai! ");
                    }
                };break;
                case 4:Management.show();break;
                case 5:Management.statistic();
            }
        }while(chose>0 && chose <6);
    }
}