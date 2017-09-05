package com.altimetrik.usermanagement.api;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.api.service.PgAwsDirectoryBundleApiService;

import com.altimetrik.usermanagement.exception.NotFoundException;

import com.altimetrik.usermanagement.models.PgAwsDirectoryBundle;


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

public class PgAwsDirectoryBundleApi {

   @Autowired
   private PgAwsDirectoryBundleApiService service;
  

  @RequestMapping(value = "/pg_aws_directory_bundle", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgAwsDirectoryBundle>> findAllPgAwsDirectoryBundle()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgAwsDirectoryBundle>>(service.findAllPgAwsDirectoryBundle(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_directory_bundle", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgAwsDirectoryBundle> updatePgAwsDirectoryBundle(@RequestBody PgAwsDirectoryBundle pgAwsDirectoryBundle
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAwsDirectoryBundle>(service.updatePgAwsDirectoryBundle(pgAwsDirectoryBundle), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_directory_bundle", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgAwsDirectoryBundle> addPgAwsDirectoryBundle(@RequestBody PgAwsDirectoryBundle pgAwsDirectoryBundle
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAwsDirectoryBundle>(service.addPgAwsDirectoryBundle(pgAwsDirectoryBundle), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_directory_bundle/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgAwsDirectoryBundle> findByIdPgAwsDirectoryBundle(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAwsDirectoryBundle>(service.findByIdPgAwsDirectoryBundle(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_directory_bundle/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgAwsDirectoryBundle(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deletePgAwsDirectoryBundle(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

