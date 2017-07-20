package asa.bean;

import java.util.LinkedHashMap;
import java.util.Map;
import org.bson.Document;

public class AttendanceBean {


  private String group;

  private String date;

  //private Map<String, Boolean> members = new LinkedHashMap<String, Boolean>();
  private Document members;
  
  public AttendanceBean(){
  }
  
  public AttendanceBean(String group, String date, Document members){
    this.group=group;
    this.date=date;
    this.members=members;
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
