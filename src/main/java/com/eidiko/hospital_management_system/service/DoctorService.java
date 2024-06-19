package com.eidiko.hospital_management_system.service;

import com.eidiko.hospital_management_system.dao.DoctorDao;
import com.eidiko.hospital_management_system.dto.DoctorDTO;
import com.eidiko.hospital_management_system.entity.Doctor;
import com.eidiko.hospital_management_system.exception.specific_exception.DoctorIdNotFoundException;
import com.eidiko.hospital_management_system.responce_structure.ResponceStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorDao doctorDao;

    public ResponseEntity<ResponceStructure<?>> saveDoctor(Doctor doctor)
    {
        ResponceStructure<DoctorDTO> responceStructure = new ResponceStructure<>();

        responceStructure.setStatus(HttpStatus.CREATED.value());

        responceStructure.setMessage("Successfully Doctors data inserted into database ");

        responceStructure.setData(doctorDao.saveDoctor(doctor));

        return new ResponseEntity<>(responceStructure,HttpStatus.CREATED);

    }


    public ResponseEntity<ResponceStructure<?>> fetchDoctor(Integer id) {

        DoctorDTO doctorDTO = doctorDao.fetchDoctor(id);

        if (doctorDTO != null) {
            ResponceStructure<DoctorDTO> responceStructure = new ResponceStructure<>();

            responceStructure.setStatus(HttpStatus.FOUND.value());

            responceStructure.setMessage("Successfully Doctors data fetched from  databse ");

            responceStructure.setData(doctorDao.fetchDoctor(id));

            return new ResponseEntity<>(responceStructure, HttpStatus.FOUND);
        } else {
            throw new DoctorIdNotFoundException();
        }

    }

    public ResponseEntity<ResponceStructure<List<Doctor>>> fetchAllDoctor() {
        ResponceStructure<List<Doctor>> responceStructure = new ResponceStructure<List<Doctor>>();

        responceStructure.setStatus(HttpStatus.FOUND.value());

        responceStructure.setMessage("Successfully All Doctors data fetched from  databse ");

        responceStructure.setData(doctorDao.fetchAllDoctor());

        return new ResponseEntity<ResponceStructure<List<Doctor>>>(responceStructure, HttpStatus.FOUND);

    }

}

