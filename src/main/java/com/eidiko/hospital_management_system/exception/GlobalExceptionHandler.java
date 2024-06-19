package com.eidiko.hospital_management_system.exception;

import com.eidiko.hospital_management_system.entity.Doctor;
import com.eidiko.hospital_management_system.exception.specific_exception.DoctorIdNotFoundException;
import com.eidiko.hospital_management_system.responce_structure.ResponseStructureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DoctorIdNotFoundException.class)
    public ResponseEntity<ResponseStructureException> doctorIdNotFoundException(DoctorIdNotFoundException doctorIdNotFoundException){
        ResponseStructureException<Doctor> doctorResponseStructureException = new ResponseStructureException<>();
        doctorResponseStructureException.setStatus(HttpStatus.NOT_FOUND.value());
        doctorResponseStructureException.setMessage(doctorIdNotFoundException.getMessage());

        return new ResponseEntity<>(doctorResponseStructureException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ResponseStructureException> handleNullPointerException(NullPointerException e) {
        ResponseStructureException<Doctor> doctorResponseStructureException = new ResponseStructureException<>();
        doctorResponseStructureException.setStatus(HttpStatus.NOT_FOUND.value());
        doctorResponseStructureException.setMessage(e.getMessage());

        return new ResponseEntity<>(doctorResponseStructureException, HttpStatus.NOT_FOUND);
    }

}
