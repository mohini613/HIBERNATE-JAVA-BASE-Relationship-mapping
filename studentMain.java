package com.RelationshipMapping1to1UNI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class studentMain {
    public static void main(String[] args) {

    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();

   /*teacher t = new teacher();
    t.setTid(1);         
    t.settName("Ram");     
    t.setSubject("science");
    
    student s= new  student();
    s.setsid(1);
    s.setsName("AMAN");
    s.setAddrs("Pune");
    
    s.setTeacher(t);
    session.save(s);
    session.save(t);
     
    session.beginTransaction().commit();*/
    
   student s=  session.get(student.class, 1);
   System.out.println(s);
   
    session.close();
    sf.close();   
}
}