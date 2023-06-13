package com.hexagonal.hexagonal.infra.employee;

import com.hexagonal.hexagonal.app.employee.EmployeeResponse;
import com.hexagonal.hexagonal.core.employee.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class EmployeeMapperInfra implements EmployeeMapper{

    @Override
    public EmployeeEntity from(EmployeeDto dto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(dto.getName());
        employeeEntity.setDescription(dto.getDescription());
        return employeeEntity;
    }

    @Override
    public EmployeeDto from(EmployeeEntity entity) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    @Override
    public List<EmployeeDto> from(List<EmployeeEntity> entities) {
        List<EmployeeDto> dtoList = entities.stream().map(entity -> from(entity)).collect(Collectors.toList());
        return dtoList;
    }
}
