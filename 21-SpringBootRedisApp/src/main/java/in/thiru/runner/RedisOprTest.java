package in.thiru.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.thiru.dao.IStudentDao;
import in.thiru.model.Student;


@Component
public class RedisOprTest implements CommandLineRunner{
	
	
	@Autowired
	private IStudentDao dao;

	@Override
	public void run(String... args) throws Exception {

		dao.addStudent(new Student(101,"SAM",500.00));
		dao.addStudent(new Student(102,"SYED",600.00));
		dao.addStudent(new Student(103,"RAM",700.00));
		dao.addStudent(new Student(104,"KIRAN",800.00));
		
		
		System.out.println("===========================All===========================");
		dao.getAllStudents().forEach((k,v)->System.out.println(k+"---"+v));
		
		dao.removeStudent(104);
		dao.modifyStudent(new Student(103,"RAM RAJYAM",1000.00));
		
		System.out.println("====================after remove/modify===================");
		
		dao.getAllStudents().forEach((k,v)->System.out.println(k+"---"+v));
	}

}
