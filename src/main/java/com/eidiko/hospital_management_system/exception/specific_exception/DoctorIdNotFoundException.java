package com.eidiko.hospital_management_system.exception.specific_exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class DoctorIdNotFoundException extends RuntimeException {


   public String getMessage( ){
       return "Doctor Id is Not Available in database please give proper id";
   }
}
