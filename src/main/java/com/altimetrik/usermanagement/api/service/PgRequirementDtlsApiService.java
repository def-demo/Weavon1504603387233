package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgRequirementDtls;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgRequirementDtlsApiService {
  
      List<PgRequirementDtls> findAllPgRequirementDtls()
      throws NotFoundException;
  
      PgRequirementDtls updatePgRequirementDtls(PgRequirementDtls pgRequirementDtls)
      throws NotFoundException;
  
      PgRequirementDtls addPgRequirementDtls(PgRequirementDtls pgRequirementDtls)
      throws NotFoundException;
  
      PgRequirementDtls findByIdPgRequirementDtls(Long id)
      throws NotFoundException;
  
      void deletePgRequirementDtls(Long id)
      throws NotFoundException;
  
}

