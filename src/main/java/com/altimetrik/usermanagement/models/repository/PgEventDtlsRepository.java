package com.altimetrik.usermanagement.models.repository;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.models.PgUserInfoMstr;
import com.altimetrik.usermanagement.models.PgEventRule;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgEventDtlsRepository extends JpaRepository<PgEventDtls, Long>{

}



