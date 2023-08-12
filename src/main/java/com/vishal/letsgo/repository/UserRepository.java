package com.vishal.letsgo.repository;


import com.vishal.letsgo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {


}
