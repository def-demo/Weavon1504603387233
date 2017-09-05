package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgScheduleId;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgScheduleIdApiServiceImpl implements PgScheduleIdApiService {
		  	  
	  @Autowired
	
  	  private PgScheduleIdRepository  pgScheduleIdRepository ;
	   
  
  
				
			
      @Override
      public List<PgScheduleId> findAllPgScheduleId()
      throws NotFoundException {
      
        
  		
  		
  			return pgScheduleIdRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleId updatePgScheduleId(PgScheduleId pgScheduleId)
      throws NotFoundException {
      
         
        	return pgScheduleIdRepository.save(pgScheduleId);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleId addPgScheduleId(PgScheduleId pgScheduleId)
      throws NotFoundException {
      
         
        	return pgScheduleIdRepository.save(pgScheduleId);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgScheduleId findByIdPgScheduleId(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgScheduleIdRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgScheduleId(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

