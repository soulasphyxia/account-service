package org.soulasphyxia.accountservice.service;

import org.soulasphyxia.accountservice.dto.UserDto;

public interface UserService {

    UserDto findById(Long id);

}
