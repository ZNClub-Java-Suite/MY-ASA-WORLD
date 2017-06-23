
package asa.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import asa.model.Member;

public interface UserDAO extends MongoRepository<Member, String> {

    public Member findByName(String name);

}
