package com.WebSecurity.WebSecurity.Repository;

import com.WebSecurity.WebSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
