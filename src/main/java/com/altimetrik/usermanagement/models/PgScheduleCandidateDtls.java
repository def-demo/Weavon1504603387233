package com.altimetrik.usermanagement.models;


import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class PgScheduleCandidateDtls  {
  
  
   
  
  @Id
   
  
  private Long scheduleCandidateId = null;
  
   
   
  
  private Long scheduleId = null;
  
   
   
  
  private String firstNm = null;
  
   
   
  
  private String lastNm = null;
  
   
   
  
  private String dob = null;
  
   
   
  
  private String emailId = null;
  
   
   
  
  private String country = null;
  
   
   
  
  private String testLnk = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getScheduleCandidateId() {
    return scheduleCandidateId;
  }
  public void setScheduleCandidateId(Long scheduleCandidateId) {
    this.scheduleCandidateId = scheduleCandidateId;
  }

  
  /**
   * {}
   **/
  public Long getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(Long scheduleId) {
    this.scheduleId = scheduleId;
  }

  
  /**
   * {}
   **/
  public String getFirstNm() {
    return firstNm;
  }
  public void setFirstNm(String firstNm) {
    this.firstNm = firstNm;
  }

  
  /**
   * {}
   **/
  public String getLastNm() {
    return lastNm;
  }
  public void setLastNm(String lastNm) {
    this.lastNm = lastNm;
  }

  
  /**
   * {}
   **/
  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }

  
  /**
   * {}
   **/
  public String getEmailId() {
    return emailId;
  }
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  
  /**
   * {}
   **/
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * {}
   **/
  public String getTestLnk() {
    return testLnk;
  }
  public void setTestLnk(String testLnk) {
    this.testLnk = testLnk;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgScheduleCandidateDtls pgScheduleCandidateDtls = (PgScheduleCandidateDtls) o;
    return Objects.equals(scheduleCandidateId, pgScheduleCandidateDtls.scheduleCandidateId) &&
        Objects.equals(scheduleId, pgScheduleCandidateDtls.scheduleId) &&
        Objects.equals(firstNm, pgScheduleCandidateDtls.firstNm) &&
        Objects.equals(lastNm, pgScheduleCandidateDtls.lastNm) &&
        Objects.equals(dob, pgScheduleCandidateDtls.dob) &&
        Objects.equals(emailId, pgScheduleCandidateDtls.emailId) &&
        Objects.equals(country, pgScheduleCandidateDtls.country) &&
        Objects.equals(testLnk, pgScheduleCandidateDtls.testLnk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleCandidateId, scheduleId, firstNm, lastNm, dob, emailId, country, testLnk);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgScheduleCandidateDtls {\n");
    
    sb.append("  scheduleCandidateId: ").append(scheduleCandidateId).append("\n");
    sb.append("  scheduleId: ").append(scheduleId).append("\n");
    sb.append("  firstNm: ").append(firstNm).append("\n");
    sb.append("  lastNm: ").append(lastNm).append("\n");
    sb.append("  dob: ").append(dob).append("\n");
    sb.append("  emailId: ").append(emailId).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  testLnk: ").append(testLnk).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

