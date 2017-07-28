package com.chatbox.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
	 private String empid;

	 private String username;

	 private Location location;

	 private String task;

	 private String date;

	 private String intime;

	 private String outtime;

	 public String getEmpid ()
	 {
	     return empid;
	 }

	 public void setEmpid (String empid)
	 {
	     this.empid = empid;
	 }

	 public String getUsername ()
	 {
	     return username;
	 }

	 public void setUsername (String username)
	 {
	     this.username = username;
	 }

	 public Location getLocation ()
	 {
	     return location;
	 }

	 public void setLocation (Location location)
	 {
	     this.location = location;
	 }

	 public String getTask ()
	 {
	     return task;
	 }

	 public void setTask (String task)
	 {
	     this.task = task;
	 }

	 public String getDate ()
	 {
	     return date;
	 }

	 public void setDate (String date)
	 {
	     this.date = date;
	 }

	 public String getIntime ()
	 {
	     return intime;
	 }

	 public void setIntime (String intime)
	 {
	     this.intime = intime;
	 }

	 public String getOuttime ()
	 {
	     return outtime;
	 }

	 public void setOuttime (String outtime)
	 {
	     this.outtime = outtime;
	 }

	 @Override
	 public String toString()
	 {
	     return "ClassPojo [empid = "+empid+", username = "+username+", location = "+location+", task = "+task+", date = "+date+", intime = "+intime+", outtime = "+outtime+"]";
	 }
}
