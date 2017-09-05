package com.altimetrik.usermanagement.api.service;

import com.altimetrik.usermanagement.models.PgAwsDirectoryBundle;


import com.altimetrik.usermanagement.exception.NotFoundException;
import java.util.List;

public interface PgAwsDirectoryBundleApiService {
  
      List<PgAwsDirectoryBundle> findAllPgAwsDirectoryBundle()
      throws NotFoundException;
  
      PgAwsDirectoryBundle updatePgAwsDirectoryBundle(PgAwsDirectoryBundle pgAwsDirectoryBundle)
      throws NotFoundException;
  
      PgAwsDirectoryBundle addPgAwsDirectoryBundle(PgAwsDirectoryBundle pgAwsDirectoryBundle)
      throws NotFoundException;
  
      PgAwsDirectoryBundle findByIdPgAwsDirectoryBundle(String id)
      throws NotFoundException;
  
      void deletePgAwsDirectoryBundle(String id)
      throws NotFoundException;
  
}

