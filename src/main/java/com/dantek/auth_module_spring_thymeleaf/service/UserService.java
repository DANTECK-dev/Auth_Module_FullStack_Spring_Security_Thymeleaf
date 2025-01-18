package com.dantek.auth_module_spring_thymeleaf.service;

import com.dantek.auth_module_spring_thymeleaf.model.User;
import com.dantek.auth_module_spring_thymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
