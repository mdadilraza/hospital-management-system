package com.eidiko.hospital_management_system.responce_structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStructureException<T> {
    private int status;
    private String message;
}