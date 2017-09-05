package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgEventDtls;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgEventDtlsApiServiceImpl implements PgEventDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgEventDtlsRepository  pgEventDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgEventDtls> findAllPgEventDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgEventDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventDtls updatePgEventDtls(PgEventDtls pgEventDtls)
      throws NotFoundException {
      
         
        	return pgEventDtlsRepository.save(pgEventDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventDtls addPgEventDtls(PgEventDtls pgEventDtls)
      throws NotFoundException {
      
         
        	return pgEventDtlsRepository.save(pgEventDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventDtls findByIdPgEventDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgEventDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgEventDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

