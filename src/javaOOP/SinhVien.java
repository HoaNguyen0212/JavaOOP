package javaOOP;

public class SinhVien {
    String name;
    int age;
    String address;
    String className;

    //hàm xây dựng không có tham số
    public SinhVien() {
        name = "Hoa";
        age = 22;
        address = "TH";
        className = "UDPM";
    }

    //Hàm xây dựng có tham số
    public SinhVien(String name1, int age1, String address1, String className1) {
       //this.tên biến của class
        this.name = name1;
        this.age = age1;
        this.address = address1;
        this.className = className1;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    //Các hàm truy xuất thông tin
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }


}
