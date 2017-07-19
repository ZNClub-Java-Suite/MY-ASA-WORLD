
package asa.service;

import asa.bean.AttendanceBean;
import java.util.*;

public interface AttendanceService{
	
	
	public boolean add(AttendanceBean attendance);
	public AttendanceBean get(String group,String date);
}
