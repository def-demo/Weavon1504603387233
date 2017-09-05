package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgScheduleDtls;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgScheduleDtlsApiServiceImpl implements PgScheduleDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgScheduleDtlsRepository  pgScheduleDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgScheduleDtls> findAllPgScheduleDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgScheduleDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleDtls updatePgScheduleDtls(PgScheduleDtls pgScheduleDtls)
      throws NotFoundException {
      
         
        	return pgScheduleDtlsRepository.save(pgScheduleDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleDtls addPgScheduleDtls(PgScheduleDtls pgScheduleDtls)
      throws NotFoundException {
      
         
        	return pgScheduleDtlsRepository.save(pgScheduleDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleDtls findByIdPgScheduleDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgScheduleDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgScheduleDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

