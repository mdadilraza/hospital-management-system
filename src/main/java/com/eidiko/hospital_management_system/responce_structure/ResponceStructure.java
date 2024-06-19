package com.eidiko.hospital_management_system.responce_structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponceStructure<T> {

    private int status;
    private String message;
    private T data;
}