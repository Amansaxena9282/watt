package com.training.watt.repository;

import com.training.watt.model.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Long> {
    List<User> findAll();

    User getById(Long id);

    User save(User user);

    void deleteById(Long id);

//    void deleteById(Long id);
}
