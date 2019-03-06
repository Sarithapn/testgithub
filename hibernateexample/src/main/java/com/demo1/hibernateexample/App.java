package com.demo1.hibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        
       Configuration con=new Configuration().configure().addAnnotatedClass(student.class);  
       ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
      
       SessionFactory factory =con.buildSessionFactory(sr) ;  
       Session session =factory.openSession() ;  
       Transaction t= session.beginTransaction();
  
       System.out.println( "before transaction" );
       student s1=new student();    
        s1.setSid(4);    
        s1.setSname("student4");    
        s1.setSbranch("eee");;    
        System.out.println( "before save" );
    session.save(s1);
    t.commit();
    session.close();   
     
    Session session1 =factory.openSession() ; 
    Transaction t1= session1.beginTransaction();
    student s=(student)session1.get(student.class,1);
    System.out.println(s);
    t1.commit();
  
   
   
   System.out.println("successfully saved");    
    factory.close();  
      
    }
}
