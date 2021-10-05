package com.github.patotskiy.springnativedemo.repository;


import com.github.patotskiy.springnativedemo.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
