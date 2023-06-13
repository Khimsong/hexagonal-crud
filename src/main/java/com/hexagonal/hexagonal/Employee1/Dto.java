//package com.hexagonal.hexagonal.Core.Employee;
//
//import com.hexagonal.hexagonal.App.Employee.EmployeeRequest;
//import com.hexagonal.hexagonal.App.Employee.EmployeeResponse;
//import com.hexagonal.hexagonal.Infra.Employee.EmployeeEntity;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Service;
//
//import java.util.function.Function;
//
//
//@Service
//public class Dto implements Function<EmployeeEntity, EmployeeResponse> {
//
//    public EmployeeResponse apply(EmployeeEntity employeeEntity){
//      return new EmployeeResponse(
//                employeeEntity.getId(),
//                employeeEntity.getEmployeeName(),
//                employeeEntity.getLocation());
//    }
//
//    public static EmployeeEntity toEntity(EmployeeRequest employeeRequest,EmployeeEntity employeeEntity){
//        employeeEntity.setEmployeeName(employeeRequest.getEmployeeName());
//        employeeEntity.setLocation(employeeRequest.getLocation());
//        return employeeEntity;
//    }
//
//
//    public static EmployeeEntity toEntity(EmployeeRequest employeeRequest){
//        return new EmployeeEntity(
//                employeeRequest.getEmployeeName(),
//                employeeRequest.getLocation()
//        );
//    }
//
//}
