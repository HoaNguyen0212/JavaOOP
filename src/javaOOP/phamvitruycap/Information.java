package javaOOP.phamvitruycap;

public class Information {
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.getInfo();
        employee.getInfoProtected();
        employee.getInfoDefault();
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
