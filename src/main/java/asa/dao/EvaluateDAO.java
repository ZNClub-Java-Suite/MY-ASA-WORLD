
package asa.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import asa.model.Evaluate;

@Repository("evaluateDAO")
public interface EvaluateDAO extends MongoRepository<Evaluate, String> {

    
    public List<Evaluate> findAll();
    public List<Evaluate> findByDate(String date);
    public Schedule insert(Evaluate evaluate);

}
