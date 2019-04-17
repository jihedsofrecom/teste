package com.in28minutes.springboot.microservice.example.currencyconversion;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
	 @Id
  private Long id;
  private String name;
  private boolean skillenabled;
  private boolean priorityenabled;
  private String advcode;
  private String timezone;
  private String codecdr;
  private String dateofdisabled;
  private String userid;
  private String username;
  private int port;

  public Customer() {

  }

public Customer(Long id, String name, boolean skillEnabled, boolean priorityEnabled, String advCode,
		String timeZone, String codeCdr, String dateOfDisabled, int port) {
	super();
	this.id = id;
	this.name = name;
	this.skillenabled = skillEnabled;
	this.priorityenabled = priorityEnabled;
	this.advcode = advCode;
	this.timezone = timeZone;
	this.codecdr = codeCdr;
	this.dateofdisabled = dateOfDisabled;
	this.port = port;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isSkillenabled() {
	return skillenabled;
}

public void setSkillenabled(boolean skillenabled) {
	this.skillenabled = skillenabled;
}

public boolean isPriorityenabled() {
	return priorityenabled;
}

public void setPriorityenabled(boolean priorityenabled) {
	this.priorityenabled = priorityenabled;
}

public String getAdvcode() {
	return advcode;
}

public void setAdvcode(String advcode) {
	this.advcode = advcode;
}

public String getTimezone() {
	return timezone;
}

public void setTimezone(String timezone) {
	this.timezone = timezone;
}

public String getCodecdr() {
	return codecdr;
}

public void setCodecdr(String codecdr) {
	this.codecdr = codecdr;
}

public String getDateofdisabled() {
	return dateofdisabled;
}

public void setDateofdisabled(String dateofdisabled) {
	this.dateofdisabled = dateofdisabled;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public int getPort() {
	return port;
}

public void setPort(int port) {
	this.port = port;
}



}