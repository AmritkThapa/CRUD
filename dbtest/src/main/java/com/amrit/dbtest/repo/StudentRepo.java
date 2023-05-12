package com.amrit.dbtest.repo;

import com.amrit.dbtest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
