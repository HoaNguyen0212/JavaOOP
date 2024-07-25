package javaOOP.thongtin;

import javaOOP.phamvitruycap.Employee;

public class ThongTinNhanVien extends Employee {

    public void XuLyPhatLuong() {
        getInfoProtected();
    }


    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.company);
        System.out.println(employee.getName());
    }

}
