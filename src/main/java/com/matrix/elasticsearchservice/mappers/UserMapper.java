package com.matrix.elasticsearchservice.mappers;

import com.matrix.elasticsearchservice.entities.UserEntity;
import com.matrix.elasticsearchservice.models.UserDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserEntity userDtoToUserEntity(UserDTO userDTO);

    UserDTO userEntityToUserDto(UserEntity userEntity);
}
