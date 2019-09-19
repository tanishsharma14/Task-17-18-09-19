package com.tanish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {

	Configuration config=new Configuration().configure();
	SessionFactory sf=config.buildSessionFactory();
	
	public  void saveStudent(Student student)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(student);
		tx.commit();
		session.close();
	}
	
	public Student searchStudent(int id)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Student stu=(Student)session.get(Student.class,id);
		return stu;
	}
	
	public void update(Student student)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(student);
		
		tx.commit();
		session.close();
	}
	
	public void removeStudent(int id)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student student=(Student)session.get(Student.class,id);
		session.delete(student);
		
		tx.commit();
		session.close();
	}
}
