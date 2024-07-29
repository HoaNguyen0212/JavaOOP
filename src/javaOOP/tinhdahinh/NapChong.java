package javaOOP.tinhdahinh;

public class NapChong extends ActionKeyword{

    //Khai báo nhiều hàm tên giống nhau nhưng khác nhau về tham số
    //Nạp chồng xảy ra trong 1 class

    public void getInfo() {
        System.out.println("Hàm getInfo không có tham số");
    }

    public void getInfo(String name) {
        System.out.println("Name: " + name);
        System.out.println("Address: Hà Nội");
    }

    public void getInfo(String name, String address) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    public void login(String url, String email, String password) {
        //login bình thường
    }

    public void login(String url, String email, String password, String role) {
        //kiểm tra account đó thuộc role nào
    }

    public void login(String url, String email, String password, String role, String message) {
        //kiểm tra account đó thuộc role nào
        //Kiểm tra text của message sau khi login (message của pass và fail)
    }

    public static void main(String[] args) {
        NapChong napChong = new NapChong();
        napChong.getInfo("Hoa");
        napChong.getInfo("Hoa", "Thanh Hóa");
        napChong.getInfo();
    }

}
