package com.hexagonal.hexagonal.core.employee;

import java.util.List;

public interface EmployeeDriven {

    EmployeeDto create(EmployeeDto dto);
    List<EmployeeDto> findAll();
    EmployeeDto update(EmployeeDto dto,Integer id);
    void delete(Integer id);

}
