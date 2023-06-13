package com.hexagonal.hexagonal.core.employee;

import com.hexagonal.hexagonal.infra.employee.EmployeeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService implements EmployeeDriving {

    private final EmployeeDriven employeeDriven;

    @Override
    public EmployeeDto create(EmployeeDto dto) {
        return employeeDriven.create(dto);
    }

    @Override
    public List<EmployeeDto> findAll() {
        return employeeDriven.findAll();
    }

    @Override
    public EmployeeDto update(EmployeeDto dto, Integer id) {
        return employeeDriven.update(dto, id);
    }

    @Override
    public void delete(Integer id) {
        employeeDriven.delete(id);
    }
}
