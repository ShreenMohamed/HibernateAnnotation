package com.hiber2;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Crud {
	public void insert(){
		Session se =NewHibernateUtil.getSessionFactory().openSession();
try{
	se.beginTransaction();

	/*Seconed s =new Seconed();
	s.setName("shereenn");
	s.setHiredate(new Date());
	s.setTime(new Date());
	s.setCal(1250);
	s.setPosition("instructor");
	s.setJobTitle("senior");*/
	
	
	/*Address ad=new Address();
	ad.setState("Cairo");
	ad.setCity("be");
	ad.setStreet("14 st");
	
	Address ads=new Address();
	ads.setState("mans");
	ads.setCity("mmm");
	ads.setStreet("20 st");*/
	

	/*Address as=new Address();
	ads.setState("man");
	ads.setCity("mm");
	ads.setStreet("30 st");*/
	
	/*Employee em =new Employee();
	em.setName("she");
	em.setAd(ad);
	em.setAdHome(ads);
	se.save(em);*/
	
	/*Compke c =new Compke(1,10);
	Student s =new Student();
	s.setName("yasmin");
	s.setCo(c);
	se.save(s);*/
	
	/*Student2 st=new Student2();
	Book bo =new Book();
	st.setName("adam");
	bo.setBookname("java");
	st.setBo(bo);
	se.save(st);*/
	
	/*Center ce =new Center();
	ce.setName("Ibm");
	Course co =new Course();
	co.setName("c++");
	Course co2 =new Course();
	co2.setName("php");
	ce.getCorse().add(co);
	ce.getCorse().add(co2);*/
	
	/*co2.setCent(ce);
	co2.setCent(ce);*/ 
	
	/*Center ce =new Center();
	 Center ce2 =new Center();
	 
	Course co =new Course();
	Course co2 =new Course();
	 
	co.getCorse().add(ce);
	co2.getCorse().add(ce2);
	
	ce.getCorse().add(co);
	ce2.getCorse().add(co2);*/
	 
	
	Books books=new Books();
	books.setIsb(1456);
	
	Probooks probooks =new Probooks();
	probooks.setLan("en");
	probooks.setIsb(458);
	
	Headser head=new Headser();
	head.setLan("en");
	head.setIsb(555);
	head.setPic("yes");
	se.save(books);
	se.save(probooks);
	se.save(head);
	
	// to insert in database
	se.getTransaction().commit();
	
}catch(HibernateException e){
	se.getTransaction().rollback();
	e.printStackTrace();
	
}
	finally{
		
		se.close();
	}}
	
	
	
	
	public void select(){
		Session se =NewHibernateUtil.getSessionFactory().openSession();
try{
	se.beginTransaction();
/*Seconed f =new Seconed();
//1 >pk which we want
f =(Seconed) se.get(Seconed.class,1);
System.out.println("the name is ="+ f.getName());
System.out.println("the Hiredate is ="+ f.getHiredate());
System.out.println("the Time is ="+ f.getTime());
System.out.println("the Position is ="+ f.getPosition());
System.out.println("the JobTitle is ="+ f.getJobTitle());*/
	
	Student2 stu =new Student2();
	stu =(Student2) se.get(Student2.class,1);
	

	/*Book bok =new Book();
	bok =(Book) se.get(Book.class,1);
System.out.println("the name is ="+ bok.getBookname());
System.out.println("the Hiredate is ="+ bok.getst().getName());*/

	// to insert in database
	se.getTransaction().commit();
	
}catch(HibernateException e){
	se.getTransaction().rollback();
	e.printStackTrace();
	
}
	finally{
		
		se.close();
	}}
	
	
	
	
	
	
	public void update(){
		Session se =NewHibernateUtil.getSessionFactory().openSession();
try{
	se.beginTransaction();
Seconed f =new Seconed();
//1 >pk which we want
/*f =(Seconed) se.get(Seconed.class,1);
f.setName("eman");
se.update(f);*/

Student2 st =new Student2();
st=(Student2) se.get(Student2.class,1);
Book bokk =new Book();
bokk=(Book) se.get(Book.class,1);
st.setName("ahmed");
bokk.setBookname("history");
st.setBo(bokk);
se.update(st);
	// to insert in database
	se.getTransaction().commit();
	
}catch(HibernateException e){
	se.getTransaction().rollback();
	e.printStackTrace();
	
}
	finally{
		
		se.close();
	}}
	
	
	
	public void delete(){
		Session se =NewHibernateUtil.getSessionFactory().openSession();
try{
	se.beginTransaction();
Seconed f =new Seconed();
//1 >pk which we want
f =(Seconed) se.get(Seconed.class,2);
se.delete(f);
	// to insert in database
	se.getTransaction().commit();
	
}catch(HibernateException e){
	se.getTransaction().rollback();
	e.printStackTrace();
	
}
	finally{
		
		se.close();
	}}
	
	

}
