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
		BeanUtil.copyProperties(attendanceBean,attendance);
		
		if(attendanceDAO.insert(attendance)==null){
       			System.out.println("add Attendance failed");
        		return false;
       		}
		
		//success
		return true;		
 
	}
	
	public AttendanceBean get(String group,String date){
		
		return attendanceDAO.findByGroupAndDate(group,date);
		
    
	}
}
