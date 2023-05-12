package com.amrit.dbtest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="student_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 20,name = "student_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="address_id",referencedColumnName = "id",
    foreignKey = @ForeignKey(name="FK_STUDENT_ADDRESS"))
    private Address address;

}
