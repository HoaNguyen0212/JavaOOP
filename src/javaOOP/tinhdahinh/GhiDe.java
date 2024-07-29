package javaOOP.tinhdahinh;

public class GhiDe extends ActionKeyword {

    //xảy ra kế thừa class cha và class con
    //Hàm của class con giống với tên hàm của class cha

    @Override
    public void clickElement() {
//        super.clickElement();
        System.out.println("Click on button login");
    }

    public void login() {
        System.out.println("http://anhtester.com");
        System.out.println("Email: abc@gmail.com");
        System.out.println("Password: 123456");
        clickElement();
    }

    public static void main(String[] args) {
        GhiDe ghiDe = new GhiDe();
//        ghiDe.clickElement();
        ghiDe.login();
    }
}
