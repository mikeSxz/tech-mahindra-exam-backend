package com.msuarez.springboot.rest.example.user.repository;

import com.msuarez.springboot.rest.example.user.entity.UserEntity;
import com.msuarez.springboot.rest.example.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

    Page<UserEntity> findAll(Pageable pageable);

}
