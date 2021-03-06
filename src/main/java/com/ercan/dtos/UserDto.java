package com.ercan.dtos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto extends BaseDto {
    String username;
    String password;
    String firstName;
    String lastName;
    String email;
    String phone;
    String profile;
    Integer enabled;
    List<RoleDto> roles;
}
