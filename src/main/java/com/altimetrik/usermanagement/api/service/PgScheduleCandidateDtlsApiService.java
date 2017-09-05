package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgScheduleCandidateDtls;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgScheduleCandidateDtlsApiService {
  
      List<PgScheduleCandidateDtls> findAllPgScheduleCandidateDtls()
      throws NotFoundException;
  
      PgScheduleCandidateDtls updatePgScheduleCandidateDtls(PgScheduleCandidateDtls pgScheduleCandidateDtls)
      throws NotFoundException;
  
      PgScheduleCandidateDtls addPgScheduleCandidateDtls(PgScheduleCandidateDtls pgScheduleCandidateDtls)
      throws NotFoundException;
  
      PgScheduleCandidateDtls findByIdPgScheduleCandidateDtls(Long id)
      throws NotFoundException;
  
      void deletePgScheduleCandidateDtls(Long id)
      throws NotFoundException;
  
}

