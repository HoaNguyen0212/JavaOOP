package javaOOP.objectclass;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        //Khoi tao doi tuong class de truy xuat thong tin trong class
        SinhVien sv1= new SinhVien("Hoa", 22, "TH", "Auto test");
        sv1.printInfo();

        SinhVien sv2= new SinhVien("Hoa Nguyen", 22, "HN", "Auto test");
        sv1.printInfo();

        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(sv1);//Them bo data sv1 vafo vi tri dau tien trong ArrayList
        listSinhVien.add(sv2);//Them bo data sv2 vafo vi tri tiep theo trong ArrayList

        for (SinhVien sv : listSinhVien) {
            System.out.println("=====================");
           sv.printInfo();
        }


    }
}
