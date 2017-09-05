package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgRoleMstr;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgRoleMstrApiService {
  
      List<PgRoleMstr> findAllPgRoleMstr()
      throws NotFoundException;
  
      PgRoleMstr updatePgRoleMstr(PgRoleMstr pgRoleMstr)
      throws NotFoundException;
  
      PgRoleMstr addPgRoleMstr(PgRoleMstr pgRoleMstr)
      throws NotFoundException;
  
      PgRoleMstr findByIdPgRoleMstr(Long id)
      throws NotFoundException;
  
      void deletePgRoleMstr(Long id)
      throws NotFoundException;
  
}

