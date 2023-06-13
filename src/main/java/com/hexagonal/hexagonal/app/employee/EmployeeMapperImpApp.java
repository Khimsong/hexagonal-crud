package com.hexagonal.hexagonal.app.employee;

import com.hexagonal.hexagonal.core.employee.EmployeeDto;
import com.hexagonal.hexagonal.infra.employee.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class EmployeeMapperImpApp implements EmployeeMapper {
    @Override
    public EmployeeResponse from(EmployeeDto dto) {
        EmployeeResponse response = new EmployeeResponse();
        response.setId(dto.getId());
        response.setName(dto.getName());
        response.setDescription(dto.getDescription());
        return response;
    }

    @Override
    public EmployeeDto from(EmployeeRequest request) {
        EmployeeDto dto = new EmployeeDto();
        dto.setName(request.getName());
        dto.setDescription(request.getDescription());
        return dto;
    }

    @Override
    public List<EmployeeResponse> from(List<EmployeeDto> dtoList) {
         List<EmployeeResponse> employeeResponse = dtoList.stream().map(dto -> from(dto)).collect(Collectors.toList());
         return employeeResponse;
    }

}
