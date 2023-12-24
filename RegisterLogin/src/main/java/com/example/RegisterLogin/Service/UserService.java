package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Dto.UserDTO;
import com.example.RegisterLogin.response.LoginResponse;

public interface UserService {
    LoginResponse addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDTO loginDTO);

}
