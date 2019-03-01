package Ass9;

import java.time.LocalDate;

public class KhachHangNN extends KhachHang {
    public String quoctich;

    public KhachHangNN(int MKH, String name, LocalDate ex_date, int soluong, String quoctich){
        this.MKH = MKH;
        this.name = name;
        this.ex_date = ex_date;
        this.soluong = soluong;
        this.quoctich = quoctich;
    }

    public int tinhtien(){
        return this.soluong* KhachHang.M4;
    }
}
