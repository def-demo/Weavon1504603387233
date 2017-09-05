package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgScheduleId;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgScheduleIdApiService {
  
      List<PgScheduleId> findAllPgScheduleId()
      throws NotFoundException;
  
      PgScheduleId updatePgScheduleId(PgScheduleId pgScheduleId)
      throws NotFoundException;
  
      PgScheduleId addPgScheduleId(PgScheduleId pgScheduleId)
      throws NotFoundException;
  
      PgScheduleId findByIdPgScheduleId(Long id)
      throws NotFoundException;
  
      void deletePgScheduleId(Long id)
      throws NotFoundException;
  
}

