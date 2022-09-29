package com.example.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;




public class App 
{
    
	public static void main( String[] args ) throws Exception
    {
    	
		Client obj=new  Client(101,"Ashish","NCR",16000);
		Client obj1=new  Client(102,"Ayush","Delhi",35000);
		Client obj2=new  Client(103,"Amit","Noida",9000);
		Client obj3=new  Client(104,"Dilraaj","Rajsthan",13000);
    	
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Client.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	session.save(obj);
    	session.save(obj1);
    	session.save(obj2);
    	session.save(obj3);
    	

    	
    	Query q = session.createQuery("from Alien");
		
		List<Client> li =  q.list();
		for(Client aj:li)
		{
			System.out.println(aj);
		}
		
		

		session.getTransaction().commit();
		
		
//		tx.commit();
		

    	session.close();
    
        System.out.println("-----------------Data Saved and Displayed-------------------");
    }
}
