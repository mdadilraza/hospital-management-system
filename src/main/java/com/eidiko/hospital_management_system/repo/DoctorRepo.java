package com.eidiko.hospital_management_system.repo;

import com.eidiko.hospital_management_system.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor , Integer> {
}
