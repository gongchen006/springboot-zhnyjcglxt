package com.jesper.model;

import lombok.Data;

@Data
public class Estorage {

  private long id;
  private String name;
  private double erateMin;
  private double erateMax;
  private double echarge;
  private double edischarge;
  private String image;
  private long cid;
  private long status;
  private java.sql.Timestamp created;
  private java.sql.Timestamp updated;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getErateMin() {
    return erateMin;
  }

  public void setErateMin(double erateMin) {
    this.erateMin = erateMin;
  }


  public double getErateMax() {
    return erateMax;
  }

  public void setErateMax(double erateMax) {
    this.erateMax = erateMax;
  }


  public double getEcharge() {
    return echarge;
  }

  public void setEcharge(double echarge) {
    this.echarge = echarge;
  }


  public double getEdischarge() {
    return edischarge;
  }

  public void setEdischarge(double edischarge) {
    this.edischarge = edischarge;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreated() {
    return created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }


  public java.sql.Timestamp getUpdated() {
    return updated;
  }

  public void setUpdated(java.sql.Timestamp updated) {
    this.updated = updated;
  }

}
