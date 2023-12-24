package com.example.RegisterLogin.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class LoginResponse {
    String response;
    @JsonProperty("isSuccess")
    Boolean isSuccess;

    String[] errors;

    public LoginResponse(String response, Boolean isSuccess, String[] errors) {
        this.response = response;
        this.isSuccess = isSuccess;
        this.errors = errors;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "response='" + response + '\'' +
                ", isSuccess=" + isSuccess +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
