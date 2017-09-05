package com.altimetrik.usermanagement.models.repository;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.models.PgUserInfoDtls;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgAwsLaunchDataRepository extends JpaRepository<PgAwsLaunchData, Long>{

}



