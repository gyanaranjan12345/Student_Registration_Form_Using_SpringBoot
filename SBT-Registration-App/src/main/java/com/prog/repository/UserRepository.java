package com.prog.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.prog.entity.UserDtls;

public interface UserRepository extends JpaRepositoryImplementation<UserDtls,Integer > {

}
