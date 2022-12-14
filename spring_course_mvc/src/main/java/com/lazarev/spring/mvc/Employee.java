/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lazarev.spring.mvc;

import com.lazarev.spring.mvc.validation.CheckEmail;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author ArtemLazarev
 */
public class Employee {
    @Size(min=2, message="name must be min 2 symbols")
    private String name;
//    @NotEmpty(message="surname is required field")
    @NotBlank(message="surname is required field")
    private String surname;
    @Min(value=500,message="must be grated 499")
    @Max(value=1000,message="must be less than 1001")
    private int salary;
    
    private String department;
    
    private Map<String,String> departments;
    
    private String carBrand;
    
    private Map<String,String> carBrands;
    
    private String[] languages;
    
    private Map<String,String> languageList;
    @Pattern(regexp="\\d{3}-\\d{2}-\\d{2}",message="please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail()
    private String email;

    public Map<String, String> getDepartments() {
        return departments;
    }
     
    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments=new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");
        
        carBrands=new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Audi","Audi");
        carBrands.put("Mersedes-Benz","MB");
        
        languageList=new HashMap<>();
        languageList.put("English","En");
        languageList.put("Deutch","DE");
        languageList.put("French","FR");                           
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }              
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + ", department=" + department + '}';
    }         
}
