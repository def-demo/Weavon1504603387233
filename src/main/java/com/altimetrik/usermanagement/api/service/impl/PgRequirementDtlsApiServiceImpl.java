package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgRequirementDtls;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgRequirementDtlsApiServiceImpl implements PgRequirementDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgRequirementDtlsRepository  pgRequirementDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgRequirementDtls> findAllPgRequirementDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgRequirementDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirementDtls updatePgRequirementDtls(PgRequirementDtls pgRequirementDtls)
      throws NotFoundException {
      
         
        	return pgRequirementDtlsRepository.save(pgRequirementDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirementDtls addPgRequirementDtls(PgRequirementDtls pgRequirementDtls)
      throws NotFoundException {
      
         
        	return pgRequirementDtlsRepository.save(pgRequirementDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirementDtls findByIdPgRequirementDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgRequirementDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgRequirementDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

