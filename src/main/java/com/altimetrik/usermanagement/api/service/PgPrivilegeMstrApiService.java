package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgPrivilegeMstr;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgPrivilegeMstrApiService {
  
      List<PgPrivilegeMstr> findAllPgPrivilegeMstr()
      throws NotFoundException;
  
      PgPrivilegeMstr updatePgPrivilegeMstr(PgPrivilegeMstr pgPrivilegeMstr)
      throws NotFoundException;
  
      PgPrivilegeMstr addPgPrivilegeMstr(PgPrivilegeMstr pgPrivilegeMstr)
      throws NotFoundException;
  
      PgPrivilegeMstr findByIdPgPrivilegeMstr(Long id)
      throws NotFoundException;
  
      void deletePgPrivilegeMstr(Long id)
      throws NotFoundException;
  
}

