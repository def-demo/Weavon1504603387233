package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgLifecycleManagement;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgLifecycleManagementApiServiceImpl implements PgLifecycleManagementApiService {
		  	  
	  @Autowired
	
  	  private PgLifecycleManagementRepository  pgLifecycleManagementRepository ;
	   
  
  
				
			
      @Override
      public List<PgLifecycleManagement> findAllPgLifecycleManagement()
      throws NotFoundException {
      
        
  		
  		
  			return pgLifecycleManagementRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgLifecycleManagement updatePgLifecycleManagement(PgLifecycleManagement pgLifecycleManagement)
      throws NotFoundException {
      
         
        	return pgLifecycleManagementRepository.save(pgLifecycleManagement);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgLifecycleManagement addPgLifecycleManagement(PgLifecycleManagement pgLifecycleManagement)
      throws NotFoundException {
      
         
        	return pgLifecycleManagementRepository.save(pgLifecycleManagement);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgLifecycleManagement findByIdPgLifecycleManagement(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgLifecycleManagementRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgLifecycleManagement(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

