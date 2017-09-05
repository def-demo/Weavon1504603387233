package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgSourceMstr;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgSourceMstrApiService {
  
      List<PgSourceMstr> findAllPgSourceMstr()
      throws NotFoundException;
  
      PgSourceMstr updatePgSourceMstr(PgSourceMstr pgSourceMstr)
      throws NotFoundException;
  
      PgSourceMstr addPgSourceMstr(PgSourceMstr pgSourceMstr)
      throws NotFoundException;
  
      PgSourceMstr findByIdPgSourceMstr(Long id)
      throws NotFoundException;
  
      void deletePgSourceMstr(Long id)
      throws NotFoundException;
  
}

