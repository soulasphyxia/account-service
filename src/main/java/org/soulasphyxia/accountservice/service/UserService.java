package org.soulasphyxia.accountservice.service;

import org.soulasphyxia.accountservice.dto.CreateUserDto;
import org.soulasphyxia.accountservice.dto.UpdateUserDto;
import org.soulasphyxia.accountservice.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserDto findById(Long id);

    Page<UserDto> findAll(Pageable pageable);

    UserDto create(CreateUserDto createUserDto);

    UserDto update(UpdateUserDto dto);

    void delete(Long id);
}
