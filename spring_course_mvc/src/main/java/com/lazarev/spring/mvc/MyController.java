/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lazarev.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ArtemLazarev
 */
@Controller
@RequestMapping("/employee")
public class MyController {
    
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
     @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
//        Employee emp=new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(500);
        
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }
            @GetMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee")Employee emp,
            BindingResult bindingResult){              
        if(bindingResult.hasErrors()){
            return "ask-emp-details-view";
        }else
             return "show-emp-details-view";
    }
//         @RequestMapping("/showDetails")
//    public String showEmpDetails(@ModelAttribute("employee")Employee emp){
//        
//        String name=emp.getName();
//        emp.setName("Mr "+name);
//        
//        String surname=emp.getSurname();
//        emp.setSurname(surname+"!!!");
//        
//        int salary=emp.getSalary();
//        emp.setSalary(salary*10);
     
//        return "show-emp-details-view";
//    }
//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails(){
//        return "ask-emp-details-view";
//    }
//         @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName,Model model){
        
//        empName="Mr. "+empName+"!";
//         
//        model.addAttribute("nameAttribute",empName);
       
//        return "show-emp-details-view";
//    }     
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }
    
//      @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request,Model model){
//        
//        String empName=request.getParameter("employeeName");
//        empName="Mr. "+empName;
//         
//        model.addAttribute("nameAttribute",empName);
//        model.addAttribute("description","-udemy instructor");
//        
//        return "show-emp-details-view";
//    }          
}
