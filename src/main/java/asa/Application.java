package asa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import asa.model.*;
import asa.dao.*;
import java.util.*;

@SpringBootApplication
/*public class Application  implements CommandLineRunner {*/
public class Application{	
	/*
	@Autowired
	private TestDAO testDAO;
	*/
	/*
	@Autowired
	private MemberDAO memberDAO;
	*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	/*
	@Override
	public void run(String... args) throws Exception {
				
		Member member=memberDAO.findByName("Roystan Dcosta");
		System.out.println(member.getName()+" is "+member.getRole());
		
	}
	*/

}
