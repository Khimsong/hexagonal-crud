//package com.hexagonal.hexagonal.Core.Employee;
//
//import com.hexagonal.hexagonal.App.Employee.EmployeeRequest;
//import com.hexagonal.hexagonal.App.Employee.EmployeeResponse;
//import com.hexagonal.hexagonal.Infra.Employee.EmployeeEntity;
//import com.hexagonal.hexagonal.Infra.Employee.EmployeeRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class EmployeeServiceImpl implements EmployeeService{
//
//    private final EmployeeRepository employeeRepository;
//    private final Dto dto;
//    @Override
//    public List<EmployeeResponse> findAll() {
//        return employeeRepository
//                .findAll()
//                .stream()
//                .map(dto)
//                .collect(Collectors.toList());
//    }
//    @Override
//    public EmployeeResponse save(EmployeeRequest employeeRequest) {
//        return dto.apply(employeeRepository.save(Dto.toEntity(employeeRequest)));
//    }
//
//    @Override
//    public EmployeeResponse update(EmployeeRequest employeeRequest,Long id) {
//        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
//        return dto.apply(employeeRepository.save(Dto.toEntity(employeeRequest,employeeEntity)));
//    }
//
//    @Override
//    public EmployeeResponse delete(Long id) {
//        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
//        employeeRepository.delete(employeeEntity);
//        return dto.apply(employeeEntity);
//    }
//
//
//}
