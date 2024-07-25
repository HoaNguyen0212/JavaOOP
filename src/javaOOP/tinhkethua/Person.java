package javaOOP.tinhkethua;

public class Person {
    String name;
    int age;
    float height;

    public Person() {
    }

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void getInfor(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        Person person = new Person("Nguyen Thi Hoa", 22, 1.58f);
        person.getInfor();
    }
}
