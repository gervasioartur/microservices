package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotNull(message = "Name is  required.")
    @NotBlank(message = "Name is required.")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @NotNull(message = "Email is  required.")
    @NotBlank(message = "Email is required.")
    private String email;

    @Size(min = 10, max = 10, message = "Mobile number must be exactly 10 digits")
    @Pattern(regexp = "[0-9]+", message = "Mobile number must contain only digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
