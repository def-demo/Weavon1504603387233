package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgRolePrivilege;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgRolePrivilegeApiService {
  
      List<PgRolePrivilege> findAllPgRolePrivilege()
      throws NotFoundException;
  
      PgRolePrivilege updatePgRolePrivilege(PgRolePrivilege pgRolePrivilege)
      throws NotFoundException;
  
      PgRolePrivilege addPgRolePrivilege(PgRolePrivilege pgRolePrivilege)
      throws NotFoundException;
  
      PgRolePrivilege findByIdPgRolePrivilege(Long id)
      throws NotFoundException;
  
      void deletePgRolePrivilege(Long id)
      throws NotFoundException;
  
}

