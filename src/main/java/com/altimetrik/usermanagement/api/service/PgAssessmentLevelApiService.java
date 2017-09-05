package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgAssessmentLevel;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgAssessmentLevelApiService {
  
      List<PgAssessmentLevel> findAllPgAssessmentLevel()
      throws NotFoundException;
  
      PgAssessmentLevel updatePgAssessmentLevel(PgAssessmentLevel pgAssessmentLevel)
      throws NotFoundException;
  
      PgAssessmentLevel addPgAssessmentLevel(PgAssessmentLevel pgAssessmentLevel)
      throws NotFoundException;
  
      PgAssessmentLevel findByIdPgAssessmentLevel(Long id)
      throws NotFoundException;
  
      void deletePgAssessmentLevel(Long id)
      throws NotFoundException;
  
}

