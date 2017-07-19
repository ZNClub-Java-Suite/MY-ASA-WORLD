package asa.service.impl;

import asa.service.ConstantsInterface;
import asa.service.AttendanceService;
import asa.dao.AttendanceDAO ;
import asa.bean.AttendanceBean;
import asa.model.Attendance;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import java.util.*;


@Service("attendanceService")
public class AttendanceServiceImpl implements ConstantsInterface,AttendanceService{
	
	@Autowired
	AttendanceDAO attendanceDAO;
	
	public boolean add(AttendanceBean attendanceBean){
		Attendance attendance= new Attendance();
		BeanUtils.copyProperties(attendanceBean,attendance);
		
		try{
			attendanceDAO.save(attendance)!=null)       			
			//success
			return true;			
       		}
		
		catch(Exception e){
			System.out.println("add Attendance failed");
        		return false;	
		}
 
	}
	
	public AttendanceBean get(String group,String date){
		
	//	return attendanceDAO.findByGroupAndDate(group,date);
		AttendanceBean attendanceBean = new AttendanceBean();
		Attendance attendance= attendanceDAO.findByGroupAndDate(group,date);
		BeanUtils.copyProperties(attendance,attendanceBean);
		return attendanceBean;

    
	}
}
