package com.altimetrik.usermanagement.api;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.api.service.PgScheduleCandidateDtlsApiService;

import com.altimetrik.usermanagement.exception.NotFoundException;

import com.altimetrik.usermanagement.models.PgScheduleCandidateDtls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class PgScheduleCandidateDtlsApi {

   @Autowired
   private PgScheduleCandidateDtlsApiService service;
  

  @RequestMapping(value = "/pg_schedule_candidate_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgScheduleCandidateDtls>> findAllPgScheduleCandidateDtls()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgScheduleCandidateDtls>>(service.findAllPgScheduleCandidateDtls(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_candidate_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgScheduleCandidateDtls> updatePgScheduleCandidateDtls(@RequestBody PgScheduleCandidateDtls pgScheduleCandidateDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgScheduleCandidateDtls>(service.updatePgScheduleCandidateDtls(pgScheduleCandidateDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_candidate_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgScheduleCandidateDtls> addPgScheduleCandidateDtls(@RequestBody PgScheduleCandidateDtls pgScheduleCandidateDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgScheduleCandidateDtls>(service.addPgScheduleCandidateDtls(pgScheduleCandidateDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_candidate_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgScheduleCandidateDtls> findByIdPgScheduleCandidateDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgScheduleCandidateDtls>(service.findByIdPgScheduleCandidateDtls(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_candidate_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgScheduleCandidateDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgScheduleCandidateDtls(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

