package com.altimetrik.usermanagement.api;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.api.service.PgRuleIdDefApiService;

import com.altimetrik.usermanagement.exception.NotFoundException;

import com.altimetrik.usermanagement.models.PgRuleIdDef;


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

public class PgRuleIdDefApi {

   @Autowired
   private PgRuleIdDefApiService service;
  

  @RequestMapping(value = "/pg_rule_id_def", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgRuleIdDef>> findAllPgRuleIdDef()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgRuleIdDef>>(service.findAllPgRuleIdDef(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_id_def", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgRuleIdDef> updatePgRuleIdDef(@RequestBody PgRuleIdDef pgRuleIdDef
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRuleIdDef>(service.updatePgRuleIdDef(pgRuleIdDef), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_id_def", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgRuleIdDef> addPgRuleIdDef(@RequestBody PgRuleIdDef pgRuleIdDef
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRuleIdDef>(service.addPgRuleIdDef(pgRuleIdDef), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_id_def/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgRuleIdDef> findByIdPgRuleIdDef(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRuleIdDef>(service.findByIdPgRuleIdDef(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_id_def/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgRuleIdDef(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgRuleIdDef(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

