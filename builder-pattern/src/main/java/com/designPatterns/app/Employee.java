package com.designPatterns.app;

public class Employee {
    private String name;
    private String email;
    private String employeeNumber;
    private String companyName;

    public Employee name(String name){
        this.name = name;
        return this;
    }
    public Employee email(String email){
        this.email = email;
        return this;
    }
    public Employee employeeNumber(String employeeNumber){
        this.employeeNumber = Employee.this.employeeNumber;
        return this;
    }
    public Employee companyName(String companyName){
        this.companyName = Employee.this.companyName;
        return this;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getEmployeeNumber() {
//        return employeeNumber;
//    }
//
//    public void setEmployeeNumber(String employeeNumber) {
//        this.employeeNumber = employeeNumber;
//    }
//
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
