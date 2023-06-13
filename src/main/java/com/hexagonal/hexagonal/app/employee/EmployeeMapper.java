package com.hexagonal.hexagonal.app.employee;

import com.hexagonal.hexagonal.app.product.ProductResponse;
import com.hexagonal.hexagonal.core.employee.EmployeeDto;

import java.util.List;

public interface EmployeeMapper {
    EmployeeResponse from(EmployeeDto dto);
    List<EmployeeResponse> from(List<EmployeeDto> dto);
    EmployeeDto from(EmployeeRequest employeeRequest);



}
