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

public class PgScheduleDtls  {
  
  
   
  
  @Id
   
  
  private Long scheduleId = null;
  
   
   
  
  private String scheduleName = null;
  
   
   
  
  private Long assessmentId = null;
  
   
   
  
  private String accessKey = null;
  
   
   
  
  private String accessUrl = null;
  
   
   
  
  private String sourceApp = null;
  
   
   
  
  private String schStatus = null;

  
  /**
   * {"primaryKey":true}
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
  public String getScheduleName() {
    return scheduleName;
  }
  public void setScheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
  }

  
  /**
   * {}
   **/
  public Long getAssessmentId() {
    return assessmentId;
  }
  public void setAssessmentId(Long assessmentId) {
    this.assessmentId = assessmentId;
  }

  
  /**
   * {}
   **/
  public String getAccessKey() {
    return accessKey;
  }
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  
  /**
   * {}
   **/
  public String getAccessUrl() {
    return accessUrl;
  }
  public void setAccessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
  }

  
  /**
   * {}
   **/
  public String getSourceApp() {
    return sourceApp;
  }
  public void setSourceApp(String sourceApp) {
    this.sourceApp = sourceApp;
  }

  
  /**
   * {}
   **/
  public String getSchStatus() {
    return schStatus;
  }
  public void setSchStatus(String schStatus) {
    this.schStatus = schStatus;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgScheduleDtls pgScheduleDtls = (PgScheduleDtls) o;
    return Objects.equals(scheduleId, pgScheduleDtls.scheduleId) &&
        Objects.equals(scheduleName, pgScheduleDtls.scheduleName) &&
        Objects.equals(assessmentId, pgScheduleDtls.assessmentId) &&
        Objects.equals(accessKey, pgScheduleDtls.accessKey) &&
        Objects.equals(accessUrl, pgScheduleDtls.accessUrl) &&
        Objects.equals(sourceApp, pgScheduleDtls.sourceApp) &&
        Objects.equals(schStatus, pgScheduleDtls.schStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, scheduleName, assessmentId, accessKey, accessUrl, sourceApp, schStatus);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgScheduleDtls {\n");
    
    sb.append("  scheduleId: ").append(scheduleId).append("\n");
    sb.append("  scheduleName: ").append(scheduleName).append("\n");
    sb.append("  assessmentId: ").append(assessmentId).append("\n");
    sb.append("  accessKey: ").append(accessKey).append("\n");
    sb.append("  accessUrl: ").append(accessUrl).append("\n");
    sb.append("  sourceApp: ").append(sourceApp).append("\n");
    sb.append("  schStatus: ").append(schStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

