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
		Attendance attendance=null;		
		try{
			String group= attendanceBean.getGroup();
			String date= attendanceBean.getDate();
			attendance= attendanceDAO.findByGroupAndDate(group,date);
			System.out.println("ByGroupAndDate:"+attendance.getId());
		}
		
		catch(Exception e){		
			attendance= new Attendance();
			System.out.println("new object");
		}
		finally{
			BeanUtils.copyProperties(attendanceBean,attendance);
				
			System.out.println("ByGroupAndDate:"+attendance.getId());
			if(attendanceDAO.save(attendance)!=null){
				//success
				return true;			
			}
			else{
				System.out.println("add Attendance failed");
				return false;	
			}
		}
	}
	
	public AttendanceBean get(String group,String date){
		
	//	return attendanceDAO.findByGroupAndDate(group,date);
		AttendanceBean attendanceBean = new AttendanceBean();
		
		try{
			Attendance attendance= attendanceDAO.findByGroupAndDate(group,date);
			BeanUtils.copyProperties(attendance,attendanceBean);
			return attendanceBean;
		}
		catch(Exception e){
			System.out.println("view Attendance failed"+e);
        		return null;	
		}

    
	}
}
