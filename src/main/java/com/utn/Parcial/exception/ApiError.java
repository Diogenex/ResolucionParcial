package com.utn.Parcial.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor

public class ApiError {

    private HttpStatus httpstatus;
    private String message;
    private List<String> errors;

}
