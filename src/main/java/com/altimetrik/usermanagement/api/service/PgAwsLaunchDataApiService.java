package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgAwsLaunchData;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgAwsLaunchDataApiService {
  
      List<PgAwsLaunchData> findAllPgAwsLaunchData()
      throws NotFoundException;
  
      PgAwsLaunchData updatePgAwsLaunchData(PgAwsLaunchData pgAwsLaunchData)
      throws NotFoundException;
  
      PgAwsLaunchData addPgAwsLaunchData(PgAwsLaunchData pgAwsLaunchData)
      throws NotFoundException;
  
      PgAwsLaunchData findByIdPgAwsLaunchData(String id)
      throws NotFoundException;
  
      void deletePgAwsLaunchData(String id)
      throws NotFoundException;
  
}

