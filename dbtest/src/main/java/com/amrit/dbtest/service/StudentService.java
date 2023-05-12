package com.amrit.dbtest.service;

import com.amrit.dbtest.dto.request.StudentRequestDto;
import com.amrit.dbtest.dto.response.StudentResponseDto;

public interface StudentService {

    StudentResponseDto saveStudent(StudentRequestDto std) throws Exception;

}
