
package asa.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import asa.model.Attendance;

@Repository("attendanceDAO")
public interface AttendanceDAO extends MongoRepository<Attendance, String> {

    
    public List<Attendance> findAll();
    public Attendance findByGroupAndDate(String group, String date);
    public Attendance insert(Attendance attendance);

}
