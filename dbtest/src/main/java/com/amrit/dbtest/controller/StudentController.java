package com.amrit.dbtest.controller;

import com.amrit.dbtest.dto.request.StudentRequestDto;
import com.amrit.dbtest.dto.response.StudentResponseDto;
import com.amrit.dbtest.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    @Operation(summary = "api to save api",description = "This is my api")
    public ResponseEntity<?> saveStudent(@RequestBody StudentRequestDto std) {
        try {
            return new ResponseEntity<>(studentService.saveStudent(std), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
