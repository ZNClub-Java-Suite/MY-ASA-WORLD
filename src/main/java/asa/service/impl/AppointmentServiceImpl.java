package asa.service.impl;

import asa.service.ConstantsInterface;
import asa.service.AppointmentService;
import asa.dao.ScheduleDAO;
import asa.dao.EvaluateDAO;
import asa.bean.Appointment;
import asa.bean.EvaluateBean;
import asa.model.Schedule;
import asa.model.Evaluate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import java.util.*;


@Service("appointmentService")
public class AppointmentServiceImpl implements ConstantsInterface,AppointmentService{
//public class AppointmentServiceImpl implements ConstantsInterface{
	
	@Autowired
	private ScheduleDAO scheduleDAO;
	@Autowired
	private EvaluateDAO evaluateDAO;
		
    public List<Appointment> get(){
	List<Appointment> list = new ArrayList<>();
	List<Schedule> queried = scheduleDAO.findAll();
	queried.forEach(query->{
		Appointment appointment = new Appointment();
		BeanUtils.copyProperties(query,appointment);
		list.add(appointment);
	});
	    
	  return list;
    }
	
	public List<Appointment> getByDate(String date){
		System.out.print("query date:"+date);
		
		List<Appointment> list = new ArrayList<>();		
		List<Schedule> queried = scheduleDAO.findByDate(date);
		
		queried.forEach(query->{
			Appointment appointment = new Appointment();
			BeanUtils.copyProperties(query,appointment);
			list.add(appointment);
		});
		System.out.print("Length:"+list.size());
		return list;
    }

    
	public boolean add(Appointment appointment){
	Schedule schedule= new Schedule();
      	BeanUtils.copyProperties(appointment,schedule);
	System.out.println(appointment.getDate()+" - "+schedule.getDate());
     
       if(scheduleDAO.insert(schedule)==null){
       		System.out.println("add Appointment failed");
        	return false;
       }
		
      //success
      return true;
    }
	
	
	public boolean evaluate(EvaluateBean appointment){
		Evaluate evaluate= new Evaluate();
		BeanUtils.copyProperties(appointment,evaluate);
		System.out.println(appointment.getDate()+" - "+evaluate.getDate());

	       if(evaluateDAO.insert(evaluate)==null){
			System.out.println("add Appointment failed");
			return false;
	       }

	      //success
	      return true;
	
	}
	
}
