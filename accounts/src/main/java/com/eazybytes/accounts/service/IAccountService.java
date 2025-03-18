package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto request);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto request);

    boolean deleteAccount(String mobileNumber);

}
