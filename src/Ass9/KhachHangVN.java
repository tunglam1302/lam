package Ass9;

import java.time.LocalDate;

public class KhachHangVN extends KhachHang {
    String doituongKH;

    public KhachHangVN(int MKH, String name, LocalDate ex_date,int soluong, String doituongKH){
        this.MKH = MKH;
        this.name = name;
        this.ex_date = ex_date;
        this.soluong = soluong;
        this.doituongKH = doituongKH;
    }

    @Override
    public int tinhtien() {
        int thanhtien = 0;
        if(this.soluong < KhachHang.DM1){
            thanhtien = this.soluong*KhachHang.M1;
        }else if(this.soluong >= KhachHang.DM1 && this.soluong <= KhachHang.DM2){
            thanhtien = KhachHang.DM1*KhachHang.M1+ (this.soluong-KhachHang.DM1)*KhachHang.M2;
        }else if(this.soluong > KhachHang.DM2 && this.soluong <= KhachHang.DM3){
            thanhtien = KhachHang.DM1*KhachHang.M1+ (KhachHang.DM2-KhachHang.DM1)*KhachHang.M2 + (this.soluong - KhachHang.DM2)*KhachHang.M3;
        }else {
            thanhtien = KhachHang.DM1*KhachHang.M1+ (KhachHang.DM2-KhachHang.DM1)*KhachHang.M2 + (KhachHang.DM3-KhachHang.DM2)*KhachHang.M3 + (this.soluong - KhachHang.DM3)*KhachHang.M4;
        }
        return thanhtien;
    }
}
