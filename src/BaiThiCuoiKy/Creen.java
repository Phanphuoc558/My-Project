package BaiThiCuoiKy;

public class Creen{
    static public void clear()
        {
            try {
                    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
           } catch (Exception E) {
                {
                   System.out.println(E);
                }
            }
        }      
}

