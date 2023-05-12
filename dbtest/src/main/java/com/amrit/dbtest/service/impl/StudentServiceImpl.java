package com.amrit.dbtest.service.impl;

import com.amrit.dbtest.dto.request.StudentRequestDto;
import com.amrit.dbtest.dto.response.StudentResponseDto;
import com.amrit.dbtest.entity.Address;
import com.amrit.dbtest.entity.Student;
import com.amrit.dbtest.repo.AddressRepo;
import com.amrit.dbtest.repo.StudentRepo;
import com.amrit.dbtest.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final AddressRepo addressRepo;
    public StudentServiceImpl(StudentRepo studentRepo, AddressRepo addressRepo) {
        this.studentRepo=studentRepo;
        this.addressRepo = addressRepo;
    }

    @Override
    public StudentResponseDto saveStudent(StudentRequestDto std) throws Exception {
        Student student = new Student();
        student.setName(std.getName());
        Address address= addressRepo.getById(std.getAddressId());
        if(address==null){
            throw new Exception("id not present");
        }
        student.setAddress(address);
        Student savedStudent = studentRepo.save(student);
        StudentResponseDto studentResponseDto = new StudentResponseDto(savedStudent);
        return studentResponseDto;
    }
}
