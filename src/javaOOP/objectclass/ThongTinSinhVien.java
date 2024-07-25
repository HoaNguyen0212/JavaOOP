package javaOOP.objectclass;

public class ThongTinSinhVien {

    public static void main(String[] args) {
        //Khai báo đối tượng class để truy xuất thông tin trong class
        SinhVien sv1 = new SinhVien();//tương ứng với hàm xây dựng không c tham số

        //Gọi thành phần trong class thông qua đối tượng
        System.out.println(sv1.getName());
        System.out.println(sv1.getAge());
        System.out.println(sv1.getAddress());
        System.out.println(sv1.getClassName());

        //Khởi tạo đô tượng cho class SinhVien nhưng voới cấu trúc hàm xây dụựng có tham số
        SinhVien sv2 = new SinhVien("Nguyễn Hoa", 22, "Thanh Hóa", "Java OOP");
        System.out.println("=====================");
        System.out.println(sv2.getName());
        System.out.println(sv2.getAge());
        System.out.println(sv2.getAddress());
        System.out.println(sv2.getClassName());


        //Truy xuất thông tin class thông qua khởi tạo đối tượng Annonymous
        System.out.println("=====================");
        System.out.println(new SinhVien().getName());
        System.out.println(new SinhVien().getAge());
    }

}
