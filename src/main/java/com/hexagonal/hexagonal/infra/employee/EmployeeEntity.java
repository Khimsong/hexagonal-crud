package com.hexagonal.hexagonal.infra.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq",allocationSize = 1,sequenceName = "employee_seq")
    private Integer id;
    private String name;
    private String description;

}
