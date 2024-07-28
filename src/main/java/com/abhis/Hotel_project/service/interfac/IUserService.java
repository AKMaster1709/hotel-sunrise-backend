package com.abhis.Hotel_project.service.interfac;

import com.abhis.Hotel_project.dto.LoginRequest;
import com.abhis.Hotel_project.dto.Response;
import com.abhis.Hotel_project.entity.User;


public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
