package javaOOP.tinhtruutuong;

public class SinhVien extends Person{

    public SinhVien(String ten, int tuoi, String cmnd) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
    }


    @Override
    public void showInfor() {
        System.out.println(ten);
        System.out.println(tuoi);
        System.out.println(cmnd);
    }

    @Override
    public String getTen() {
        return null;
    }

    @Override
    public String getCmnd() {
        return null;
    }

    @Override
    public int getTuoi() {
        return 0;
    }

    @Override
    public String getGioiTinh() {
        return null;
    }

    @Override
    public String getTrinhDo() {
        return null;
    }

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien("Hoa", 22, "0123456789");
        sinhVien.showInfor();
    }
}
