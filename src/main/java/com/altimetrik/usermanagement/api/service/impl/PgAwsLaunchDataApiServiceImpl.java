package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgAwsLaunchData;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgAwsLaunchDataApiServiceImpl implements PgAwsLaunchDataApiService {
		  	  
	  @Autowired
	
  	  private PgAwsLaunchDataRepository  pgAwsLaunchDataRepository ;
	   
  
  
				
			
      @Override
      public List<PgAwsLaunchData> findAllPgAwsLaunchData()
      throws NotFoundException {
      
        
  		
  		
  			return pgAwsLaunchDataRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAwsLaunchData updatePgAwsLaunchData(PgAwsLaunchData pgAwsLaunchData)
      throws NotFoundException {
      
         
        	return pgAwsLaunchDataRepository.save(pgAwsLaunchData);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAwsLaunchData addPgAwsLaunchData(PgAwsLaunchData pgAwsLaunchData)
      throws NotFoundException {
      
         
        	return pgAwsLaunchDataRepository.save(pgAwsLaunchData);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAwsLaunchData findByIdPgAwsLaunchData(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgAwsLaunchDataRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgAwsLaunchData(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

