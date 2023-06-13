package com.hexagonal.hexagonal.app.employee;
import com.hexagonal.hexagonal.core.employee.EmployeeDriving;
import com.hexagonal.hexagonal.core.employee.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeRestController {

    private final EmployeeDriving driving;
    private final EmployeeMapper mapper;

    @PostMapping
    public ResponseEntity<EmployeeResponse> create(@RequestBody EmployeeRequest request) {
        // Request to dto
        EmployeeDto dto = mapper.from(request);
        // dto to response
        EmployeeResponse response =  mapper.from(driving.create(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(mapper.from(driving.findAll()));
//        return ResponseEntity.status(HttpStatus.OK).body(driving.findAll().stream().map(dto -> mapper.from(dto)).collect(Collectors.toList()));
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeResponse> update(@RequestBody EmployeeRequest request,@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(mapper.from(driving.update(mapper.from(request),id)));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        driving.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

