package com.amrit.dbtest.dto.response;

import com.amrit.dbtest.entity.Student;

public class StudentResponseDto {

    private Integer id;

    private String name;

    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentResponseDto(Integer ID, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentResponseDto(Student std){
        this.id=std.getId();
        this.name=std.getName();
    }

    public StudentResponseDto(){

    }

}
