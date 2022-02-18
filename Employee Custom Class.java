package com.company;

class EmployeeII{
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EmployeeCustomClass {
    public static void main(String[] args) {
        System.out.println("This is the custom class..");
        EmployeeII e1 = new EmployeeII();
        e1.setName("Sakti Suman");
        e1.salary = 56;
        String name = e1.getName();
        int salary = e1.getSalary();
        System.out.println(name+" "+salary);


    }
}
