package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgScheduleCandidateDtls;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgScheduleCandidateDtlsApiServiceImpl implements PgScheduleCandidateDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgScheduleCandidateDtlsRepository  pgScheduleCandidateDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgScheduleCandidateDtls> findAllPgScheduleCandidateDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgScheduleCandidateDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleCandidateDtls updatePgScheduleCandidateDtls(PgScheduleCandidateDtls pgScheduleCandidateDtls)
      throws NotFoundException {
      
         
        	return pgScheduleCandidateDtlsRepository.save(pgScheduleCandidateDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleCandidateDtls addPgScheduleCandidateDtls(PgScheduleCandidateDtls pgScheduleCandidateDtls)
      throws NotFoundException {
      
         
        	return pgScheduleCandidateDtlsRepository.save(pgScheduleCandidateDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleCandidateDtls findByIdPgScheduleCandidateDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgScheduleCandidateDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgScheduleCandidateDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

