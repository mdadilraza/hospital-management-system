package com.eidiko.hospital_management_system.entity_dto_mapping;

import com.eidiko.hospital_management_system.dto.DoctorDTO;
import com.eidiko.hospital_management_system.entity.Doctor;

public class DoctorMapping {

    public DoctorDTO doctorToDTO(Doctor doctor){
        return new DoctorDTO(doctor.getDoctorId(), doctor.getDoctorName(),doctor.getDoctorEmail(),doctor.getDoctorPhone());

    }

    public Doctor doctorToEntity(DoctorDTO doctorDTO){
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorDTO.getDoctorId());

        doctor.setDoctorName(doctorDTO.getDoctorName());
        doctor.setDoctorEmail(doctorDTO.getDoctorEmail());

        doctor.setDoctorPhone(doctorDTO.getDoctorPhone());

        return doctor;
    }
}
