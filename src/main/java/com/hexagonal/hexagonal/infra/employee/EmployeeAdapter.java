package com.hexagonal.hexagonal.infra.employee;

import com.hexagonal.hexagonal.core.employee.EmployeeDriven;
import com.hexagonal.hexagonal.core.employee.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeAdapter implements EmployeeDriven {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto create(EmployeeDto dto) {
        EmployeeEntity entity = employeeRepository.save(employeeMapper.from(dto));
        return employeeMapper.from(entity);
    }

    @Override
    public List<EmployeeDto> findAll() {
        return employeeMapper.from(employeeRepository.findAll());
    }

    @Override
    public EmployeeDto update(EmployeeDto dto, Integer id) {
        EmployeeEntity entity = employeeRepository.findById(id).orElse(null);
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        employeeRepository.save(entity);
        return employeeMapper.from(entity);
    }

    @Override
    public void delete(Integer id) {
         EmployeeEntity entity = employeeRepository.findById(id).orElse(null);
         employeeRepository.delete(entity);
    }
}
