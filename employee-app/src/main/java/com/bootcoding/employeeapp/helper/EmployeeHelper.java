package com.bootcoding.employeeapp.helper;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EmployeeHelper {
    public String newEmployee(){

        return UUID.randomUUID().toString();
    }
}