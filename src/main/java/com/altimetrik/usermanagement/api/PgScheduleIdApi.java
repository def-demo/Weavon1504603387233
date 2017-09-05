package com.altimetrik.usermanagement.api;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.api.service.PgScheduleIdApiService;

import com.altimetrik.usermanagement.exception.NotFoundException;

import com.altimetrik.usermanagement.models.PgScheduleId;


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

public class PgScheduleIdApi {

   @Autowired
   private PgScheduleIdApiService service;
  

  @RequestMapping(value = "/pg_schedule_id", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgScheduleId>> findAllPgScheduleId()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgScheduleId>>(service.findAllPgScheduleId(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_id", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgScheduleId> updatePgScheduleId(@RequestBody PgScheduleId pgScheduleId
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgScheduleId>(service.updatePgScheduleId(pgScheduleId), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_id", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgScheduleId> addPgScheduleId(@RequestBody PgScheduleId pgScheduleId
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgScheduleId>(service.addPgScheduleId(pgScheduleId), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_id/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgScheduleId> findByIdPgScheduleId(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgScheduleId>(service.findByIdPgScheduleId(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_schedule_id/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgScheduleId(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgScheduleId(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

