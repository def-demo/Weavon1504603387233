package com.altimetrik.usermanagement.api;

import com.altimetrik.usermanagement.models.*;

import com.altimetrik.usermanagement.api.service.PgAwsLaunchDataApiService;

import com.altimetrik.usermanagement.exception.NotFoundException;

import com.altimetrik.usermanagement.models.PgAwsLaunchData;


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

public class PgAwsLaunchDataApi {

   @Autowired
   private PgAwsLaunchDataApiService service;
  

  @RequestMapping(value = "/pg_aws_launch_data", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgAwsLaunchData>> findAllPgAwsLaunchData()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgAwsLaunchData>>(service.findAllPgAwsLaunchData(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_launch_data", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgAwsLaunchData> updatePgAwsLaunchData(@RequestBody PgAwsLaunchData pgAwsLaunchData
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAwsLaunchData>(service.updatePgAwsLaunchData(pgAwsLaunchData), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_launch_data", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgAwsLaunchData> addPgAwsLaunchData(@RequestBody PgAwsLaunchData pgAwsLaunchData
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAwsLaunchData>(service.addPgAwsLaunchData(pgAwsLaunchData), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_launch_data/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgAwsLaunchData> findByIdPgAwsLaunchData(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAwsLaunchData>(service.findByIdPgAwsLaunchData(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_aws_launch_data/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgAwsLaunchData(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deletePgAwsLaunchData(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

