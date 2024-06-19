package com.eidiko.hospital_management_system.controller;

import com.eidiko.hospital_management_system.entity.Doctor;
import com.eidiko.hospital_management_system.responce_structure.ResponceStructure;
import com.eidiko.hospital_management_system.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("/saveDoctor")
    public ResponseEntity<ResponceStructure<?>> saveDoctor(@RequestBody Doctor doctor) {
     return doctorService.saveDoctor(doctor);
    }


    @GetMapping("/fetchDoctor")
    public ResponseEntity<ResponceStructure<?>> fetchDoctor(Integer id) {
        return doctorService.fetchDoctor(id);
    }

    @GetMapping("/fetchAllDoctor")
    public ResponseEntity<ResponceStructure<List<Doctor>>> fetchAllDoctor() {

        return doctorService.fetchAllDoctor();

    }


    }
