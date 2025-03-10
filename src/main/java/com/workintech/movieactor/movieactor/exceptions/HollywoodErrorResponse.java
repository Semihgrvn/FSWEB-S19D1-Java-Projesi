package com.workintech.movieactor.movieactor.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HollywoodErrorResponse {

    private int status;
    private String message;
    private long timestamp;

}
