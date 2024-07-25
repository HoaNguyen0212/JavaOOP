package javaOOP.tinhkethua;

public class Student extends Person{
public String university="FPT Polytechnic";
    public Student(String name, int age, float height, String university) {
        super(name, age, height);//Dam bao dung cau truc tu ham xay dung cua class Person
        this.university = university;
    }

    //Ghi de phuong thuc
    public void getInfor(){//giong ten class cha se goi la ghi de
        super.getInfor();
        System.out.println("University: " + university);
    }

    public void getInforStudent(){
        super.getInfor();
        System.out.println("University: " + university);
    }
    public static void main(String[] args) {
        Student student = new Student("Nguyen Thi Hoa", 22, 1.58f, "FPT Polytechnic");
        student.getInfor();//ham infor nay thuoc ve class Student. Khong phai cua class Person
//        System.out.println("University: " + student.university);
        student.getInforStudent();


    }
}
