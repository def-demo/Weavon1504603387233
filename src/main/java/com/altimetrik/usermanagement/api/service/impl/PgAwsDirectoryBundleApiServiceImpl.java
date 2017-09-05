package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgAwsDirectoryBundle;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgAwsDirectoryBundleApiServiceImpl implements PgAwsDirectoryBundleApiService {
		  	  
	  @Autowired
	
  	  private PgAwsDirectoryBundleRepository  pgAwsDirectoryBundleRepository ;
	   
  
  
				
			
      @Override
      public List<PgAwsDirectoryBundle> findAllPgAwsDirectoryBundle()
      throws NotFoundException {
      
        
  		
  		
  			return pgAwsDirectoryBundleRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAwsDirectoryBundle updatePgAwsDirectoryBundle(PgAwsDirectoryBundle pgAwsDirectoryBundle)
      throws NotFoundException {
      
         
        	return pgAwsDirectoryBundleRepository.save(pgAwsDirectoryBundle);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAwsDirectoryBundle addPgAwsDirectoryBundle(PgAwsDirectoryBundle pgAwsDirectoryBundle)
      throws NotFoundException {
      
         
        	return pgAwsDirectoryBundleRepository.save(pgAwsDirectoryBundle);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAwsDirectoryBundle findByIdPgAwsDirectoryBundle(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgAwsDirectoryBundleRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgAwsDirectoryBundle(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

