package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgEventRule;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgEventRuleApiServiceImpl implements PgEventRuleApiService {
		  	  
	  @Autowired
	
  	  private PgEventRuleRepository  pgEventRuleRepository ;
	   
  
  
				
			
      @Override
      public List<PgEventRule> findAllPgEventRule()
      throws NotFoundException {
      
        
  		
  		
  			return pgEventRuleRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventRule updatePgEventRule(PgEventRule pgEventRule)
      throws NotFoundException {
      
         
        	return pgEventRuleRepository.save(pgEventRule);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventRule addPgEventRule(PgEventRule pgEventRule)
      throws NotFoundException {
      
         
        	return pgEventRuleRepository.save(pgEventRule);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventRule findByIdPgEventRule(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgEventRuleRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgEventRule(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

