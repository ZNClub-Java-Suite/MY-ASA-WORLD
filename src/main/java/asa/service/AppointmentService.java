
package asa.service;

import asa.bean.Appointment;
import asa.bean.Evaluate;
import java.util.*;

public interface AppointmentService{
	
	public List<Appointment> get();
	public List<Appointment> getByDate(String date);
	public boolean add(Appointment appointment);
	public boolean evaluate(Evaluate appointment);
}
