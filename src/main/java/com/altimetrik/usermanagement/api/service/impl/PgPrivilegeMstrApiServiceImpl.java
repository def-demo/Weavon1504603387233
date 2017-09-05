package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgPrivilegeMstr;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgPrivilegeMstrApiServiceImpl implements PgPrivilegeMstrApiService {
		  	  
	  @Autowired
	
  	  private PgPrivilegeMstrRepository  pgPrivilegeMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgPrivilegeMstr> findAllPgPrivilegeMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgPrivilegeMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgPrivilegeMstr updatePgPrivilegeMstr(PgPrivilegeMstr pgPrivilegeMstr)
      throws NotFoundException {
      
         
        	return pgPrivilegeMstrRepository.save(pgPrivilegeMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgPrivilegeMstr addPgPrivilegeMstr(PgPrivilegeMstr pgPrivilegeMstr)
      throws NotFoundException {
      
         
        	return pgPrivilegeMstrRepository.save(pgPrivilegeMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgPrivilegeMstr findByIdPgPrivilegeMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgPrivilegeMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgPrivilegeMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

