package com.altimetrik.usermanagement.api.service.impl;

import com.altimetrik.usermanagement.api.service.*;
import com.altimetrik.usermanagement.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.usermanagement.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.usermanagement.models.PgUserInfoDtls;


import java.util.List;
import com.altimetrik.usermanagement.exception.NotFoundException;


@Service
@Transactional
public class PgUserInfoDtlsApiServiceImpl implements PgUserInfoDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgUserInfoDtlsRepository  pgUserInfoDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgUserInfoDtls> findAllPgUserInfoDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgUserInfoDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoDtls updatePgUserInfoDtls(PgUserInfoDtls pgUserInfoDtls)
      throws NotFoundException {
      
         
        	return pgUserInfoDtlsRepository.save(pgUserInfoDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoDtls addPgUserInfoDtls(PgUserInfoDtls pgUserInfoDtls)
      throws NotFoundException {
      
         
        	return pgUserInfoDtlsRepository.save(pgUserInfoDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoDtls findByIdPgUserInfoDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgUserInfoDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgUserInfoDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

