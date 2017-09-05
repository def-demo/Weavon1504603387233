package com.altimetrik.usermanagement.models.repository;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.models.PgRuleMstr;
import com.altimetrik.usermanagement.models.PgEventMstr;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgEventRuleRepository extends JpaRepository<PgEventRule, Long>{

}



