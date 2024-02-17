package com.matrix.elasticsearchservice.services;

import com.matrix.elasticsearchservice.models.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();

}
