package com.altimetrik.usermanagement.models.repository;

import com.altimetrik.usermanagement.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgScheduleIdRepository extends JpaRepository<PgScheduleId, Long>{

}



