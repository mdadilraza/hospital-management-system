package com.eidiko.hospital_management_system.dao;

import com.eidiko.hospital_management_system.dto.DoctorDTO;
import com.eidiko.hospital_management_system.entity.Doctor;
import com.eidiko.hospital_management_system.repo.DoctorRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class DoctorDao {

    @Autowired
    DoctorRepo doctorRepo;
    @Autowired
    ModelMapper modelMapper;

   //saveDoctor method
    public DoctorDTO saveDoctor( Doctor doctor){
        return modelMapper.map(doctorRepo.save(doctor), DoctorDTO.class);
    }

    //fetchDoctor

    public DoctorDTO fetchDoctor(Integer id){
       return modelMapper.map(doctorRepo.findById(id), DoctorDTO.class);
    }

    //fetchAllDoctor
    public List<Doctor> fetchAllDoctor(){
       return doctorRepo.findAll();
    }



}
