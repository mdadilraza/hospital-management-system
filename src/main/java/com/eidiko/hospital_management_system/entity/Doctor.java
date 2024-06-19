package com.eidiko.hospital_management_system.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "doctors")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer doctorId;

    @Column(name = "doctor_name",nullable = false)
    private String doctorName;

    @Column(name="doctor_email" ,nullable = false, unique = true)
    private String doctorEmail;


    @Column(name="doctor_phone" ,nullable = false, unique = true, length=10)
    private Long doctorPhone;

    @Column(name="doctor_password" ,nullable = false, unique = true)
    private String doctorPassword;

    @Column(name = "doctor_salary" ,nullable = false)
    private Double doctorSalary;

}
