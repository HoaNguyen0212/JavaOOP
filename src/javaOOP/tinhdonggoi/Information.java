package javaOOP.tinhdonggoi;

public class Information {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hoa");
        student.setAddress("Thanh Hóa");
        student.setAge(22);
        student.setGender("Nữ");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Gender: " + student.getGender());

        student.setAddress("Hà Nội");
        System.out.println("Address: " + student.getAddress());
    }

}
