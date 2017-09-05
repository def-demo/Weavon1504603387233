package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgScheduleDtls;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgScheduleDtlsApiService {
  
      List<PgScheduleDtls> findAllPgScheduleDtls()
      throws NotFoundException;
  
      PgScheduleDtls updatePgScheduleDtls(PgScheduleDtls pgScheduleDtls)
      throws NotFoundException;
  
      PgScheduleDtls addPgScheduleDtls(PgScheduleDtls pgScheduleDtls)
      throws NotFoundException;
  
      PgScheduleDtls findByIdPgScheduleDtls(Long id)
      throws NotFoundException;
  
      void deletePgScheduleDtls(Long id)
      throws NotFoundException;
  
}

