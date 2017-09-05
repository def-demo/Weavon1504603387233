package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgSkillTrackDtls;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgSkillTrackDtlsApiServiceImpl implements PgSkillTrackDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgSkillTrackDtlsRepository  pgSkillTrackDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgSkillTrackDtls> findAllPgSkillTrackDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgSkillTrackDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackDtls updatePgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls)
      throws NotFoundException {
      
         
        	return pgSkillTrackDtlsRepository.save(pgSkillTrackDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackDtls addPgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls)
      throws NotFoundException {
      
         
        	return pgSkillTrackDtlsRepository.save(pgSkillTrackDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgSkillTrackDtls findByIdPgSkillTrackDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgSkillTrackDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgSkillTrackDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

