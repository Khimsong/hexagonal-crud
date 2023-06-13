package com.hexagonal.hexagonal.infra.employee;

import com.hexagonal.hexagonal.app.employee.EmployeeRequest;
import com.hexagonal.hexagonal.app.employee.EmployeeResponse;
import com.hexagonal.hexagonal.core.employee.EmployeeDto;

import java.util.List;
import java.util.function.Function;

public interface EmployeeMapper {
    EmployeeEntity from(EmployeeDto dto);
    EmployeeDto from(EmployeeEntity entity);
    List<EmployeeDto> from(List<EmployeeEntity> entities);

}
