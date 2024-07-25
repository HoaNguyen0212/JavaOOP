package javaOOP.phamvitruycap;

public class Employee {
    //Pham vi truy cap private - chi truy cap trong class

    private String name = "Hoa";
    private int age = 22;
    public String company = "Vconnex";

    private void getInfoPrivate() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Company: " + company);
    }

    //pham vi truy cap protected - truy cap sang class khac nhung phai trong cung package va neu ben ngoai thi phai ke thua
    protected void getInfoProtected() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //pham vi truy cap default - truy cap trong cung package
    void getInfoDefault() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //pham vi truy cap public - truy cap o bat ky dau
    void getInfoPublic() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfoPrivate();
    }
}
