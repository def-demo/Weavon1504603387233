package com.altimetrik.usermanagement.models;

import com.altimetrik.usermanagement.models.PgUserInfoDtls;

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

public class PgAwsDirectoryBundle  {
  
  
   
  
  @Id
   
  
  private String directoryId = null;
  
   
   
  
  private String bundleId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "SKILL_TRACK_DTLS_ID", insertable=false, updatable=false) 
  
  private PgUserInfoDtls pgUserInfoDtls = null;

  
  /**
   * {"primaryKey":true}
   **/
  public String getDirectoryId() {
    return directoryId;
  }
  public void setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
  }

  
  /**
   * {}
   **/
  public String getBundleId() {
    return bundleId;
  }
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  
  /**
   * {"foreignKeyColumn":"SKILL_TRACK_DTLS_ID","relation":"OneToOne"}
   **/
  public PgUserInfoDtls getPgUserInfoDtls() {
    return pgUserInfoDtls;
  }
  public void setPgUserInfoDtls(PgUserInfoDtls pgUserInfoDtls) {
    this.pgUserInfoDtls = pgUserInfoDtls;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgAwsDirectoryBundle pgAwsDirectoryBundle = (PgAwsDirectoryBundle) o;
    return Objects.equals(directoryId, pgAwsDirectoryBundle.directoryId) &&
        Objects.equals(bundleId, pgAwsDirectoryBundle.bundleId) &&
        Objects.equals(pgUserInfoDtls, pgAwsDirectoryBundle.pgUserInfoDtls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryId, bundleId, pgUserInfoDtls);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgAwsDirectoryBundle {\n");
    
    sb.append("  directoryId: ").append(directoryId).append("\n");
    sb.append("  bundleId: ").append(bundleId).append("\n");
    sb.append("  pgUserInfoDtls: ").append(pgUserInfoDtls).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

