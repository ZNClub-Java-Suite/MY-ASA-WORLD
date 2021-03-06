package asa.model;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.data.annotation.Id;
import org.bson.Document;

public class Attendance {
  
  @Id
  private String id;

  private String group;

  private String date;

  //private Map<String, Boolean> members = new LinkedHashMap<String, Boolean>();
  private Document members;
  
  public Attendance(){
  }
  
  /*public Attendance(String group, String date, Map<String, Boolean> members){
    this.group=group;
    this.date=date;
    this.members=members;
  }*/
  
  public String getId() {
    return id;
  }
 

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }

  
  public String getDate() {
    return date;
  }

  
  public void setDate(String date) {
    this.date = date;
  }

  /*
  public Map<String, Boolean> getMembers() {
    return this.members;
  }

  
  public void setMembers(Map<String, Boolean> members) {
    this.members=members;
  }
  */
  public Document getMembers() {
    return this.members;
  }

  
  public void setMembers(Document members) {
    this.members=members;
  }

}
