package com.eidiko.hospital_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {

    private Integer doctorId;

    private String doctorName;

    private String doctorEmail;

    private Long doctorPhone;


}
