package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgLifecycleManagement;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgLifecycleManagementApiService {
  
      List<PgLifecycleManagement> findAllPgLifecycleManagement()
      throws NotFoundException;
  
      PgLifecycleManagement updatePgLifecycleManagement(PgLifecycleManagement pgLifecycleManagement)
      throws NotFoundException;
  
      PgLifecycleManagement addPgLifecycleManagement(PgLifecycleManagement pgLifecycleManagement)
      throws NotFoundException;
  
      PgLifecycleManagement findByIdPgLifecycleManagement(Long id)
      throws NotFoundException;
  
      void deletePgLifecycleManagement(Long id)
      throws NotFoundException;
  
}

