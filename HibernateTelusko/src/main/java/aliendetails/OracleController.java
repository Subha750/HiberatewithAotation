package aliendetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class OracleController 
{
	
public static void main(String[] args) 
{
	
	Oracle al=new Oracle();
//	al.setId(2);
//	al.setName("Axaya");
	
	Configuration con=new Configuration().configure().addAnnotatedClass(Oracle.class);
	ServiceRegistry rs=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	SessionFactory sf=con.buildSessionFactory(rs);
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	//session.save(al); //save in to persistance state
	al=(Oracle) session.get(Oracle.class, 1);
	tx.commit(); ///save data in to database
	System.out.println(al);
	
}
}