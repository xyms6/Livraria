package com.xyms.fiama.repository;

import com.xyms.fiama.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
