package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgSourceMstr;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgSourceMstrApiServiceImpl implements PgSourceMstrApiService {
		  	  
	  @Autowired
	
  	  private PgSourceMstrRepository  pgSourceMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgSourceMstr> findAllPgSourceMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgSourceMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSourceMstr updatePgSourceMstr(PgSourceMstr pgSourceMstr)
      throws NotFoundException {
      
         
        	return pgSourceMstrRepository.save(pgSourceMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSourceMstr addPgSourceMstr(PgSourceMstr pgSourceMstr)
      throws NotFoundException {
      
         
        	return pgSourceMstrRepository.save(pgSourceMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSourceMstr findByIdPgSourceMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgSourceMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgSourceMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

