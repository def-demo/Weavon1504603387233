package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgEventMstr;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgEventMstrApiService {
  
      List<PgEventMstr> findAllPgEventMstr()
      throws NotFoundException;
  
      PgEventMstr updatePgEventMstr(PgEventMstr pgEventMstr)
      throws NotFoundException;
  
      PgEventMstr addPgEventMstr(PgEventMstr pgEventMstr)
      throws NotFoundException;
  
      PgEventMstr findByIdPgEventMstr(Long id)
      throws NotFoundException;
  
      void deletePgEventMstr(Long id)
      throws NotFoundException;
  
}

