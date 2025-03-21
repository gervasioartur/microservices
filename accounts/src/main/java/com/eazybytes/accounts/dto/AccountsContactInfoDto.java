package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}